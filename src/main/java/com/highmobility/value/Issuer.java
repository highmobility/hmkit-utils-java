package com.highmobility.value;

public class Issuer extends BytesWithLength {
    /**
     * @param value The bytes in hex or Base64.
     */
    public Issuer(String value) {
        super(value);
    }

    /**
     * @param bytes The raw bytes.
     */
    public Issuer(byte[] bytes) {
        super(bytes);
    }

    @Override int getExpectedLength() {
        return 4;
    }
}
