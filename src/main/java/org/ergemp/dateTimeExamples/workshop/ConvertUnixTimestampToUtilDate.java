package org.ergemp.dateTimeExamples.workshop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUnixTimestampToUtilDate {
    public static void main(String[] args) {

        long unixSeconds = 1372339860;

        // convert seconds to milliseconds
        Date date = new Date(unixSeconds*1000L);

        // the format of your date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");

        // give a timezone reference for formatting (see comment at the bottom)
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT-4"));
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        // 2013-06-27 09:31:00 GMT-04:00

    }
}
