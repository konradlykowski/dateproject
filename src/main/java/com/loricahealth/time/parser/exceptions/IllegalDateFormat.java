package com.loricahealth.time.parser.exceptions;

public class IllegalDateFormat extends RuntimeException {
    public IllegalDateFormat(String wrongFormat) {
        super(wrongFormat);
    }
}
