package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ipv4.rev140528;


public enum KnownIpProtocols {
    /**
     * IPv6 Hop-by-Hop Option
     *
     */
    Hopopt(0, "hopopt"),
    
    /**
     * Internet Control Message Protocol
     *
     */
    Icmp(1, "icmp"),
    
    /**
     * Internet Group Management Protocol
     *
     */
    Igmp(2, "igmp"),
    
    /**
     * Gateway-to-Gateway Protocol
     *
     */
    Ggp(3, "ggp"),
    
    /**
     * IP-in-IP Encapsulation
     *
     */
    IpInIp(4, "ip-in-ip"),
    
    /**
     * Internet Stream Protocol
     *
     */
    St(5, "st"),
    
    /**
     * Transmisson Control Protocol
     *
     */
    Tcp(6, "tcp"),
    
    /**
     * Core-based trees
     *
     */
    Cbt(7, "cbt"),
    
    /**
     * Exterior Gateway Protocol
     *
     */
    Egp(8, "egp"),
    
    /**
     * Interior Gateway Protocol
     *
     */
    Igp(9, "igp"),
    
    /**
     * Network Voice Protocol
     *
     */
    Nvp(11, "nvp"),
    
    /**
     * User Datagram Protocol
     *
     */
    Udp(17, "udp"),
    
    /**
     * Host Monitoring Protocol
     *
     */
    Hmp(20, "hmp"),
    
    /**
     * Reliable Datagram Protocol
     *
     */
    Rdp(27, "rdp"),
    
    /**
     * Datagram Congestion Control Protocol
     *
     */
    Dccp(33, "dccp"),
    
    /**
     * IPv6 Encapsulation
     *
     */
    Encap(41, "encap"),
    
    /**
     * IPv6 Routing Header
     *
     */
    Ipv6Route(43, "ipv6-route"),
    
    /**
     * IPv6 Fragment Header
     *
     */
    Ipv6Frag(44, "ipv6-frag"),
    
    /**
     * Resource Reservation Protocol
     *
     */
    Rsvp(46, "rsvp"),
    
    /**
     * Generic Routing Encapsulation
     *
     */
    Gre(47, "gre"),
    
    /**
     * Encapsulating Security Payload
     *
     */
    Esp(50, "esp"),
    
    /**
     * Authentication Header
     *
     */
    Ah(51, "ah"),
    
    /**
     * IPv6 ICMP
     *
     */
    Ipv6Icmp(58, "ipv6-icmp"),
    
    /**
     * IPv6 No Next Header
     *
     */
    Ipv6NoNext(59, "ipv6-no-next"),
    
    /**
     * IPv6 Destination Options
     *
     */
    Ipv6Opts(60, "ipv6-opts"),
    
    /**
     * Open Shortest Path First
     *
     */
    Ospf(89, "ospf"),
    
    /**
     * Stream Control Transmission Protocol
     *
     */
    Sctp(132, "sctp"),
    
    /**
     * Fibre Channel
     *
     */
    FibreChannel(133, "fibre-channel"),
    
    /**
     * IPv6 Mobility Header
     *
     */
    Ipv6Mobility(135, "ipv6-mobility"),
    
    /**
     * Use for experimentation and testing, RFC3692
     *
     */
    Experimentation1(253, "experimentation1"),
    
    /**
     * Use for experimentation and testing, RFC3692
     *
     */
    Experimentation2(254, "experimentation2")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, KnownIpProtocols> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, KnownIpProtocols> b = com.google.common.collect.ImmutableMap.builder();
        for (KnownIpProtocols enumItem : KnownIpProtocols.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private KnownIpProtocols(int value, java.lang.String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Returns the name of the enumeration item as it is specified in the input yang.
     *
     * @return the name of the enumeration item as it is specified in the input yang
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding KnownIpProtocols item
     */
    public static KnownIpProtocols forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
