package modulo1.assincrono.aula01;

import java.util.Arrays;
import java.util.List;

public class ExpressaoLambda{
public static void main(String[] args) {
    Operacao soma = (a, b) -> a + b;
    System.out.println(soma.calcular(5, 3));

    List<String> names =
            Arrays.asList("João", "José", "Maria");
    names.forEach(name -> System.out.println(name));

}
}
