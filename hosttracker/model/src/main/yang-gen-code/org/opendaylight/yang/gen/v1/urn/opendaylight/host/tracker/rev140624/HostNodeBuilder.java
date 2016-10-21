package org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624;
import org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode
 *
 */
public class HostNodeBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode> {

    private List<Addresses> _addresses;
    private List<AttachmentPoints> _attachmentPoints;
    private HostId _id;


    public HostNodeBuilder() {
    }
    public HostNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.Host arg) {
        this._id = arg.getId();
        this._attachmentPoints = arg.getAttachmentPoints();
        this._addresses = arg.getAddresses();
    }
    public HostNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector arg) {
        this._addresses = arg.getAddresses();
    }

    public HostNodeBuilder(HostNode base) {
        this._addresses = base.getAddresses();
        this._attachmentPoints = base.getAttachmentPoints();
        this._id = base.getId();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.Host</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.Host) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.Host)arg).getId();
            this._attachmentPoints = ((org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.Host)arg).getAttachmentPoints();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector) {
            this._addresses = ((org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector)arg).getAddresses();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.Host, org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Addresses> getAddresses() {
        return _addresses;
    }
    
    public List<AttachmentPoints> getAttachmentPoints() {
        return _attachmentPoints;
    }
    
    public HostId getId() {
        return _id;
    }

     
    public HostNodeBuilder setAddresses(final List<Addresses> value) {
        this._addresses = value;
        return this;
    }
    
     
    public HostNodeBuilder setAttachmentPoints(final List<AttachmentPoints> value) {
        this._attachmentPoints = value;
        return this;
    }
    
     
    public HostNodeBuilder setId(final HostId value) {
        this._id = value;
        return this;
    }

    public HostNode build() {
        return new HostNodeImpl(this);
    }

    private static final class HostNodeImpl implements HostNode {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode.class;
        }

        private final List<Addresses> _addresses;
        private final List<AttachmentPoints> _attachmentPoints;
        private final HostId _id;


        private HostNodeImpl(HostNodeBuilder base) {
            this._addresses = base.getAddresses();
            this._attachmentPoints = base.getAttachmentPoints();
            this._id = base.getId();
        }

        @Override
        public List<Addresses> getAddresses() {
            return _addresses;
        }
        
        @Override
        public List<AttachmentPoints> getAttachmentPoints() {
            return _attachmentPoints;
        }
        
        @Override
        public HostId getId() {
            return _id;
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_addresses);
            result = prime * result + Objects.hashCode(_attachmentPoints);
            result = prime * result + Objects.hashCode(_id);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode other = (org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.HostNode)obj;
            if (!Objects.equals(_addresses, other.getAddresses())) {
                return false;
            }
            if (!Objects.equals(_attachmentPoints, other.getAttachmentPoints())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("HostNode [");
            boolean first = true;
        
            if (_addresses != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_addresses=");
                builder.append(_addresses);
             }
            if (_attachmentPoints != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_attachmentPoints=");
                builder.append(_attachmentPoints);
             }
            if (_id != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_id=");
                builder.append(_id);
             }
            return builder.append(']').toString();
        }
    }

}
