package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.Packet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ethernet-packet</b>
 * <pre>
 * case ethernet-packet {
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
 * <i>ethernet-packet/ethernet-packet-received/packet-chain/packet/ethernet-packet</i>
 *
 */
public interface EthernetPacket
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>,
    EthernetPacketFields,
    Packet
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ethernet",
        "2014-05-28", "ethernet-packet").intern();


}

