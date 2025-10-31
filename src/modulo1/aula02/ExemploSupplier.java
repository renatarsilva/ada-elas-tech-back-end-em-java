package modulo1.aula02;

import java.util.function.Supplier;

public class ExemploSupplier {
    public static void main(String[] args) {
        Supplier<String> fornecedor =
                () -> "Sou Programador Java";
        System.out.println(fornecedor.get());
    }
}
