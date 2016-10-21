package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528;


public enum KnownOperation {
    Reserved(0, "reserved"),
    
    Request(1, "request"),
    
    Reply(2, "reply"),
    
    RequestReverse(3, "request reverse"),
    
    ReplyReverse(4, "reply reverse")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, KnownOperation> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, KnownOperation> b = com.google.common.collect.ImmutableMap.builder();
        for (KnownOperation enumItem : KnownOperation.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private KnownOperation(int value, java.lang.String name) {
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
     * @return corresponding KnownOperation item
     */
    public static KnownOperation forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
