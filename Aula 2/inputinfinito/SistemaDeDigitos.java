package inputinfinito;
import java.util.Scanner;

public class SistemaDeDigitos {
    static Scanner scanner = new Scanner(System.in);
    public static void digitar(){
        int soma = 0;
        int quantidadeDeNumerosDigitados = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        while (true) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }
            soma += numero;
            quantidadeDeNumerosDigitados++;
        }
        int media = soma / quantidadeDeNumerosDigitados;

        System.out.println("A quantidade de números digitados é: " + quantidadeDeNumerosDigitados);
        System.out.println("O maior número digitado é: " + maiorNumero);
        System.out.println("O menor número digitado é: " + menorNumero);
        System.out.println("A media dos números digitados é: " + media);
    }
    public static void main(String[] args) {
        digitar();
    }
}