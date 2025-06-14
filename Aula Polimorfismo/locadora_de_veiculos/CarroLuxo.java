package locadora_de_veiculos;

public class CarroLuxo extends Carro{
    private int quantidade_airbags;
    private float tamanho_porta_malas;
    private boolean gps_integrado;
    
    public CarroLuxo(String marca, String modelo, String placa, int ano, double valorLocação, int multa, boolean disponivel, int quantidade_airbags, float tamanho_porta_malas, boolean gps_integrado) {
        super(marca, modelo, placa, ano, valorLocação, multa, disponivel, 5);
        this.quantidade_airbags = quantidade_airbags;
        this.tamanho_porta_malas = tamanho_porta_malas;
        this.gps_integrado = gps_integrado;
    }

    public int getQuantidade_airbags() {
        return quantidade_airbags;
    }

    public void setQuantidade_airbags(int quantidade_airbags) {
        this.quantidade_airbags = quantidade_airbags;
    }

    public float getTamanho_porta_malas() {
        return tamanho_porta_malas;
    }

    public void setTamanho_porta_malas(float tamanho_porta_malas) {
        this.tamanho_porta_malas = tamanho_porta_malas;
    }

    public boolean isGps_integrado() {
        return gps_integrado;
    }

    public void setGps_integrado(boolean gps_integrado) {
        this.gps_integrado = gps_integrado;
    }
}