package modulo1.aula02;

import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        Consumer<String> imprimirNome =
                nome -> System.out.println(nome);

        imprimirNome.accept("Maki");

    }
}
