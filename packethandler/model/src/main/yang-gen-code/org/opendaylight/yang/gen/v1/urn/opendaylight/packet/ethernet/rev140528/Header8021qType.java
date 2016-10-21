package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528;


public enum Header8021qType {
    /**
     * VLAN-tagged frame (IEEE 802.1Q) &amp; Shortest Path Bridging IEEE 802.1aq[4]
     *
     */
    VlanTagged(33024, "vlan-tagged"),
    
    /**
     * Q-in-Q
     *
     */
    QInQ(37120, "q-in-q"),
    
    /**
     * 802.1ad provider bridging
     *
     */
    ProviderBridging(34984, "provider-bridging")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, Header8021qType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Header8021qType> b = com.google.common.collect.ImmutableMap.builder();
        for (Header8021qType enumItem : Header8021qType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private Header8021qType(int value, java.lang.String name) {
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
     * @return corresponding Header8021qType item
     */
    public static Header8021qType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
