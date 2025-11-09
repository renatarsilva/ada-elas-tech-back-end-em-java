package modulo1.assincrono.aula08;

import java.util.List;
import java.util.SequencedCollection;

public class ExemploSequencedCollections {
    public static void main(String[] args) {
        SequencedCollection<String> nomes = List.of("Joao", "Maria", "Carlos");
        System.out.println(nomes.getFirst());
        System.out.println(nomes.getLast());
    }
}
