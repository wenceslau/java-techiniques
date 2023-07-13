package br.com.ada.datetime.operations;

import br.com.ada.datetime.operations.TimeDifference;
import junit.framework.TestCase;

import java.time.LocalDateTime;
import java.util.Calendar;

public class TimeDifferenceTest extends TestCase {

    public void testCalculateTimeDifferenceJavaTime() {
        TimeDifference timeDifference = new TimeDifference();
        String value = timeDifference.calculateTimeDifferenceJavaTime(
                LocalDateTime.of(2023,7,10, 8,29),
                LocalDateTime.of(2024,7,10,6,33));
        System.out.println(value);
    }

    public void testCalculateTimeDifferenceJavaUtil() {

        TimeDifference timeDifference = new TimeDifference();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2023,6,10, 8, 29);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2024,6,10,6,33);
        String value = timeDifference.calculateTimeDifferenceJavaUtil(cal1.getTime(), cal2.getTime());
        System.out.println(value);

    }
}