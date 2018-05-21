package com.highmobility.value;

import java.time.temporal.ValueRange;

public class Permissions extends BytesWithLength {
    private static final ValueRange range = ValueRange.of(0, 16);

    /**
     * @param value The bytes in hex or Base64.
     */
    public Permissions(String value) {
        super(value);
    }

    /**
     * @param bytes The raw bytes.
     */
    public Permissions(byte[] bytes) {
        super(bytes);
    }

    /**
     * No permissions.
     */
    public Permissions() {
        super();
    }

    @Override ValueRange getExpectedRange() {
        return range;
    }
}
