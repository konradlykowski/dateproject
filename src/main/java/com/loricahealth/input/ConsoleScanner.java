package com.loricahealth.input;

import com.loricahealth.time.operation.DatesDifference;
import com.loricahealth.time.parser.GregDateParser;
import com.loricahealth.time.parser.exceptions.IllegalDateFormat;
import lombok.extern.java.Log;

import java.util.Scanner;

@Log
public class ConsoleScanner {

    public static void main(String[] args) {
        log.info("Please input an empty line to finish. Please provide a valid dates in a format like: 03/01/1989 03/08/1983");
        Scanner sc = new Scanner(System.in);
        readInput(sc);
        log.info("Thank you!");
    }

    private static void readInput(Scanner sc) {
        String word;
        while (!(word = sc.nextLine().trim()).isEmpty()) {
            String[] dates = word.split("\\s");
            try {
                System.out.println(new DatesDifference<>(new GregDateParser(dates[0]).parse(), new GregDateParser(dates[1]).parse()).getDays());
            } catch (IllegalDateFormat | ArrayIndexOutOfBoundsException e) {
                log.warning("Please input dates in a format like 03/01/1989 03/08/1983 - " + e.getLocalizedMessage());
            }
        }
    }
}
