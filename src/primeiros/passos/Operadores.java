package primeiros.passos;

public class Operadores {
    public static void main(String[] args) {
        /*
        * Matematicos:
        * + somar
        * - subtrair
        * * multiplicar
        * / dividir
        * % modulo, resto
        *
        *
        * Relacionais
        * == iguais
        * != diferente
        * > maior
        * < menor
        * >= maior igual
        * <= menor igual
        *
        * Lógicos
        * && and
        * || or
        * ! Not
        * */

        int a = 10;
        int b = 20;

        int somar = a + b;
        int subtrair = b - a;
        int multiplicar = a * b;
        int dividir = a / b;
        int resto = a % b;

        System.out.printf("somar %d, subtrair %d, multiplicar %d, dividir %d, resto %d", somar, subtrair, multiplicar, dividir, resto);

        a += b;
        boolean resultado = (a==b); //false
        boolean resultado1 = (a>=10 && b>10); //true

        System.out.printf("%b, %b", resultado, resultado1);




    }
}
