package com.loricahealth.time.parser;

import com.loricahealth.time.GregorianDate;
import com.loricahealth.time.parser.exceptions.IllegalDateFormat;
import org.junit.Assert;
import org.junit.Test;

public class GregDateParserTest {

    @Test
    public void parseDateZeroPrefixed() {
        Assert.assertEquals(new GregorianDate(1, 2, 2019), new GregDateParser("01/02/2019").parse());
    }

    @Test(expected = IllegalDateFormat.class)
    public void parseWrongFormattedDateThrowsException() {
        Assert.assertEquals(new GregorianDate(14, 2, 2019), new GregDateParser("14/2/2019").parse());
    }
}