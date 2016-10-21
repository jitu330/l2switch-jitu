package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableId;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.ConnectionCookie;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket
 *
 */
public class RawPacketBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket> {

    private ConnectionCookie _connectionCookie;
    private FlowCookie _flowCookie;
    private NodeConnectorRef _ingress;
    private Match _match;
    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> _packetInReason;
    private java.lang.Integer _payloadLength;
    private java.lang.Integer _payloadOffset;
    private TableId _tableId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> augmentation = Collections.emptyMap();

    public RawPacketBuilder() {
    }
    public RawPacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields arg) {
        this._ingress = arg.getIngress();
        this._connectionCookie = arg.getConnectionCookie();
        this._flowCookie = arg.getFlowCookie();
        this._tableId = arg.getTableId();
        this._packetInReason = arg.getPacketInReason();
        this._match = arg.getMatch();
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }
    public RawPacketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields arg) {
        this._payloadOffset = arg.getPayloadOffset();
        this._payloadLength = arg.getPayloadLength();
    }

    public RawPacketBuilder(RawPacket base) {
        this._connectionCookie = base.getConnectionCookie();
        this._flowCookie = base.getFlowCookie();
        this._ingress = base.getIngress();
        this._match = base.getMatch();
        this._packetInReason = base.getPacketInReason();
        this._payloadLength = base.getPayloadLength();
        this._payloadOffset = base.getPayloadOffset();
        this._tableId = base.getTableId();
        if (base instanceof RawPacketImpl) {
            RawPacketImpl impl = (RawPacketImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields) {
            this._ingress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields)arg).getIngress();
            this._connectionCookie = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields)arg).getConnectionCookie();
            this._flowCookie = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields)arg).getFlowCookie();
            this._tableId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields)arg).getTableId();
            this._packetInReason = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields)arg).getPacketInReason();
            this._match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields)arg).getMatch();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields, org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.RawPacketFields] \n" +
              "but was: " + arg
            );
        }
    }

    public ConnectionCookie getConnectionCookie() {
        return _connectionCookie;
    }
    
    public FlowCookie getFlowCookie() {
        return _flowCookie;
    }
    
    public NodeConnectorRef getIngress() {
        return _ingress;
    }
    
    public Match getMatch() {
        return _match;
    }
    
    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> getPacketInReason() {
        return _packetInReason;
    }
    
    public java.lang.Integer getPayloadLength() {
        return _payloadLength;
    }
    
    public java.lang.Integer getPayloadOffset() {
        return _payloadOffset;
    }
    
    public TableId getTableId() {
        return _tableId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RawPacketBuilder setConnectionCookie(final ConnectionCookie value) {
        this._connectionCookie = value;
        return this;
    }
    
     
    public RawPacketBuilder setFlowCookie(final FlowCookie value) {
        this._flowCookie = value;
        return this;
    }
    
     
    public RawPacketBuilder setIngress(final NodeConnectorRef value) {
        this._ingress = value;
        return this;
    }
    
     
    public RawPacketBuilder setMatch(final Match value) {
        this._match = value;
        return this;
    }
    
     
    public RawPacketBuilder setPacketInReason(final java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> value) {
        this._packetInReason = value;
        return this;
    }
    
     
    public RawPacketBuilder setPayloadLength(final java.lang.Integer value) {
        this._payloadLength = value;
        return this;
    }
    
     
    public RawPacketBuilder setPayloadOffset(final java.lang.Integer value) {
        this._payloadOffset = value;
        return this;
    }
    
     
    public RawPacketBuilder setTableId(final TableId value) {
        this._tableId = value;
        return this;
    }
    
    public RawPacketBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RawPacketBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public RawPacket build() {
        return new RawPacketImpl(this);
    }

    private static final class RawPacketImpl implements RawPacket {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket.class;
        }

        private final ConnectionCookie _connectionCookie;
        private final FlowCookie _flowCookie;
        private final NodeConnectorRef _ingress;
        private final Match _match;
        private final java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> _packetInReason;
        private final java.lang.Integer _payloadLength;
        private final java.lang.Integer _payloadOffset;
        private final TableId _tableId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> augmentation = Collections.emptyMap();

        private RawPacketImpl(RawPacketBuilder base) {
            this._connectionCookie = base.getConnectionCookie();
            this._flowCookie = base.getFlowCookie();
            this._ingress = base.getIngress();
            this._match = base.getMatch();
            this._packetInReason = base.getPacketInReason();
            this._payloadLength = base.getPayloadLength();
            this._payloadOffset = base.getPayloadOffset();
            this._tableId = base.getTableId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ConnectionCookie getConnectionCookie() {
            return _connectionCookie;
        }
        
        @Override
        public FlowCookie getFlowCookie() {
            return _flowCookie;
        }
        
        @Override
        public NodeConnectorRef getIngress() {
            return _ingress;
        }
        
        @Override
        public Match getMatch() {
            return _match;
        }
        
        @Override
        public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> getPacketInReason() {
            return _packetInReason;
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
        public TableId getTableId() {
            return _tableId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionCookie);
            result = prime * result + Objects.hashCode(_flowCookie);
            result = prime * result + Objects.hashCode(_ingress);
            result = prime * result + Objects.hashCode(_match);
            result = prime * result + Objects.hashCode(_packetInReason);
            result = prime * result + Objects.hashCode(_payloadLength);
            result = prime * result + Objects.hashCode(_payloadOffset);
            result = prime * result + Objects.hashCode(_tableId);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket)obj;
            if (!Objects.equals(_connectionCookie, other.getConnectionCookie())) {
                return false;
            }
            if (!Objects.equals(_flowCookie, other.getFlowCookie())) {
                return false;
            }
            if (!Objects.equals(_ingress, other.getIngress())) {
                return false;
            }
            if (!Objects.equals(_match, other.getMatch())) {
                return false;
            }
            if (!Objects.equals(_packetInReason, other.getPacketInReason())) {
                return false;
            }
            if (!Objects.equals(_payloadLength, other.getPayloadLength())) {
                return false;
            }
            if (!Objects.equals(_payloadOffset, other.getPayloadOffset())) {
                return false;
            }
            if (!Objects.equals(_tableId, other.getTableId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RawPacketImpl otherImpl = (RawPacketImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("RawPacket [");
            boolean first = true;
        
            if (_connectionCookie != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connectionCookie=");
                builder.append(_connectionCookie);
             }
            if (_flowCookie != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowCookie=");
                builder.append(_flowCookie);
             }
            if (_ingress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ingress=");
                builder.append(_ingress);
             }
            if (_match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_match=");
                builder.append(_match);
             }
            if (_packetInReason != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetInReason=");
                builder.append(_packetInReason);
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
            if (_tableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableId=");
                builder.append(_tableId);
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
