package modulo1.assincrono.aula08;

public class ExemploStringTemplate {
    public static void main(String[] args) {


    String nome = "João";
    int idade = 20;

    String texto = String.format("Nome: %s, Idade: %d", nome, idade);;
        System.out.println(texto);

}
}
