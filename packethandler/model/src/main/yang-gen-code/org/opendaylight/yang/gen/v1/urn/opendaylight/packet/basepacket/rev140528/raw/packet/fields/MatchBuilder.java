package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Layer3Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.TcpFlagsMatch;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Layer4Match;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match
 *
 */
public class MatchBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match> {

    private EthernetMatch _ethernetMatch;
    private Icmpv4Match _icmpv4Match;
    private Icmpv6Match _icmpv6Match;
    private NodeConnectorId _inPhyPort;
    private NodeConnectorId _inPort;
    private IpMatch _ipMatch;
    private Layer3Match _layer3Match;
    private Layer4Match _layer4Match;
    private Metadata _metadata;
    private ProtocolMatchFields _protocolMatchFields;
    private TcpFlagsMatch _tcpFlagsMatch;
    private Tunnel _tunnel;
    private VlanMatch _vlanMatch;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> augmentation = Collections.emptyMap();

    public MatchBuilder() {
    }
    public MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match arg) {
        this._inPort = arg.getInPort();
        this._inPhyPort = arg.getInPhyPort();
        this._metadata = arg.getMetadata();
        this._tunnel = arg.getTunnel();
        this._ethernetMatch = arg.getEthernetMatch();
        this._vlanMatch = arg.getVlanMatch();
        this._ipMatch = arg.getIpMatch();
        this._layer3Match = arg.getLayer3Match();
        this._layer4Match = arg.getLayer4Match();
        this._icmpv4Match = arg.getIcmpv4Match();
        this._icmpv6Match = arg.getIcmpv6Match();
        this._protocolMatchFields = arg.getProtocolMatchFields();
        this._tcpFlagsMatch = arg.getTcpFlagsMatch();
    }

    public MatchBuilder(Match base) {
        this._ethernetMatch = base.getEthernetMatch();
        this._icmpv4Match = base.getIcmpv4Match();
        this._icmpv6Match = base.getIcmpv6Match();
        this._inPhyPort = base.getInPhyPort();
        this._inPort = base.getInPort();
        this._ipMatch = base.getIpMatch();
        this._layer3Match = base.getLayer3Match();
        this._layer4Match = base.getLayer4Match();
        this._metadata = base.getMetadata();
        this._protocolMatchFields = base.getProtocolMatchFields();
        this._tcpFlagsMatch = base.getTcpFlagsMatch();
        this._tunnel = base.getTunnel();
        this._vlanMatch = base.getVlanMatch();
        if (base instanceof MatchImpl) {
            MatchImpl impl = (MatchImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match) {
            this._inPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getInPort();
            this._inPhyPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getInPhyPort();
            this._metadata = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getMetadata();
            this._tunnel = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getTunnel();
            this._ethernetMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getEthernetMatch();
            this._vlanMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getVlanMatch();
            this._ipMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getIpMatch();
            this._layer3Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getLayer3Match();
            this._layer4Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getLayer4Match();
            this._icmpv4Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getIcmpv4Match();
            this._icmpv6Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getIcmpv6Match();
            this._protocolMatchFields = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getProtocolMatchFields();
            this._tcpFlagsMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getTcpFlagsMatch();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match] \n" +
              "but was: " + arg
            );
        }
    }

    public EthernetMatch getEthernetMatch() {
        return _ethernetMatch;
    }
    
    public Icmpv4Match getIcmpv4Match() {
        return _icmpv4Match;
    }
    
    public Icmpv6Match getIcmpv6Match() {
        return _icmpv6Match;
    }
    
    public NodeConnectorId getInPhyPort() {
        return _inPhyPort;
    }
    
    public NodeConnectorId getInPort() {
        return _inPort;
    }
    
    public IpMatch getIpMatch() {
        return _ipMatch;
    }
    
    public Layer3Match getLayer3Match() {
        return _layer3Match;
    }
    
    public Layer4Match getLayer4Match() {
        return _layer4Match;
    }
    
    public Metadata getMetadata() {
        return _metadata;
    }
    
    public ProtocolMatchFields getProtocolMatchFields() {
        return _protocolMatchFields;
    }
    
    public TcpFlagsMatch getTcpFlagsMatch() {
        return _tcpFlagsMatch;
    }
    
    public Tunnel getTunnel() {
        return _tunnel;
    }
    
    public VlanMatch getVlanMatch() {
        return _vlanMatch;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MatchBuilder setEthernetMatch(final EthernetMatch value) {
        this._ethernetMatch = value;
        return this;
    }
    
     
    public MatchBuilder setIcmpv4Match(final Icmpv4Match value) {
        this._icmpv4Match = value;
        return this;
    }
    
     
    public MatchBuilder setIcmpv6Match(final Icmpv6Match value) {
        this._icmpv6Match = value;
        return this;
    }
    
     
    public MatchBuilder setInPhyPort(final NodeConnectorId value) {
        this._inPhyPort = value;
        return this;
    }
    
     
    public MatchBuilder setInPort(final NodeConnectorId value) {
        this._inPort = value;
        return this;
    }
    
     
    public MatchBuilder setIpMatch(final IpMatch value) {
        this._ipMatch = value;
        return this;
    }
    
     
    public MatchBuilder setLayer3Match(final Layer3Match value) {
        this._layer3Match = value;
        return this;
    }
    
     
    public MatchBuilder setLayer4Match(final Layer4Match value) {
        this._layer4Match = value;
        return this;
    }
    
     
    public MatchBuilder setMetadata(final Metadata value) {
        this._metadata = value;
        return this;
    }
    
     
    public MatchBuilder setProtocolMatchFields(final ProtocolMatchFields value) {
        this._protocolMatchFields = value;
        return this;
    }
    
     
    public MatchBuilder setTcpFlagsMatch(final TcpFlagsMatch value) {
        this._tcpFlagsMatch = value;
        return this;
    }
    
     
    public MatchBuilder setTunnel(final Tunnel value) {
        this._tunnel = value;
        return this;
    }
    
     
    public MatchBuilder setVlanMatch(final VlanMatch value) {
        this._vlanMatch = value;
        return this;
    }
    
    public MatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public MatchBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Match build() {
        return new MatchImpl(this);
    }

    private static final class MatchImpl implements Match {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match.class;
        }

        private final EthernetMatch _ethernetMatch;
        private final Icmpv4Match _icmpv4Match;
        private final Icmpv6Match _icmpv6Match;
        private final NodeConnectorId _inPhyPort;
        private final NodeConnectorId _inPort;
        private final IpMatch _ipMatch;
        private final Layer3Match _layer3Match;
        private final Layer4Match _layer4Match;
        private final Metadata _metadata;
        private final ProtocolMatchFields _protocolMatchFields;
        private final TcpFlagsMatch _tcpFlagsMatch;
        private final Tunnel _tunnel;
        private final VlanMatch _vlanMatch;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> augmentation = Collections.emptyMap();

        private MatchImpl(MatchBuilder base) {
            this._ethernetMatch = base.getEthernetMatch();
            this._icmpv4Match = base.getIcmpv4Match();
            this._icmpv6Match = base.getIcmpv6Match();
            this._inPhyPort = base.getInPhyPort();
            this._inPort = base.getInPort();
            this._ipMatch = base.getIpMatch();
            this._layer3Match = base.getLayer3Match();
            this._layer4Match = base.getLayer4Match();
            this._metadata = base.getMetadata();
            this._protocolMatchFields = base.getProtocolMatchFields();
            this._tcpFlagsMatch = base.getTcpFlagsMatch();
            this._tunnel = base.getTunnel();
            this._vlanMatch = base.getVlanMatch();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public EthernetMatch getEthernetMatch() {
            return _ethernetMatch;
        }
        
        @Override
        public Icmpv4Match getIcmpv4Match() {
            return _icmpv4Match;
        }
        
        @Override
        public Icmpv6Match getIcmpv6Match() {
            return _icmpv6Match;
        }
        
        @Override
        public NodeConnectorId getInPhyPort() {
            return _inPhyPort;
        }
        
        @Override
        public NodeConnectorId getInPort() {
            return _inPort;
        }
        
        @Override
        public IpMatch getIpMatch() {
            return _ipMatch;
        }
        
        @Override
        public Layer3Match getLayer3Match() {
            return _layer3Match;
        }
        
        @Override
        public Layer4Match getLayer4Match() {
            return _layer4Match;
        }
        
        @Override
        public Metadata getMetadata() {
            return _metadata;
        }
        
        @Override
        public ProtocolMatchFields getProtocolMatchFields() {
            return _protocolMatchFields;
        }
        
        @Override
        public TcpFlagsMatch getTcpFlagsMatch() {
            return _tcpFlagsMatch;
        }
        
        @Override
        public Tunnel getTunnel() {
            return _tunnel;
        }
        
        @Override
        public VlanMatch getVlanMatch() {
            return _vlanMatch;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ethernetMatch);
            result = prime * result + Objects.hashCode(_icmpv4Match);
            result = prime * result + Objects.hashCode(_icmpv6Match);
            result = prime * result + Objects.hashCode(_inPhyPort);
            result = prime * result + Objects.hashCode(_inPort);
            result = prime * result + Objects.hashCode(_ipMatch);
            result = prime * result + Objects.hashCode(_layer3Match);
            result = prime * result + Objects.hashCode(_layer4Match);
            result = prime * result + Objects.hashCode(_metadata);
            result = prime * result + Objects.hashCode(_protocolMatchFields);
            result = prime * result + Objects.hashCode(_tcpFlagsMatch);
            result = prime * result + Objects.hashCode(_tunnel);
            result = prime * result + Objects.hashCode(_vlanMatch);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match)obj;
            if (!Objects.equals(_ethernetMatch, other.getEthernetMatch())) {
                return false;
            }
            if (!Objects.equals(_icmpv4Match, other.getIcmpv4Match())) {
                return false;
            }
            if (!Objects.equals(_icmpv6Match, other.getIcmpv6Match())) {
                return false;
            }
            if (!Objects.equals(_inPhyPort, other.getInPhyPort())) {
                return false;
            }
            if (!Objects.equals(_inPort, other.getInPort())) {
                return false;
            }
            if (!Objects.equals(_ipMatch, other.getIpMatch())) {
                return false;
            }
            if (!Objects.equals(_layer3Match, other.getLayer3Match())) {
                return false;
            }
            if (!Objects.equals(_layer4Match, other.getLayer4Match())) {
                return false;
            }
            if (!Objects.equals(_metadata, other.getMetadata())) {
                return false;
            }
            if (!Objects.equals(_protocolMatchFields, other.getProtocolMatchFields())) {
                return false;
            }
            if (!Objects.equals(_tcpFlagsMatch, other.getTcpFlagsMatch())) {
                return false;
            }
            if (!Objects.equals(_tunnel, other.getTunnel())) {
                return false;
            }
            if (!Objects.equals(_vlanMatch, other.getVlanMatch())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MatchImpl otherImpl = (MatchImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.raw.packet.fields.Match>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Match [");
            boolean first = true;
        
            if (_ethernetMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethernetMatch=");
                builder.append(_ethernetMatch);
             }
            if (_icmpv4Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv4Match=");
                builder.append(_icmpv4Match);
             }
            if (_icmpv6Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv6Match=");
                builder.append(_icmpv6Match);
             }
            if (_inPhyPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inPhyPort=");
                builder.append(_inPhyPort);
             }
            if (_inPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inPort=");
                builder.append(_inPort);
             }
            if (_ipMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipMatch=");
                builder.append(_ipMatch);
             }
            if (_layer3Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_layer3Match=");
                builder.append(_layer3Match);
             }
            if (_layer4Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_layer4Match=");
                builder.append(_layer4Match);
             }
            if (_metadata != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadata=");
                builder.append(_metadata);
             }
            if (_protocolMatchFields != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_protocolMatchFields=");
                builder.append(_protocolMatchFields);
             }
            if (_tcpFlagsMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tcpFlagsMatch=");
                builder.append(_tcpFlagsMatch);
             }
            if (_tunnel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tunnel=");
                builder.append(_tunnel);
             }
            if (_vlanMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vlanMatch=");
                builder.append(_vlanMatch);
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
