package com.loricahealth.time.parser;

import com.loricahealth.time.GregorianDate;
import com.loricahealth.time.parser.exceptions.IllegalDateFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GregDateParser {

    private String date;
    private static String SLASHED_DATE_REG = "^(\\d{2})/(\\d{2})/(\\d{4})$";

    public GregDateParser(String date) {
        this.date = date;
    }

    public GregorianDate parse() {
        Matcher matcher = Pattern.compile(SLASHED_DATE_REG).matcher(date);
        if (matcher.find()) {
            return new GregorianDate(Integer.valueOf(matcher.group(1)), Integer.valueOf(matcher.group(2)), Integer.valueOf(matcher.group(3)));
        } else {
            throw new IllegalDateFormat(date);
        }
    }

}

