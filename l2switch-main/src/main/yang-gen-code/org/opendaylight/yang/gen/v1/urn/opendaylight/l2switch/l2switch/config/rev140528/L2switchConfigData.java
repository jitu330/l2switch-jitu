package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * This module contains the base configuration for main implementation.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>l2switch-config</b>
 * <pre>
 * module l2switch-config {
 *     yang-version 1;
 *     namespace "urn:opendaylight:l2switch:l2switch-config";
 *     prefix "l2switch-config";
 *
 *     revision 2014-05-28 {
 *         description "This module contains the base configuration for main implementation.
 *         ";
 *     }
 *
 *     container l2switch-config {
 *         leaf is-learning-only-mode {
 *             type is-learning-only-mode;
 *         }
 *         leaf is-install-dropall-flow {
 *             type is-install-dropall-flow;
 *         }
 *         leaf dropall-flow-table-id {
 *             type dropall-flow-table-id;
 *         }
 *         leaf dropall-flow-priority {
 *             type dropall-flow-priority;
 *         }
 *         leaf dropall-flow-hard-timeout {
 *             type dropall-flow-hard-timeout;
 *         }
 *         leaf dropall-flow-idle-timeout {
 *             type dropall-flow-idle-timeout;
 *         }
 *         leaf reactive-flow-table-id {
 *             type reactive-flow-table-id;
 *         }
 *         leaf reactive-flow-priority {
 *             type reactive-flow-priority;
 *         }
 *         leaf reactive-flow-hard-timeout {
 *             type reactive-flow-hard-timeout;
 *         }
 *         leaf reactive-flow-idle-timeout {
 *             type reactive-flow-idle-timeout;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface L2switchConfigData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig</code> <code>l2switchConfig</code>, or <code>null</code> if not present
     */
    L2switchConfig getL2switchConfig();

}

