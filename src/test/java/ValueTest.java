
import com.highmobility.value.HMCalendar;

import org.junit.Test;

import java.util.Calendar;

import static junit.framework.TestCase.assertTrue;

public class ValueTest {
    @Test public void calendar() {
        HMCalendar calendar = new HMCalendar("0701020307");
        Calendar date = calendar.getCalendar();
        assertTrue(date.get(Calendar.YEAR) == 2007);
        assertTrue(date.get(Calendar.MONTH) == 0);
        assertTrue(date.get(Calendar.DAY_OF_MONTH) == 2);
        assertTrue(date.get(Calendar.HOUR) == 3);
        assertTrue(date.get(Calendar.MINUTE) == 7);
    }


}
