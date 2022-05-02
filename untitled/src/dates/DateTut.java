package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTut {

    public static void main(String[] args) {
//        testDate();
        testCalendar();

    }

    static void testDate(){
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        String formattedDate = String.format("%1$s %3$td/%3$tm/%3$tY %2$s %3$tH:%3$tM:%3$tS %3$tz", "Date:", "Time:", date);
        System.out.println(formattedDate);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(formatter.format(date));
    }

    static void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, 19);
        String formattedDate = String.format("%1$s %3$td/%3$tm/%3$tY %2$s %3$tH:%3$tM:%3$tS %3$tz", "Date:", "Time:", calendar);
        System.out.println(formattedDate);
    }

}
