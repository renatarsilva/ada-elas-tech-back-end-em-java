package modulo1.assincrono.aula02;

import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        Predicate<String> isLong = str -> str.length() > 10;
        System.out.println(isLong.test("Uma String"));
        System.out.println(isLong.test("Uma String Longa"));


        Predicate<Integer> maiorDeIdade = idade -> idade > 18;
        System.out.println(maiorDeIdade.test(20));

//        List<Integer> numeros = Arrays.asList(12,25,7,27);
//        numeros.removeIF(n -> n < 18);
//        System.out.println(numeros);
    }
}
// recebe um valor, devolve true/false.
