package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.icmp.rev140528.icmp.packet.received.packet.chain.packet;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.Packet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.icmp.rev140528.IcmpPacketFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>icmp-packet</b>
 * <pre>
 * case icmp-packet {
 *     leaf type {
 *         type uint8;
 *     }
 *     leaf code {
 *         type uint8;
 *     }
 *     leaf crc {
 *         type uint16;
 *     }
 *     leaf identifier {
 *         type uint16;
 *     }
 *     leaf sequence-number {
 *         type uint16;
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
 * <i>icmp-packet/icmp-packet-received/packet-chain/packet/icmp-packet</i>
 *
 */
public interface IcmpPacket
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.icmp.rev140528.icmp.packet.received.packet.chain.packet.IcmpPacket>,
    IcmpPacketFields,
    Packet
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:icmp",
        "2014-05-28", "icmp-packet").intern();


}

