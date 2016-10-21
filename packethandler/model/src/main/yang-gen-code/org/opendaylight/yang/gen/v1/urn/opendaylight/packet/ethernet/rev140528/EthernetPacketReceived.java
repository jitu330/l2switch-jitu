package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketPayload;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketChainGrp;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ethernet-packet</b>
 * <pre>
 * notification ethernet-packet-received {
 *     list packet-chain {
 *         key     choice packet {
 *             case ethernet-packet {
 *                 leaf source-mac {
 *                     type mac-address;
 *                 }
 *                 leaf destination-mac {
 *                     type mac-address;
 *                 }
 *                 list header8021q {
 *                     key     leaf TPID {
 *                         type header8021q-type;
 *                     }
 *                     leaf priority-code {
 *                         type uint8;
 *                     }
 *                     leaf drop-eligible {
 *                         type boolean;
 *                     }
 *                     leaf vlan {
 *                         type vlan-id;
 *                     }
 *                     uses header8021q;
 *                 }
 *                 leaf ethertype {
 *                     type known-ether-type;
 *                 }
 *                 leaf ethernet-length {
 *                     type uint16;
 *                 }
 *                 leaf crc {
 *                     type uint32;
 *                 }
 *                 leaf payload-offset {
 *                     type int32;
 *                 }
 *                 leaf payload-length {
 *                     type int32;
 *                 }
 *             }
 *             case raw-packet {
 *                 leaf ingress {
 *                     type node-connector-ref;
 *                 }
 *                 leaf connection-cookie {
 *                     type connection-cookie;
 *                 }
 *                 leaf flow-cookie {
 *                     type flow-cookie;
 *                 }
 *                 leaf table-id {
 *                     type table-id;
 *                 }
 *                 leaf packet-in-reason {
 *                     type identityref;
 *                 }
 *                 container match {
 *                     leaf in-port {
 *                         type node-connector-id;
 *                     }
 *                     leaf in-phy-port {
 *                         type node-connector-id;
 *                     }
 *                     container metadata {
 *                         leaf metadata {
 *                             type uint64;
 *                         }
 *                         leaf metadata-mask {
 *                             type uint64;
 *                         }
 *                         uses of-metadata;
 *                     }
 *                     container tunnel {
 *                         leaf tunnel-id {
 *                             type uint64;
 *                         }
 *                         leaf tunnel-mask {
 *                             type uint64;
 *                         }
 *                     }
 *                     container ethernet-match {
 *                         container ethernet-source {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             leaf mask {
 *                                 type mac-address;
 *                             }
 *                             uses mac-address-filter;
 *                         }
 *                         container ethernet-destination {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             leaf mask {
 *                                 type mac-address;
 *                             }
 *                             uses mac-address-filter;
 *                         }
 *                         container ethernet-type {
 *                             leaf type {
 *                                 type ether-type;
 *                             }
 *                         }
 *                         uses ethernet-match-fields;
 *                     }
 *                     container vlan-match {
 *                         container vlan-id {
 *                             leaf vlan-id-present {
 *                                 type boolean;
 *                             }
 *                             leaf vlan-id {
 *                                 type vlan-id;
 *                             }
 *                         }
 *                         leaf vlan-pcp {
 *                             type vlan-pcp;
 *                         }
 *                         uses vlan-match-fields;
 *                     }
 *                     container ip-match {
 *                         leaf ip-protocol {
 *                             type uint8;
 *                         }
 *                         leaf ip-dscp {
 *                             type dscp;
 *                         }
 *                         leaf ip-ecn {
 *                             type uint8;
 *                         }
 *                         leaf ip-proto {
 *                             type ip-version;
 *                         }
 *                         uses ip-match-fields;
 *                     }
 *                     choice layer-3-match {
 *                         case arp-match {
 *                             leaf arp-op {
 *                                 type uint16;
 *                             }
 *                             leaf arp-source-transport-address {
 *                                 type ipv4-prefix;
 *                             }
 *                             leaf arp-target-transport-address {
 *                                 type ipv4-prefix;
 *                             }
 *                             container arp-source-hardware-address {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 leaf mask {
 *                                     type mac-address;
 *                                 }
 *                                 uses mac-address-filter;
 *                             }
 *                             container arp-target-hardware-address {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 leaf mask {
 *                                     type mac-address;
 *                                 }
 *                                 uses mac-address-filter;
 *                             }
 *                         }
 *                         case ipv4-match {
 *                             leaf ipv4-source {
 *                                 type ipv4-prefix;
 *                             }
 *                             leaf ipv4-destination {
 *                                 type ipv4-prefix;
 *                             }
 *                         }
 *                         case ipv4-match-arbitrary-bit-mask {
 *                             leaf ipv4-source-address-no-mask {
 *                                 type ipv4-address;
 *                             }
 *                             leaf ipv4-destination-address-no-mask {
 *                                 type ipv4-address;
 *                             }
 *                             leaf ipv4-source-arbitrary-bitmask {
 *                                 type dotted-quad;
 *                             }
 *                             leaf ipv4-destination-arbitrary-bitmask {
 *                                 type dotted-quad;
 *                             }
 *                         }
 *                         case ipv6-match {
 *                             leaf ipv6-source {
 *                                 type ipv6-prefix;
 *                             }
 *                             leaf ipv6-destination {
 *                                 type ipv6-prefix;
 *                             }
 *                             leaf ipv6-nd-target {
 *                                 type ipv6-address;
 *                             }
 *                             container ipv6-label {
 *                                 leaf ipv6-flabel {
 *                                     type ipv6-flow-label;
 *                                 }
 *                                 leaf flabel-mask {
 *                                     type ipv6-flow-label;
 *                                 }
 *                             }
 *                             leaf ipv6-nd-sll {
 *                                 type mac-address;
 *                             }
 *                             leaf ipv6-nd-tll {
 *                                 type mac-address;
 *                             }
 *                             container ipv6-ext-header {
 *                                 leaf ipv6-exthdr {
 *                                     type uint16;
 *                                 }
 *                                 leaf ipv6-exthdr-mask {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case ipv6-match-arbitrary-bit-mask {
 *                             leaf ipv6-source-address-no-mask {
 *                                 type ipv6-address;
 *                             }
 *                             leaf ipv6-source-arbitrary-bitmask {
 *                                 type ipv6-arbitrary-mask;
 *                             }
 *                             leaf ipv6-destination-address-no-mask {
 *                                 type ipv6-address;
 *                             }
 *                             leaf ipv6-destination-arbitrary-bitmask {
 *                                 type ipv6-arbitrary-mask;
 *                             }
 *                         }
 *                         case tunnel-ipv4-match {
 *                             leaf tunnel-ipv4-source {
 *                                 type ipv4-prefix;
 *                             }
 *                             leaf tunnel-ipv4-destination {
 *                                 type ipv4-prefix;
 *                             }
 *                         }
 *                     }
 *                     choice layer-4-match {
 *                         case sctp-match {
 *                             leaf sctp-source-port {
 *                                 type port-number;
 *                             }
 *                             leaf sctp-destination-port {
 *                                 type port-number;
 *                             }
 *                         }
 *                         case tcp-match {
 *                             leaf tcp-source-port {
 *                                 type port-number;
 *                             }
 *                             leaf tcp-destination-port {
 *                                 type port-number;
 *                             }
 *                         }
 *                         case udp-match {
 *                             leaf udp-source-port {
 *                                 type port-number;
 *                             }
 *                             leaf udp-destination-port {
 *                                 type port-number;
 *                             }
 *                         }
 *                     }
 *                     container icmpv4-match {
 *                         leaf icmpv4-type {
 *                             type uint8;
 *                         }
 *                         leaf icmpv4-code {
 *                             type uint8;
 *                         }
 *                         uses icmpv4-match-fields;
 *                     }
 *                     container icmpv6-match {
 *                         leaf icmpv6-type {
 *                             type uint8;
 *                         }
 *                         leaf icmpv6-code {
 *                             type uint8;
 *                         }
 *                         uses icmpv6-match-fields;
 *                     }
 *                     container protocol-match-fields {
 *                         leaf mpls-label {
 *                             type uint32;
 *                         }
 *                         leaf mpls-tc {
 *                             type uint8;
 *                         }
 *                         leaf mpls-bos {
 *                             type uint8;
 *                         }
 *                         container pbb {
 *                             leaf pbb-isid {
 *                                 type uint32;
 *                             }
 *                             leaf pbb-mask {
 *                                 type uint32;
 *                             }
 *                         }
 *                         uses protocol-match-fields;
 *                     }
 *                     container tcp-flags-match {
 *                         leaf tcp-flags {
 *                             type uint16;
 *                         }
 *                         leaf tcp-flags-mask {
 *                             type uint16;
 *                         }
 *                         uses tcp-flags-match-fields;
 *                     }
 *                     uses match;
 *                 }
 *                 leaf payload-offset {
 *                     type int32;
 *                 }
 *                 leaf payload-length {
 *                     type int32;
 *                 }
 *             }
 *         }
 *     }
 *     leaf payload {
 *         type binary;
 *     }
 *     uses packet-payload;
 *     uses packet-chain-grp;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ethernet-packet/ethernet-packet-received</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketReceivedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketReceivedBuilder
 *
 */
public interface EthernetPacketReceived
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketReceived>,
    PacketPayload,
    PacketChainGrp,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ethernet",
        "2014-05-28", "ethernet-packet-received").intern();


}

