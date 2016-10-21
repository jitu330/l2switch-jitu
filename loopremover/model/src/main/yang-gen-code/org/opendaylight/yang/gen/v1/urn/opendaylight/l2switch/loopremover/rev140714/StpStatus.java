package org.opendaylight.yang.gen.v1.urn.opendaylight.l2switch.loopremover.rev140714;


public enum StpStatus {
    /**
     * STP Status Forwarding
     *
     */
    Forwarding(1, "forwarding"),
    
    /**
     * STP status discarding
     *
     */
    Discarding(2, "discarding")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, StpStatus> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, StpStatus> b = com.google.common.collect.ImmutableMap.builder();
        for (StpStatus enumItem : StpStatus.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private StpStatus(int value, java.lang.String name) {
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
     * @return corresponding StpStatus item
     */
    public static StpStatus forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
