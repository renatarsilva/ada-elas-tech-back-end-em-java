package primeiros.passos;

public class Funcoes {
    public static void main(String[] args) {

        int resultado = soma (5, 3);
        System.out.println("Resultado da soma é " + resultado);
    }

    public static int soma(int a, int b){
        return (a+b);
    }
    public static double soma (double a, double b){
        return a+b;
    }
}
