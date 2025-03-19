package resistor;
import java.util.HashMap;
import java.util.Scanner;

public class Resistores{
    public static void main(String[] args) {
        HashMap<String, String> corResistor = new HashMap<>();
        corResistor.put("Preto", "0");
        corResistor.put("Marrom", "1");
        corResistor.put("Vermelho", "2");
        corResistor.put("Laranja", "3");
        corResistor.put("Amarelo", "4");
        corResistor.put("Verde", "5");
        corResistor.put("Azul", "6");
        corResistor.put("Violeta", "7");
        corResistor.put("Cinza", "8");
        corResistor.put("Branco", "9");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de faixas no resistor: ");
        int quantidadeDeFaixas = scanner.nextInt();

        String[] faixas = new String[quantidadeDeFaixas];

        for (int i = 0; i < quantidadeDeFaixas; i++){
            System.out.println("Digite a cor da faixa " + (i+1) + ": ");
            faixas[i] = scanner.next();
        }
        scanner.close();
        scanner.close();
        String valor1 = corResistor.get(faixas[0]);
        String valor2 = corResistor.get(faixas[1]);
        System.out.println("O valor da resistência é: " + valor1 + valor2);
    }
}
