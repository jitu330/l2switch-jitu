package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.PacketFields;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.KnownEtherType;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>arp-packet</b>
 * <pre>
 * grouping arp-packet-fields {
 *     leaf hardware-type {
 *         type known-hardware-type;
 *     }
 *     leaf protocol-type {
 *         type known-ether-type;
 *     }
 *     leaf hardware-length {
 *         type uint8;
 *     }
 *     leaf protocol-length {
 *         type uint8;
 *     }
 *     leaf operation {
 *         type known-operation;
 *     }
 *     leaf source-hardware-address {
 *         type string;
 *     }
 *     leaf source-protocol-address {
 *         type string;
 *     }
 *     leaf destination-hardware-address {
 *         type string;
 *     }
 *     leaf destination-protocol-address {
 *         type string;
 *     }
 *     leaf payload-offset {
 *         type int32;
 *     }
 *     leaf payload-length {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>arp-packet/arp-packet-fields</i>
 *
 */
public interface ArpPacketFields
    extends
    DataObject,
    PacketFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:arp",
        "2014-05-28", "arp-packet-fields").intern();

    /**
     * Network protocol type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.KnownHardwareType</code> <code>hardwareType</code>, or <code>null</code> if not present
     */
    KnownHardwareType getHardwareType();
    
    /**
     * Higher layer protocol for which the ARP request is intended. This corresponds to
     * EtherType.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.KnownEtherType</code> <code>protocolType</code>, or <code>null</code> if not present
     */
    KnownEtherType getProtocolType();
    
    /**
     * Length (in octets) of a hardware address. Ethernet address size is 6.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hardwareLength</code>, or <code>null</code> if not present
     */
    java.lang.Short getHardwareLength();
    
    /**
     * Length (in octets) of addresses used in the higher layer protocol. IPv4 address 
     * size is 4.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>protocolLength</code>, or <code>null</code> if not present
     */
    java.lang.Short getProtocolLength();
    
    /**
     * Specifies the operation that the sender is performing: 1 for request, 2 for 
     * reply.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.KnownOperation</code> <code>operation</code>, or <code>null</code> if not present
     */
    KnownOperation getOperation();
    
    /**
     * Media address of the sender.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sourceHardwareAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getSourceHardwareAddress();
    
    /**
     * Internet address of the sender.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sourceProtocolAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getSourceProtocolAddress();
    
    /**
     * Media address of the destination/target.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>destinationHardwareAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getDestinationHardwareAddress();
    
    /**
     * Internet address of the destination/target.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>destinationProtocolAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getDestinationProtocolAddress();

}

