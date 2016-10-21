package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig
 *
 */
public class L2switchConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig> {

    private java.lang.Integer _dropallFlowHardTimeout;
    private java.lang.Integer _dropallFlowIdleTimeout;
    private java.lang.Integer _dropallFlowPriority;
    private java.lang.Short _dropallFlowTableId;
    private java.lang.Integer _reactiveFlowHardTimeout;
    private java.lang.Integer _reactiveFlowIdleTimeout;
    private java.lang.Integer _reactiveFlowPriority;
    private java.lang.Short _reactiveFlowTableId;
    private java.lang.Boolean _isInstallDropallFlow;
    private java.lang.Boolean _isLearningOnlyMode;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> augmentation = Collections.emptyMap();

    public L2switchConfigBuilder() {
    }

    public L2switchConfigBuilder(L2switchConfig base) {
        this._dropallFlowHardTimeout = base.getDropallFlowHardTimeout();
        this._dropallFlowIdleTimeout = base.getDropallFlowIdleTimeout();
        this._dropallFlowPriority = base.getDropallFlowPriority();
        this._dropallFlowTableId = base.getDropallFlowTableId();
        this._reactiveFlowHardTimeout = base.getReactiveFlowHardTimeout();
        this._reactiveFlowIdleTimeout = base.getReactiveFlowIdleTimeout();
        this._reactiveFlowPriority = base.getReactiveFlowPriority();
        this._reactiveFlowTableId = base.getReactiveFlowTableId();
        this._isInstallDropallFlow = base.isIsInstallDropallFlow();
        this._isLearningOnlyMode = base.isIsLearningOnlyMode();
        if (base instanceof L2switchConfigImpl) {
            L2switchConfigImpl impl = (L2switchConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Integer getDropallFlowHardTimeout() {
        return _dropallFlowHardTimeout;
    }
    
    public java.lang.Integer getDropallFlowIdleTimeout() {
        return _dropallFlowIdleTimeout;
    }
    
    public java.lang.Integer getDropallFlowPriority() {
        return _dropallFlowPriority;
    }
    
    public java.lang.Short getDropallFlowTableId() {
        return _dropallFlowTableId;
    }
    
    public java.lang.Integer getReactiveFlowHardTimeout() {
        return _reactiveFlowHardTimeout;
    }
    
    public java.lang.Integer getReactiveFlowIdleTimeout() {
        return _reactiveFlowIdleTimeout;
    }
    
    public java.lang.Integer getReactiveFlowPriority() {
        return _reactiveFlowPriority;
    }
    
    public java.lang.Short getReactiveFlowTableId() {
        return _reactiveFlowTableId;
    }
    
    public java.lang.Boolean isIsInstallDropallFlow() {
        return _isInstallDropallFlow;
    }
    
    public java.lang.Boolean isIsLearningOnlyMode() {
        return _isLearningOnlyMode;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkDropallFlowHardTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public L2switchConfigBuilder setDropallFlowHardTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkDropallFlowHardTimeoutRange(value);
    }
        this._dropallFlowHardTimeout = value;
        return this;
    }
    
     
     private static void checkDropallFlowIdleTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public L2switchConfigBuilder setDropallFlowIdleTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkDropallFlowIdleTimeoutRange(value);
    }
        this._dropallFlowIdleTimeout = value;
        return this;
    }
    
     
     private static void checkDropallFlowPriorityRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public L2switchConfigBuilder setDropallFlowPriority(final java.lang.Integer value) {
    if (value != null) {
        checkDropallFlowPriorityRange(value);
    }
        this._dropallFlowPriority = value;
        return this;
    }
    
     
     private static void checkDropallFlowTableIdRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public L2switchConfigBuilder setDropallFlowTableId(final java.lang.Short value) {
    if (value != null) {
        checkDropallFlowTableIdRange(value);
    }
        this._dropallFlowTableId = value;
        return this;
    }
    
     
     private static void checkReactiveFlowHardTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public L2switchConfigBuilder setReactiveFlowHardTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkReactiveFlowHardTimeoutRange(value);
    }
        this._reactiveFlowHardTimeout = value;
        return this;
    }
    
     
     private static void checkReactiveFlowIdleTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public L2switchConfigBuilder setReactiveFlowIdleTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkReactiveFlowIdleTimeoutRange(value);
    }
        this._reactiveFlowIdleTimeout = value;
        return this;
    }
    
     
     private static void checkReactiveFlowPriorityRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public L2switchConfigBuilder setReactiveFlowPriority(final java.lang.Integer value) {
    if (value != null) {
        checkReactiveFlowPriorityRange(value);
    }
        this._reactiveFlowPriority = value;
        return this;
    }
    
     
     private static void checkReactiveFlowTableIdRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public L2switchConfigBuilder setReactiveFlowTableId(final java.lang.Short value) {
    if (value != null) {
        checkReactiveFlowTableIdRange(value);
    }
        this._reactiveFlowTableId = value;
        return this;
    }
    
     
    public L2switchConfigBuilder setIsInstallDropallFlow(final java.lang.Boolean value) {
        this._isInstallDropallFlow = value;
        return this;
    }
    
     
    public L2switchConfigBuilder setIsLearningOnlyMode(final java.lang.Boolean value) {
        this._isLearningOnlyMode = value;
        return this;
    }
    
    public L2switchConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public L2switchConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public L2switchConfig build() {
        return new L2switchConfigImpl(this);
    }

    private static final class L2switchConfigImpl implements L2switchConfig {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig.class;
        }

        private final java.lang.Integer _dropallFlowHardTimeout;
        private final java.lang.Integer _dropallFlowIdleTimeout;
        private final java.lang.Integer _dropallFlowPriority;
        private final java.lang.Short _dropallFlowTableId;
        private final java.lang.Integer _reactiveFlowHardTimeout;
        private final java.lang.Integer _reactiveFlowIdleTimeout;
        private final java.lang.Integer _reactiveFlowPriority;
        private final java.lang.Short _reactiveFlowTableId;
        private final java.lang.Boolean _isInstallDropallFlow;
        private final java.lang.Boolean _isLearningOnlyMode;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> augmentation = Collections.emptyMap();

        private L2switchConfigImpl(L2switchConfigBuilder base) {
            this._dropallFlowHardTimeout = base.getDropallFlowHardTimeout();
            this._dropallFlowIdleTimeout = base.getDropallFlowIdleTimeout();
            this._dropallFlowPriority = base.getDropallFlowPriority();
            this._dropallFlowTableId = base.getDropallFlowTableId();
            this._reactiveFlowHardTimeout = base.getReactiveFlowHardTimeout();
            this._reactiveFlowIdleTimeout = base.getReactiveFlowIdleTimeout();
            this._reactiveFlowPriority = base.getReactiveFlowPriority();
            this._reactiveFlowTableId = base.getReactiveFlowTableId();
            this._isInstallDropallFlow = base.isIsInstallDropallFlow();
            this._isLearningOnlyMode = base.isIsLearningOnlyMode();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getDropallFlowHardTimeout() {
            return _dropallFlowHardTimeout;
        }
        
        @Override
        public java.lang.Integer getDropallFlowIdleTimeout() {
            return _dropallFlowIdleTimeout;
        }
        
        @Override
        public java.lang.Integer getDropallFlowPriority() {
            return _dropallFlowPriority;
        }
        
        @Override
        public java.lang.Short getDropallFlowTableId() {
            return _dropallFlowTableId;
        }
        
        @Override
        public java.lang.Integer getReactiveFlowHardTimeout() {
            return _reactiveFlowHardTimeout;
        }
        
        @Override
        public java.lang.Integer getReactiveFlowIdleTimeout() {
            return _reactiveFlowIdleTimeout;
        }
        
        @Override
        public java.lang.Integer getReactiveFlowPriority() {
            return _reactiveFlowPriority;
        }
        
        @Override
        public java.lang.Short getReactiveFlowTableId() {
            return _reactiveFlowTableId;
        }
        
        @Override
        public java.lang.Boolean isIsInstallDropallFlow() {
            return _isInstallDropallFlow;
        }
        
        @Override
        public java.lang.Boolean isIsLearningOnlyMode() {
            return _isLearningOnlyMode;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dropallFlowHardTimeout);
            result = prime * result + Objects.hashCode(_dropallFlowIdleTimeout);
            result = prime * result + Objects.hashCode(_dropallFlowPriority);
            result = prime * result + Objects.hashCode(_dropallFlowTableId);
            result = prime * result + Objects.hashCode(_reactiveFlowHardTimeout);
            result = prime * result + Objects.hashCode(_reactiveFlowIdleTimeout);
            result = prime * result + Objects.hashCode(_reactiveFlowPriority);
            result = prime * result + Objects.hashCode(_reactiveFlowTableId);
            result = prime * result + Objects.hashCode(_isInstallDropallFlow);
            result = prime * result + Objects.hashCode(_isLearningOnlyMode);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig)obj;
            if (!Objects.equals(_dropallFlowHardTimeout, other.getDropallFlowHardTimeout())) {
                return false;
            }
            if (!Objects.equals(_dropallFlowIdleTimeout, other.getDropallFlowIdleTimeout())) {
                return false;
            }
            if (!Objects.equals(_dropallFlowPriority, other.getDropallFlowPriority())) {
                return false;
            }
            if (!Objects.equals(_dropallFlowTableId, other.getDropallFlowTableId())) {
                return false;
            }
            if (!Objects.equals(_reactiveFlowHardTimeout, other.getReactiveFlowHardTimeout())) {
                return false;
            }
            if (!Objects.equals(_reactiveFlowIdleTimeout, other.getReactiveFlowIdleTimeout())) {
                return false;
            }
            if (!Objects.equals(_reactiveFlowPriority, other.getReactiveFlowPriority())) {
                return false;
            }
            if (!Objects.equals(_reactiveFlowTableId, other.getReactiveFlowTableId())) {
                return false;
            }
            if (!Objects.equals(_isInstallDropallFlow, other.isIsInstallDropallFlow())) {
                return false;
            }
            if (!Objects.equals(_isLearningOnlyMode, other.isIsLearningOnlyMode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2switchConfigImpl otherImpl = (L2switchConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.l2switch.config.rev140528.L2switchConfig>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("L2switchConfig [");
            boolean first = true;
        
            if (_dropallFlowHardTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dropallFlowHardTimeout=");
                builder.append(_dropallFlowHardTimeout);
             }
            if (_dropallFlowIdleTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dropallFlowIdleTimeout=");
                builder.append(_dropallFlowIdleTimeout);
             }
            if (_dropallFlowPriority != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dropallFlowPriority=");
                builder.append(_dropallFlowPriority);
             }
            if (_dropallFlowTableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dropallFlowTableId=");
                builder.append(_dropallFlowTableId);
             }
            if (_reactiveFlowHardTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reactiveFlowHardTimeout=");
                builder.append(_reactiveFlowHardTimeout);
             }
            if (_reactiveFlowIdleTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reactiveFlowIdleTimeout=");
                builder.append(_reactiveFlowIdleTimeout);
             }
            if (_reactiveFlowPriority != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reactiveFlowPriority=");
                builder.append(_reactiveFlowPriority);
             }
            if (_reactiveFlowTableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reactiveFlowTableId=");
                builder.append(_reactiveFlowTableId);
             }
            if (_isInstallDropallFlow != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_isInstallDropallFlow=");
                builder.append(_isInstallDropallFlow);
             }
            if (_isLearningOnlyMode != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_isLearningOnlyMode=");
                builder.append(_isLearningOnlyMode);
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
