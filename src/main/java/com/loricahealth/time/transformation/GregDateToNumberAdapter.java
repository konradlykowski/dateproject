package com.loricahealth.time.transformation;

import com.loricahealth.time.constants.GregCalendarConst;
import com.loricahealth.time.GregorianDate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GregDateToNumberAdapter {

    private final GregorianDate date;

    public int toNumberOfDays() {
        if (isLeapYear()) {
            return date.getDay() + GregCalendarConst.INSTANCE.leapYearDaysTo(date.getMonth()) + getDaysForAllPreviousYears() + (leapYears() - 1);
        }
        return date.getDay() + GregCalendarConst.INSTANCE.daysTo(date.getMonth()) + getDaysForAllPreviousYears() + leapYears();
    }

    private int getDaysForAllPreviousYears() {
        return GregCalendarConst.INSTANCE.getDaysPerYear() * (date.getYear() - 1);
    }

    private int leapYears() {
        return (date.getYear() / 4) - (date.getYear() / 100) + (date.getYear() / 400);
    }

    private boolean isLeapYear() {
        return (date.getYear() & 3) == 0 && ((date.getYear() % 100) != 0 || (date.getYear() % 400) == 0);
    }
}
