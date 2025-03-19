package fitasdna;
import java.util.Scanner;


public class FitaDna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira sequência de DNA(C,A.G,T): ");
        String sequenciaDna = scanner.nextLine();
        System.out.println("Digite a segunda sequência de DNA(C,A.G,T): ");
        String sequenciaDna2 = scanner.nextLine();

        if (sequenciaDna.length() != sequenciaDna2.length()) {
            System.out.println("Erro: as sequências devem ter o mesmo tamanho.");
        }
        else {
            int distanciaHamming = 0;
            for (int i = 0; i < sequenciaDna.length(); i++) {
                if (sequenciaDna.charAt(i) != sequenciaDna2.charAt(i)) {
                    distanciaHamming++;
                }
            }
            System.out.println("A distância de Hamming é: " + distanciaHamming);
        }
        scanner.close();
        scanner.close();
    }
}
