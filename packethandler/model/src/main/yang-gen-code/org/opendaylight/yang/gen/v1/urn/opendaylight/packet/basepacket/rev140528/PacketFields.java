package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>base-packet</b>
 * <pre>
 * grouping packet-fields {
 *     leaf payload-offset {
 *         type int32;
 *     }
 *     leaf payload-length {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>base-packet/packet-fields</i>
 *
 */
public interface PacketFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:basepacket",
        "2014-05-28", "packet-fields").intern();

    /**
     * @return <code>java.lang.Integer</code> <code>payloadOffset</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPayloadOffset();
    
    /**
     * @return <code>java.lang.Integer</code> <code>payloadLength</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPayloadLength();

}

