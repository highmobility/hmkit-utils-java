/*
 * The MIT License
 *
 * Copyright (c) 2014- High-Mobility GmbH (https://high-mobility.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.highmobility.utils;

import com.highmobility.value.Bytes;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class BytesTest {
    @Test public void concat() {
        Bytes first = new Bytes("0101");
        Bytes second = new Bytes("0102");

        assertTrue(Bytes.concat(first, second).equals(new Bytes("01010102")));
    }

    @Test public void equalsTest() {
        Bytes bytes = new Bytes("010102");
        assertTrue(bytes.equals(new byte[]{0x01, 0x01, 0x02}));
        assertTrue(bytes.equals("010102"));
    }

    @Test public void testEmptyBytesLog() {
        Bytes bytes = new Bytes(new byte[0]);
        assertTrue(bytes.toString().equals("[]"));
    }

    @Test public void base64Input() {
        Bytes serial = new Bytes
                ("K5mVFoq2rqKwAttWdIyPhwgVL80FNxkkNpgr/ca+ueq3JFn5iMLAMTJOKzG26qwtqrLO" +
                        "+z2sxxdwWNaItdBUWg==");
        assertTrue(Arrays.equals(serial.getByteArray(), ByteUtils.bytesFromHex
                ("2B9995168AB6AEA2B002DB56748C8F8708152FCD0537192436982BFDC6BEB9EAB72459F988C2C031324E2B31B6EAAC2DAAB2CEFB3DACC7177058D688B5D0545A")));
    }

    @Test public void hexInput() {
        Bytes serial = new Bytes("22AAFF");
        assertTrue(Arrays.equals(serial.getByteArray(), ByteUtils.bytesFromHex("22AAFF")));
    }

    @Test public void doesNotThrowOnLastItemAccess() {
        Bytes bytes = new Bytes("0102");
        //noinspection ResultOfMethodCallIgnored
        bytes.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class) public void throwsOnOverAccess() {
        Bytes bytes = new Bytes("0102");
        //noinspection ResultOfMethodCallIgnored
        bytes.get(2);
    }
}
