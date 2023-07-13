package br.com.ada.datetime.operations;

import br.com.ada.datetime.operations.BirthdayReminder;
import junit.framework.TestCase;
import org.junit.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayReminderTest extends TestCase {

    public void testListNextBirthdayJavaTime() throws ParseException {

        Map<String, LocalDate> birthdays = new HashMap<>();
        birthdays.put("John", LocalDate.of(1990, 6, 15));
        birthdays.put("Mary", LocalDate.of(1985, 8, 20));
        birthdays.put("David", LocalDate.of(1995, 3, 10));
        birthdays.put("Emily", LocalDate.of(1998, 11, 25));

        BirthdayReminder birthdayReminder = new BirthdayReminder();
        List<String> nexBirthdays = birthdayReminder.listNextBirthdayJavaTime(birthdays);

        System.out.println(nexBirthdays);

        Assert.assertEquals(2, nexBirthdays.size());

    }

    public void testListNextBirthdayJavaUtil() throws ParseException {

        Map<String, Date> birthdays = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Add birthdays to the map
        birthdays.put("John", sdf.parse("1990-06-15"));
        birthdays.put("Mary", sdf.parse("1985-08-20"));
        birthdays.put("David", sdf.parse("1995-03-10"));
        birthdays.put("Emily", sdf.parse("1998-11-25"));

        BirthdayReminder birthdayReminder = new BirthdayReminder();
        List<String> nexBirthdays = birthdayReminder.listNextBirthdayJavaUtil(birthdays);

        System.out.println(nexBirthdays);

        Assert.assertEquals(2, nexBirthdays.size());

    }
}