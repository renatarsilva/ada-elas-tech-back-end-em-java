package primeiros.passos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Dates {
    public static void main(String[] args) {
        // Cadastro do cliente

        LocalDate dataNascimento = LocalDate.of(2000,01,01);
        System.out.println("Data nasciemnto cliente "+dataNascimento);

        // Data e hora do cadastro do cliente
        LocalDateTime dataHoraCadastro = LocalDateTime.now();
        System.out.println("Data e hora do cadastro "+ dataHoraCadastro);

        // Calcular próximo niver do cliente
        LocalDate hoje = LocalDate.now();
        LocalDate proximoNiver = dataNascimento.withYear(hoje.getYear());
        if (proximoNiver.isBefore(hoje) || proximoNiver.isEqual(hoje)){
            proximoNiver = proximoNiver.plusYears(1);
        }
        System.out.println("Próximo Aniversário do cliente "+ proximoNiver);

        // Calcular o periodo até o proximo aniversario
        Period periodoAteNiver = Period.between(hoje, proximoNiver);
        System.out.println("Faltam " + periodoAteNiver.getMonths()+ " meses e "+ periodoAteNiver.getDays()+" dias para o próximo niver");

        //Verificar se o niver é antes ou depois do Natal
        LocalDate dataEvento = LocalDate.of(2025,12,25);
        if (proximoNiver.isAfter(dataEvento)){
            System.out.println("O niver do cliente é depois do evento");
        } else {
            System.out.println("O niver do cliente é antes ou no mesmo dia do evento");
        }




    }
}
