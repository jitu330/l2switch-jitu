package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021qType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.VlanId;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q
 *
 */
public class Header8021qBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q> {

    private java.lang.Short _priorityCode;
    private Header8021qType _tPID;
    private VlanId _vlan;
    private java.lang.Boolean _dropEligible;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> augmentation = Collections.emptyMap();

    public Header8021qBuilder() {
    }
    public Header8021qBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q arg) {
        this._tPID = arg.getTPID();
        this._priorityCode = arg.getPriorityCode();
        this._dropEligible = arg.isDropEligible();
        this._vlan = arg.getVlan();
    }

    public Header8021qBuilder(Header8021q base) {
        this._priorityCode = base.getPriorityCode();
        this._tPID = base.getTPID();
        this._vlan = base.getVlan();
        this._dropEligible = base.isDropEligible();
        if (base instanceof Header8021qImpl) {
            Header8021qImpl impl = (Header8021qImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q) {
            this._tPID = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q)arg).getTPID();
            this._priorityCode = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q)arg).getPriorityCode();
            this._dropEligible = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q)arg).isDropEligible();
            this._vlan = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q)arg).getVlan();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021q] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getPriorityCode() {
        return _priorityCode;
    }
    
    public Header8021qType getTPID() {
        return _tPID;
    }
    
    public VlanId getVlan() {
        return _vlan;
    }
    
    public java.lang.Boolean isDropEligible() {
        return _dropEligible;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkPriorityCodeRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥7]].", value));
     }
    
    public Header8021qBuilder setPriorityCode(final java.lang.Short value) {
    if (value != null) {
        checkPriorityCodeRange(value);
    }
        this._priorityCode = value;
        return this;
    }
    
     
    public Header8021qBuilder setTPID(final Header8021qType value) {
        this._tPID = value;
        return this;
    }
    
     
    public Header8021qBuilder setVlan(final VlanId value) {
        this._vlan = value;
        return this;
    }
    
     
    public Header8021qBuilder setDropEligible(final java.lang.Boolean value) {
        this._dropEligible = value;
        return this;
    }
    
    public Header8021qBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public Header8021qBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Header8021q build() {
        return new Header8021qImpl(this);
    }

    private static final class Header8021qImpl implements Header8021q {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q.class;
        }

        private final java.lang.Short _priorityCode;
        private final Header8021qType _tPID;
        private final VlanId _vlan;
        private final java.lang.Boolean _dropEligible;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> augmentation = Collections.emptyMap();

        private Header8021qImpl(Header8021qBuilder base) {
            this._priorityCode = base.getPriorityCode();
            this._tPID = base.getTPID();
            this._vlan = base.getVlan();
            this._dropEligible = base.isDropEligible();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getPriorityCode() {
            return _priorityCode;
        }
        
        @Override
        public Header8021qType getTPID() {
            return _tPID;
        }
        
        @Override
        public VlanId getVlan() {
            return _vlan;
        }
        
        @Override
        public java.lang.Boolean isDropEligible() {
            return _dropEligible;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_priorityCode);
            result = prime * result + Objects.hashCode(_tPID);
            result = prime * result + Objects.hashCode(_vlan);
            result = prime * result + Objects.hashCode(_dropEligible);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q)obj;
            if (!Objects.equals(_priorityCode, other.getPriorityCode())) {
                return false;
            }
            if (!Objects.equals(_tPID, other.getTPID())) {
                return false;
            }
            if (!Objects.equals(_vlan, other.getVlan())) {
                return false;
            }
            if (!Objects.equals(_dropEligible, other.isDropEligible())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Header8021qImpl otherImpl = (Header8021qImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Header8021q [");
            boolean first = true;
        
            if (_priorityCode != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_priorityCode=");
                builder.append(_priorityCode);
             }
            if (_tPID != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tPID=");
                builder.append(_tPID);
             }
            if (_vlan != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vlan=");
                builder.append(_vlan);
             }
            if (_dropEligible != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dropEligible=");
                builder.append(_dropEligible);
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
