import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer numeroGerado = (int) (Math.random() * (100-1+1)) + 1;
        Scanner scanner = new Scanner(System.in);
        Integer numero = 0 ;
        Boolean parar = false;
        String resposta;

        String titulo = """
                ************************************
                *       Jogo de advinhação         *
                ************************************
                """;
        System.out.println(titulo);

        int tentativa = 1;

        while (tentativa <= 5 && Boolean.TRUE.equals(!parar) ){
            System.out.println("Informe um número entre 0 e 100:  - Tentativa: " + tentativa);
            numero = scanner.nextInt();

            resposta  = validaNumero(numeroGerado, numero);
            System.out.println(resposta);

            parar = resposta.contains("acertou");

            tentativa++;
        }
        System.out.println("O número gerado foi: " + numeroGerado);
    }

    private static String validaNumero(Integer numeroGerado, Integer numero){
        String resposta = numero > numeroGerado ? "Número maior que o gerado" : "Número menor que o gerado";

        if(numero == numeroGerado){
            resposta = "Você acertou";
        }

        return resposta;
    }
}