package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig
 *
 */
public class LoopRemoverConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig> {

    private java.lang.Long _graphRefreshDelay;
    private java.lang.Integer _lldpFlowHardTimeout;
    private java.lang.Integer _lldpFlowIdleTimeout;
    private java.lang.Integer _lldpFlowPriority;
    private java.lang.Short _lldpFlowTableId;
    private java.lang.String _topologyId;
    private java.lang.Boolean _isInstallLldpFlow;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> augmentation = Collections.emptyMap();

    public LoopRemoverConfigBuilder() {
    }

    public LoopRemoverConfigBuilder(LoopRemoverConfig base) {
        this._graphRefreshDelay = base.getGraphRefreshDelay();
        this._lldpFlowHardTimeout = base.getLldpFlowHardTimeout();
        this._lldpFlowIdleTimeout = base.getLldpFlowIdleTimeout();
        this._lldpFlowPriority = base.getLldpFlowPriority();
        this._lldpFlowTableId = base.getLldpFlowTableId();
        this._topologyId = base.getTopologyId();
        this._isInstallLldpFlow = base.isIsInstallLldpFlow();
        if (base instanceof LoopRemoverConfigImpl) {
            LoopRemoverConfigImpl impl = (LoopRemoverConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getGraphRefreshDelay() {
        return _graphRefreshDelay;
    }
    
    public java.lang.Integer getLldpFlowHardTimeout() {
        return _lldpFlowHardTimeout;
    }
    
    public java.lang.Integer getLldpFlowIdleTimeout() {
        return _lldpFlowIdleTimeout;
    }
    
    public java.lang.Integer getLldpFlowPriority() {
        return _lldpFlowPriority;
    }
    
    public java.lang.Short getLldpFlowTableId() {
        return _lldpFlowTableId;
    }
    
    public java.lang.String getTopologyId() {
        return _topologyId;
    }
    
    public java.lang.Boolean isIsInstallLldpFlow() {
        return _isInstallLldpFlow;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkGraphRefreshDelayRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public LoopRemoverConfigBuilder setGraphRefreshDelay(final java.lang.Long value) {
    if (value != null) {
        checkGraphRefreshDelayRange(value);
    }
        this._graphRefreshDelay = value;
        return this;
    }
    
     
     private static void checkLldpFlowHardTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public LoopRemoverConfigBuilder setLldpFlowHardTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkLldpFlowHardTimeoutRange(value);
    }
        this._lldpFlowHardTimeout = value;
        return this;
    }
    
     
     private static void checkLldpFlowIdleTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public LoopRemoverConfigBuilder setLldpFlowIdleTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkLldpFlowIdleTimeoutRange(value);
    }
        this._lldpFlowIdleTimeout = value;
        return this;
    }
    
     
     private static void checkLldpFlowPriorityRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public LoopRemoverConfigBuilder setLldpFlowPriority(final java.lang.Integer value) {
    if (value != null) {
        checkLldpFlowPriorityRange(value);
    }
        this._lldpFlowPriority = value;
        return this;
    }
    
     
     private static void checkLldpFlowTableIdRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public LoopRemoverConfigBuilder setLldpFlowTableId(final java.lang.Short value) {
    if (value != null) {
        checkLldpFlowTableIdRange(value);
    }
        this._lldpFlowTableId = value;
        return this;
    }
    
     
    public LoopRemoverConfigBuilder setTopologyId(final java.lang.String value) {
        this._topologyId = value;
        return this;
    }
    
     
    public LoopRemoverConfigBuilder setIsInstallLldpFlow(final java.lang.Boolean value) {
        this._isInstallLldpFlow = value;
        return this;
    }
    
    public LoopRemoverConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public LoopRemoverConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public LoopRemoverConfig build() {
        return new LoopRemoverConfigImpl(this);
    }

    private static final class LoopRemoverConfigImpl implements LoopRemoverConfig {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig.class;
        }

