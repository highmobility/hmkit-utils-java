package com.highmobility.value;

import com.highmobility.utils.Range;

public class Permissions extends BytesWithLength {
    private static final Range range = new Range(0, 16);

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

    @Override Range getExpectedRange() {
        return range;
    }
}
