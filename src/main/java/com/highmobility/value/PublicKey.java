package com.highmobility.value;

/**
 * @deprecated This class has moved to crypto package.
 */
@Deprecated
public class PublicKey extends BytesWithLength {
    /**
     * @param value The bytes in hex or Base64.
     */
    public PublicKey(String value) {
        super(value);
    }

    /**
     * @param bytes The raw bytes.
     */
    public PublicKey(byte[] bytes) {
        super(bytes);
    }

    @Override protected int getExpectedLength() {
        return 64;
    }
}
