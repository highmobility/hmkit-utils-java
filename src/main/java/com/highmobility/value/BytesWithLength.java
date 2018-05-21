package com.highmobility.value;

import java.time.temporal.ValueRange;

public class BytesWithLength extends Bytes {
    /**
     * @param value The bytes in hex or Base64.
     */
    public BytesWithLength(String value) {
        super(value);
        validateBytes(bytes);
    }

    /**
     * @param bytes The raw bytes.
     */
    public BytesWithLength(byte[] bytes) {
        super(bytes);
        validateBytes(bytes);
    }

    public BytesWithLength() {
        super();
    }

    void validateBytes(byte[] bytes) {
        if ((getExpectedLength() != -1 && getExpectedLength() != bytes.length) ||
                (getExpectedRange() != null && getExpectedRange().isValidValue(bytes.length) == false)) {
            throw new IllegalArgumentException("Invalid bytes for expected length: " + getLength());
        }
    }

    int getExpectedLength() {
        return -1;
    }

    ValueRange getExpectedRange() {
        return null;
    }
}
