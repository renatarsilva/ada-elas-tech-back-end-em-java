package modulo1.assincrono.aula05;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class ExemploColecoes {
    public static void main(String[] args) {
        // Criando uma lista imutavel
        List<String> lista = List.of("João", "Maria", "Carlos");
        System.out.println(lista);

        //criando conjunto imutavel
        Set<Integer> conjunto = Set.of(1,2,3,4,5);
        System.out.println(conjunto);

        //criando um mapa imutavel
        Map<String, Integer> mapa = Map.of("Maria", 29, "Joao", 30, "Ana", 31);
        System.out.println(mapa);

    }
}
