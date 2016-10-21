package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.icmp.rev140528;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>icmp-packet</b>
 * <pre>
 * grouping icmp-packet-fields {
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
 * <i>icmp-packet/icmp-packet-fields</i>
 *
 */
public interface IcmpPacketFields
    extends
    DataObject,
    PacketFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:icmp",
        "2014-05-28", "icmp-packet-fields").intern();

    /**
     * @return <code>java.lang.Short</code> <code>type</code>, or <code>null</code> if not present
     */
    java.lang.Short getType();
    
    /**
     * @return <code>java.lang.Short</code> <code>code</code>, or <code>null</code> if not present
     */
    java.lang.Short getCode();
    
    /**
     * @return <code>java.lang.Integer</code> <code>crc</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCrc();
    
    /**
     * @return <code>java.lang.Integer</code> <code>identifier</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIdentifier();
    
    /**
     * @return <code>java.lang.Integer</code> <code>sequenceNumber</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSequenceNumber();

}

