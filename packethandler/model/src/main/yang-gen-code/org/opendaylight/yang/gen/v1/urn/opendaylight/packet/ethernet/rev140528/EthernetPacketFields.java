package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ethernet-packet</b>
 * <pre>
 * grouping ethernet-packet-fields {
 *     leaf source-mac {
 *         type mac-address;
 *     }
 *     leaf destination-mac {
 *         type mac-address;
 *     }
 *     list header8021q {
 *         key     leaf TPID {
 *             type header8021q-type;
 *         }
 *         leaf priority-code {
 *             type uint8;
 *         }
 *         leaf drop-eligible {
 *             type boolean;
 *         }
 *         leaf vlan {
 *             type vlan-id;
 *         }
 *         uses header8021q;
 *     }
 *     leaf ethertype {
 *         type known-ether-type;
 *     }
 *     leaf ethernet-length {
 *         type uint16;
 *     }
 *     leaf crc {
 *         type uint32;
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
 * <i>ethernet-packet/ethernet-packet-fields</i>
 *
 */
public interface EthernetPacketFields
    extends
    DataObject,
    PacketFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ethernet",
        "2014-05-28", "ethernet-packet-fields").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>sourceMac</code>, or <code>null</code> if not present
     */
    MacAddress getSourceMac();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>destinationMac</code>, or <code>null</code> if not present
     */
    MacAddress getDestinationMac();
    
    /**
     * @return <code>java.util.List</code> <code>header8021q</code>, or <code>null</code> if not present
     */
    List<Header8021q> getHeader8021q();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.KnownEtherType</code> <code>ethertype</code>, or <code>null</code> if not present
     */
    KnownEtherType getEthertype();
    
    /**
     * @return <code>java.lang.Integer</code> <code>ethernetLength</code>, or <code>null</code> if not present
     */
    java.lang.Integer getEthernetLength();
    
    /**
     * @return <code>java.lang.Long</code> <code>crc</code>, or <code>null</code> if not present
     */
    java.lang.Long getCrc();

}

