package org.ergemp.dateTime.javaTimeExamples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class JavaTimeDayOfWeekEnumExamples {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-dayofweek-enum

        // In Java the DayOfWeek is an enum representing the 7 days of the week.
        // In addition with the textual enum name, every day-of-week has an int value.

        //
        // Example: get()
        //

        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));
        //3

        //
        // Example: of()
        //

        DayOfWeek day = DayOfWeek.of(5);
        System.out.println(day.name());
        System.out.println(day.ordinal());
        System.out.println(day.getValue());
        /*
        FRIDAY
        4
        5
        */

        //
        // Example: plus() minus()
        //

        LocalDate date = LocalDate.of(2017, Month.JANUARY, 31);
        DayOfWeek day2 = DayOfWeek.from(date);
        System.out.println(day2.getValue());
        day2 = day2.plus(3);
        System.out.println(day2.getValue());
        /*
        2
        5
        */

        day2 = day2.minus(3);
        System.out.println(day2.getValue());
        //2

        //
        // Example: getValue()
        //
        LocalDate localDate2 = LocalDate.of(2021, Month.SEPTEMBER, 13);
        DayOfWeek dayOfWeek2 = DayOfWeek.from(localDate2);
        System.out.println("Day of the Week on" + " 13th September 2021 - " + dayOfWeek2.name());
        int val = dayOfWeek2.getValue();
        System.out.println("Int Value of " + dayOfWeek2.name() + " - " + val);
        /*
        Day of the Week on 13th September 2021 - MONDAY
        Int Value of MONDAY - 1
        */








    }
}
