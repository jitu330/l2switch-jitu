package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>stp-status-aware-node-connector</b>
 * <pre>
 * grouping stp-status-node-connector {
 *     leaf status {
 *         type stp-status;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>stp-status-aware-node-connector/stp-status-node-connector</i>
 *
 */
public interface StpStatusNodeConnector
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2switch:loopremover",
        "2014-07-14", "stp-status-node-connector").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatus</code> <code>status</code>, or <code>null</code> if not present
     */
    StpStatus getStatus();

}

