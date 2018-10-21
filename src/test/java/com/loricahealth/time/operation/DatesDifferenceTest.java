package com.loricahealth.time.operation;

import com.loricahealth.time.GregorianDate;
import org.junit.Assert;
import org.junit.Test;

public class DatesDifferenceTest {

    @Test
    public void getDaysZeroDiff() {
        Assert.assertEquals(0, new DatesDifference<>(new GregorianDate(7, 11, 1972),
                new GregorianDate(8, 11, 1972)).getDays());
    }


    @Test
    public void getDaysOneDiff() {
        Assert.assertEquals(1,
                new DatesDifference<>(new GregorianDate(1, 1, 2000),
                        new GregorianDate(3, 1, 2000)).getDays());
    }

    @Test
    public void getDaysSmallDiff() {
        Assert.assertEquals(19, new DatesDifference<>(new GregorianDate(2, 6, 1983),
                new GregorianDate(22, 6, 1983)).getDays());
    }

    @Test
    public void getDaysMediumDiff() {
        Assert.assertEquals(173, new DatesDifference<>(new GregorianDate(4, 7, 1984),
                new GregorianDate(25, 12, 1984)).getDays());
    }

    @Test
    public void getDaysBigDiff() {
        Assert.assertEquals(1979, new DatesDifference<>(new GregorianDate(3, 1, 1989),
                new GregorianDate(3, 8, 1983)).getDays());
    }

    @Test
    public void getDaysMaxDiff() {
        Assert.assertEquals(401400, new DatesDifference<>(new GregorianDate(1, 1, 1901),
                new GregorianDate(31, 12, 2999)).getDays());
    }
}
