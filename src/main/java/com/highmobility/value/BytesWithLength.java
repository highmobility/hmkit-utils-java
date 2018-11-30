package com.highmobility.value;

import com.highmobility.utils.ByteUtils;
import com.highmobility.utils.Range;

public class BytesWithLength extends Bytes {

    public BytesWithLength(Bytes value) {
        super(value.getByteArray());
        validateBytes();
    }

    /**
     * @param value The bytes in hex or Base64.
     */
    public BytesWithLength(String value) {
        super(value);
        validateBytes();
    }

    /**
     * @param bytes The raw bytes.
     */
    public BytesWithLength(byte[] bytes) {
        super(bytes);
        validateBytes();
    }

    public BytesWithLength() {
        super();
    }

    void validateBytes() {
        if ((getExpectedLength() != -1 && getExpectedLength() != bytes.length) ||
                (getExpectedRange() != null && getExpectedRange().contains(bytes.length) ==
                        false)) {
            throw new IllegalArgumentException(this.getClass() + ": invalid bytes " + ByteUtils.hexFromBytes
                    (bytes) + " for expected length: " + getExpectedLength() + " range " + getExpectedRange());
        }
    }

    protected int getExpectedLength() {
        return -1;
    }

    protected Range getExpectedRange() {
        return null;
    }
}
