package br.com.ada.datetime;

import br.com.ada.datetime.operations.CountdownTimer;
import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.Calendar;

public class CountdownTimerTest extends TestCase {

    public void testCalculateDaysRemainingJavaTime() {

        CountdownTimer countdownTimer = new CountdownTimer();

        long count = countdownTimer.calculateDaysRemainingJavaTime(LocalDate.of(2024,7,10));

        System.out.println(count);

    }

    public void testCalculateDaysRemainingJavaUtil() {

        CountdownTimer countdownTimer = new CountdownTimer();

        Calendar cal = Calendar.getInstance();
        cal.set(2024,6,10);
        long count = countdownTimer.calculateDaysRemainingJavaUtil(cal.getTime());

        System.out.println(count);
    }
}