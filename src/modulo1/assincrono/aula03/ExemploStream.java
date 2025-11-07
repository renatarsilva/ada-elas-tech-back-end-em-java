package modulo1.assincrono.aula03;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> nomes = List.of("Maki", "Hinata", "Naruto", "Saski", "Misaki");
        List<String> nomesFiltrados =
                nomes.stream()
                        .filter(abacate -> abacate.startsWith("S"))
                        .distinct()
                        .collect(Collectors.toList());
//        System.out.println(nomesFiltrados);
        nomes.forEach(System.out::println);

        var lista =
        nomes.stream()
                .filter(nome -> nome.contains("a"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(lista);

    }
}

