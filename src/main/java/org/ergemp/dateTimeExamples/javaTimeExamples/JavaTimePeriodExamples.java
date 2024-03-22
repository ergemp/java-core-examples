package org.ergemp.dateTimeExamples.javaTimeExamples;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class JavaTimePeriodExamples {
    public static void main(String[] args) {

        // Java Period class is used to measures time in years, months and days.
        // It inherits the Object class and implements the ChronoPeriod interface.

        //
        // Example: addTo()
        //
        Period period = Period.ofDays(24);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
        //2023-12-22

        //
        // Example: of()
        //
        period = Period.of(2017,02,16);
        System.out.println(period.toString());
        //P2017Y2M16D

        //
        // Example: minus() plus()
        //
        Period period1 = Period.ofMonths(4);
        Period period2 = period1.minus(Period.ofMonths(2));
        Period period3 = period1.plus(Period.ofMonths(2));
        System.out.println(period2);
        System.out.println(period3);
        /*
        P2M
        P6M
        */




    }
}
