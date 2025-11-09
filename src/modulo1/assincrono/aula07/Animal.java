package modulo1.assincrono.aula07;


public sealed class Animal permits Cachorro, Gato {
    public void fazerSom(){
        System.out.println("Som do Animal");
    }
}

    final class Cachorro extends Animal{
        @Override
        public void fazerSom() {
            System.out.println("Latido");
        }
    }

    final class Gato extends Animal {
        public void fazerSom(){
            System.out.println("Miado");
        }
    }
