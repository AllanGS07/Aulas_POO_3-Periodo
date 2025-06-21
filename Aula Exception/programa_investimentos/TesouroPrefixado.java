package programa_investimentos;

import exceptions.TipoClienteInvalidoException;

public class TesouroPrefixado extends Investimento {
    private String nomeTitulo;
    private double taxaJurosAnual;
    private final double percentualImpostoRenda = 0.15;

    public TesouroPrefixado(Cliente cliente, double valorInicial, String nomeTitulo, double taxaJurosAnual) {
        super(cliente, valorInicial);
        if (!(cliente instanceof PessoaFisica)) {
            throw new TipoClienteInvalidoException("Tesouro Prefixado é um investimento exclusivo para Pessoa Física.");
        }
        this.nomeTitulo = nomeTitulo;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    @Override
    public double calcularSaldoProjetado(int numeroMeses) {
        double taxaJurosMensal = this.taxaJurosAnual / 12.0;
        double saldoBrutoProjetado = getSaldo() * Math.pow((1 + taxaJurosMensal), numeroMeses);
        double rendimentoBruto = saldoBrutoProjetado - getSaldo();
        double impostoDevido = rendimentoBruto * this.percentualImpostoRenda;
        return getSaldo() + rendimentoBruto - impostoDevido;
    }

    @Override
    public void simularPassagemDeMes() {
        double rendimentoMes = this.getSaldo() * (this.taxaJurosAnual / 12.0);
        this.setSaldo(this.getSaldo() + rendimentoMes);
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }
}
