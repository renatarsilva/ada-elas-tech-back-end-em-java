package modulo1.assincrono.aula06;

public class ExemploTextBlock {
    public static void main(String[] args) {
        String sql = """
                Isso é um teste, this is a test,
                test 123,
                teste 321
                """;
        System.out.println(sql);
    }
}
