package session20;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeApplication {


    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println("now = " + now);

        ZonedDateTime zonedDateTime = now.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("zonedDateTime = " + zonedDateTime);
    }
}
