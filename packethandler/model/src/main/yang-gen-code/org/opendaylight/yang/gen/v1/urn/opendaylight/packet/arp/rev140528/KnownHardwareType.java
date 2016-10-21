package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528;


public enum KnownHardwareType {
    Reserved(0, "reserved"),
    
    Ethernet(1, "ethernet")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, KnownHardwareType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, KnownHardwareType> b = com.google.common.collect.ImmutableMap.builder();
        for (KnownHardwareType enumItem : KnownHardwareType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private KnownHardwareType(int value, java.lang.String name) {
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
     * @return corresponding KnownHardwareType item
     */
    public static KnownHardwareType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
