package primeiros.passos;

public class StringsEDatas {
    public static void main(String[] args) {

        String nomeDigitado = "Maki Zenin";
        String nomeCadastrado = "maki";

        boolean nomesIguais = nomeDigitado.equals(nomeCadastrado);
        System.out.println("Os nomes sao exatamentes iguais? "+nomesIguais);

        boolean nomesIguais1 = nomeDigitado.equalsIgnoreCase(nomeCadastrado);
        System.out.println("Os nomes sao iguais ignorando as maisculas ?" + nomesIguais1);

        String nomeMaiusculo = nomeDigitado.toUpperCase();
        System.out.println(nomeMaiusculo);

        String nomeMinusculo = nomeDigitado.toLowerCase();
        System.out.println(nomeMinusculo);

        int tamanhoNome = nomeDigitado.length();
        System.out.println(tamanhoNome);

        String saudacao = "Bem vindo(a) ".concat(nomeDigitado).concat("!");
        System.out.println(saudacao);

        //Encontrar posicao do sobrenome Zenin usando indexof
        int posicaoNome = nomeDigitado.indexOf("Zenin");
        if (posicaoNome != -1){
            System.out.println("O sobrenome Zenin começa na posição " + posicaoNome);
        } else {
            System.out.println("Sobrenome Zenin não foi encontrado");
        }
    }
}
