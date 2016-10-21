package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>base-packet</b>
 * <pre>
 * grouping packet-payload {
 *     leaf payload {
 *         type binary;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>base-packet/packet-payload</i>
 *
 */
public interface PacketPayload
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:basepacket",
        "2014-05-28", "packet-payload").intern();

    /**
     * @return <code>byte[]</code> <code>payload</code>, or <code>null</code> if not present
     */
    byte[] getPayload();

}

