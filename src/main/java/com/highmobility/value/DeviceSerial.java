package com.highmobility.value;

/**
 * @deprecated This class has moved to crypto package.
 */
@Deprecated
public class DeviceSerial extends BytesWithLength {
    /**
     * @param value The bytes in hex or Base64.
     */
    public DeviceSerial(String value) {
        super(value);
    }

    /**
     * @param bytes The raw bytes.
     */
    public DeviceSerial(byte[] bytes) {
        super(bytes);
    }

    @Override protected int getExpectedLength() {
        return 9;
    }
}
