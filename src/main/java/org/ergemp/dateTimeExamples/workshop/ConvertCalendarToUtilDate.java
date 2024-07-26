package org.ergemp.dateTimeExamples.workshop;

import java.util.Calendar;

public class ConvertCalendarToUtilDate {
    public static void main(String[] args) {

        //
        //create a new calendar
        //set and get date
        //
        Calendar tmpCal = Calendar.getInstance();

        tmpCal.set(2017, 11, 6);
        tmpCal.set(2017, 11, 6, 13, 29, 0);
        System.out.println("tmpCal First: " + tmpCal.getTime()) ;
        //Wed Dec 06 13:29:00 EET 2017

        System.out.println(tmpCal.get(Calendar.YEAR) + " " + tmpCal.get(Calendar.MONTH) + " " + tmpCal.get(Calendar.DAY_OF_MONTH));
        //2017 11 6


        //
        //create a new java.util.date
        //set date /w deprecated functions
        //
        java.util.Date tmpDate = new java.util.Date();
        tmpDate.setYear(2017);
        tmpDate.setMinutes(32);
        tmpDate.setHours(13);
        tmpDate.setMonth(11);
        tmpDate.setSeconds(0);

        //
        //convert java.util.date to java.util.calendar
        //
        tmpCal.setTimeInMillis(tmpDate.getTime());
        tmpCal.setTime(tmpDate);
        //tmpCal.set(java.util.Calendar.YEAR, 2017);
        //tmpCal.set(java.util.Calendar.MONTH, 11);
        System.out.println("tmpCal Second: " + tmpCal.getTime());
        //Thu Dec 06 13:32:00 EET 3917

    }
}
