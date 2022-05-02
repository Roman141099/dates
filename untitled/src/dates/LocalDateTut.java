package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTut {

    public static void main(String[] args) {
        localDate();
    }

    static void localDate(){
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate localDate = LocalDate.of(2000, 10, 10);
        LocalDate withYear = localDate.withYear(1999);
        System.out.println(localDate);
        System.out.println(withYear);

        LocalDate plusedWeeks = localDate.plusWeeks(4);
        System.out.println(plusedWeeks);

        //To localDateTime
        LocalDateTime withTime = plusedWeeks.atTime(LocalTime.MAX);
        System.out.println(withTime);
    }




}