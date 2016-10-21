package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * This module contains the base configuration for loop-remover implementation.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>loop-remover-config</b>
 * <pre>
 * module loop-remover-config {
 *     yang-version 1;
 *     namespace "urn:opendaylight:packet:loop-remover-config";
 *     prefix "loop-remover-config";
 *
 *     revision 2014-05-28 {
 *         description "This module contains the base configuration for loop-remover implementation.
 *         ";
 *     }
 *
 *     container loop-remover-config {
 *         leaf is-install-lldp-flow {
 *             type is-install-lldp-flow;
 *         }
 *         leaf lldp-flow-table-id {
 *             type lldp-flow-table-id;
 *         }
 *         leaf lldp-flow-priority {
 *             type lldp-flow-priority;
 *         }
 *         leaf lldp-flow-hard-timeout {
 *             type lldp-flow-hard-timeout;
 *         }
 *         leaf lldp-flow-idle-timeout {
 *             type lldp-flow-idle-timeout;
 *         }
 *         leaf graph-refresh-delay {
 *             type graph-refresh-delay;
 *         }
 *         leaf topology-id {
 *             type topology-id;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface LoopRemoverConfigData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig</code> <code>loopRemoverConfig</code>, or <code>null</code> if not present
     */
    LoopRemoverConfig getLoopRemoverConfig();

}

