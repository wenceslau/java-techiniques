package br.com.ada.datetime;

import br.com.ada.datetime.operations.DayOfWeekChecker;
import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.Calendar;

public class DayOfWeekCheckerTest extends TestCase {

    public void testGetDayOfWeekJavaTime() {
        DayOfWeekChecker dayOfWeekChecker = new DayOfWeekChecker();

        String dayOfWeek = dayOfWeekChecker.getDayOfWeekJavaTime(LocalDate.of(2023,7,10));

        assertEquals("monday", dayOfWeek.toLowerCase());
    }

    public void testGetDayOfWeekJavaUtil() {

        DayOfWeekChecker dayOfWeekChecker = new DayOfWeekChecker();

        Calendar cal = Calendar.getInstance();
        cal.set(2023,6,10);
        String dayOfWeek = dayOfWeekChecker.getDayOfWeekJavaUtil(cal.getTime());

        assertEquals("monday", dayOfWeek.toLowerCase());

    }
}