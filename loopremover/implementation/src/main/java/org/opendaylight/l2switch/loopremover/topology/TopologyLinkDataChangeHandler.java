/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.l2switch.loopremover.topology;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.CheckedFuture;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataChangeListener;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.md.sal.binding.api.ReadWriteTransaction;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataBroker;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataChangeEvent;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.l2switch.loopremover.util.InstanceIdentifierUtils;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.Address;
import org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SalFlowService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatus;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnectorBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Destination;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Source;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Listens to data change events on topology links
 * {@link org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link}
 * and maintains a topology graph using provided NetworkGraphService
 * {@link org.opendaylight.l2switch.loopremover.topology.NetworkGraphService}.
 * It refreshes the graph after a delay(default 10 sec) to accommodate burst of
 * change events if they come in bulk. This is to avoid continuous refresh of
 * graph on a series of change events in short time.
 */
public class TopologyLinkDataChangeHandler implements DataChangeListener {
    private static final Logger LOG = LoggerFactory.getLogger(TopologyLinkDataChangeHandler.class);
    private static final String DEFAULT_TOPOLOGY_ID = "flow:1";
    private static final long DEFAULT_GRAPH_REFRESH_DELAY = 1000;

    private final ScheduledExecutorService topologyDataChangeEventProcessor = Executors.newScheduledThreadPool(1);

    private final NetworkGraphService networkGraphService;
    private boolean networkGraphRefreshScheduled = false;
    private boolean threadReschedule = false;
    private long graphRefreshDelay;
    private String topologyId;

    private final DataBroker dataBroker;

    private final SalFlowService salFlowService;

    public TopologyLinkDataChangeHandler(DataBroker dataBroker, NetworkGraphService networkGraphService,
    		SalFlowService salFlowService) {
        Preconditions.checkNotNull(dataBroker, "dataBroker should not be null.");
        Preconditions.checkNotNull(networkGraphService, "networkGraphService should not be null.");
        Preconditions.checkNotNull(salFlowService, "salFlowService should not be null.");
        this.dataBroker = dataBroker;
        this.networkGraphService = networkGraphService;
        this.salFlowService = salFlowService;
    }

    public void setGraphRefreshDelay(long graphRefreshDelay) {
        if (graphRefreshDelay < 0) {
            this.graphRefreshDelay = DEFAULT_GRAPH_REFRESH_DELAY;
        } else
            this.graphRefreshDelay = graphRefreshDelay;
    }

    public void setTopologyId(String topologyId) {
        if (topologyId == null || topologyId.isEmpty()) {
            this.topologyId = DEFAULT_TOPOLOGY_ID;
        } else
            this.topologyId = topologyId;
    }

    /**
     * Registers as a data listener to receive changes done to
     * {@link org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link}
     * under
     * {@link org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology}
     * operation data root.
     */
    public ListenerRegistration<DataChangeListener> registerAsDataChangeListener() {
        InstanceIdentifier<Link> linkInstance = InstanceIdentifier.builder(NetworkTopology.class)
                .child(Topology.class, new TopologyKey(new TopologyId(topologyId))).child(Link.class).build();
        return dataBroker.registerDataChangeListener(LogicalDatastoreType.OPERATIONAL, linkInstance, this,
                AsyncDataBroker.DataChangeScope.BASE);
    }

