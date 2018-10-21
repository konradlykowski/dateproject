package com.loricahealth.time;

public enum GregCalConst {
    INSTANCE;

    private final int[] daysToMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    private final int[] daysToMonthLeapYear = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
    private final int daysPerYear = 365;

    public int daysTo(int month) {
        return daysToMonth[month - 1];
    }

    public int leapYearDaysTo(int month) {
        return daysToMonthLeapYear[month - 1];
    }

    public int getDaysPerYear() {
        return daysPerYear;
    }
}
