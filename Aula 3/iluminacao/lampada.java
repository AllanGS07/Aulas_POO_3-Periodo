package iluminacao;

public class lampada {
    @SuppressWarnings("unused")
    boolean estado;
    @SuppressWarnings("unused")
    float potencia;
    @SuppressWarnings("unused")
    String formato;
    @SuppressWarnings("unused")
    String tipoDeLampada;
    @SuppressWarnings("unused")
    String corDaLampada;
    @SuppressWarnings("unused")
    String intensidade;
    @SuppressWarnings("unused")
    String tamanho;
    @SuppressWarnings("unused")
    String voltagem;

    public void ligarDesligar(){
        estado = !estado;
    }
}