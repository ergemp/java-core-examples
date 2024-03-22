package org.ergemp.dateTimeExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateFormatSimpleExamples {
    public static void main(String[] args) throws ParseException {

        // ref: https://www.javatpoint.com/java-simpledateformat

        // The java.text.SimpleDateFormat class provides methods to
        // format and parse date and time in java.
        // The SimpleDateFormat is a concrete class for formatting and parsing date
        // which inherits java.text.DateFormat class.

        // Notice that formatting means converting date to string and parsing means converting string to date.

        Date date = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        System.out.println(strDate);
        //28/11/2023

        date = new Date();
        formatter = new SimpleDateFormat("MM/dd/yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);
        /*
        Date Format with MM/dd/yyyy : 11/28/2023
        Date Format with dd-M-yyyy hh:mm:ss : 28-11-2023 05:27:20
        Date Format with dd MMMM yyyy : 28 November 2023
        Date Format with dd MMMM yyyy zzzz : 28 November 2023 Eastern European Time
        Date Format with E, dd MMM yyyy HH:mm:ss z : Tue, 28 Nov 2023 17:27:20 EET
        */

        //
        // Example: String to Date
        //
        formatter = new SimpleDateFormat("dd/MM/yyyy");

        date = formatter.parse("31/03/2015");
        System.out.println("Date is: "+date);
        // Date is: Tue Mar 31 00:00:00 EEST 2015


    }
}
