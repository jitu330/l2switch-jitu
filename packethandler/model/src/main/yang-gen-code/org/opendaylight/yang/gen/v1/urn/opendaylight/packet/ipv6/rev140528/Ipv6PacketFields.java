package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv6Address;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ipv6-packet</b>
 * <pre>
 * grouping ipv6-packet-fields {
 *     leaf version {
 *         type uint8;
 *     }
 *     leaf dscp {
 *         type dscp;
 *     }
 *     leaf ecn {
 *         type uint8;
 *     }
 *     leaf flow-label {
 *         type uint32;
 *     }
 *     leaf ipv6-length {
 *         type uint16;
 *     }
 *     leaf next-header {
 *         type known-ip-protocols;
 *     }
 *     leaf hop-limit {
 *         type uint8;
 *     }
 *     leaf source-ipv6 {
 *         type ipv6-address;
 *     }
 *     leaf destination-ipv6 {
 *         type ipv6-address;
 *     }
 *     list extension-headers {
 *         key     leaf next-header {
 *             type known-ip-protocols;
 *         }
 *         leaf length {
 *             type uint16;
 *         }
 *         leaf data {
 *             type binary;
 *         }
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
 * <i>ipv6-packet/ipv6-packet-fields</i>
 *
 */
public interface Ipv6PacketFields
    extends
    DataObject,
    PacketFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ipv6",
        "2014-05-28", "ipv6-packet-fields").intern();

    /**
     * @return <code>java.lang.Short</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.Short getVersion();
    
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
     * Flow label
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>flowLabel</code>, or <code>null</code> if not present
     */
    java.lang.Long getFlowLabel();
    
    /**
     * Payload size including any extension headers, in octets
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ipv6Length</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIpv6Length();
    
    /**
     * Type of the next header or Transport layer protocol used by the payload
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols</code> <code>nextHeader</code>, or <code>null</code> if not present
     */
    KnownIpProtocols getNextHeader();
    
    /**
     * Hop Limit, the IPv6 version of Time to live
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hopLimit</code>, or <code>null</code> if not present
     */
    java.lang.Short getHopLimit();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv6Address</code> <code>sourceIpv6</code>, or <code>null</code> if not present
     */
    Ipv6Address getSourceIpv6();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv6Address</code> <code>destinationIpv6</code>, or <code>null</code> if not present
     */
    Ipv6Address getDestinationIpv6();
    
    /**
     * @return <code>java.util.List</code> <code>extensionHeaders</code>, or <code>null</code> if not present
     */
    List<ExtensionHeaders> getExtensionHeaders();

}

