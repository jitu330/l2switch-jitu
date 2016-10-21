package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ethernet-packet</b>
 * <pre>
 * grouping header8021q {
 *     leaf TPID {
 *         type header8021q-type;
 *     }
 *     leaf priority-code {
 *         type uint8;
 *     }
 *     leaf drop-eligible {
 *         type boolean;
 *     }
 *     leaf vlan {
 *         type vlan-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ethernet-packet/header8021q</i>
 *
 */
public interface Header8021q
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:ethernet",
        "2014-05-28", "header8021q").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.Header8021qType</code> <code>tPID</code>, or <code>null</code> if not present
     */
    Header8021qType getTPID();
    
    /**
     * @return <code>java.lang.Short</code> <code>priorityCode</code>, or <code>null</code> if not present
     */
    java.lang.Short getPriorityCode();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>dropEligible</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isDropEligible();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.VlanId</code> <code>vlan</code>, or <code>null</code> if not present
     */
    VlanId getVlan();

}

