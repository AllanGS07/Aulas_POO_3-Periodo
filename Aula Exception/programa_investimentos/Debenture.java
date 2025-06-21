package programa_investimentos;

import exceptions.TipoClienteInvalidoException;

public class Debenture extends Investimento {
    private String nomeEmpresaEmissora;
    private double taxaJurosAnualDebenture;
    private double percentualTributacaoPJ;

    public Debenture(Cliente cliente, double valorInicial, String nomeEmpresaEmissora, double taxaJurosAnualDebenture, double percentualTributacaoPJ) {
        super(cliente, valorInicial);
        if (!(cliente instanceof PessoaJuridica)) {
            throw new TipoClienteInvalidoException("Debênture é um investimento exclusivo para Pessoa Jurídica.");
        }
        this.nomeEmpresaEmissora = nomeEmpresaEmissora;
        this.taxaJurosAnualDebenture = taxaJurosAnualDebenture;
        this.percentualTributacaoPJ = percentualTributacaoPJ;
    }

    @Override
    public double calcularSaldoProjetado(int numeroMeses) {
        double taxaJurosMensal = this.taxaJurosAnualDebenture / 12.0;
        double saldoBrutoProjetado = getSaldo() * Math.pow((1 + taxaJurosMensal), numeroMeses);
        double rendimentoBruto = saldoBrutoProjetado - getSaldo();
        double impostoDevido = rendimentoBruto * this.percentualTributacaoPJ;
        return getSaldo() + rendimentoBruto - impostoDevido;
    }

    @Override
    public void simularPassagemDeMes() {
        double rendimentoMes = this.getSaldo() * (this.taxaJurosAnualDebenture / 12.0);
        this.setSaldo(this.getSaldo() + rendimentoMes);
    }

    public String getNomeEmpresaEmissora() {
        return nomeEmpresaEmissora;
    }
}
