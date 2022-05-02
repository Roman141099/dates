package main.java.localdates;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class PeriodTut {

    public static void main(String[] args) {
        LocalDateTime first = LocalDateTime.of(2020, 10, 10, 10, 10, 10);
        LocalDateTime second = LocalDateTime.of(2022, 10, 10, 10, 10, 10);
        long until = first.until(second, ChronoUnit.DAYS);
        System.out.println(until);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime.atZoneSameInstant(ZoneOffset.ofHours(10)));
        System.out.println(offsetDateTime.truncatedTo(ChronoUnit.DAYS));
    }

}
