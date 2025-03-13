package resistor;
import java.util.Scanner;

public class Resistores{
    public static void main(String[] args) {
        int faixa1 = 0;
        int faixa2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de faixas no resistor: ");
        int quantidadeDeFaixas = scanner.nextInt();
        String cor[] = new String[quantidadeDeFaixas];

        for (int i = 0; i < quantidadeDeFaixas; i++) {
            System.out.println("Digite a cor da faixa: ");
            cor[i] = scanner.next();
        }
        for (int i = 0; i < quantidadeDeFaixas; i++) {
            System.out.println(cor[i]);
            if(cor[0].equals("Preto") || cor[0].equals("preto")){
                faixa1 = 0;
            }
            if(cor[0].equals("Marrom") || cor[0].equals("marrom")){
                faixa1 = 1;
            }
            if(cor[0].equals("Vermelho") || cor[0].equals("vermelho")){
                faixa1 = 2;
            }
            if(cor[0].equals("Laranja") || cor[0].equals("laranja")){
                faixa1 = 3;
            }
            if(cor[0].equals("Amarelo") || cor[0].equals("amarelo")){
                faixa1 = 4;
            }
            if(cor[0].equals("Verde") || cor[0].equals("verde")){
                faixa1 = 5;
            }
            if(cor[0].equals("Azul") || cor[0].equals("azul")){
                faixa1 = 6;
            }
            if(cor[0].equals("Violeta") || cor[0].equals("violeta")){
                faixa1 = 7;
            }
            if(cor[0].equals("Cinza") || cor[0].equals("cinza")){
                faixa1 = 8;
            }
            if(cor[0].equals("Branco") || cor[0].equals("branco")){
                faixa1 = 9;
            }
            if(cor[1].equals("Preto") || cor[1].equals("preto")){
                faixa2 = 0;
            }
            if(cor[1].equals("Marrom") || cor[1].equals("marrom")){
                faixa2 = 1;
            }
            if(cor[1].equals("Vermelho") || cor[1].equals("vermelho")){
                faixa2 = 2;
            }
            if(cor[1].equals("Laranja") || cor[1].equals("laranja")){
                faixa2 = 3;
            }
            if(cor[1].equals("Amarelo") || cor[1].equals("amarelo")){
                faixa2 = 4;
            }
            if(cor[1].equals("Verde") || cor[1].equals("verde")){
                faixa2 = 5;
            }
            if(cor[1].equals("Azul") || cor[1].equals("azul")){
                faixa2 = 6;
            }
            if(cor[1].equals("Violeta") || cor[1].equals("violeta")){
                faixa2 = 7;
            }
            if(cor[1].equals("Cinza") || cor[1].equals("cinza")){
                faixa2 = 8;
            }
            if(cor[1].equals("Branco") || cor[1].equals("branco")){
                faixa2 = 9;
            }
        }

        scanner.close();
        System.out.println("O valor do resistor é: " + faixa1 + faixa2);
    }
}
