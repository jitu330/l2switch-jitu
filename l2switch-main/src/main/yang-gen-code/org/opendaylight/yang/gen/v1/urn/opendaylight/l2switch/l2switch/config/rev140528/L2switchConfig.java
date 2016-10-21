package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>l2switch-config</b>
 * <pre>
 * container l2switch-config {
 *     leaf is-learning-only-mode {
 *         type is-learning-only-mode;
 *     }
 *     leaf is-install-dropall-flow {
 *         type is-install-dropall-flow;
 *     }
 *     leaf dropall-flow-table-id {
 *         type dropall-flow-table-id;
 *     }
 *     leaf dropall-flow-priority {
 *         type dropall-flow-priority;
 *     }
 *     leaf dropall-flow-hard-timeout {
 *         type dropall-flow-hard-timeout;
 *     }
 *     leaf dropall-flow-idle-timeout {
 *         type dropall-flow-idle-timeout;
 *     }
 *     leaf reactive-flow-table-id {
 *         type reactive-flow-table-id;
 *     }
 *     leaf reactive-flow-priority {
 *         type reactive-flow-priority;
 *     }
 *     leaf reactive-flow-hard-timeout {
 *         type reactive-flow-hard-timeout;
 *     }
 *     leaf reactive-flow-idle-timeout {
 *         type reactive-flow-idle-timeout;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>l2switch-config/l2switch-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfigBuilder
 *
 */
public interface L2switchConfig
    extends
    ChildOf<L2switchConfigData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2switch:l2switch-config",
        "2014-05-28", "l2switch-config").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>isLearningOnlyMode</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsLearningOnlyMode();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>isInstallDropallFlow</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsInstallDropallFlow();
    
    /**
     * @return <code>java.lang.Short</code> <code>dropallFlowTableId</code>, or <code>null</code> if not present
     */
    java.lang.Short getDropallFlowTableId();
    
    /**
     * @return <code>java.lang.Integer</code> <code>dropallFlowPriority</code>, or <code>null</code> if not present
     */
    java.lang.Integer getDropallFlowPriority();
    
    /**
     * @return <code>java.lang.Integer</code> <code>dropallFlowHardTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getDropallFlowHardTimeout();
    
    /**
     * @return <code>java.lang.Integer</code> <code>dropallFlowIdleTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getDropallFlowIdleTimeout();
    
    /**
     * @return <code>java.lang.Short</code> <code>reactiveFlowTableId</code>, or <code>null</code> if not present
     */
    java.lang.Short getReactiveFlowTableId();
    
    /**
     * @return <code>java.lang.Integer</code> <code>reactiveFlowPriority</code>, or <code>null</code> if not present
     */
    java.lang.Integer getReactiveFlowPriority();
    
    /**
     * @return <code>java.lang.Integer</code> <code>reactiveFlowHardTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getReactiveFlowHardTimeout();
    
    /**
     * @return <code>java.lang.Integer</code> <code>reactiveFlowIdleTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getReactiveFlowIdleTimeout();

}

