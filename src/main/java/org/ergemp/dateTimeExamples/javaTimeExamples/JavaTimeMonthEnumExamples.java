package org.ergemp.dateTimeExamples.javaTimeExamples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class JavaTimeMonthEnumExamples {
    public static void main(String[] args) {

        Month month = Month.valueOf("January".toUpperCase());
        System.out.printf("For the month of %s all Sunday are:%n", month);

        LocalDate localdate = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        Month mi = localdate.getMonth();

        while (mi == month) {
            System.out.printf("%s%n", localdate);
            localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
            mi = localdate.getMonth();

        }
        /*
        For the month of JANUARY all Sunday are:
        2023-01-01
        2023-01-08
        2023-01-15
        2023-01-22
        2023-01-29
        */

        //
        // getValue()
        //
        Month month2 = Month.from(LocalDate.now());
        System.out.println(month2.getValue());
        System.out.println(month2.name());
        /*
        11
        NOVEMBER
        */

        month = Month.from(LocalDate.now());
        System.out.println(month.minus(2));
        System.out.println(month.plus(2));
        System.out.println("Total Number of days: " + month.length(true));


    }
}
