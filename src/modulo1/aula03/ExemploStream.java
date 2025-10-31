package modulo1.aula03;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> names = List.of("Maria", "José", "Antonio", "Maria", "Clara", "Carol");

        List<String> namesFilter =
                names.stream()
                        .filter(name -> name.startsWith("M"))
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(namesFilter);

        names.forEach(System.out::println);

        // elementos nao repetidos quem contem a letra A
        var list = names.stream()
                .filter(name -> name.contains("a"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);







    }
}
