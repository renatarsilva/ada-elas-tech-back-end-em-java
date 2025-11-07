package modulo1.assincrono.aula04;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;

public class ExemploZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Duration duration = Duration.ofHours(5);
        System.out.println(duration);
        System.out.println(zonedDateTime.plus(duration));

        LocalDate dataNascimento = LocalDate.of(1995,8,23);
        Period period = Period.between(dataNascimento, LocalDate.now());
        System.out.println(period.getYears());
    }
}
