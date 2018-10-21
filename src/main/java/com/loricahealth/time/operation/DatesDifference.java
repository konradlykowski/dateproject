package com.loricahealth.time.operation;

import com.loricahealth.time.GregorianDate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DatesDifference<T extends GregorianDate> {
    private final T start;
    private final T end;

    public int getDays() {
        return Math.abs(end.toDaysNumber() - start.toDaysNumber()) - 1;
    }
}
