package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * This module contains the base configuration for host-tracker implementation.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>host-tracker-config</b>
 * <pre>
 * module host-tracker-config {
 *     yang-version 1;
 *     namespace "urn:opendaylight:l2switch:host-tracker-config";
 *     prefix "host-tracker-impl";
 *
 *     revision 2014-05-28 {
 *         description "This module contains the base configuration for host-tracker implementation.
 *         ";
 *     }
 *
 *     container host-tracker-config {
 *         leaf topology-id {
 *             type topology-id;
 *         }
 *         leaf host-purge-interval {
 *             type host-purge-interval;
 *         }
 *         leaf host-purge-age {
 *             type host-purge-age;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface HostTrackerConfigData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig</code> <code>hostTrackerConfig</code>, or <code>null</code> if not present
     */
    HostTrackerConfig getHostTrackerConfig();

}

