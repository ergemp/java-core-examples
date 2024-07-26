package org.ergemp.dateTime.workshop;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;

public class GetCurrentTimestamp {
    public static void main(String[] args) {

        // 2021-03-24 16:48:05.591
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // 2021-03-24 16:48:05.591
        Date date = new Date();
        Timestamp timestamp2 = new Timestamp(date.getTime());

        // convert Instant to Timestamp
        Timestamp ts = Timestamp.from(Instant.now());

        // convert ZonedDateTime to Instant to Timestamp
        Timestamp ts2 = Timestamp.from(ZonedDateTime.now().toInstant());

        // convert Timestamp to Instant
        Instant instant = ts.toInstant();



        Timestamp timestamp3 = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp3);                  // 2021-03-24 17:12:03.311
        System.out.println(timestamp3.getTime());        // 1616577123311

        // Convert Timestamp to Instant
        Instant instant3 = timestamp3.toInstant();
        System.out.println(instant3);                    // 2021-03-24T09:12:03.311Z
        System.out.println(instant3.toEpochMilli());     // 1616577123311

        // Convert Instant to Timestamp
        Timestamp tsFromInstant = Timestamp.from(instant3);
        System.out.println(tsFromInstant.getTime());    // 1616577123311


    }
}
