package session20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApplication {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);
        LocalDateTime timeNowWithDate = LocalDateTime.now();
        System.out.println("timeNowWithDate = " + timeNowWithDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("timeNowWithDate.format(dateTimeFormatter) = " + timeNowWithDate.format(dateTimeFormatter));

        System.out.println("timeNowWithDate.withDayOfMonth(1) = " + timeNowWithDate.withDayOfMonth(1));

        LocalDateTime localDateTime = timeNowWithDate
                .withDayOfMonth(1)
                .withMonth(3);
        System.out.println("localDateTime = " + localDateTime);

        System.out.println("timeNowWithDate.withYear(2000) = " + timeNowWithDate.withYear(2000));
    }
}
