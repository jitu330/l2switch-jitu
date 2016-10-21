package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>loop-remover-config</b>
 * <pre>
 * container loop-remover-config {
 *     leaf is-install-lldp-flow {
 *         type is-install-lldp-flow;
 *     }
 *     leaf lldp-flow-table-id {
 *         type lldp-flow-table-id;
 *     }
 *     leaf lldp-flow-priority {
 *         type lldp-flow-priority;
 *     }
 *     leaf lldp-flow-hard-timeout {
 *         type lldp-flow-hard-timeout;
 *     }
 *     leaf lldp-flow-idle-timeout {
 *         type lldp-flow-idle-timeout;
 *     }
 *     leaf graph-refresh-delay {
 *         type graph-refresh-delay;
 *     }
 *     leaf topology-id {
 *         type topology-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>loop-remover-config/loop-remover-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfigBuilder
 *
 */
public interface LoopRemoverConfig
    extends
    ChildOf<LoopRemoverConfigData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:loop-remover-config",
        "2014-05-28", "loop-remover-config").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>isInstallLldpFlow</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsInstallLldpFlow();
    
    /**
     * @return <code>java.lang.Short</code> <code>lldpFlowTableId</code>, or <code>null</code> if not present
     */
    java.lang.Short getLldpFlowTableId();
    
    /**
     * @return <code>java.lang.Integer</code> <code>lldpFlowPriority</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLldpFlowPriority();
    
    /**
     * @return <code>java.lang.Integer</code> <code>lldpFlowHardTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLldpFlowHardTimeout();
    
    /**
     * @return <code>java.lang.Integer</code> <code>lldpFlowIdleTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLldpFlowIdleTimeout();
    
    /**
     * @return <code>java.lang.Long</code> <code>graphRefreshDelay</code>, or <code>null</code> if not present
     */
    java.lang.Long getGraphRefreshDelay();
    
    /**
     * @return <code>java.lang.String</code> <code>topologyId</code>, or <code>null</code> if not present
     */
    java.lang.String getTopologyId();

}

