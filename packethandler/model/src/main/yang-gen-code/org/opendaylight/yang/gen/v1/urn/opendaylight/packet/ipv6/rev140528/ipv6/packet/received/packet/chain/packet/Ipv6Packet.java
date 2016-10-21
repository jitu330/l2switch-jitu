package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.Packet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ipv6-packet</b>
 * <pre>
 * case ipv6-packet {
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
 * <i>ipv6-packet/ipv6-packet-received/packet-chain/packet/ipv6-packet</i>
 *
 */
public interface Ipv6Packet
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>,
    Ipv6PacketFields,
    Packet
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ipv6",
        "2014-05-28", "ipv6-packet").intern();


}

