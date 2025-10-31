package modulo1.aula01;

import java.util.Arrays;
import java.util.List;

public class ExpressaoLambda {
    public static void main(String[] args) {
        Operacao soma = (a, b) -> a + b;

        System.out.println(soma.calcular(5,3));

        List<String> nomes =
                Arrays.asList("Hinata", "Naruto", "Sakura");
        nomes.forEach(nome -> System.out.println(nomes));


    }
}
