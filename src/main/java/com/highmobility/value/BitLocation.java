package com.highmobility.value;

/**
 * The location of a bit in a byte.
 */
public class BitLocation {
    int byteLocation;
    int bitLocation;

    public int getByteLocation() {
        return byteLocation;
    }

    public int getBitLocation() {
        return bitLocation;
    }

    public BitLocation(int byteLocation, int bitLocation) {
        if (bitLocation > 7) throw new IllegalArgumentException("Bit location is from 0 - 7.");
        this.byteLocation = byteLocation;
        this.bitLocation = bitLocation;
    }
}