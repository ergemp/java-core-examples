package org.ergemp.dateTimeExamples.javaTimeExamples;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class JavaTimeLocalTimeExamples {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);
        //14:12:44.613688

        //
        // Example: of()
        //

        LocalTime time2 = LocalTime.of(10,43,12);
        System.out.println(time2);
        //10:43:12

        //
        // Example: minusHours() and minusMinutes()
        //

        LocalTime time3 = LocalTime.of(10,43,12);
        System.out.println(time3);
        LocalTime time4=time3.minusHours(2);
        LocalTime time5=time4.minusMinutes(34);
        System.out.println(time4);
        System.out.println(time5);
        /*
        10:43:12
        08:43:12
        08:09:12
        */

        //
        // Example: plusHours() and plusMinutes()
        //

        LocalTime time6 = LocalTime.of(10,43,12);
        System.out.println(time6);
        LocalTime time7=time6.plusHours(4);
        LocalTime time8=time7.plusMinutes(18);
        System.out.println(time8);
        /*
        10:43:12
        15:01:12
        */

        //
        // timezone examples
        //

        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("India Time Zone: "+time1);
        LocalTime time9 = LocalTime.now(zone2);
        System.out.println("Japan Time Zone: "+time9);
        long hours = ChronoUnit.HOURS.between(time1, time9);
        System.out.println("Hours between two Time Zone: "+hours);
        long minutes = ChronoUnit.MINUTES.between(time1, time9);
        System.out.println("Minutes between two time zone: "+minutes);
        /*
        India Time Zone: 19:02:12.956363
        Japan Time Zone: 22:32:12.969843
        Hours between two Time Zone: 3
        Minutes between two time zone: 210
        */

    }
}
