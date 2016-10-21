package org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints
 *
 */
public class AttachmentPointsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints> {

    private TpId _correspondingTp;
    private AttachmentPointsKey _key;
    private TpId _tpId;
    private List<TpId> _tpRef;
    private java.lang.Boolean _active;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> augmentation = Collections.emptyMap();

    public AttachmentPointsBuilder() {
    }
    public AttachmentPointsBuilder(org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes arg) {
        this._tpId = arg.getTpId();
        this._tpRef = arg.getTpRef();
    }

    public AttachmentPointsBuilder(AttachmentPoints base) {
        if (base.getKey() == null) {
            this._key = new AttachmentPointsKey(
                base.getTpId()
            );
            this._tpId = base.getTpId();
        } else {
            this._key = base.getKey();
            this._tpId = _key.getTpId();
        }
        this._correspondingTp = base.getCorrespondingTp();
        this._tpRef = base.getTpRef();
        this._active = base.isActive();
        if (base instanceof AttachmentPointsImpl) {
            AttachmentPointsImpl impl = (AttachmentPointsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes) {
            this._tpId = ((org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes)arg).getTpId();
            this._tpRef = ((org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes)arg).getTpRef();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public TpId getCorrespondingTp() {
        return _correspondingTp;
    }
    
    public AttachmentPointsKey getKey() {
        return _key;
    }
    
    public TpId getTpId() {
        return _tpId;
    }
    
    public List<TpId> getTpRef() {
        return _tpRef;
    }
    
    public java.lang.Boolean isActive() {
        return _active;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AttachmentPointsBuilder setCorrespondingTp(final TpId value) {
        this._correspondingTp = value;
        return this;
    }
    
     
    public AttachmentPointsBuilder setKey(final AttachmentPointsKey value) {
        this._key = value;
        return this;
    }
    
     
    public AttachmentPointsBuilder setTpId(final TpId value) {
        this._tpId = value;
        return this;
    }
    
     
    public AttachmentPointsBuilder setTpRef(final List<TpId> value) {
        this._tpRef = value;
        return this;
    }
    
     
    public AttachmentPointsBuilder setActive(final java.lang.Boolean value) {
        this._active = value;
        return this;
    }
    
    public AttachmentPointsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AttachmentPointsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AttachmentPoints build() {
        return new AttachmentPointsImpl(this);
    }

    private static final class AttachmentPointsImpl implements AttachmentPoints {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints.class;
        }

        private final TpId _correspondingTp;
        private final AttachmentPointsKey _key;
        private final TpId _tpId;
        private final List<TpId> _tpRef;
        private final java.lang.Boolean _active;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> augmentation = Collections.emptyMap();

        private AttachmentPointsImpl(AttachmentPointsBuilder base) {
            if (base.getKey() == null) {
                this._key = new AttachmentPointsKey(
                    base.getTpId()
                );
                this._tpId = base.getTpId();
            } else {
                this._key = base.getKey();
                this._tpId = _key.getTpId();
            }
            this._correspondingTp = base.getCorrespondingTp();
            this._tpRef = base.getTpRef();
            this._active = base.isActive();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public TpId getCorrespondingTp() {
            return _correspondingTp;
        }
        
        @Override
        public AttachmentPointsKey getKey() {
            return _key;
        }
        
        @Override
        public TpId getTpId() {
            return _tpId;
        }
        
        @Override
        public List<TpId> getTpRef() {
            return _tpRef;
        }
        
        @Override
        public java.lang.Boolean isActive() {
            return _active;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
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
            result = prime * result + Objects.hashCode(_correspondingTp);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_tpId);
            result = prime * result + Objects.hashCode(_tpRef);
            result = prime * result + Objects.hashCode(_active);
            result = prime * result + Objects.hashCode(augmentation);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints other = (org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints)obj;
            if (!Objects.equals(_correspondingTp, other.getCorrespondingTp())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_tpId, other.getTpId())) {
                return false;
            }
            if (!Objects.equals(_tpRef, other.getTpRef())) {
                return false;
            }
            if (!Objects.equals(_active, other.isActive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AttachmentPointsImpl otherImpl = (AttachmentPointsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPoints>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AttachmentPoints [");
            boolean first = true;
        
            if (_correspondingTp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_correspondingTp=");
                builder.append(_correspondingTp);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_tpId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tpId=");
                builder.append(_tpId);
             }
            if (_tpRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tpRef=");
                builder.append(_tpRef);
             }
            if (_active != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_active=");
                builder.append(_active);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
