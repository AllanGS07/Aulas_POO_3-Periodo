package locadora_de_veiculos;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorLocação;
    private int multa;
    private boolean disponivel;
    private int limiteRenovacao;

    public Carro(String marca, String modelo, String placa, int ano, double valorLocação, int multa, boolean disponivel, int limiteRenovacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocação = valorLocação;
        this.multa = multa;
        this.disponivel = disponivel;
        this.limiteRenovacao = limiteRenovacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorLocação() {
        return valorLocação;
    }

    public void setValorLocação(double valorLocação) {
        this.valorLocação = valorLocação;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel= true;
    }

    public int getLimiteRenovacao() {
        return limiteRenovacao;
    }

    public double calcularMulta(int quantidadeRenovacoes) {
        double valorTotalMulta = 0;
        if (this.limiteRenovacao < quantidadeRenovacoes) {
            valorTotalMulta = this.multa * (quantidadeRenovacoes - this.limiteRenovacao);
        } else {
            return 0;
        }
        return valorTotalMulta;
    }
}