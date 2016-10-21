package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig
 *
 */
public class HostTrackerConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig> {

    private java.lang.Long _hostPurgeAge;
    private java.lang.Long _hostPurgeInterval;
    private java.lang.String _topologyId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> augmentation = Collections.emptyMap();

    public HostTrackerConfigBuilder() {
    }

    public HostTrackerConfigBuilder(HostTrackerConfig base) {
        this._hostPurgeAge = base.getHostPurgeAge();
        this._hostPurgeInterval = base.getHostPurgeInterval();
        this._topologyId = base.getTopologyId();
        if (base instanceof HostTrackerConfigImpl) {
            HostTrackerConfigImpl impl = (HostTrackerConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getHostPurgeAge() {
        return _hostPurgeAge;
    }
    
    public java.lang.Long getHostPurgeInterval() {
        return _hostPurgeInterval;
    }
    
    public java.lang.String getTopologyId() {
        return _topologyId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HostTrackerConfigBuilder setHostPurgeAge(final java.lang.Long value) {
        this._hostPurgeAge = value;
        return this;
    }
    
     
    public HostTrackerConfigBuilder setHostPurgeInterval(final java.lang.Long value) {
        this._hostPurgeInterval = value;
        return this;
    }
    
     
    public HostTrackerConfigBuilder setTopologyId(final java.lang.String value) {
        this._topologyId = value;
        return this;
    }
    
    public HostTrackerConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public HostTrackerConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public HostTrackerConfig build() {
        return new HostTrackerConfigImpl(this);
    }

    private static final class HostTrackerConfigImpl implements HostTrackerConfig {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig.class;
        }

        private final java.lang.Long _hostPurgeAge;
        private final java.lang.Long _hostPurgeInterval;
        private final java.lang.String _topologyId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> augmentation = Collections.emptyMap();

        private HostTrackerConfigImpl(HostTrackerConfigBuilder base) {
            this._hostPurgeAge = base.getHostPurgeAge();
            this._hostPurgeInterval = base.getHostPurgeInterval();
            this._topologyId = base.getTopologyId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getHostPurgeAge() {
            return _hostPurgeAge;
        }
        
        @Override
        public java.lang.Long getHostPurgeInterval() {
            return _hostPurgeInterval;
        }
        
        @Override
        public java.lang.String getTopologyId() {
            return _topologyId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_hostPurgeAge);
            result = prime * result + Objects.hashCode(_hostPurgeInterval);
            result = prime * result + Objects.hashCode(_topologyId);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig)obj;
            if (!Objects.equals(_hostPurgeAge, other.getHostPurgeAge())) {
                return false;
            }
            if (!Objects.equals(_hostPurgeInterval, other.getHostPurgeInterval())) {
                return false;
            }
            if (!Objects.equals(_topologyId, other.getTopologyId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HostTrackerConfigImpl otherImpl = (HostTrackerConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.host.tracker.config.rev140528.HostTrackerConfig>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("HostTrackerConfig [");
            boolean first = true;
        
            if (_hostPurgeAge != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hostPurgeAge=");
                builder.append(_hostPurgeAge);
             }
            if (_hostPurgeInterval != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hostPurgeInterval=");
                builder.append(_hostPurgeInterval);
             }
            if (_topologyId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_topologyId=");
                builder.append(_topologyId);
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
