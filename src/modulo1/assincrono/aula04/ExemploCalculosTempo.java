package modulo1.assincrono.aula04;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExemploCalculosTempo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime future = now.plusDays(10);

        Duration duration = Duration.between(now, future);
        System.out.println(duration.toDays());

        LocalDate today = LocalDate.now();
        LocalDate lastDay = LocalDate.of(2025, 12, 31);
        Period period1 = Period.between(today, lastDay);

        System.out.println(period1.getMonths());

        System.out.println(ChronoUnit.DAYS.between(today, lastDay));


    }
}
