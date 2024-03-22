package org.ergemp.dateTimeExamples.javaTimeExamples;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaTimeYearMonthExamples {
    public static void main(String[] args) {

        //
        // Example: now()
        //
        Year y = Year.now();
        System.out.println(y);
        //2023


        //
        // Example: atDay()
        //
        Year y2 = Year.of(2017);
        LocalDate l = y2.atDay(123);
        System.out.println(l);
        //2017-05-03

        //
        // Example: length()
        //
        Year year = Year.of(2017);
        System.out.println(year.length());
        //365

        // Example: isLeap()
        year = Year.of(2016);
        System.out.println(year.isLeap());
        //true

        //
        // year month examples
        //

        YearMonth ym = YearMonth.now();
        System.out.println(ym);
        //2023-11

        //
        // Example: format()
        //

        String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(s);
        //11 2023

        //
        // Example: get()
        //

        YearMonth yyear = YearMonth.now();
        long l1 = yyear.get(ChronoField.YEAR);
        System.out.println(l1);
        long l2 = yyear.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(l2);
        /*
        2023
        11
        */

        //
        // Example: plus() minus()
        //

        YearMonth ym1 = YearMonth.now();
        YearMonth ym2 = ym1.plus(Period.ofYears(2));
        YearMonth ym3 = ym1.minus(Period.ofYears(2));
        System.out.println(ym2);
        System.out.println(ym3);
        //2025-11
        //2021-11





    }
}
