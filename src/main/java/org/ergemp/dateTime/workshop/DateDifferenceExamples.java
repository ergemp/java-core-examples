package org.ergemp.dateTime.workshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateDifferenceExamples {

    public static void main(String[] args) throws ParseException {

        // ref: https://www.baeldung.com/java-date-difference

        // date difference example01
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse("06/24/2017");
        Date secondDate = sdf.parse("06/30/2017");

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        //
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime sixMinutesBehind = now.minusMinutes(6);

        Duration duration = Duration.between(now, sixMinutesBehind);
        long diff2 = Math.abs(duration.toMinutes());

        //
        LocalDate aDate = LocalDate.of(2020, 9, 11);
        LocalDate sixDaysBehind = aDate.minusDays(6);

        Period period = Period.between(aDate, sixDaysBehind);
        int diff3 = Math.abs(period.getDays());

        //
        LocalDate aDate4 = LocalDate.of(2020, 9, 11);
        LocalDate sixtyDaysBehind = aDate.minusDays(60);

        Period period4 = Period.between(aDate, sixtyDaysBehind);
        int diff4 = Math.abs(period.getDays());

        //
        LocalDate aDate5 = LocalDate.of(2020, 9, 11);
        LocalDate sixtyDaysBehind5 = aDate.minusDays(60);
        Period period5 = Period.between(aDate, sixtyDaysBehind);
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
    }
}
