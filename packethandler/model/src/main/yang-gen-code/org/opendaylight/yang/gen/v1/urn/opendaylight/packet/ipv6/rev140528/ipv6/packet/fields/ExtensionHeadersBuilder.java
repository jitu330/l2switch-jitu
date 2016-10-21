package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528.KnownIpProtocols;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders
 *
 */
public class ExtensionHeadersBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders> {

    private byte[] _data;
    private java.lang.Integer _length;
    private KnownIpProtocols _nextHeader;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> augmentation = Collections.emptyMap();

    public ExtensionHeadersBuilder() {
    }

    public ExtensionHeadersBuilder(ExtensionHeaders base) {
        this._data = base.getData();
        this._length = base.getLength();
        this._nextHeader = base.getNextHeader();
        if (base instanceof ExtensionHeadersImpl) {
            ExtensionHeadersImpl impl = (ExtensionHeadersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public byte[] getData() {
        return _data == null ? null : _data.clone();
    }
    
    public java.lang.Integer getLength() {
        return _length;
    }
    
    public KnownIpProtocols getNextHeader() {
        return _nextHeader;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ExtensionHeadersBuilder setData(final byte[] value) {
        this._data = value;
        return this;
    }
    
     
     private static void checkLengthRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public ExtensionHeadersBuilder setLength(final java.lang.Integer value) {
    if (value != null) {
        checkLengthRange(value);
    }
        this._length = value;
        return this;
    }
    
     
    public ExtensionHeadersBuilder setNextHeader(final KnownIpProtocols value) {
        this._nextHeader = value;
        return this;
    }
    
    public ExtensionHeadersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ExtensionHeadersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public ExtensionHeaders build() {
        return new ExtensionHeadersImpl(this);
    }

    private static final class ExtensionHeadersImpl implements ExtensionHeaders {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders.class;
        }

        private final byte[] _data;
        private final java.lang.Integer _length;
        private final KnownIpProtocols _nextHeader;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> augmentation = Collections.emptyMap();

        private ExtensionHeadersImpl(ExtensionHeadersBuilder base) {
            this._data = base.getData();
            this._length = base.getLength();
            this._nextHeader = base.getNextHeader();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public byte[] getData() {
            return _data == null ? null : _data.clone();
        }
        
        @Override
        public java.lang.Integer getLength() {
            return _length;
        }
        
        @Override
        public KnownIpProtocols getNextHeader() {
            return _nextHeader;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Arrays.hashCode(_data);
            result = prime * result + Objects.hashCode(_length);
            result = prime * result + Objects.hashCode(_nextHeader);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders other = (org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders)obj;
            if (!Arrays.equals(_data, other.getData())) {
                return false;
            }
            if (!Objects.equals(_length, other.getLength())) {
                return false;
            }
            if (!Objects.equals(_nextHeader, other.getNextHeader())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExtensionHeadersImpl otherImpl = (ExtensionHeadersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv6.rev140528.ipv6.packet.fields.ExtensionHeaders>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ExtensionHeaders [");
            boolean first = true;
        
            if (_data != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_data=");
                builder.append(Arrays.toString(_data));
             }
            if (_length != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_length=");
                builder.append(_length);
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
