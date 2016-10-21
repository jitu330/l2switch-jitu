package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ipv6-packet</b>
 * <pre>
 * list extension-headers {
 *     key     leaf next-header {
 *         type known-ip-protocols;
 *     }
 *     leaf length {
 *         type uint16;
 *     }
 *     leaf data {
 *         type binary;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ipv6-packet/ipv6-packet-fields/extension-headers</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeadersBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeadersBuilder
 *
 *
 */
public interface ExtensionHeaders
    extends
    ChildOf<Ipv6PacketFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ipv6",
        "2014-05-28", "extension-headers").intern();

    /**
     * Type of this extension header
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols</code> <code>nextHeader</code>, or <code>null</code> if not present
     */
    KnownIpProtocols getNextHeader();
    
    /**
     * Length of this extension header, in octets
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>length</code>, or <code>null</code> if not present
     */
    java.lang.Integer getLength();
    
    /**
     * Data for this extension header
     *
     *
     *
     * @return <code>byte[]</code> <code>data</code>, or <code>null</code> if not present
     */
    byte[] getData();

}

