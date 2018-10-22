package com.loricahealth.time.transformation;

import com.loricahealth.time.GregorianDate;
import org.junit.Assert;
import org.junit.Test;

public class GregDateToNumberAdapterTest {

    private static final int DAYS_IN_YEAR = 365;
    private static final int DAYS_IN_JAN = 31;
    private static final int DAYS_IN_FEB = 28;


    @Test
    public void daysStartsCountingFromThe1stJanuary0001() {
        Assert.assertEquals(1, new GregDateToNumberAdapter(new GregorianDate(1, 1, 1)).toNumberOfDays());
    }

    @Test
    public void daysUntilDay() {
        Assert.assertEquals(4, new GregDateToNumberAdapter(new GregorianDate(4, 1, 1)).toNumberOfDays());
    }

    @Test
    public void daysUntilDayMonthYear() {
        Assert.assertEquals(14 + DAYS_IN_JAN + DAYS_IN_YEAR, new GregDateToNumberAdapter(new GregorianDate(14, 2, 2)).toNumberOfDays());
    }

    @Test
    public void daysFirstLeapYearBefore29Feb() {
        Assert.assertEquals(23 + DAYS_IN_JAN + 3 * DAYS_IN_YEAR, new GregDateToNumberAdapter(new GregorianDate(23, 2, 4)).toNumberOfDays());
    }

    @Test
    public void daysFirstLeapYearAfter29Feb() {
        Assert.assertEquals(getNoLeapDaysUntil23March0004() + 1, new GregDateToNumberAdapter(new GregorianDate(23, 3, 4)).toNumberOfDays());
    }

    @Test
    public void daysAfterFirstLeapYear() {
        Assert.assertEquals(getNoLeapDaysUntil23March0005() + 1, new GregDateToNumberAdapter(new GregorianDate(23, 3, 5)).toNumberOfDays());
    }

    @Test
    public void daysSecondLeapYearBefore29Feb() {
        Assert.assertEquals(getNoLeapDaysUntil23Feb0008() + 1, new GregDateToNumberAdapter(new GregorianDate(23, 2, 8)).toNumberOfDays());
    }

    @Test
    public void daysSecondLeapYearAfter29Feb() {
        Assert.assertEquals(getNoLeapDaysUntil23March0008() + 2, new GregDateToNumberAdapter(new GregorianDate(23, 3, 8)).toNumberOfDays());
    }

    @Test
    public void daysCentury() {
        Assert.assertEquals(getNoLeapDaysUntil23March100() + 24, new GregDateToNumberAdapter(new GregorianDate(23, 3, 100)).toNumberOfDays());
    }

    @Test
    public void days400s() {
        Assert.assertEquals(getNoLeapDaysUntil23March400() + 97, new GregDateToNumberAdapter(new GregorianDate(23, 3, 400)).toNumberOfDays());
    }

    @Test
    public void days500s() {
        Assert.assertEquals(getNoLeapDaysUntil23March500() + 121, new GregDateToNumberAdapter(new GregorianDate(23, 3, 500)).toNumberOfDays());
    }

    @Test
    public void days2000s() {
        Assert.assertEquals(getNoLeapDaysUntil23March2000() + 485, new GregDateToNumberAdapter(new GregorianDate(23, 3, 2000)).toNumberOfDays());
    }

    @Test
    public void days2001() {
        Assert.assertEquals(getNoLeapDaysUntil23March2001() + 485, new GregDateToNumberAdapter(new GregorianDate(23, 3, 2001)).toNumberOfDays());
    }


    private int getNoLeapDaysUntil23March400() {
        return DAYS_IN_YEAR * 399 + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }

    private int getNoLeapDaysUntil23March100() {
        return DAYS_IN_YEAR * 99 + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }

    private int getNoLeapDaysUntil23March500() {
        return DAYS_IN_YEAR * 499 + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }


    private int getNoLeapDaysUntil23March2000() {
        return DAYS_IN_YEAR * 1999 + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }

    private int getNoLeapDaysUntil23March2001() {
        return DAYS_IN_YEAR * 2000 + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }

    private int getNoLeapDaysUntil23March0008() {
        return DAYS_IN_YEAR * 7 + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }

    private int getNoLeapDaysUntil23Feb0008() {
        return DAYS_IN_YEAR * 7 + DAYS_IN_JAN + 23;
    }

    private int getNoLeapDaysUntil23March0004() {
        return 3 * DAYS_IN_YEAR + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }

    private int getNoLeapDaysUntil23March0005() {
        return DAYS_IN_YEAR * 4 + DAYS_IN_JAN + DAYS_IN_FEB + 23;
    }

}