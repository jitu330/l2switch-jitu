package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>address-tracker-config</b>
 * <pre>
 * container address-tracker-config {
 *     leaf timestamp-update-interval {
 *         type timestamp-update-interval;
 *     }
 *     leaf observe-addresses-from {
 *         type observe-addresses-from;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>address-tracker-config/address-tracker-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfigBuilder
 *
 */
public interface AddressTrackerConfig
    extends
    ChildOf<AddressTrackerConfigData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:address-tracker-config",
        "2016-06-21", "address-tracker-config").intern();

    /**
     * Value is in milliseconds. In case if you are using host-expiry feature, before 
     * modifying timestamp-update-interval please consider the host-purge-age value in 
     * hosttracker module, also consider default flow idletimeout/hardtimeout values 
     * installed by l2switch in l2switch-main module
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>timestampUpdateInterval</code>, or <code>null</code> if not present
     */
    java.lang.Long getTimestampUpdateInterval();
    
    /**
     * All possible values for comma separated values e.g. arp,ipv,ipv6
     *
     *
     *
     * @return <code>java.lang.String</code> <code>observeAddressesFrom</code>, or <code>null</code> if not present
     */
    java.lang.String getObserveAddressesFrom();

}

