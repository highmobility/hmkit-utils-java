package com.highmobility.value;

public class Signature extends BytesWithLength {
    /**
     * @param value The bytes in hex or Base64.
     */
    public Signature(String value) {
        super(value);
    }

    /**
     * @param bytes The raw bytes.
     */
    public Signature(byte[] bytes) {
        super(bytes);
    }

    @Override int getExpectedLength() {
        return 64;
    }
}
