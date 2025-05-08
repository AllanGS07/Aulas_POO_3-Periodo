package codigodebarras;

import java.util.Scanner;

public class CodigoDeBarras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entradaCodigoBarras;
        do{
            System.out.print("Digite o código de barras: ");
            entradaCodigoBarras = scanner.next();
        } while (entradaCodigoBarras.length() != 12);

        int[] codigoDeBarras = new int[entradaCodigoBarras.length()];
        for (int i = 0; i < entradaCodigoBarras.length(); i++){
            codigoDeBarras[i] = entradaCodigoBarras.charAt(i) - '0';
        }

        int somaImpares = 0;
        for (int i = 0; i < codigoDeBarras.length; i+=2){
            somaImpares += codigoDeBarras[i];
        }
        
        int somaPares = 0;
        for (int i = 1; i < codigoDeBarras.length - 1; i+=2){
            somaPares += codigoDeBarras[i];
        }

        int somaTotal = (somaImpares * 3) + somaPares;
        int muliploDez = 0;
        while (muliploDez < somaTotal){
            muliploDez += 10;
        }

        int codigoVerificador = muliploDez - somaTotal;

        if (codigoVerificador == codigoDeBarras[11]){
            System.out.println("O código de barras é válido!!!");
        } else {
            System.out.println("O código de barras é inválido!!!");
        }

        scanner.close();
    }
}