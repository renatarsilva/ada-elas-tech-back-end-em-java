package modulo1.assincrono.aula06;

public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = 1;

        String nomeDia = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            default -> "Dia inválido";
        };
        System.out.println(nomeDia);
    }
}
