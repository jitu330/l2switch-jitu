package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet
 *
 */
public class Ipv4PacketBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet> {

    private java.lang.Integer _checksum;
    private Ipv4Address _destinationIpv4;
    private Dscp _dscp;
    private java.lang.Short _ecn;
    private java.lang.Integer _fragmentOffset;
    private java.lang.Integer _id;
    private java.lang.Short _ihl;
    private java.lang.Integer _ipv4Length;
    private byte[] _ipv4Options;
    private java.lang.Integer _payloadLength;
    private java.lang.Integer _payloadOffset;
    private KnownIpProtocols _protocol;
    private Ipv4Address _sourceIpv4;
    private java.lang.Short _ttl;
    private java.lang.Short _version;
    private java.lang.Boolean _dfFlag;
    private java.lang.Boolean _mfFlag;
    private java.lang.Boolean _reservedFlag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> augmentation = Collections.emptyMap();

    public Ipv4PacketBuilder() {
    }
    public Ipv4PacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields arg) {
        this._version = arg.getVersion();
        this._ihl = arg.getIhl();
        this._dscp = arg.getDscp();
        this._ecn = arg.getEcn();
        this._ipv4Length = arg.getIpv4Length();
        this._id = arg.getId();
        this._reservedFlag = arg.isReservedFlag();
        this._dfFlag = arg.isDfFlag();
        this._mfFlag = arg.isMfFlag();
        this._fragmentOffset = arg.getFragmentOffset();
        this._ttl = arg.getTtl();
        this._protocol = arg.getProtocol();
        this._checksum = arg.getChecksum();
        this._sourceIpv4 = arg.getSourceIpv4();
        this._destinationIpv4 = arg.getDestinationIpv4();
        this._ipv4Options = arg.getIpv4Options();
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }
    public Ipv4PacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields arg) {
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }

    public Ipv4PacketBuilder(Ipv4Packet base) {
        this._checksum = base.getChecksum();
        this._destinationIpv4 = base.getDestinationIpv4();
        this._dscp = base.getDscp();
        this._ecn = base.getEcn();
        this._fragmentOffset = base.getFragmentOffset();
        this._id = base.getId();
        this._ihl = base.getIhl();
        this._ipv4Length = base.getIpv4Length();
        this._ipv4Options = base.getIpv4Options();
        this._payloadLength = base.getPayloadLength();
        this._payloadOffset = base.getPayloadOffset();
        this._protocol = base.getProtocol();
        this._sourceIpv4 = base.getSourceIpv4();
        this._ttl = base.getTtl();
        this._version = base.getVersion();
        this._dfFlag = base.isDfFlag();
        this._mfFlag = base.isMfFlag();
        this._reservedFlag = base.isReservedFlag();
        if (base instanceof Ipv4PacketImpl) {
            Ipv4PacketImpl impl = (Ipv4PacketImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields) {
            this._version = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getVersion();
            this._ihl = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getIhl();
            this._dscp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getDscp();
            this._ecn = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getEcn();
            this._ipv4Length = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getIpv4Length();
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getId();
            this._reservedFlag = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).isReservedFlag();
            this._dfFlag = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).isDfFlag();
            this._mfFlag = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).isMfFlag();
            this._fragmentOffset = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getFragmentOffset();
            this._ttl = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getTtl();
            this._protocol = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getProtocol();
            this._checksum = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getChecksum();
            this._sourceIpv4 = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getSourceIpv4();
            this._destinationIpv4 = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getDestinationIpv4();
            this._ipv4Options = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields)arg).getIpv4Options();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields, org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.Ipv4PacketFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getChecksum() {
        return _checksum;
    }
    
    public Ipv4Address getDestinationIpv4() {
        return _destinationIpv4;
    }
    
    public Dscp getDscp() {
        return _dscp;
    }
    
    public java.lang.Short getEcn() {
        return _ecn;
    }
    
    public java.lang.Integer getFragmentOffset() {
        return _fragmentOffset;
    }
    
    public java.lang.Integer getId() {
        return _id;
    }
    
    public java.lang.Short getIhl() {
        return _ihl;
    }
    
    public java.lang.Integer getIpv4Length() {
        return _ipv4Length;
    }
    
    public byte[] getIpv4Options() {
        return _ipv4Options == null ? null : _ipv4Options.clone();
    }
    
    public java.lang.Integer getPayloadLength() {
        return _payloadLength;
    }
    
    public java.lang.Integer getPayloadOffset() {
        return _payloadOffset;
    }
    
    public KnownIpProtocols getProtocol() {
        return _protocol;
    }
    
    public Ipv4Address getSourceIpv4() {
        return _sourceIpv4;
    }
    
    public java.lang.Short getTtl() {
        return _ttl;
    }
    
    public java.lang.Short getVersion() {
        return _version;
    }
    
    public java.lang.Boolean isDfFlag() {
        return _dfFlag;
    }
    
    public java.lang.Boolean isMfFlag() {
        return _mfFlag;
    }
    
    public java.lang.Boolean isReservedFlag() {
        return _reservedFlag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkChecksumRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public Ipv4PacketBuilder setChecksum(final java.lang.Integer value) {
    if (value != null) {
        checkChecksumRange(value);
    }
        this._checksum = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setDestinationIpv4(final Ipv4Address value) {
        this._destinationIpv4 = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setDscp(final Dscp value) {
        this._dscp = value;
        return this;
    }
    
     
     private static void checkEcnRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public Ipv4PacketBuilder setEcn(final java.lang.Short value) {
    if (value != null) {
        checkEcnRange(value);
    }
        this._ecn = value;
        return this;
    }
    
     
     private static void checkFragmentOffsetRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public Ipv4PacketBuilder setFragmentOffset(final java.lang.Integer value) {
    if (value != null) {
        checkFragmentOffsetRange(value);
    }
        this._fragmentOffset = value;
        return this;
    }
    
     
     private static void checkIdRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public Ipv4PacketBuilder setId(final java.lang.Integer value) {
    if (value != null) {
        checkIdRange(value);
    }
        this._id = value;
        return this;
    }
    
     
     private static void checkIhlRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public Ipv4PacketBuilder setIhl(final java.lang.Short value) {
    if (value != null) {
        checkIhlRange(value);
    }
        this._ihl = value;
        return this;
    }
    
     
     private static void checkIpv4LengthRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public Ipv4PacketBuilder setIpv4Length(final java.lang.Integer value) {
    if (value != null) {
        checkIpv4LengthRange(value);
    }
        this._ipv4Length = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setIpv4Options(final byte[] value) {
        this._ipv4Options = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setPayloadLength(final java.lang.Integer value) {
        this._payloadLength = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setPayloadOffset(final java.lang.Integer value) {
        this._payloadOffset = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setProtocol(final KnownIpProtocols value) {
        this._protocol = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setSourceIpv4(final Ipv4Address value) {
        this._sourceIpv4 = value;
        return this;
    }
    
     
     private static void checkTtlRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public Ipv4PacketBuilder setTtl(final java.lang.Short value) {
    if (value != null) {
        checkTtlRange(value);
    }
        this._ttl = value;
        return this;
    }
    
     
     private static void checkVersionRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public Ipv4PacketBuilder setVersion(final java.lang.Short value) {
    if (value != null) {
        checkVersionRange(value);
    }
        this._version = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setDfFlag(final java.lang.Boolean value) {
        this._dfFlag = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setMfFlag(final java.lang.Boolean value) {
        this._mfFlag = value;
        return this;
    }
    
     
    public Ipv4PacketBuilder setReservedFlag(final java.lang.Boolean value) {
        this._reservedFlag = value;
        return this;
    }
    
    public Ipv4PacketBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public Ipv4PacketBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Ipv4Packet build() {
        return new Ipv4PacketImpl(this);
    }

    private static final class Ipv4PacketImpl implements Ipv4Packet {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet.class;
        }

        private final java.lang.Integer _checksum;
        private final Ipv4Address _destinationIpv4;
        private final Dscp _dscp;
        private final java.lang.Short _ecn;
        private final java.lang.Integer _fragmentOffset;
        private final java.lang.Integer _id;
        private final java.lang.Short _ihl;
        private final java.lang.Integer _ipv4Length;
        private final byte[] _ipv4Options;
        private final java.lang.Integer _payloadLength;
        private final java.lang.Integer _payloadOffset;
        private final KnownIpProtocols _protocol;
        private final Ipv4Address _sourceIpv4;
        private final java.lang.Short _ttl;
        private final java.lang.Short _version;
        private final java.lang.Boolean _dfFlag;
        private final java.lang.Boolean _mfFlag;
        private final java.lang.Boolean _reservedFlag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> augmentation = Collections.emptyMap();

        private Ipv4PacketImpl(Ipv4PacketBuilder base) {
            this._checksum = base.getChecksum();
            this._destinationIpv4 = base.getDestinationIpv4();
            this._dscp = base.getDscp();
            this._ecn = base.getEcn();
            this._fragmentOffset = base.getFragmentOffset();
            this._id = base.getId();
            this._ihl = base.getIhl();
            this._ipv4Length = base.getIpv4Length();
            this._ipv4Options = base.getIpv4Options();
            this._payloadLength = base.getPayloadLength();
            this._payloadOffset = base.getPayloadOffset();
            this._protocol = base.getProtocol();
            this._sourceIpv4 = base.getSourceIpv4();
            this._ttl = base.getTtl();
            this._version = base.getVersion();
            this._dfFlag = base.isDfFlag();
            this._mfFlag = base.isMfFlag();
            this._reservedFlag = base.isReservedFlag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getChecksum() {
            return _checksum;
        }
        
        @Override
        public Ipv4Address getDestinationIpv4() {
            return _destinationIpv4;
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
        public java.lang.Integer getFragmentOffset() {
            return _fragmentOffset;
        }
        
        @Override
        public java.lang.Integer getId() {
            return _id;
        }
        
        @Override
        public java.lang.Short getIhl() {
            return _ihl;
        }
        
        @Override
        public java.lang.Integer getIpv4Length() {
            return _ipv4Length;
        }
        
        @Override
        public byte[] getIpv4Options() {
            return _ipv4Options == null ? null : _ipv4Options.clone();
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
        public KnownIpProtocols getProtocol() {
            return _protocol;
        }
        
        @Override
        public Ipv4Address getSourceIpv4() {
            return _sourceIpv4;
        }
        
        @Override
        public java.lang.Short getTtl() {
            return _ttl;
        }
        
        @Override
        public java.lang.Short getVersion() {
            return _version;
        }
        
        @Override
        public java.lang.Boolean isDfFlag() {
            return _dfFlag;
        }
        
        @Override
        public java.lang.Boolean isMfFlag() {
            return _mfFlag;
        }
        
        @Override
        public java.lang.Boolean isReservedFlag() {
            return _reservedFlag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_checksum);
            result = prime * result + Objects.hashCode(_destinationIpv4);
            result = prime * result + Objects.hashCode(_dscp);
            result = prime * result + Objects.hashCode(_ecn);
            result = prime * result + Objects.hashCode(_fragmentOffset);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ihl);
            result = prime * result + Objects.hashCode(_ipv4Length);
            result = prime * result + Arrays.hashCode(_ipv4Options);
            result = prime * result + Objects.hashCode(_payloadLength);
            result = prime * result + Objects.hashCode(_payloadOffset);
            result = prime * result + Objects.hashCode(_protocol);
            result = prime * result + Objects.hashCode(_sourceIpv4);
            result = prime * result + Objects.hashCode(_ttl);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_dfFlag);
            result = prime * result + Objects.hashCode(_mfFlag);
            result = prime * result + Objects.hashCode(_reservedFlag);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet)obj;
            if (!Objects.equals(_checksum, other.getChecksum())) {
                return false;
            }
            if (!Objects.equals(_destinationIpv4, other.getDestinationIpv4())) {
                return false;
            }
            if (!Objects.equals(_dscp, other.getDscp())) {
                return false;
            }
            if (!Objects.equals(_ecn, other.getEcn())) {
                return false;
            }
            if (!Objects.equals(_fragmentOffset, other.getFragmentOffset())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ihl, other.getIhl())) {
                return false;
            }
            if (!Objects.equals(_ipv4Length, other.getIpv4Length())) {
                return false;
            }
            if (!Arrays.equals(_ipv4Options, other.getIpv4Options())) {
                return false;
            }
            if (!Objects.equals(_payloadLength, other.getPayloadLength())) {
                return false;
            }
            if (!Objects.equals(_payloadOffset, other.getPayloadOffset())) {
                return false;
            }
            if (!Objects.equals(_protocol, other.getProtocol())) {
                return false;
            }
            if (!Objects.equals(_sourceIpv4, other.getSourceIpv4())) {
                return false;
            }
            if (!Objects.equals(_ttl, other.getTtl())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_dfFlag, other.isDfFlag())) {
                return false;
            }
            if (!Objects.equals(_mfFlag, other.isMfFlag())) {
                return false;
            }
            if (!Objects.equals(_reservedFlag, other.isReservedFlag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Ipv4PacketImpl otherImpl = (Ipv4PacketImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.ipv4.packet.received.packet.chain.packet.Ipv4Packet>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Ipv4Packet [");
            boolean first = true;
        
            if (_checksum != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_checksum=");
                builder.append(_checksum);
             }
            if (_destinationIpv4 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_destinationIpv4=");
                builder.append(_destinationIpv4);
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
            if (_fragmentOffset != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_fragmentOffset=");
                builder.append(_fragmentOffset);
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
            if (_ihl != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ihl=");
                builder.append(_ihl);
             }
            if (_ipv4Length != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv4Length=");
                builder.append(_ipv4Length);
             }
            if (_ipv4Options != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv4Options=");
                builder.append(Arrays.toString(_ipv4Options));
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
            if (_protocol != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_protocol=");
                builder.append(_protocol);
             }
            if (_sourceIpv4 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sourceIpv4=");
                builder.append(_sourceIpv4);
             }
            if (_ttl != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ttl=");
                builder.append(_ttl);
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
            if (_dfFlag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dfFlag=");
                builder.append(_dfFlag);
             }
            if (_mfFlag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mfFlag=");
                builder.append(_mfFlag);
             }
            if (_reservedFlag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reservedFlag=");
                builder.append(_reservedFlag);
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
