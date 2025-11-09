package modulo1.assincrono.aula06;

public class Pessoa {
    String nome;

    public Pessoa(String nome) { this.nome = nome; }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pessoa p){
            return this.nome.equals(p.nome);
        }
        return false;
    }
}

