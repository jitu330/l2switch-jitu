package org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.VlanId;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>address-tracker</b>
 * <pre>
 * list addresses {
 *     key "id"
 *     leaf id {
 *         type uint64;
 *     }
 *     leaf mac {
 *         type mac-address;
 *     }
 *     leaf ip {
 *         type ip-address;
 *     }
 *     leaf vlan {
 *         type vlan-id;
 *     }
 *     leaf first-seen {
 *         type int64;
 *     }
 *     leaf last-seen {
 *         type int64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>address-tracker/address-node-connector/addresses</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.AddressesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.AddressesBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.AddressesKey
 *
 */
public interface Addresses
    extends
    ChildOf<AddressNodeConnector>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>,
    Identifiable<AddressesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:address-tracker",
        "2014-06-17", "addresses").intern();

    /**
     * A 64-bit key for this observation. This is opaque and should not be interpreted.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>id</code>, or <code>null</code> if not present
     */
    BigInteger getId();
    
    /**
     * MAC address
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>mac</code>, or <code>null</code> if not present
     */
    MacAddress getMac();
    
    /**
     * IPv4 or IPv6 address
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ip</code>, or <code>null</code> if not present
     */
    IpAddress getIp();
    
    /**
     * VLAN id
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.VlanId</code> <code>vlan</code>, or <code>null</code> if not present
     */
    VlanId getVlan();
    
    /**
     * Timestamp (number of ms since January 1, 1970, 00:00:00 GMT) of observing this 
     * address for the first time
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>firstSeen</code>, or <code>null</code> if not present
     */
    java.lang.Long getFirstSeen();
    
    /**
     * The most recent timestamp (tnumber of ms since January 1, 1970, 00:00:00 GMT) of
     * observing this address
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>lastSeen</code>, or <code>null</code> if not present
     */
    java.lang.Long getLastSeen();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.AddressesKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AddressesKey getKey();

}

