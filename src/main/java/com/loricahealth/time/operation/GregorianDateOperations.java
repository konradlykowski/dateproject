package com.loricahealth.time.operation;

import com.loricahealth.time.transformation.GregDateToNumberAdapter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class GregorianDateOperations {
    private GregDateToNumberAdapter start;
    private GregDateToNumberAdapter end;
    public GregorianDateOperations(GregDateToNumberAdapter start, GregDateToNumberAdapter end) {
        this.start = start;
        this.end = end;
    }
    public int getDaysDifference() {
        return Math.abs(end.toNumberOfDays() - start.toNumberOfDays()) - 1;
    }
}
