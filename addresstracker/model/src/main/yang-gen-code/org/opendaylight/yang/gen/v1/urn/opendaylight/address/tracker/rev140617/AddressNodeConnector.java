package org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617;
import org.opendaylight.yang.gen.v1.urn.opendaylight.address.tracker.rev140617.address.node.connector.Addresses;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>address-tracker</b>
 * <pre>
 * grouping address-node-connector {
 *     list addresses {
 *         key "id"
 *         leaf id {
 *             type uint64;
 *         }
 *         leaf mac {
 *             type mac-address;
 *         }
 *         leaf ip {
 *             type ip-address;
 *         }
 *         leaf vlan {
 *             type vlan-id;
 *         }
 *         leaf first-seen {
 *             type int64;
 *         }
 *         leaf last-seen {
 *             type int64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>address-tracker/address-node-connector</i>
 *
 */
public interface AddressNodeConnector
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:address-tracker",
        "2014-06-17", "address-node-connector").intern();

    /**
     * @return <code>java.util.List</code> <code>addresses</code>, or <code>null</code> if not present
     */
    List<Addresses> getAddresses();

}

