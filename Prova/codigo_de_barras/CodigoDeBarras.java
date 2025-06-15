package codigo_de_barras;

import java.util.Scanner;

public class CodigoDeBarras {
    String[] codigo;
    int somaPosicaoImpar;
    int somarPosicaoPar;
    int somaTotal;
    int codigoVerificador;
    int multiploDez = 0;

    public CodigoDeBarras(String codigoDeBarras){
        codigo = new String[12];
        for(int i = 0; i < 12; i++){
            this.codigo[i] = String.valueOf(codigoDeBarras.charAt(i));
        }
    }

    public boolean retornarTamanho(String codigo){
        if (codigo.length() == 12){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarCodigo(){
        for (int i = 0; i < 12; i+=2){
            this.somaPosicaoImpar += Integer.parseInt(this.codigo[i], 10);
        }
        for (int i = 1; i < 11; i+=2){
            this.somarPosicaoPar += Integer.parseInt(this.codigo[i], 10);
        }
        
        this.somaTotal = (this.somaPosicaoImpar * 3) + this.somarPosicaoPar;

        while (multiploDez < somaTotal){
            multiploDez += 10;
        }
        this.codigoVerificador = this.multiploDez - this.somaTotal;

        if (this.codigoVerificador == Integer.parseInt(this.codigo[11], 10)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inCodigo = scanner.nextLine();
        
        CodigoDeBarras codigo = new CodigoDeBarras(inCodigo);
        
        if (codigo.validarCodigo()){
            System.out.println("O código de barras é válido!!");
        } else {
            System.out.println("O código de barras não é válido!!");
        }
        
        scanner.close();
    }
}