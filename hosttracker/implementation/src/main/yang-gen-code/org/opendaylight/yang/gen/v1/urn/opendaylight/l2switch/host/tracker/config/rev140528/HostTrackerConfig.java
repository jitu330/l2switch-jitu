package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>host-tracker-config</b>
 * <pre>
 * container host-tracker-config {
 *     leaf topology-id {
 *         type topology-id;
 *     }
 *     leaf host-purge-interval {
 *         type host-purge-interval;
 *     }
 *     leaf host-purge-age {
 *         type host-purge-age;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>host-tracker-config/host-tracker-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfigBuilder
 *
 */
public interface HostTrackerConfig
    extends
    ChildOf<HostTrackerConfigData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2switch:host-tracker-config",
        "2014-05-28", "host-tracker-config").intern();

    /**
     * @return <code>java.lang.String</code> <code>topologyId</code>, or <code>null</code> if not present
     */
    java.lang.String getTopologyId();
    
    /**
     * The interval in seconds (0 disables host purging) at which to evaluate whether 
     * hosts should be removed in seconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hostPurgeInterval</code>, or <code>null</code> if not present
     */
    java.lang.Long getHostPurgeInterval();
    
    /**
     * How long a host must have been unobserved for it to be removed in seconds. In 
     * seconds, It is valid only if host-purge-interval &amp;gt; 0, Before modifying 
     * this configurable variable please consider default flow idletimeout/hardtimeout 
     * values installed by l2switch in l2switch-main module; Also consider 
     * timestamp-update-interval value in addressTracker module
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hostPurgeAge</code>, or <code>null</code> if not present
     */
    java.lang.Long getHostPurgeAge();

}

