package modulo1.assincrono.aula07;

public record Pessoa(String nome, int idade) {

    public Pessoa(String nome){
        this(nome, 18);
    }
}
