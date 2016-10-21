package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.arp.packet.received.packet.chain.packet;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.Packet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.ArpPacketFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>arp-packet</b>
 * <pre>
 * case arp-packet {
 *     leaf hardware-type {
 *         type known-hardware-type;
 *     }
 *     leaf protocol-type {
 *         type known-ether-type;
 *     }
 *     leaf hardware-length {
 *         type uint8;
 *     }
 *     leaf protocol-length {
 *         type uint8;
 *     }
 *     leaf operation {
 *         type known-operation;
 *     }
 *     leaf source-hardware-address {
 *         type string;
 *     }
 *     leaf source-protocol-address {
 *         type string;
 *     }
 *     leaf destination-hardware-address {
 *         type string;
 *     }
 *     leaf destination-protocol-address {
 *         type string;
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
 * <i>arp-packet/arp-packet-received/packet-chain/packet/arp-packet</i>
 *
 */
public interface ArpPacket
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.arp.packet.received.packet.chain.packet.ArpPacket>,
    ArpPacketFields,
    Packet
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:arp",
        "2014-05-28", "arp-packet").intern();


}

