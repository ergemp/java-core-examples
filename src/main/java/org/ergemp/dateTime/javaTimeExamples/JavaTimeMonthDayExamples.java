package org.ergemp.dateTime.javaTimeExamples;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class JavaTimeMonthDayExamples {
    public static void main(String[] args) {

        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(1944);
        System.out.println(date);
        //1944-11-27

        //
        // Example: isValidYear()
        //
        Boolean b = month.isValidYear(1944);
        System.out.println(b);
        //true

        //
        // Example: get()
        //
        MonthDay month2 = MonthDay.now();
        long n = month2.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(n);

        //
        // Example: range()
        //
        ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(r1);
        ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);
        System.out.println(r2);
        /*
        1 - 12
        1 - 30
        */




    }
}
