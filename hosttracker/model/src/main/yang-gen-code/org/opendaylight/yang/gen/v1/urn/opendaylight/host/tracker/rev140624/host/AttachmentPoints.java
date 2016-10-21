package org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.Host;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * the assumption is that all address can be reached at all attachment points
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>host-tracker-service</b>
 * <pre>
 * list attachment-points {
 *     key "tp-id"
 *     leaf tp-id {
 *         type tp-id;
 *     }
 *     leaf-list tp-ref {
 *         type tp-ref;
 *     }
 *     leaf corresponding-tp {
 *         type tp-ref;
 *     }
 *     leaf active {
 *         type boolean;
 *     }
 *     uses tp-attributes;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>host-tracker-service/host/attachment-points</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPointsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPointsBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPointsKey
 *
 */
public interface AttachmentPoints
    extends
    ChildOf<Host>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>,
    TpAttributes,
    Identifiable<AttachmentPointsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:host-tracker",
        "2014-06-24", "attachment-points").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>correspondingTp</code>, or <code>null</code> if not present
     */
    TpId getCorrespondingTp();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>active</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isActive();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPointsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AttachmentPointsKey getKey();

}

