/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.l2switch.loopremover.topology;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

import org.opendaylight.openflowplugin.api.OFConstants;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.OutputActionCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.TableKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.Flow;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.FlowBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.FlowKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.AddFlowInputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.AddFlowOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowTableRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SalFlowService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.InstructionsBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.MatchBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.ApplyActionsCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.apply.actions._case.ApplyActions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.apply.actions._case.ApplyActionsBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.InstructionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestinationBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetSourceBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatchBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;

/**
 * Adds a flow, which sends all LLDP packets to the controller, on all switches.
 * Registers as ODL Inventory listener so that it can add flows once a new node i.e. switch is added
 */
public class CustomFlowWriter1 {
    private static final Logger LOG = LoggerFactory.getLogger(CustomFlowWriter1.class);

    private final ExecutorService customFlowExecutor = Executors.newCachedThreadPool();
    private final SalFlowService salFlowService;
    private final String FLOW_ID_PREFIX = "CustomFlow-";
    private final int IP_ETHER_TYPE = 2048;
    private short flowTableId;
    private int flowPriority;
    private int flowIdleTimeout;
    private int flowHardTimeout;

    private AtomicLong flowIdInc = new AtomicLong();
    private AtomicLong flowCookieInc = new AtomicLong(0x2b00000000000000L);

    private MacAddress srcMac;
    private MacAddress destMac;
    private String sNodeId;
    private String outPort;

    private IpAddress srcIp;
    private IpAddress destIp;

    private LinkId linkId;

    public CustomFlowWriter1(SalFlowService salFlowService) {
        this.salFlowService = salFlowService;
    }

    public void setFlowTableId(short flowTableId) { this.flowTableId = flowTableId; }

    public void setFlowPriority(int flowPriority) {
        this.flowPriority = flowPriority;
    }

    public void setFlowIdleTimeout(int flowIdleTimeout) {
        this.flowIdleTimeout = flowIdleTimeout;
    }

    public void setFlowHardTimeout(int flowHardTimeout) {
        this.flowHardTimeout = flowHardTimeout;
    }

    public void setSrcMac(MacAddress srcMac) { this.srcMac = srcMac; }

    public void setDestMac(MacAddress destMac) { this.destMac = destMac; }

    public void setSNode(String sNodeId) { this.sNodeId = sNodeId; }

    public void setOutPort(String outPort) { this.outPort = outPort; }

    public void setLinkId(LinkId linkId) {
        this.linkId = linkId;

    }

    public void setSrcIp(IpAddress srcMac) { this.srcIp = srcIp; }

    public void setDestIp(IpAddress destMac) { this.destIp = destIp; }



    //Jitu: Should not be uncommented
    /*public ListenerRegistration<DataChangeListener> registerAsDataChangeListener(DataBroker dataBroker) {
        InstanceIdentifier<Node> nodeInstanceIdentifier = InstanceIdentifier.builder(Nodes.class)
                .child(Node.class).build();

        return dataBroker.registerDataChangeListener(LogicalDatastoreType.OPERATIONAL, nodeInstanceIdentifier, this, AsyncDataBroker.DataChangeScope.BASE);
    }*/

    //Jitu: Should not be uncommented
    /*@Override
    public void onDataChanged(AsyncDataChangeEvent<InstanceIdentifier<?>, DataObject> instanceIdentifierDataObjectAsyncDataChangeEvent) {
        Map<InstanceIdentifier<?>, DataObject> createdData = instanceIdentifierDataObjectAsyncDataChangeEvent.getCreatedData();
        if(createdData !=null && !createdData.isEmpty()) {
            Set<InstanceIdentifier<?>> nodeIds = createdData.keySet();
            if(nodeIds != null && !nodeIds.isEmpty()) {
                initialFlowExecutor.submit(new InitialFlowWriterProcessor(nodeIds));
            }
        }
    }*/

    /*public void createFlow(Set<InstanceIdentifier<?>> nodeIds){
        if(nodeIds != null && !nodeIds.isEmpty()) {
            customFlowExecutor.submit(new CustomFlowWriterProcessor(nodeIds));
        }
    }*/

    public void createFlow(){

        InstanceIdentifier<Node> nodeInstanceIdentifier = InstanceIdentifier.builder(Nodes.class)
                .child(Node.class, new NodeKey(new NodeId(sNodeId))).build();

        customFlowExecutor.submit(new CustomFlowWriterProcessor(nodeInstanceIdentifier));


    }



    /**
     * A private class to process the node updated event in separate thread. Allows to release the
     * thread that invoked the data node updated event. Avoids any thread lock it may cause.
     */
    private class CustomFlowWriterProcessor implements Runnable {
        //Set<InstanceIdentifier<?>> nodeIds = null;
        InstanceIdentifier<Node> sNodeIId = null;

        //public CustomFlowWriterProcessor(Set<InstanceIdentifier<?>> nodeIds) { this.nodeIds = nodeIds; }

        public CustomFlowWriterProcessor(InstanceIdentifier<Node> sNodeIId) { this.sNodeIId = sNodeIId; }

