package br.com.ada.datetime;

import br.com.ada.datetime.operations.AgeCalculator;
import junit.framework.TestCase;
import org.junit.Assert;

import java.time.LocalDate;
import java.util.Calendar;

public class AgeCalculatorTest extends TestCase {

    public void testCalculateAgeJavaTime() {

        AgeCalculator ageCalculator = new AgeCalculator();

        int age = ageCalculator.calculateAgeJavaTime(LocalDate.of(1985,7,10));

        Assert.assertEquals(38, age);

    }

    public void testCalculateAgeJavaUtil() {

        AgeCalculator ageCalculator = new AgeCalculator();

        Calendar cal = Calendar.getInstance();
        cal.set(1985,6,10);
        int age = ageCalculator.calculateAgeJavaUtil(cal.getTime());

        Assert.assertEquals(38, age);
    }
}