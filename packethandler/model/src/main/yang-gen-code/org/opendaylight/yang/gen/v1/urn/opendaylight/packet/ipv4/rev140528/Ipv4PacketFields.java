package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ipv4-packet</b>
 * <pre>
 * grouping ipv4-packet-fields {
 *     leaf version {
 *         type uint8;
 *     }
 *     leaf ihl {
 *         type uint8;
 *     }
 *     leaf dscp {
 *         type dscp;
 *     }
 *     leaf ecn {
 *         type uint8;
 *     }
 *     leaf ipv4-length {
 *         type uint16;
 *     }
 *     leaf id {
 *         type uint16;
 *     }
 *     leaf reserved-flag {
 *         type boolean;
 *     }
 *     leaf df-flag {
 *         type boolean;
 *     }
 *     leaf mf-flag {
 *         type boolean;
 *     }
 *     leaf fragment-offset {
 *         type uint16;
 *     }
 *     leaf ttl {
 *         type uint8;
 *     }
 *     leaf protocol {
 *         type known-ip-protocols;
 *     }
 *     leaf checksum {
 *         type uint16;
 *     }
 *     leaf source-ipv4 {
 *         type ipv4-address;
 *     }
 *     leaf destination-ipv4 {
 *         type ipv4-address;
 *     }
 *     leaf ipv4-options {
 *         type binary;
 *     }
 *     leaf payload-offset {
 *         type int32;
 *     }
 *     leaf payload-length {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ipv4-packet/ipv4-packet-fields</i>
 *
 */
public interface Ipv4PacketFields
    extends
    DataObject,
    PacketFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ipv4",
        "2014-05-28", "ipv4-packet-fields").intern();

    /**
     * @return <code>java.lang.Short</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.Short getVersion();
    
    /**
     * Internal Header Length
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ihl</code>, or <code>null</code> if not present
     */
    java.lang.Short getIhl();
    
    /**
     * Differentiated Code Services Point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp</code> <code>dscp</code>, or <code>null</code> if not present
     */
    Dscp getDscp();
    
    /**
     * Explicit Congestion Notification
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ecn</code>, or <code>null</code> if not present
     */
    java.lang.Short getEcn();
    
    /**
     * Packet size, including header and data, in bytes
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ipv4Length</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIpv4Length();
    
    /**
     * Identification
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.Integer getId();
    
    /**
     * First bit in the flags, must be 0
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>reservedFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isReservedFlag();
    
    /**
     * Second bit in the flags, Don't Fragment Flag
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>dfFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDfFlag();
    
    /**
     * Third bit in the flags, More Fragments Flag
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mfFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMfFlag();
    
    /**
     * Specifies the offset of a particular fragment relative to the beginning of the 
     * original unfragmented IP datagram
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>fragmentOffset</code>, or <code>null</code> if not present
     */
    java.lang.Integer getFragmentOffset();
    
    /**
     * Time to live
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ttl</code>, or <code>null</code> if not present
     */
    java.lang.Short getTtl();
    
    /**
     * Protocol for the data
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols</code> <code>protocol</code>, or <code>null</code> if not present
     */
    KnownIpProtocols getProtocol();
    
    /**
     * Header Checksum
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>checksum</code>, or <code>null</code> if not present
     */
    java.lang.Integer getChecksum();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address</code> <code>sourceIpv4</code>, or <code>null</code> if not present
     */
    Ipv4Address getSourceIpv4();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address</code> <code>destinationIpv4</code>, or <code>null</code> if not present
     */
    Ipv4Address getDestinationIpv4();
    
    /**
     * @return <code>byte[]</code> <code>ipv4Options</code>, or <code>null</code> if not present
     */
    byte[] getIpv4Options();

}

