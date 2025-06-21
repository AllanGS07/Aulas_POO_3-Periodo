package programa_investimentos;

public class AcaoBolsa extends Investimento {
    private String codigoAcao;
    private String nomeEmpresa;
    private double taxaCorretagemFixaMensal;

    public AcaoBolsa(Cliente cliente, double valorInicial, String codigoAcao, String nomeEmpresa, double taxaCorretagemFixaMensal) {
        super(cliente, valorInicial);
        this.codigoAcao = codigoAcao;
        this.nomeEmpresa = nomeEmpresa;
        this.taxaCorretagemFixaMensal = taxaCorretagemFixaMensal;
    }

    @Override
    public double calcularSaldoProjetado(int numeroMeses) {
        double saldoBrutoProjetado = getSaldo() * Math.pow((1 + 0.008), numeroMeses);
        double totalTaxas = this.taxaCorretagemFixaMensal * numeroMeses;
        double saldoFinal = saldoBrutoProjetado - totalTaxas;
        return Math.max(0, saldoFinal);
    }

    @Override
    public void simularPassagemDeMes() {
        this.setSaldo(this.getSaldo() * (1 + 0.008));
        this.setSaldo(Math.max(0, this.getSaldo() - this.taxaCorretagemFixaMensal));
    }

    public String getCodigoAcao() {
        return codigoAcao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
}
