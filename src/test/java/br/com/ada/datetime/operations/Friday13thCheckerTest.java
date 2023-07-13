package br.com.ada.datetime.operations;

import br.com.ada.datetime.operations.Friday13thChecker;
import junit.framework.TestCase;
import org.junit.Assert;

public class Friday13thCheckerTest extends TestCase {

    public void testIsFriday13JavaTime() {

        Friday13thChecker friday13thChecker = new Friday13thChecker();
        boolean is13 =  friday13thChecker.isFriday13JavaTime(2023,1);
        System.out.println(is13);
        Assert.assertEquals(true, is13);
    }

    public void testIsFriday13JavaUtil() {

        Friday13thChecker friday13thChecker = new Friday13thChecker();
        boolean is13 =  friday13thChecker.isFriday13JavaUtil(2023,1);
        System.out.println(is13);
        Assert.assertEquals(true, is13);

    }
}