package primeiros.passos;

public class TratamentoErros {
    public static void main(String[] args) {
    try {
        int resultado = dividir (10,0);
        System.out.println("Resultado: "+resultado);
    } catch (ArithmeticException e){
        System.out.println("Erro divisao por zero");
    } finally {
        System.out.println("Bloco finally sendo executado");
    }
    }
    public static int dividir (int a, int b){
        return  a / b;
    }

}