        private final java.lang.Long _graphRefreshDelay;
        private final java.lang.Integer _lldpFlowHardTimeout;
        private final java.lang.Integer _lldpFlowIdleTimeout;
        private final java.lang.Integer _lldpFlowPriority;
        private final java.lang.Short _lldpFlowTableId;
        private final java.lang.String _topologyId;
        private final java.lang.Boolean _isInstallLldpFlow;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> augmentation = Collections.emptyMap();

        private LoopRemoverConfigImpl(LoopRemoverConfigBuilder base) {
            this._graphRefreshDelay = base.getGraphRefreshDelay();
            this._lldpFlowHardTimeout = base.getLldpFlowHardTimeout();
            this._lldpFlowIdleTimeout = base.getLldpFlowIdleTimeout();
            this._lldpFlowPriority = base.getLldpFlowPriority();
            this._lldpFlowTableId = base.getLldpFlowTableId();
            this._topologyId = base.getTopologyId();
            this._isInstallLldpFlow = base.isIsInstallLldpFlow();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getGraphRefreshDelay() {
            return _graphRefreshDelay;
        }
        
        @Override
        public java.lang.Integer getLldpFlowHardTimeout() {
            return _lldpFlowHardTimeout;
        }
        
        @Override
        public java.lang.Integer getLldpFlowIdleTimeout() {
            return _lldpFlowIdleTimeout;
        }
        
        @Override
        public java.lang.Integer getLldpFlowPriority() {
            return _lldpFlowPriority;
        }
        
        @Override
        public java.lang.Short getLldpFlowTableId() {
            return _lldpFlowTableId;
        }
        
        @Override
        public java.lang.String getTopologyId() {
            return _topologyId;
        }
        
        @Override
        public java.lang.Boolean isIsInstallLldpFlow() {
            return _isInstallLldpFlow;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_graphRefreshDelay);
            result = prime * result + Objects.hashCode(_lldpFlowHardTimeout);
            result = prime * result + Objects.hashCode(_lldpFlowIdleTimeout);
            result = prime * result + Objects.hashCode(_lldpFlowPriority);
            result = prime * result + Objects.hashCode(_lldpFlowTableId);
            result = prime * result + Objects.hashCode(_topologyId);
            result = prime * result + Objects.hashCode(_isInstallLldpFlow);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig)obj;
            if (!Objects.equals(_graphRefreshDelay, other.getGraphRefreshDelay())) {
                return false;
            }
            if (!Objects.equals(_lldpFlowHardTimeout, other.getLldpFlowHardTimeout())) {
                return false;
            }
            if (!Objects.equals(_lldpFlowIdleTimeout, other.getLldpFlowIdleTimeout())) {
                return false;
            }
            if (!Objects.equals(_lldpFlowPriority, other.getLldpFlowPriority())) {
                return false;
            }
            if (!Objects.equals(_lldpFlowTableId, other.getLldpFlowTableId())) {
                return false;
            }
            if (!Objects.equals(_topologyId, other.getTopologyId())) {
                return false;
            }
            if (!Objects.equals(_isInstallLldpFlow, other.isIsInstallLldpFlow())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LoopRemoverConfigImpl otherImpl = (LoopRemoverConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.loop.remover.config.rev140528.LoopRemoverConfig>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("LoopRemoverConfig [");
            boolean first = true;
        
            if (_graphRefreshDelay != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_graphRefreshDelay=");
                builder.append(_graphRefreshDelay);
             }
            if (_lldpFlowHardTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lldpFlowHardTimeout=");
                builder.append(_lldpFlowHardTimeout);
             }
            if (_lldpFlowIdleTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lldpFlowIdleTimeout=");
                builder.append(_lldpFlowIdleTimeout);
             }
            if (_lldpFlowPriority != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lldpFlowPriority=");
                builder.append(_lldpFlowPriority);
             }
            if (_lldpFlowTableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lldpFlowTableId=");
                builder.append(_lldpFlowTableId);
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
            if (_isInstallLldpFlow != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_isInstallLldpFlow=");
                builder.append(_isInstallLldpFlow);
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