    /**
     * Handler for onDataChanged events and schedules the building of the
     * network graph.
     *
     * @param dataChangeEvent
     *            The data change event to process.
     */
    @Override
    public void onDataChanged(AsyncDataChangeEvent<InstanceIdentifier<?>, DataObject> dataChangeEvent) {
        if (dataChangeEvent == null) {
            return;
        }

        LOG.info("Jitu: onDataChanged in TopologyLinkDataChangeHandler");

        Map<InstanceIdentifier<?>, DataObject> createdData = dataChangeEvent.getCreatedData();
        Set<InstanceIdentifier<?>> removedPaths = dataChangeEvent.getRemovedPaths();
        Map<InstanceIdentifier<?>, DataObject> originalData = dataChangeEvent.getOriginalData();
        boolean isGraphUpdated = false;

        if (createdData != null && !createdData.isEmpty()) {
            Set<InstanceIdentifier<?>> linksIds = createdData.keySet();
            for (InstanceIdentifier<?> linkId : linksIds) {
                if (Link.class.isAssignableFrom(linkId.getTargetType())) {
                    Link link = (Link) createdData.get(linkId);
                    if (!(link.getLinkId().getValue().contains("host"))) {
                        isGraphUpdated = true;
                        LOG.debug("Graph is updated! Added Link {}", link.getLinkId().getValue());
                        break;
                    }
                }
            }
        }

        if (removedPaths != null && !removedPaths.isEmpty() && originalData != null && !originalData.isEmpty()) {

            //Added by Jitu 
            LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: links are removed");

            for (InstanceIdentifier<?> instanceId : removedPaths) {
                if (Link.class.isAssignableFrom(instanceId.getTargetType())) {
                    Link link = (Link) originalData.get(instanceId);

                    if (!(link.getLinkId().getValue().contains("host"))) {
                        isGraphUpdated = true;

                        //Added by Jitu 

                        NodeId sourceNodeId = link.getSource().getSourceNode();
                        NodeId destinationNodeId = link.getDestination().getDestNode();

                        LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: Graph is updated! "
                        		+ "Removed Link {}, between sourceID {} and targetID {}",
                        		link.getLinkId().getValue(), sourceNodeId, destinationNodeId);

                        LOG.debug("Graph is updated! Removed Link {}", link.getLinkId().getValue());

                        List<Node> hostNodes = getHostsFromTopology();

                        if(hostNodes == null || hostNodes.isEmpty())
                        	LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: no host nodes found");
                        else{
                        	LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: host nodes found");

                        	for(Node host: hostNodes)
                        		LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: host node {} ", host.getNodeId().getValue());

                        	//LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: Initiating NetworkGraphImpl");
                            	//NetworkGraphImpl networkGraphImpl = new NetworkGraphImpl();

                            	LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: Finding shortestPath");
                            	List<Link> spLinks = networkGraphService.getPath(hostNodes.get(0).getNodeId(), hostNodes.get(1).getNodeId());

                            	LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: shortestPath found");

                            	for(Link spLink: spLinks)
                            		LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: "
                            			+ "shortestPath linkID {}, sourceID {}, destinationID {}",
                            			spLink.getLinkId(),
                            			spLink.getSource().getSourceNode().getValue(),
                                    	spLink.getDestination().getDestNode().getValue());
                        }
                        
                        
                        
                        
                        /*
                         {
                        	"link-id": "openflow:1:1",
                        	"destination": 
                        	{
                            	"dest-tp": "openflow:2:1",
                            	"dest-node": "openflow:2"
                        	},
                        	"source": 
                        	{
                            	"source-node": "openflow:1",
                            	"source-tp": "openflow:1:1"
                        	}
                    	 }    
                    	*/
                        
                        
                        /*for(Link spLink: spLinks){
                        	Source sourceNode = spLink.getSource();
                        	Destination destinationNode = spLink.getDestination();
                        	
                        	LOG.info("CustomLog: TopologyLinkDataChangeHandler: onDataChanged: sourceID");
                        }*/
                break;
                    }
                }
            }





        }

        if (!isGraphUpdated) {
            return;
        }
        if (!networkGraphRefreshScheduled) {
            synchronized (this) {
                if (!networkGraphRefreshScheduled) {
                    topologyDataChangeEventProcessor.schedule(new TopologyDataChangeEventProcessor(), graphRefreshDelay,
                            TimeUnit.MILLISECONDS);
                    networkGraphRefreshScheduled = true;
                    LOG.debug("Scheduled Graph for refresh.");
                }
            }
        } else {
            LOG.debug("Already scheduled for network graph refresh.");
            threadReschedule = true;
        }
    }


    private List<Node> getHostsFromTopology() {
        InstanceIdentifier<Topology> topologyInstanceIdentifier = InstanceIdentifierUtils
                .generateTopologyInstanceIdentifier(topologyId);
        Topology topology = null;
        ReadOnlyTransaction readOnlyTransaction = dataBroker.newReadOnlyTransaction();
        try {
            Optional<Topology> topologyOptional = readOnlyTransaction
                    .read(LogicalDatastoreType.OPERATIONAL, topologyInstanceIdentifier).get();
            if (topologyOptional.isPresent()) {
                topology = topologyOptional.get();
            }
        } catch (Exception e) {
            LOG.error("Error reading topology {}", topologyInstanceIdentifier);
            readOnlyTransaction.close();
            throw new RuntimeException(
                    "Error reading from operational store, topology : " + topologyInstanceIdentifier, e);
        }
        readOnlyTransaction.close();
        if (topology == null) {
            return null;
        }

        List<Node> nodes = topology.getNode();
        if (nodes == null || nodes.isEmpty()) {
            return null;
        }

        List<Node> hostNodes = new ArrayList<Node>();
        for (Node node : nodes)
        	if(node.getNodeId().getValue().contains("host"))
        		hostNodes.add(node);

        for (Node node : nodes) {
            HostNode hostNode = node.getAugmentation(HostNode.class);

            LOG.info("CustomLog: TopologyLinkDataChangeHandler: getHostsFromTopology: "
                            + "hostNode id {}", hostNode.getId());

            List<Addresses> hnAddresses = hostNode.getAddresses();

            for(Addresses addresses : hnAddresses){
                LOG.info("CustomLog: TopologyLinkDataChangeHandler: getHostsFromTopology: "
                        + "hostNode address IP {}, MAC {}", addresses.getIp(), addresses.getMac());

            }

            List<AttachmentPoints> hnAttPoints = hostNode.getAttachmentPoints();

            for(AttachmentPoints attPoints: hnAttPoints){
                LOG.info("CustomLog: TopologyLinkDataChangeHandler: getHostsFromTopology: "
                        + "attPoints Tp {}, isActive {}", attPoints.getCorrespondingTp().getValue(),
                        attPoints.isActive());
            }
        }

        return hostNodes;
    }

    /**
     *
     */
    private class TopologyDataChangeEventProcessor implements Runnable {

        @Override
        public void run() {
            if (threadReschedule) {
                topologyDataChangeEventProcessor.schedule(this, graphRefreshDelay, TimeUnit.MILLISECONDS);
                threadReschedule = false;
                return;
            }

            //Added by Jitu
            LOG.info("CustomLog: TopologyLinkDataChangeHandler: TopologyDataChangeEventProcessor: In network graph refresh thread.");

            LOG.debug("In network graph refresh thread.");
            networkGraphRefreshScheduled = false;
            networkGraphService.clear();
            List<Link> links = getLinksFromTopology();
            if (links == null || links.isEmpty()) {
                return;
            }
            networkGraphService.addLinks(links);

            //Added by Jitu
            LOG.info("CustomLog: TopologyLinkDataChangeHandler: TopologyDataChangeEventProcessor: Links Added using networkGraphService");


            final ReadWriteTransaction readWriteTransaction = dataBroker.newReadWriteTransaction();
            updateNodeConnectorStatus(readWriteTransaction);
            final CheckedFuture writeTxResultFuture = readWriteTransaction.submit();
            Futures.addCallback(writeTxResultFuture, new FutureCallback() {
                @Override
                public void onSuccess(Object o) {

                    //Added by Jitu
                    LOG.info("CustomLog: TopologyLinkDataChangeHandler: TopologyDataChangeEventProcessor: write successful for tx :{}", readWriteTransaction.getIdentifier());

                    LOG.debug("TopologyLinkDataChangeHandler write successful for tx :{}",
                            readWriteTransaction.getIdentifier());
                }

                @Override
                public void onFailure(Throwable throwable) {
                    LOG.error("TopologyLinkDataChangeHandler write transaction {} failed",
                            readWriteTransaction.getIdentifier(), throwable.getCause());
                }
            });

            //Added by Jitu 
            LOG.info("CustomLog: TopologyLinkDataChangeHandler: TopologyDataChangeEventProcessor: Done with network graph refresh thread.");

            LOG.debug("Done with network graph refresh thread.");
        }

        private List<Link> getLinksFromTopology() {
            InstanceIdentifier<Topology> topologyInstanceIdentifier = InstanceIdentifierUtils
                    .generateTopologyInstanceIdentifier(topologyId);
            Topology topology = null;
            ReadOnlyTransaction readOnlyTransaction = dataBroker.newReadOnlyTransaction();
            try {
                Optional<Topology> topologyOptional = readOnlyTransaction
                        .read(LogicalDatastoreType.OPERATIONAL, topologyInstanceIdentifier).get();
                if (topologyOptional.isPresent()) {
                    topology = topologyOptional.get();
                }
            } catch (Exception e) {
                LOG.error("Error reading topology {}", topologyInstanceIdentifier);
                readOnlyTransaction.close();
                throw new RuntimeException(
                        "Error reading from operational store, topology : " + topologyInstanceIdentifier, e);
            }
            readOnlyTransaction.close();
            if (topology == null) {
                return null;
            }
            List<Link> links = topology.getLink();
            if (links == null || links.isEmpty()) {
                return null;
            }
            List<Link> internalLinks = new ArrayList<>();
            for (Link link : links) {
                if (!(link.getLinkId().getValue().contains("host"))) {
                    internalLinks.add(link);
                }
            }
            return internalLinks;
        }




        /**
         * @param readWriteTransaction
         */
        private void updateNodeConnectorStatus(ReadWriteTransaction readWriteTransaction) {
            List<Link> allLinks = networkGraphService.getAllLinks();
            if (allLinks == null || allLinks.isEmpty()) {
                return;
            }

            List<Link> mstLinks = networkGraphService.getLinksInMst();
            for (Link link : allLinks) {
                if (mstLinks != null && !mstLinks.isEmpty() && mstLinks.contains(link)) {
                    updateNodeConnector(readWriteTransaction, getSourceNodeConnectorRef(link), StpStatus.Forwarding);
                    updateNodeConnector(readWriteTransaction, getDestNodeConnectorRef(link), StpStatus.Forwarding);
                } else {
                    updateNodeConnector(readWriteTransaction, getSourceNodeConnectorRef(link), StpStatus.Discarding);
                    updateNodeConnector(readWriteTransaction, getDestNodeConnectorRef(link), StpStatus.Discarding);
                }
            }
        }

        /**
         * @param link
         * @return
         */
        private NodeConnectorRef getSourceNodeConnectorRef(Link link) {
            InstanceIdentifier<NodeConnector> nodeConnectorInstanceIdentifier = InstanceIdentifierUtils
                    .createNodeConnectorIdentifier(link.getSource().getSourceNode().getValue(),
                            link.getSource().getSourceTp().getValue());
            return new NodeConnectorRef(nodeConnectorInstanceIdentifier);
        }

        /**
         * @param link
         * @return
         */
        private NodeConnectorRef getDestNodeConnectorRef(Link link) {
            InstanceIdentifier<NodeConnector> nodeConnectorInstanceIdentifier = InstanceIdentifierUtils
                    .createNodeConnectorIdentifier(link.getDestination().getDestNode().getValue(),
                            link.getDestination().getDestTp().getValue());

            return new NodeConnectorRef(nodeConnectorInstanceIdentifier);
        }

        /**
         * @param readWriteTransaction
         * @param nodeConnectorRef
         * @param stpStatus
         */
        private void updateNodeConnector(ReadWriteTransaction readWriteTransaction, NodeConnectorRef nodeConnectorRef,
                StpStatus stpStatus) {
            StpStatusAwareNodeConnectorBuilder stpStatusAwareNodeConnectorBuilder = new StpStatusAwareNodeConnectorBuilder()
                    .setStatus(stpStatus);
            checkIfExistAndUpdateNodeConnector(readWriteTransaction, nodeConnectorRef,
                    stpStatusAwareNodeConnectorBuilder.build());
        }

        /**
         * @param readWriteTransaction
         * @param nodeConnectorRef
         * @param stpStatusAwareNodeConnector
         */
        private void checkIfExistAndUpdateNodeConnector(ReadWriteTransaction readWriteTransaction,
                NodeConnectorRef nodeConnectorRef, StpStatusAwareNodeConnector stpStatusAwareNodeConnector) {
            NodeConnector nc = null;
            try {
                Optional<NodeConnector> dataObjectOptional = readWriteTransaction.read(LogicalDatastoreType.OPERATIONAL,
                        (InstanceIdentifier<NodeConnector>) nodeConnectorRef.getValue()).get();
                if (dataObjectOptional.isPresent())
                    nc = (NodeConnector) dataObjectOptional.get();
            } catch (Exception e) {
                LOG.error("Error reading node connector {}", nodeConnectorRef.getValue());
                readWriteTransaction.submit();
                throw new RuntimeException("Error reading from operational store, node connector : " + nodeConnectorRef,
                        e);
            }
            NodeConnectorBuilder nodeConnectorBuilder;
            if (nc != null) {
                if (sameStatusPresent(nc.getAugmentation(StpStatusAwareNodeConnector.class),
                        stpStatusAwareNodeConnector.getStatus())) {
                    return;
                }

                // build instance id for StpStatusAwareNodeConnector
                InstanceIdentifier<StpStatusAwareNodeConnector> stpStatusAwareNcInstanceId = ((InstanceIdentifier<NodeConnector>) nodeConnectorRef
                        .getValue()).augmentation(StpStatusAwareNodeConnector.class);
                // update StpStatusAwareNodeConnector in operational store
                readWriteTransaction.merge(LogicalDatastoreType.OPERATIONAL, stpStatusAwareNcInstanceId,
                        stpStatusAwareNodeConnector);
                LOG.debug("Merged Stp Status aware node connector in operational {} with status {}",
                        stpStatusAwareNcInstanceId, stpStatusAwareNodeConnector);
            } else {
                LOG.error("Unable to update Stp Status node connector {} note present in  operational store",
                        nodeConnectorRef.getValue());
            }
        }

        /**
         * @param stpStatusAwareNodeConnector
         * @return
         */
        private boolean sameStatusPresent(StpStatusAwareNodeConnector stpStatusAwareNodeConnector,
                StpStatus stpStatus) {

            if (stpStatusAwareNodeConnector == null)
                return false;

            if (stpStatusAwareNodeConnector.getStatus() == null)
                return false;

            if (stpStatus.getIntValue() != stpStatusAwareNodeConnector.getStatus().getIntValue())
                return false;

            return true;
        }
    }
}
