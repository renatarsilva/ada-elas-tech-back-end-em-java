package modulo1.assincrono.aula03;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
    String nome = "Java";
    Optional<String> nomeOptional = Optional.of(nome);
    Optional<String> nomeOptional2 = Optional.empty();

        System.out.println(nomeOptional.isPresent());
        System.out.println(nomeOptional2.isPresent());

        String nomeVazio = null;
        Optional<String> nomeVazioOptional = Optional.ofNullable(nomeVazio);
        System.out.println("*****");
         nomeVazioOptional.ifPresent(System.out::println);

         String nomeOuDefault = nomeVazioOptional.orElse("Java 8");
        System.out.println(nomeOuDefault);

        String nomeOuGerado =
                nomeVazioOptional.orElseGet(() -> "Java 11");
        System.out.println(nomeOuGerado);

        nomeVazioOptional
                .orElseThrow(() -> new RuntimeException("Java 21"));

    }
}
