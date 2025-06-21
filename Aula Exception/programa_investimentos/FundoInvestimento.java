package programa_investimentos;

public class FundoInvestimento extends Investimento {
    private String nomeFundo;
    private String cnpjGestora;
    private double taxaAdministracaoAnual;

    public FundoInvestimento(Cliente cliente, double valorInicial, String nomeFundo, String cnpjGestora, double taxaAdministracaoAnual) {
        super(cliente, valorInicial);
        this.nomeFundo = nomeFundo;
        this.cnpjGestora = cnpjGestora;
        this.taxaAdministracaoAnual = taxaAdministracaoAnual;
    }

    @Override
    public double calcularSaldoProjetado(int numeroMeses) {
        double saldoProjetado = getSaldo();
        double taxaAdministracaoMensal = this.taxaAdministracaoAnual / 12.0;
        for (int i = 0; i < numeroMeses; i++) {
            double saldoAnterior = saldoProjetado;
            saldoProjetado = saldoAnterior * (1 + 0.01);
            double taxaAdmDoMesProjetado = saldoAnterior * taxaAdministracaoMensal;
            saldoProjetado -= taxaAdmDoMesProjetado;
        }
        return saldoProjetado;
    }

    @Override
    public void simularPassagemDeMes() {
        double rendimentoBruto = this.getSaldo() * 0.01;
        double taxaAdmDevida = this.getSaldo() * (this.taxaAdministracaoAnual / 12.0);
        this.setSaldo(Math.max(0, this.getSaldo() + rendimentoBruto - taxaAdmDevida));
    }

    public String getNomeFundo() {
        return nomeFundo;
    }
}
