package session20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodApplication {

    public static void main(String[] args) {


        LocalDate now = LocalDate.now();
        LocalDate localDate = now.withMonth(2).withYear(2024);

        Period between = Period.between(localDate, now);
        System.out.println("between = " + between);
    }
}
