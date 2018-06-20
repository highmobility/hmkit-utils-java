package com.highmobility.utils;

public class Range {
    private int start, range, end;

    public int getStart() {
        return start;
    }

    public int getRange() {
        return range;
    }

    public int getEnd() {
        return end;
    }

    public Range(int start, int range){
        this.start = start;
        this.range = range;
        this.end = start + range;
    }

    public boolean contains(int number) {
        if (range < 0) return number <= start && number > end; // some Ranges (Rock) start from smaller number and have a negative range
        else return number >= start && number <= end;
    }

    @Override public String toString() {
        return start + " .. " + end;
    }
}