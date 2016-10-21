package org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class AttachmentPointsKey
 implements Identifier<AttachmentPoints> {
    private static final long serialVersionUID = -6620476181673774789L;
    private final TpId _tpId;


    public AttachmentPointsKey(TpId _tpId) {
    
    
        this._tpId = _tpId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AttachmentPointsKey(AttachmentPointsKey source) {
        this._tpId = source._tpId;
    }


    public TpId getTpId() {
        return _tpId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_tpId);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AttachmentPointsKey other = (AttachmentPointsKey) obj;
        if (!Objects.equals(_tpId, other._tpId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.host.tracker.rev140624.host.AttachmentPointsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_tpId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tpId=");
            builder.append(_tpId);
         }
        return builder.append(']').toString();
    }
}

