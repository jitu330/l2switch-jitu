package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.fields.Header8021q;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.KnownEtherType;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket
 *
 */
public class EthernetPacketBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket> {

    private java.lang.Long _crc;
    private MacAddress _destinationMac;
    private java.lang.Integer _ethernetLength;
    private KnownEtherType _ethertype;
    private List<Header8021q> _header8021q;
    private java.lang.Integer _payloadLength;
    private java.lang.Integer _payloadOffset;
    private MacAddress _sourceMac;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> augmentation = Collections.emptyMap();

    public EthernetPacketBuilder() {
    }
    public EthernetPacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields arg) {
        this._sourceMac = arg.getSourceMac();
        this._destinationMac = arg.getDestinationMac();
        this._header8021q = arg.getHeader8021q();
        this._ethertype = arg.getEthertype();
        this._ethernetLength = arg.getEthernetLength();
        this._crc = arg.getCrc();
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }
    public EthernetPacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields arg) {
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }

    public EthernetPacketBuilder(EthernetPacket base) {
        this._crc = base.getCrc();
        this._destinationMac = base.getDestinationMac();
        this._ethernetLength = base.getEthernetLength();
        this._ethertype = base.getEthertype();
        this._header8021q = base.getHeader8021q();
        this._payloadLength = base.getPayloadLength();
        this._payloadOffset = base.getPayloadOffset();
        this._sourceMac = base.getSourceMac();
        if (base instanceof EthernetPacketImpl) {
            EthernetPacketImpl impl = (EthernetPacketImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields) {
            this._sourceMac = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields)arg).getSourceMac();
            this._destinationMac = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields)arg).getDestinationMac();
            this._header8021q = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields)arg).getHeader8021q();
            this._ethertype = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields)arg).getEthertype();
            this._ethernetLength = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields)arg).getEthernetLength();
            this._crc = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields)arg).getCrc();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields) {
            this._payloadOffset = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields)arg).getPayloadOffset();
            this._payloadLength = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields)arg).getPayloadLength();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.EthernetPacketFields, org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCrc() {
        return _crc;
    }
    
    public MacAddress getDestinationMac() {
        return _destinationMac;
    }
    
    public java.lang.Integer getEthernetLength() {
        return _ethernetLength;
    }
    
    public KnownEtherType getEthertype() {
        return _ethertype;
    }
    
    public List<Header8021q> getHeader8021q() {
        return _header8021q;
    }
    
    public java.lang.Integer getPayloadLength() {
        return _payloadLength;
    }
    
    public java.lang.Integer getPayloadOffset() {
        return _payloadOffset;
    }
    
    public MacAddress getSourceMac() {
        return _sourceMac;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCrcRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public EthernetPacketBuilder setCrc(final java.lang.Long value) {
    if (value != null) {
        checkCrcRange(value);
    }
        this._crc = value;
        return this;
    }
    
     
    public EthernetPacketBuilder setDestinationMac(final MacAddress value) {
        this._destinationMac = value;
        return this;
    }
    
     
     private static void checkEthernetLengthRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public EthernetPacketBuilder setEthernetLength(final java.lang.Integer value) {
    if (value != null) {
        checkEthernetLengthRange(value);
    }
        this._ethernetLength = value;
        return this;
    }
    
     
    public EthernetPacketBuilder setEthertype(final KnownEtherType value) {
        this._ethertype = value;
        return this;
    }
    
     
    public EthernetPacketBuilder setHeader8021q(final List<Header8021q> value) {
        this._header8021q = value;
        return this;
    }
    
     
    public EthernetPacketBuilder setPayloadLength(final java.lang.Integer value) {
        this._payloadLength = value;
        return this;
    }
    
     
    public EthernetPacketBuilder setPayloadOffset(final java.lang.Integer value) {
        this._payloadOffset = value;
        return this;
    }
    
     
    public EthernetPacketBuilder setSourceMac(final MacAddress value) {
        this._sourceMac = value;
        return this;
    }
    
    public EthernetPacketBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public EthernetPacketBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public EthernetPacket build() {
        return new EthernetPacketImpl(this);
    }

    private static final class EthernetPacketImpl implements EthernetPacket {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket.class;
        }

        private final java.lang.Long _crc;
        private final MacAddress _destinationMac;
        private final java.lang.Integer _ethernetLength;
        private final KnownEtherType _ethertype;
        private final List<Header8021q> _header8021q;
        private final java.lang.Integer _payloadLength;
        private final java.lang.Integer _payloadOffset;
        private final MacAddress _sourceMac;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> augmentation = Collections.emptyMap();

        private EthernetPacketImpl(EthernetPacketBuilder base) {
            this._crc = base.getCrc();
            this._destinationMac = base.getDestinationMac();
            this._ethernetLength = base.getEthernetLength();
            this._ethertype = base.getEthertype();
            this._header8021q = base.getHeader8021q();
            this._payloadLength = base.getPayloadLength();
            this._payloadOffset = base.getPayloadOffset();
            this._sourceMac = base.getSourceMac();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCrc() {
            return _crc;
        }
        
        @Override
        public MacAddress getDestinationMac() {
            return _destinationMac;
        }
        
        @Override
        public java.lang.Integer getEthernetLength() {
            return _ethernetLength;
        }
        
        @Override
        public KnownEtherType getEthertype() {
            return _ethertype;
        }
        
        @Override
        public List<Header8021q> getHeader8021q() {
            return _header8021q;
        }
        
        @Override
        public java.lang.Integer getPayloadLength() {
            return _payloadLength;
        }
        
        @Override
        public java.lang.Integer getPayloadOffset() {
            return _payloadOffset;
        }
        
        @Override
        public MacAddress getSourceMac() {
            return _sourceMac;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_crc);
            result = prime * result + Objects.hashCode(_destinationMac);
            result = prime * result + Objects.hashCode(_ethernetLength);
            result = prime * result + Objects.hashCode(_ethertype);
            result = prime * result + Objects.hashCode(_header8021q);
            result = prime * result + Objects.hashCode(_payloadLength);
            result = prime * result + Objects.hashCode(_payloadOffset);
            result = prime * result + Objects.hashCode(_sourceMac);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket)obj;
            if (!Objects.equals(_crc, other.getCrc())) {
                return false;
            }
            if (!Objects.equals(_destinationMac, other.getDestinationMac())) {
                return false;
            }
            if (!Objects.equals(_ethernetLength, other.getEthernetLength())) {
                return false;
            }
            if (!Objects.equals(_ethertype, other.getEthertype())) {
                return false;
            }
            if (!Objects.equals(_header8021q, other.getHeader8021q())) {
                return false;
            }
            if (!Objects.equals(_payloadLength, other.getPayloadLength())) {
                return false;
            }
            if (!Objects.equals(_payloadOffset, other.getPayloadOffset())) {
                return false;
            }
            if (!Objects.equals(_sourceMac, other.getSourceMac())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EthernetPacketImpl otherImpl = (EthernetPacketImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EthernetPacket [");
            boolean first = true;
        
            if (_crc != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_crc=");
                builder.append(_crc);
             }
            if (_destinationMac != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_destinationMac=");
                builder.append(_destinationMac);
             }
            if (_ethernetLength != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethernetLength=");
                builder.append(_ethernetLength);
             }
            if (_ethertype != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethertype=");
                builder.append(_ethertype);
             }
            if (_header8021q != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_header8021q=");
                builder.append(_header8021q);
             }
            if (_payloadLength != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_payloadLength=");
                builder.append(_payloadLength);
             }
            if (_payloadOffset != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_payloadOffset=");
                builder.append(_payloadOffset);
             }
            if (_sourceMac != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sourceMac=");
                builder.append(_sourceMac);
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
