package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.PacketChain;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived
 *
 */
public class Ipv6PacketReceivedBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived> {

    private List<PacketChain> _packetChain;
    private byte[] _payload;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> augmentation = Collections.emptyMap();

    public Ipv6PacketReceivedBuilder() {
    }
    public Ipv6PacketReceivedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketChainGrp arg) {
        this._packetChain = arg.getPacketChain();
    }
    public Ipv6PacketReceivedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketPayload arg) {
        this._payload = arg.getPayload();
    }

    public Ipv6PacketReceivedBuilder(Ipv6PacketReceived base) {
        this._packetChain = base.getPacketChain();
        this._payload = base.getPayload();
        if (base instanceof Ipv6PacketReceivedImpl) {
            Ipv6PacketReceivedImpl impl = (Ipv6PacketReceivedImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketPayload</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketChainGrp</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketPayload) {
            this._payload = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketPayload)arg).getPayload();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketChainGrp) {
            this._packetChain = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketChainGrp)arg).getPacketChain();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketPayload, org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketChainGrp] \n" +
              "but was: " + arg
            );
        }
    }

    public List<PacketChain> getPacketChain() {
        return _packetChain;
    }
    
    public byte[] getPayload() {
        return _payload == null ? null : _payload.clone();
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Ipv6PacketReceivedBuilder setPacketChain(final List<PacketChain> value) {
        this._packetChain = value;
        return this;
    }
    
     
    public Ipv6PacketReceivedBuilder setPayload(final byte[] value) {
        this._payload = value;
        return this;
    }
    
    public Ipv6PacketReceivedBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public Ipv6PacketReceivedBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Ipv6PacketReceived build() {
        return new Ipv6PacketReceivedImpl(this);
    }

    private static final class Ipv6PacketReceivedImpl implements Ipv6PacketReceived {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived.class;
        }

        private final List<PacketChain> _packetChain;
        private final byte[] _payload;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> augmentation = Collections.emptyMap();

        private Ipv6PacketReceivedImpl(Ipv6PacketReceivedBuilder base) {
            this._packetChain = base.getPacketChain();
            this._payload = base.getPayload();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<PacketChain> getPacketChain() {
            return _packetChain;
        }
        
        @Override
        public byte[] getPayload() {
            return _payload == null ? null : _payload.clone();
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_packetChain);
            result = prime * result + Arrays.hashCode(_payload);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived)obj;
            if (!Objects.equals(_packetChain, other.getPacketChain())) {
                return false;
            }
            if (!Arrays.equals(_payload, other.getPayload())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Ipv6PacketReceivedImpl otherImpl = (Ipv6PacketReceivedImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketReceived>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Ipv6PacketReceived [");
            boolean first = true;
        
            if (_packetChain != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetChain=");
                builder.append(_packetChain);
             }
            if (_payload != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_payload=");
                builder.append(Arrays.toString(_payload));
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
