package com.highmobility.value;

import com.highmobility.utils.Base64;
import com.highmobility.utils.ByteUtils;

import java.util.Arrays;

public class Bytes {
    protected byte[] bytes;

    /**
     * @return The raw bytes.
     */
    public byte[] getByteArray() {
        return bytes;
    }

    /**
     * @return The length of the bytes.
     */
    public int getLength() {
        return bytes.length;
    }

    /**
     * @return The bytes in hex.
     */
    public String getHex() {
        return ByteUtils.hexFromBytes(bytes);
    }

    /**
     * @return The bytes in Base64.
     */
    public String getBase64() {
        return Base64.encode(bytes);
    }

    /**
     * @param value The bytes in hex or Base64.
     */
    public Bytes(String value) {
        this(ByteUtils.bytesFromHexOrBase64(value));
    }

    /**
     * @param bytes The raw bytes.
     */
    public Bytes(byte[] bytes) {
        if (bytes == null) bytes = new byte[0];
        this.bytes = bytes;
    }

    public Bytes() {
        this.bytes = new byte[0];
    }

    /**
     * Concatenate a bytes to self.
     *
     * @param bytes The concatenated bytes.
     * @return The new bytes.
     */
    public Bytes concat(Bytes bytes) {
        return Bytes.concat(this, bytes);
    }

    /**
     * Concatenate two bytes.
     *
     * @param first  The first bytes.
     * @param second The second bytes.
     * @return The concatenated bytes.
     */
    public static Bytes concat(Bytes first, Bytes second) {
        return new Bytes(ByteUtils.concatBytes(first.getByteArray(), second.getByteArray()));
    }

    @Override public String toString() {
        return ByteUtils.hexFromBytes(bytes);
    }

    @Override public boolean equals(Object obj) {
        try {
            return (obj instanceof Bytes && Arrays.equals(((Bytes) obj).bytes, bytes)) ||
                    (obj instanceof byte[] && Arrays.equals((byte[]) obj, bytes)) ||
                    (obj instanceof String && Arrays.equals(ByteUtils.bytesFromHexOrBase64((String) obj), bytes));
        } catch (Exception e) {
            return false;
        }
    }
}
