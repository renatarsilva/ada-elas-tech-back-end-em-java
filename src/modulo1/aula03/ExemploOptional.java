package modulo1.aula03;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        String name = "java";

        Optional<String> nameOptional = Optional.of(name);
        Optional<String> nameOptional2 = Optional.empty();

        System.out.println(nameOptional.isPresent());
        System.out.println(nameOptional2.isPresent());

        String emptyName = null;
        Optional<String> emptyNameOptional= Optional.ofNullable(emptyName);
        System.out.println("**");
        nameOptional.ifPresent(System.out::println);

        String nameOrDefault = emptyNameOptional.orElse("Java 8");
        System.out.println(nameOrDefault);

        String name2 = emptyNameOptional.orElseGet(() ->"Java 11 ");
        System.out.println(name2);

    }
}
