package com.highmobility.value;

import com.highmobility.utils.ByteUtils;
import com.highmobility.utils.Range;

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
                (getExpectedRange() != null && getExpectedRange().contains(bytes.length) ==
                        false)) {
            throw new IllegalArgumentException(this.getClass() + ": invalid bytes " + ByteUtils.hexFromBytes
                    (bytes) + " for expected length: " + getExpectedLength() + " range " + getExpectedRange());
        }
    }

    int getExpectedLength() {
        return -1;
    }

    Range getExpectedRange() {
        return null;
    }
}
