package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig
 *
 */
public class AddressTrackerConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig> {

    private java.lang.String _observeAddressesFrom;
    private java.lang.Long _timestampUpdateInterval;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> augmentation = Collections.emptyMap();

    public AddressTrackerConfigBuilder() {
    }

    public AddressTrackerConfigBuilder(AddressTrackerConfig base) {
        this._observeAddressesFrom = base.getObserveAddressesFrom();
        this._timestampUpdateInterval = base.getTimestampUpdateInterval();
        if (base instanceof AddressTrackerConfigImpl) {
            AddressTrackerConfigImpl impl = (AddressTrackerConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getObserveAddressesFrom() {
        return _observeAddressesFrom;
    }
    
    public java.lang.Long getTimestampUpdateInterval() {
        return _timestampUpdateInterval;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AddressTrackerConfigBuilder setObserveAddressesFrom(final java.lang.String value) {
        this._observeAddressesFrom = value;
        return this;
    }
    
     
     private static void checkTimestampUpdateIntervalRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public AddressTrackerConfigBuilder setTimestampUpdateInterval(final java.lang.Long value) {
    if (value != null) {
        checkTimestampUpdateIntervalRange(value);
    }
        this._timestampUpdateInterval = value;
        return this;
    }
    
    public AddressTrackerConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AddressTrackerConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AddressTrackerConfig build() {
        return new AddressTrackerConfigImpl(this);
    }

    private static final class AddressTrackerConfigImpl implements AddressTrackerConfig {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig.class;
        }

        private final java.lang.String _observeAddressesFrom;
        private final java.lang.Long _timestampUpdateInterval;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> augmentation = Collections.emptyMap();

        private AddressTrackerConfigImpl(AddressTrackerConfigBuilder base) {
            this._observeAddressesFrom = base.getObserveAddressesFrom();
            this._timestampUpdateInterval = base.getTimestampUpdateInterval();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getObserveAddressesFrom() {
            return _observeAddressesFrom;
        }
        
        @Override
        public java.lang.Long getTimestampUpdateInterval() {
            return _timestampUpdateInterval;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_observeAddressesFrom);
            result = prime * result + Objects.hashCode(_timestampUpdateInterval);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig)obj;
            if (!Objects.equals(_observeAddressesFrom, other.getObserveAddressesFrom())) {
                return false;
            }
            if (!Objects.equals(_timestampUpdateInterval, other.getTimestampUpdateInterval())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddressTrackerConfigImpl otherImpl = (AddressTrackerConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621.AddressTrackerConfig>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AddressTrackerConfig [");
            boolean first = true;
        
            if (_observeAddressesFrom != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_observeAddressesFrom=");
                builder.append(_observeAddressesFrom);
             }
            if (_timestampUpdateInterval != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_timestampUpdateInterval=");
                builder.append(_timestampUpdateInterval);
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
