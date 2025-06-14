package locadora_de_veiculos;

public class CarroPopular extends Carro{
    private boolean ar_condicionado;

    public CarroPopular(boolean ar_condicionado, String marca, String modelo, String placa, int ano, double valorLocação, int multa, boolean disponivel) {
        super(marca, modelo, placa, ano, valorLocação, multa, disponivel, 1);
        this.ar_condicionado = ar_condicionado;
    }

    public boolean isAr_condicionado() {
        return ar_condicionado;
    }

    public void setAr_condicionado(boolean ar_condicionado) {
        this.ar_condicionado = ar_condicionado;
    }

}