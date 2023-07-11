package br.com.ada.datetime;

import br.com.ada.datetime.operations.LeapYearChecker;
import junit.framework.TestCase;
import org.junit.Assert;

public class LeapYearCheckerTest extends TestCase {

    public void testIsLeapJavaTime() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        boolean isLeap = leapYearChecker.isLeapJavaTime(2023);
        System.out.println(isLeap);
        Assert.assertEquals(false, isLeap);
    }

    public void testIsLeapJavaUtil() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        boolean isLeap = leapYearChecker.isLeapJavaUtil(2023);
        System.out.println(isLeap);
        Assert.assertEquals(false, isLeap);

    }
}