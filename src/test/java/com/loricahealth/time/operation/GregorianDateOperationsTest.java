package com.loricahealth.time.operation;

import com.loricahealth.time.transformation.GregDateToNumberAdapter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GregorianDateOperationsTest {

    @Mock
    GregDateToNumberAdapter start;
    @Mock
    GregDateToNumberAdapter end;


    @Test
    public void daysDifferenceCalculatedBaseOnDays() {
        Mockito.when(start.toNumberOfDays()).thenReturn(108);
        Mockito.when(end.toNumberOfDays()).thenReturn(100);
        Assert.assertEquals(7, new GregorianDateOperations(start, end).getDaysDifference());
    }


}
