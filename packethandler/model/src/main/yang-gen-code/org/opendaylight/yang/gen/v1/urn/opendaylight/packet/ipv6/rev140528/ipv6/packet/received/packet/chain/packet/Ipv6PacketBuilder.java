package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv6Address;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet
 *
 */
public class Ipv6PacketBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet> {

    private Ipv6Address _destinationIpv6;
    private Dscp _dscp;
    private java.lang.Short _ecn;
    private List<ExtensionHeaders> _extensionHeaders;
    private java.lang.Long _flowLabel;
    private java.lang.Short _hopLimit;
    private java.lang.Integer _ipv6Length;
    private KnownIpProtocols _nextHeader;
    private java.lang.Integer _payloadLength;
    private java.lang.Integer _payloadOffset;
    private Ipv6Address _sourceIpv6;
    private java.lang.Short _version;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> augmentation = Collections.emptyMap();

    public Ipv6PacketBuilder() {
    }
    public Ipv6PacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields arg) {
        this._version = arg.getVersion();
        this._dscp = arg.getDscp();
        this._ecn = arg.getEcn();
        this._flowLabel = arg.getFlowLabel();
        this._ipv6Length = arg.getIpv6Length();
        this._nextHeader = arg.getNextHeader();
        this._hopLimit = arg.getHopLimit();
        this._sourceIpv6 = arg.getSourceIpv6();
        this._destinationIpv6 = arg.getDestinationIpv6();
        this._extensionHeaders = arg.getExtensionHeaders();
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }
    public Ipv6PacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields arg) {
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }

    public Ipv6PacketBuilder(Ipv6Packet base) {
        this._destinationIpv6 = base.getDestinationIpv6();
        this._dscp = base.getDscp();
        this._ecn = base.getEcn();
        this._extensionHeaders = base.getExtensionHeaders();
        this._flowLabel = base.getFlowLabel();
        this._hopLimit = base.getHopLimit();
        this._ipv6Length = base.getIpv6Length();
        this._nextHeader = base.getNextHeader();
        this._payloadLength = base.getPayloadLength();
        this._payloadOffset = base.getPayloadOffset();
        this._sourceIpv6 = base.getSourceIpv6();
        this._version = base.getVersion();
        if (base instanceof Ipv6PacketImpl) {
            Ipv6PacketImpl impl = (Ipv6PacketImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields) {
            this._payloadOffset = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields)arg).getPayloadOffset();
            this._payloadLength = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields)arg).getPayloadLength();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields) {
            this._version = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getVersion();
            this._dscp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getDscp();
            this._ecn = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getEcn();
            this._flowLabel = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getFlowLabel();
            this._ipv6Length = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getIpv6Length();
            this._nextHeader = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getNextHeader();
            this._hopLimit = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getHopLimit();
            this._sourceIpv6 = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getSourceIpv6();
            this._destinationIpv6 = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getDestinationIpv6();
            this._extensionHeaders = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields)arg).getExtensionHeaders();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields, org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.Ipv6PacketFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Ipv6Address getDestinationIpv6() {
        return _destinationIpv6;
    }
    
    public Dscp getDscp() {
        return _dscp;
    }
    
    public java.lang.Short getEcn() {
        return _ecn;
    }
    
    public List<ExtensionHeaders> getExtensionHeaders() {
        return _extensionHeaders;
    }
    
    public java.lang.Long getFlowLabel() {
        return _flowLabel;
    }
    
    public java.lang.Short getHopLimit() {
        return _hopLimit;
    }
    
    public java.lang.Integer getIpv6Length() {
        return _ipv6Length;
    }
    
    public KnownIpProtocols getNextHeader() {
        return _nextHeader;
    }
    
    public java.lang.Integer getPayloadLength() {
        return _payloadLength;
    }
    
    public java.lang.Integer getPayloadOffset() {
        return _payloadOffset;
    }
    
    public Ipv6Address getSourceIpv6() {
        return _sourceIpv6;
    }
    
    public java.lang.Short getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Ipv6PacketBuilder setDestinationIpv6(final Ipv6Address value) {
        this._destinationIpv6 = value;
        return this;
    }
    
     
    public Ipv6PacketBuilder setDscp(final Dscp value) {
        this._dscp = value;
        return this;
    }
    
     
     private static void checkEcnRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public Ipv6PacketBuilder setEcn(final java.lang.Short value) {
    if (value != null) {
        checkEcnRange(value);
    }
        this._ecn = value;
        return this;
    }
    
     
    public Ipv6PacketBuilder setExtensionHeaders(final List<ExtensionHeaders> value) {
        this._extensionHeaders = value;
        return this;
    }
    
     
     private static void checkFlowLabelRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public Ipv6PacketBuilder setFlowLabel(final java.lang.Long value) {
    if (value != null) {
        checkFlowLabelRange(value);
    }
        this._flowLabel = value;
        return this;
    }
    
     
     private static void checkHopLimitRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public Ipv6PacketBuilder setHopLimit(final java.lang.Short value) {
    if (value != null) {
        checkHopLimitRange(value);
    }
        this._hopLimit = value;
        return this;
    }
    
     
     private static void checkIpv6LengthRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public Ipv6PacketBuilder setIpv6Length(final java.lang.Integer value) {
    if (value != null) {
        checkIpv6LengthRange(value);
    }
        this._ipv6Length = value;
        return this;
    }
    
     
    public Ipv6PacketBuilder setNextHeader(final KnownIpProtocols value) {
        this._nextHeader = value;
        return this;
    }
    
     
    public Ipv6PacketBuilder setPayloadLength(final java.lang.Integer value) {
        this._payloadLength = value;
        return this;
    }
    
     
    public Ipv6PacketBuilder setPayloadOffset(final java.lang.Integer value) {
        this._payloadOffset = value;
        return this;
    }
    
     
    public Ipv6PacketBuilder setSourceIpv6(final Ipv6Address value) {
        this._sourceIpv6 = value;
        return this;
    }
    
     
     private static void checkVersionRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public Ipv6PacketBuilder setVersion(final java.lang.Short value) {
    if (value != null) {
        checkVersionRange(value);
    }
        this._version = value;
        return this;
    }
    
    public Ipv6PacketBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public Ipv6PacketBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Ipv6Packet build() {
        return new Ipv6PacketImpl(this);
    }

    private static final class Ipv6PacketImpl implements Ipv6Packet {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet.class;
        }

        private final Ipv6Address _destinationIpv6;
        private final Dscp _dscp;
        private final java.lang.Short _ecn;
        private final List<ExtensionHeaders> _extensionHeaders;
        private final java.lang.Long _flowLabel;
        private final java.lang.Short _hopLimit;
        private final java.lang.Integer _ipv6Length;
        private final KnownIpProtocols _nextHeader;
        private final java.lang.Integer _payloadLength;
        private final java.lang.Integer _payloadOffset;
        private final Ipv6Address _sourceIpv6;
        private final java.lang.Short _version;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> augmentation = Collections.emptyMap();

        private Ipv6PacketImpl(Ipv6PacketBuilder base) {
            this._destinationIpv6 = base.getDestinationIpv6();
            this._dscp = base.getDscp();
            this._ecn = base.getEcn();
            this._extensionHeaders = base.getExtensionHeaders();
            this._flowLabel = base.getFlowLabel();
            this._hopLimit = base.getHopLimit();
            this._ipv6Length = base.getIpv6Length();
            this._nextHeader = base.getNextHeader();
            this._payloadLength = base.getPayloadLength();
            this._payloadOffset = base.getPayloadOffset();
            this._sourceIpv6 = base.getSourceIpv6();
            this._version = base.getVersion();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Ipv6Address getDestinationIpv6() {
            return _destinationIpv6;
        }
        
        @Override
        public Dscp getDscp() {
            return _dscp;
        }
        
        @Override
        public java.lang.Short getEcn() {
            return _ecn;
        }
        
        @Override
        public List<ExtensionHeaders> getExtensionHeaders() {
            return _extensionHeaders;
        }
        
        @Override
        public java.lang.Long getFlowLabel() {
            return _flowLabel;
        }
        
        @Override
        public java.lang.Short getHopLimit() {
            return _hopLimit;
        }
        
        @Override
        public java.lang.Integer getIpv6Length() {
            return _ipv6Length;
        }
        
        @Override
        public KnownIpProtocols getNextHeader() {
            return _nextHeader;
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
        public Ipv6Address getSourceIpv6() {
            return _sourceIpv6;
        }
        
        @Override
        public java.lang.Short getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destinationIpv6);
            result = prime * result + Objects.hashCode(_dscp);
            result = prime * result + Objects.hashCode(_ecn);
            result = prime * result + Objects.hashCode(_extensionHeaders);
            result = prime * result + Objects.hashCode(_flowLabel);
            result = prime * result + Objects.hashCode(_hopLimit);
            result = prime * result + Objects.hashCode(_ipv6Length);
            result = prime * result + Objects.hashCode(_nextHeader);
            result = prime * result + Objects.hashCode(_payloadLength);
            result = prime * result + Objects.hashCode(_payloadOffset);
            result = prime * result + Objects.hashCode(_sourceIpv6);
            result = prime * result + Objects.hashCode(_version);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet)obj;
            if (!Objects.equals(_destinationIpv6, other.getDestinationIpv6())) {
                return false;
            }
            if (!Objects.equals(_dscp, other.getDscp())) {
                return false;
            }
            if (!Objects.equals(_ecn, other.getEcn())) {
                return false;
            }
            if (!Objects.equals(_extensionHeaders, other.getExtensionHeaders())) {
                return false;
            }
            if (!Objects.equals(_flowLabel, other.getFlowLabel())) {
                return false;
            }
            if (!Objects.equals(_hopLimit, other.getHopLimit())) {
                return false;
            }
            if (!Objects.equals(_ipv6Length, other.getIpv6Length())) {
                return false;
            }
            if (!Objects.equals(_nextHeader, other.getNextHeader())) {
                return false;
            }
            if (!Objects.equals(_payloadLength, other.getPayloadLength())) {
                return false;
            }
            if (!Objects.equals(_payloadOffset, other.getPayloadOffset())) {
                return false;
            }
            if (!Objects.equals(_sourceIpv6, other.getSourceIpv6())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Ipv6PacketImpl otherImpl = (Ipv6PacketImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.received.packet.chain.packet.Ipv6Packet>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Ipv6Packet [");
            boolean first = true;
        
            if (_destinationIpv6 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_destinationIpv6=");
                builder.append(_destinationIpv6);
             }
            if (_dscp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dscp=");
                builder.append(_dscp);
             }
            if (_ecn != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ecn=");
                builder.append(_ecn);
             }
            if (_extensionHeaders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_extensionHeaders=");
                builder.append(_extensionHeaders);
             }
            if (_flowLabel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowLabel=");
                builder.append(_flowLabel);
             }
            if (_hopLimit != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hopLimit=");
                builder.append(_hopLimit);
             }
            if (_ipv6Length != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Length=");
                builder.append(_ipv6Length);
             }
            if (_nextHeader != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nextHeader=");
                builder.append(_nextHeader);
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
            if (_sourceIpv6 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sourceIpv6=");
                builder.append(_sourceIpv6);
             }
            if (_version != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_version=");
                builder.append(_version);
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
