package main.java.localdates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class InstantTutAndDateTimeFormatter {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        LocalDateTime fromIns = LocalDateTime.ofInstant(now, ZoneOffset.ofHours(4));
        System.out.println(fromIns);

        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern(
                        "dd MMMM HH:mm", new Locale("ru", "RU"));
        String format = fromIns.format(dtf);
        System.out.println(format);
        DateTimeFormatter english = dtf.withLocale(new Locale("en", "EN"));
        String engFormat = fromIns.format(english);
        System.out.println(engFormat);
    }

}
