package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ethernet-packet</b>
 * <pre>
 * list header8021q {
 *     key     leaf TPID {
 *         type header8021q-type;
 *     }
 *     leaf priority-code {
 *         type uint8;
 *     }
 *     leaf drop-eligible {
 *         type boolean;
 *     }
 *     leaf vlan {
 *         type vlan-id;
 *     }
 *     uses header8021q;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ethernet-packet/ethernet-packet-fields/header8021q</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021qBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021qBuilder
 *
 *
 */
public interface Header8021q
    extends
    ChildOf<EthernetPacketFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ethernet",
        "2014-05-28", "header8021q").intern();


}

