package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector
 *
 */
public class StpStatusAwareNodeConnectorBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector> {

    private StpStatus _status;


    public StpStatusAwareNodeConnectorBuilder() {
    }
    public StpStatusAwareNodeConnectorBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusNodeConnector arg) {
        this._status = arg.getStatus();
    }

    public StpStatusAwareNodeConnectorBuilder(StpStatusAwareNodeConnector base) {
        this._status = base.getStatus();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusNodeConnector</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusNodeConnector) {
            this._status = ((org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusNodeConnector)arg).getStatus();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusNodeConnector] \n" +
              "but was: " + arg
            );
        }
    }

    public StpStatus getStatus() {
        return _status;
    }

     
    public StpStatusAwareNodeConnectorBuilder setStatus(final StpStatus value) {
        this._status = value;
        return this;
    }

    public StpStatusAwareNodeConnector build() {
        return new StpStatusAwareNodeConnectorImpl(this);
    }

    private static final class StpStatusAwareNodeConnectorImpl implements StpStatusAwareNodeConnector {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector.class;
        }

        private final StpStatus _status;


        private StpStatusAwareNodeConnectorImpl(StpStatusAwareNodeConnectorBuilder base) {
            this._status = base.getStatus();
        }

        @Override
        public StpStatus getStatus() {
            return _status;
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
            result = prime * result + Objects.hashCode(_status);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector other = (org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714.StpStatusAwareNodeConnector)obj;
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("StpStatusAwareNodeConnector [");
            boolean first = true;
        
            if (_status != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_status=");
                builder.append(_status);
             }
            return builder.append(']').toString();
        }
    }

}
