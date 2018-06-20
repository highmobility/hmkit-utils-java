package com.highmobility.value;

/**
 * @deprecated This class has moved to crypto package.
 */
@Deprecated
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

    @Override protected int getExpectedLength() {
        return 64;
    }
}
