package org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.VlanId;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses
 *
 */
public class AddressesBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses> {

    private java.lang.Long _firstSeen;
    private BigInteger _id;
    private IpAddress _ip;
    private AddressesKey _key;
    private java.lang.Long _lastSeen;
    private MacAddress _mac;
    private VlanId _vlan;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> augmentation = Collections.emptyMap();

    public AddressesBuilder() {
    }

    public AddressesBuilder(Addresses base) {
        if (base.getKey() == null) {
            this._key = new AddressesKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._firstSeen = base.getFirstSeen();
        this._ip = base.getIp();
        this._lastSeen = base.getLastSeen();
        this._mac = base.getMac();
        this._vlan = base.getVlan();
        if (base instanceof AddressesImpl) {
            AddressesImpl impl = (AddressesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getFirstSeen() {
        return _firstSeen;
    }
    
    public BigInteger getId() {
        return _id;
    }
    
    public IpAddress getIp() {
        return _ip;
    }
    
    public AddressesKey getKey() {
        return _key;
    }
    
    public java.lang.Long getLastSeen() {
        return _lastSeen;
    }
    
    public MacAddress getMac() {
        return _mac;
    }
    
    public VlanId getVlan() {
        return _vlan;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AddressesBuilder setFirstSeen(final java.lang.Long value) {
        this._firstSeen = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKIDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKIDRANGE_RANGES = a;
     }
     private static void checkIdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKIDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKIDRANGE_RANGES)));
     }
    
    public AddressesBuilder setId(final BigInteger value) {
    if (value != null) {
        checkIdRange(value);
    }
        this._id = value;
        return this;
    }
    
     
    public AddressesBuilder setIp(final IpAddress value) {
        this._ip = value;
        return this;
    }
    
     
    public AddressesBuilder setKey(final AddressesKey value) {
        this._key = value;
        return this;
    }
    
     
    public AddressesBuilder setLastSeen(final java.lang.Long value) {
        this._lastSeen = value;
        return this;
    }
    
     
    public AddressesBuilder setMac(final MacAddress value) {
        this._mac = value;
        return this;
    }
    
     
    public AddressesBuilder setVlan(final VlanId value) {
        this._vlan = value;
        return this;
    }
    
    public AddressesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AddressesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Addresses build() {
        return new AddressesImpl(this);
    }

    private static final class AddressesImpl implements Addresses {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses.class;
        }

        private final java.lang.Long _firstSeen;
        private final BigInteger _id;
        private final IpAddress _ip;
        private final AddressesKey _key;
        private final java.lang.Long _lastSeen;
        private final MacAddress _mac;
        private final VlanId _vlan;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> augmentation = Collections.emptyMap();

        private AddressesImpl(AddressesBuilder base) {
            if (base.getKey() == null) {
                this._key = new AddressesKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._firstSeen = base.getFirstSeen();
            this._ip = base.getIp();
            this._lastSeen = base.getLastSeen();
            this._mac = base.getMac();
            this._vlan = base.getVlan();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getFirstSeen() {
            return _firstSeen;
        }
        
        @Override
        public BigInteger getId() {
            return _id;
        }
        
        @Override
        public IpAddress getIp() {
            return _ip;
        }
        
        @Override
        public AddressesKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getLastSeen() {
            return _lastSeen;
        }
        
        @Override
        public MacAddress getMac() {
            return _mac;
        }
        
        @Override
        public VlanId getVlan() {
            return _vlan;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_firstSeen);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ip);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_lastSeen);
            result = prime * result + Objects.hashCode(_mac);
            result = prime * result + Objects.hashCode(_vlan);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses other = (org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses)obj;
            if (!Objects.equals(_firstSeen, other.getFirstSeen())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ip, other.getIp())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_lastSeen, other.getLastSeen())) {
                return false;
            }
            if (!Objects.equals(_mac, other.getMac())) {
                return false;
            }
            if (!Objects.equals(_vlan, other.getVlan())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddressesImpl otherImpl = (AddressesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Addresses [");
            boolean first = true;
        
            if (_firstSeen != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_firstSeen=");
                builder.append(_firstSeen);
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
            if (_ip != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ip=");
                builder.append(_ip);
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
            if (_lastSeen != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lastSeen=");
                builder.append(_lastSeen);
             }
            if (_mac != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mac=");
                builder.append(_mac);
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
