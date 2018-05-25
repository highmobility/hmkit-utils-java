
import com.highmobility.utils.ByteUtils;
import com.highmobility.value.Bytes;
import com.highmobility.value.DeviceSerial;
import com.highmobility.value.Permissions;
import com.highmobility.value.PublicKey;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class BytesTest {
    @Test public void serial() {
        DeviceSerial serial = new DeviceSerial("000000000000000000");
        assertTrue(Arrays.equals(serial.getByteArray(), new byte[] {0x00, 0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00 }));
    }

    @Test public void base64Input() {
        PublicKey serial = new PublicKey("K5mVFoq2rqKwAttWdIyPhwgVL80FNxkkNpgr/ca+ueq3JFn5iMLAMTJOKzG26qwtqrLO+z2sxxdwWNaItdBUWg==");
        assertTrue(Arrays.equals(serial.getByteArray(), ByteUtils.bytesFromHex("2B9995168AB6AEA2B002DB56748C8F8708152FCD0537192436982BFDC6BEB9EAB72459F988C2C031324E2B31B6EAAC2DAAB2CEFB3DACC7177058D688B5D0545A")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ivalidLengthThrow() {
        new DeviceSerial("00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ivalidRangeThrow() {
        new Permissions("0011334400113344001133440011334477");
    }

    @Test public void concat() {
        Bytes first = new Bytes("0101");
        Bytes second = new Bytes("0102");

        assertTrue(Bytes.concat(first, second).equals(new Bytes("01010102")));
    }

    @Test public void equalsTest() {
        Bytes bytes = new Bytes("010102");
        assertTrue(bytes.equals(new byte[] {0x01, 0x01, 0x02}));
        assertTrue(bytes.equals("010102"));
    }
}
