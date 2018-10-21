package com.loricahealth.time;

import org.junit.Assert;
import org.junit.Test;


public class GregorianDateTest {

    private static final int D_IN_Y = 365;
    private static final int D_IN_JAN = 31;
    private static final int D_IN_FEB = 28;
    private static final int D_IN_FEB_LEAP = 29;


    @Test
    public void daysStartsCountingFromThe1stJanuary0001() {
        Assert.assertEquals(1, new GregorianDate(1, 1, 1).toDaysNumber());
    }

    @Test
    public void daysUntilDay() {
        Assert.assertEquals(4, new GregorianDate(4, 1, 1).toDaysNumber());
    }

    @Test
    public void daysUntilDayMonthYear() {
        Assert.assertEquals(D_IN_Y + D_IN_JAN + 14, new GregorianDate(14, 2, 2).toDaysNumber());
    }

    @Test
    public void daysFirstLeapYearBefore29Feb() {
        Assert.assertEquals(3 * D_IN_Y + D_IN_JAN + 23, new GregorianDate(23, 2, 4).toDaysNumber());
    }

    @Test
    public void daysFirstLeapYearAfter29Feb() {
        Assert.assertEquals(3 * D_IN_Y + D_IN_JAN + D_IN_FEB_LEAP + 23, new GregorianDate(23, 3, 4).toDaysNumber());
    }

    @Test
    public void daysAfterFirstLeapYear() {
        Assert.assertEquals(D_IN_Y * 4 + D_IN_JAN + D_IN_FEB + 23 + 1, new GregorianDate(23, 3, 5).toDaysNumber());
    }

    @Test
    public void daysSecondLeapYearBefore29Feb() {
        Assert.assertEquals(D_IN_Y * 7 + D_IN_JAN + 23 + 1, new GregorianDate(23, 2, 8).toDaysNumber());
    }

    @Test
    public void daysSecondLeapYearAfter29Feb() {
        Assert.assertEquals(D_IN_Y * 7 + D_IN_JAN + D_IN_FEB_LEAP + 23 + 1, new GregorianDate(23, 3, 8).toDaysNumber());
    }

    @Test
    public void daysCentury() {
        Assert.assertEquals(D_IN_Y * 99 + D_IN_JAN + D_IN_FEB + 23 + 24, new GregorianDate(23, 3, 100).toDaysNumber());
    }

    @Test
    public void days400s() {
        Assert.assertEquals(D_IN_Y * 399 + D_IN_JAN + D_IN_FEB_LEAP + 23 + 96, new GregorianDate(23, 3, 400).toDaysNumber());
    }

    @Test
    public void days500s() {
        Assert.assertEquals(D_IN_Y * 499 + D_IN_JAN + D_IN_FEB + 23 + 121, new GregorianDate(23, 3, 500).toDaysNumber());
    }

    @Test
    public void days2000s() {
        Assert.assertEquals(D_IN_Y * 1999 + D_IN_JAN + D_IN_FEB_LEAP + 23 + 484, new GregorianDate(23, 3, 2000).toDaysNumber());
    }

    @Test
    public void days2001() {
        Assert.assertEquals(D_IN_Y * 2000 + D_IN_JAN + D_IN_FEB + 23 + 485, new GregorianDate(23, 3, 2001).toDaysNumber());
    }

}
