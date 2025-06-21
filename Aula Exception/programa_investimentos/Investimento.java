package programa_investimentos;

public abstract class Investimento {
    private Cliente cliente;
    private double saldo;

    public Investimento(Cliente cliente, double valorInicial) {
        this.cliente = cliente;
        this.saldo = valorInicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void aplicar(double valor) {
        this.saldo += valor;
    }

    public void resgatar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public abstract double calcularSaldoProjetado(int numeroMeses);

    public abstract void simularPassagemDeMes();
}
