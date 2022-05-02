package main.java.localdates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeTut {

    public static void main(String[] args) {
        localTime();
    }

    static void localTime(){
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        String format = localTime.format(DateTimeFormatter.ofPattern("HH/mm:ss"));
        System.out.println(format);
    }

}
