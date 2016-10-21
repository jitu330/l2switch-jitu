package org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints;
import java.util.List;


/**
 * List of addresses and attachment points
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>host-tracker-service</b>
 * <pre>
 * grouping host {
 *     list addresses {
 *         key "id"
 *         leaf id {
 *             type uint64;
 *         }
 *         leaf mac {
 *             type mac-address;
 *         }
 *         leaf ip {
 *             type ip-address;
 *         }
 *         leaf vlan {
 *             type vlan-id;
 *         }
 *         leaf first-seen {
 *             type int64;
 *         }
 *         leaf last-seen {
 *             type int64;
 *         }
 *     }
 *     leaf id {
 *         type host-id;
 *     }
 *     list attachment-points {
 *         key "tp-id"
 *         leaf tp-id {
 *             type tp-id;
 *         }
 *         leaf-list tp-ref {
 *             type tp-ref;
 *         }
 *         leaf corresponding-tp {
 *             type tp-ref;
 *         }
 *         leaf active {
 *             type boolean;
 *         }
 *         uses tp-attributes;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>host-tracker-service/host</i>
 *
 */
public interface Host
    extends
    DataObject,
    AddressNodeConnector
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:host-tracker",
        "2014-06-24", "host").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostId</code> <code>id</code>, or <code>null</code> if not present
     */
    HostId getId();
    
    /**
     * the assumption is that all address can be reached at all attachment points
     *
     *
     *
     * @return <code>java.util.List</code> <code>attachmentPoints</code>, or <code>null</code> if not present
     */
    List<AttachmentPoints> getAttachmentPoints();

}

