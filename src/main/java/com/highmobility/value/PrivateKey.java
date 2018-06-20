package com.highmobility.value;

/**
 * @deprecated This class has moved to crypto package.
 */
@Deprecated
public class PrivateKey extends BytesWithLength {
    /**
     * @param value The bytes in hex or Base64.
     */
    public PrivateKey(String value) {
        super(value);
    }

    /**
     * @param bytes The raw bytes.
     */
    public PrivateKey(byte[] bytes) {
        super(bytes);
    }

    @Override protected int getExpectedLength() {
        return 32;
    }
}