        @Override
        public void run() {

            if(sNodeIId == null) {
                return;
            }

            /*for(InstanceIdentifier<?> nodeId : nodeIds) {
                if(Node.class.isAssignableFrom(nodeId.getTargetType())) {
                    InstanceIdentifier<Node> topoNodeId = (InstanceIdentifier<Node>)nodeId;
                    if(topoNodeId.firstKeyOf(Node.class,NodeKey.class).getId().getValue().contains("openflow:")) {
                        addInitialFlows(topoNodeId);
                    }
                }
            }*/

            if(sNodeIId.firstKeyOf(Node.class,NodeKey.class).getId().getValue().contains("openflow:")) {
                addInitialFlows(sNodeIId);
            }

        }

        /*
         * Adds a flow, which sends all LLDP packets to the controller, to the specified node.
         * @param nodeId The node to write the flow on.
        */
        public void addInitialFlows(InstanceIdentifier<Node> nodeId) {
            LOG.debug("adding initial flows for node {} ", nodeId);

            InstanceIdentifier<Table> tableId = getTableInstanceId(nodeId);
            InstanceIdentifier<Flow> flowId = getFlowInstanceId(tableId);

            //add lldpToController flow
            writeFlowToController(nodeId, tableId, flowId, createCustomFlow(flowTableId, flowPriority));

            LOG.debug("Added initial flows for node {} ", nodeId);
        }

        private InstanceIdentifier<Table> getTableInstanceId(InstanceIdentifier<Node> nodeId) {
            // get flow table key
            TableKey flowTableKey = new TableKey(flowTableId);
            return nodeId.builder()
                    .augmentation(FlowCapableNode.class)
                    .child(Table.class, flowTableKey)
                    .build();
        }

        private InstanceIdentifier<Flow> getFlowInstanceId(InstanceIdentifier<Table> tableId) {
            // generate unique flow key
            FlowId flowId = new FlowId(FLOW_ID_PREFIX + String.valueOf(flowIdInc.getAndIncrement()));
            FlowKey flowKey = new FlowKey(flowId);
            return tableId.child(Flow.class, flowKey);
        }

        private Flow createCustomFlow(Short tableId, int priority) {

            // start building flow
            FlowBuilder customFlow = new FlowBuilder() //
                    .setTableId(tableId) //
                    .setFlowName("customflow");

            // use its own hash code for id.
            customFlow.setId(new FlowId(Long.toString(customFlow.hashCode())));

            EthernetMatchBuilder ethernetMatchBuilder = new EthernetMatchBuilder() //
                    .setEthernetDestination(new EthernetDestinationBuilder() //
                            .setAddress(destMac) //
                            .build());

            // set source in the match only if present
            if (srcMac != null) {
                ethernetMatchBuilder.setEthernetSource(new EthernetSourceBuilder().setAddress(srcMac).build());
            }

            Match match = new MatchBuilder()
                    .setEthernetMatch(ethernetMatchBuilder.build())
                    .build();

            Uri destPortUri = new Uri(outPort);

            // Create an Apply Action

            ApplyActions applyActions = new ApplyActionsBuilder().setAction(ImmutableList.of(createOutputPortAction()))
                    .build();

            // Wrap our Apply Action in an Instruction
            Instruction applyActionsInstruction = new InstructionBuilder() //
                    .setOrder(0)
                    .setInstruction(new ApplyActionsCaseBuilder()//
                            .setApplyActions(applyActions) //
                            .build()) //
                    .build();


            // Put our Instruction in a list of Instructions
            customFlow
                    .setMatch(match) //
                    .setInstructions(new InstructionsBuilder() //
                            .setInstruction(ImmutableList.of(applyActionsInstruction)) //
                            .build()) //
                    .setPriority(priority) //
                    .setBufferId(OFConstants.OFP_NO_BUFFER) //
                    .setHardTimeout(flowHardTimeout) //
                    .setIdleTimeout(flowIdleTimeout) //
                    .setCookie(new FlowCookie(BigInteger.valueOf(flowCookieInc.getAndIncrement())))
                    .setFlags(new FlowModFlags(false, false, false, false, false));

            return customFlow.build();
        }

        private Action createOutputPortAction() {
            Action outPortAction = new ActionBuilder()
                    .setOrder(0)
                    .setKey(new ActionKey(0))
                    .setAction(new OutputActionCaseBuilder()
                            .setOutputAction(new OutputActionBuilder()
                                    .setMaxLength(0xffff)
                                    .setOutputNodeConnector(new Uri(outPort))
                                    .build())
                            .build())
                    .build();

            return outPortAction;
        }

        private Future<RpcResult<AddFlowOutput>> writeFlowToController(InstanceIdentifier<Node> nodeInstanceId,
                                                                       InstanceIdentifier<Table> tableInstanceId,
                                                                       InstanceIdentifier<Flow> flowPath,
                                                                       Flow flow) {
            LOG.trace("Adding flow to node {}",nodeInstanceId.firstKeyOf(Node.class, NodeKey.class).getId().getValue());
            final AddFlowInputBuilder builder = new AddFlowInputBuilder(flow);
            builder.setNode(new NodeRef(nodeInstanceId));
            builder.setFlowRef(new FlowRef(flowPath));
            builder.setFlowTable(new FlowTableRef(tableInstanceId));
            builder.setTransactionUri(new Uri(flow.getId().getValue()));
            return salFlowService.addFlow(builder.build());
        }
    }
}
