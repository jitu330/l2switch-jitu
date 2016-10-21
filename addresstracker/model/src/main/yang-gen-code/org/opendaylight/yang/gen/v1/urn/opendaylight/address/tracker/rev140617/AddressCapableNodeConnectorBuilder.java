package org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617;
import org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector
 *
 */
public class AddressCapableNodeConnectorBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector> {

    private List<Addresses> _addresses;


    public AddressCapableNodeConnectorBuilder() {
    }
    public AddressCapableNodeConnectorBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector arg) {
        this._addresses = arg.getAddresses();
    }

    public AddressCapableNodeConnectorBuilder(AddressCapableNodeConnector base) {
        this._addresses = base.getAddresses();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector) {
            this._addresses = ((org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector)arg).getAddresses();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressNodeConnector] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Addresses> getAddresses() {
        return _addresses;
    }

     
    public AddressCapableNodeConnectorBuilder setAddresses(final List<Addresses> value) {
        this._addresses = value;
        return this;
    }

    public AddressCapableNodeConnector build() {
        return new AddressCapableNodeConnectorImpl(this);
    }

    private static final class AddressCapableNodeConnectorImpl implements AddressCapableNodeConnector {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector.class;
        }

        private final List<Addresses> _addresses;


        private AddressCapableNodeConnectorImpl(AddressCapableNodeConnectorBuilder base) {
            this._addresses = base.getAddresses();
        }

        @Override
        public List<Addresses> getAddresses() {
            return _addresses;
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
            result = prime * result + Objects.hashCode(_addresses);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector other = (org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.AddressCapableNodeConnector)obj;
            if (!Objects.equals(_addresses, other.getAddresses())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AddressCapableNodeConnector [");
            boolean first = true;
        
            if (_addresses != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_addresses=");
                builder.append(_addresses);
             }
            return builder.append(']').toString();
        }
    }

}
