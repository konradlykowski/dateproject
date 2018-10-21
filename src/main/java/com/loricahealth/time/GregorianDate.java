package com.loricahealth.time;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class GregorianDate {

    private final int day;
    private final int month;
    private final int year;

    public int toDaysNumber() {
        if (isLeapYear()) {
            return day + GregCalConst.INSTANCE.leapYearDaysTo(month) + GregCalConst.INSTANCE.getDaysPerYear() * (year - 1) + (leapYears() - 1);
        }
        return day + GregCalConst.INSTANCE.daysTo(month) + GregCalConst.INSTANCE.getDaysPerYear() * (year - 1) + leapYears();
    }

    private int leapYears() {
        return (year / 4) - (year / 100) + (year / 400);
    }

    private boolean isLeapYear() {
        return (year & 3) == 0 && ((year % 100) != 0 || (year % 400) == 0);
    }

}
