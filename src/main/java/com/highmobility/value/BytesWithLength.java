/*
 * The MIT License
 *
 * Copyright (c) 2023- High-Mobility GmbH (https://high-mobility.com)
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
package com.highmobility.value;

import com.highmobility.utils.ByteUtils;
import com.highmobility.utils.Range;

public class BytesWithLength extends Bytes {

    public BytesWithLength(Bytes value) {
        super(value.getByteArray());
        validateBytes();
    }

    /**
     * @param value The bytes in hex or Base64.
     */
    public BytesWithLength(String value) {
        super(value);
        validateBytes();
    }

    /**
     * @param bytes The raw bytes.
     */
    public BytesWithLength(byte[] bytes) {
        super(bytes);
        validateBytes();
    }

    public BytesWithLength() {
        super();
    }

    void validateBytes() {
        if ((getExpectedLength() != -1 && getExpectedLength() != bytes.length) ||
                (getExpectedRange() != null && getExpectedRange().contains(bytes.length) ==
                        false)) {
            throw new IllegalArgumentException(this.getClass() + ": invalid bytes " + ByteUtils.hexFromBytes
                    (bytes) + " for expected length: " + getExpectedLength() + " range " + getExpectedRange());
        }
    }

    protected int getExpectedLength() {
        return -1;
    }

    protected Range getExpectedRange() {
        return null;
    }
}
