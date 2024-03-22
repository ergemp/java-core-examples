package org.ergemp.dateTimeExamples.javaTimeExamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeLocalDateExamples {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-localdate

        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);
        /*
        Today date: 2023-11-27
        Yesterday date: 2023-11-26
        Tomorrow date: 2023-11-28
        */

        LocalDate date1 = LocalDate.of(2017, 1, 13);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear());
        /*
        false
        true
        */

        LocalDate date3 = LocalDate.of(2022, 1, 13);
        LocalDateTime datetime = date3.atTime(1,50,9);
        System.out.println(datetime);
        //2022-01-13T01:50:09

        //
        // format() method of LocalDate class
        //

        // Converting LocalDate to String
        // Example 1
        LocalDate d1 = LocalDate.now();
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date1 in string :  " + d1Str);
        // Example 2
        LocalDate d2 = LocalDate.of(2002, 05, 01);
        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date2 in string :  " + d2Str);
        // Example 3
        LocalDate d3 = LocalDate.of(2016, 11, 01);
        String d3Str = d3.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date3 in string :  " + d3Str);
        /*
        Date1 in string :  2023-11-27
        Date2 in string :  2002-05-01
        Date3 in string :  2016-11-01
        */

        //
        // parse() method of LocalDate class
        //

        // Example 1
        String dInStr = "2011-09-01";
        LocalDate d5 = LocalDate.parse(dInStr);
        System.out.println("String to LocalDate : " + d5);
        // Example 2
        String dInStr2 = "2015-11-20";
        LocalDate d6 = LocalDate.parse(dInStr2);
        System.out.println("String to LocalDate : " + d6);
        /*
        String to LocalDate : 2011-09-01
        String to LocalDate : 2015-11-20
        */



    }
}
