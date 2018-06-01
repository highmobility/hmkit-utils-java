package com.highmobility.value;

public class AppIdentifier extends BytesWithLength {
    /**
     * @param value The bytes in hex or Base64.
     */
    public AppIdentifier(String value) {
        super(value);
    }

    /**
     * @param bytes The raw bytes.
     */
    public AppIdentifier(byte[] bytes) {
        super(bytes);
    }

    @Override int getExpectedLength() {
        return 12;
    }
}
