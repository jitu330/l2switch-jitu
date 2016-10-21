package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * This module contains the base configuration for address-tracker.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>address-tracker-config</b>
 * <pre>
 * module address-tracker-config {
 *     yang-version 1;
 *     namespace "urn:opendaylight:packet:address-tracker-config";
 *     prefix "address-tracker-config";
 *
 *     revision 2016-06-21 {
 *         description "This module contains the base configuration for address-tracker.
 *         ";
 *     }
 *
 *     container address-tracker-config {
 *         leaf timestamp-update-interval {
 *             type timestamp-update-interval;
 *         }
 *         leaf observe-addresses-from {
 *             type observe-addresses-from;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface AddressTrackerConfigData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig</code> <code>addressTrackerConfig</code>, or <code>null</code> if not present
     */
    AddressTrackerConfig getAddressTrackerConfig();

}

