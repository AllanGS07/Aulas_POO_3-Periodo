package locadora_de_veiculos;

public class CarroSUV extends Carro{
    private int tamanho_porta_malas;
    private String tipo_tracao;
    private String tipo_combustivel;
    
    public CarroSUV(String marca, String modelo, String placa, int ano, double valorLocação, int multa, boolean disponivel, int tamanho_porta_malas, String tipo_tracao, String tipo_combustivel) {
        super(marca, modelo, placa, ano, valorLocação, multa, disponivel, 3);
        this.tamanho_porta_malas = tamanho_porta_malas;
        this.tipo_tracao = tipo_tracao;
        this.tipo_combustivel = tipo_combustivel;
    }

    public int getTamanho_porta_malas() {
        return tamanho_porta_malas;
    }

    public void setTamanho_porta_malas(int tamanho_porta_malas) {
        this.tamanho_porta_malas = tamanho_porta_malas;
    }

    public String getTipo_tracao() {
        return tipo_tracao;
    }

    public void setTipo_tracao(String tipo_tracao) {
        this.tipo_tracao = tipo_tracao;
    }

    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }
}