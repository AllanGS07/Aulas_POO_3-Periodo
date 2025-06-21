package programa_investimentos;

import exceptions.InvestimentoNaoPertenceAoClienteException;
import java.util.ArrayList;
import java.util.List;

public class CarteiraInvestimentos {
    private Cliente cliente;
    private List<Investimento> investimentos;

    public CarteiraInvestimentos(Cliente cliente) {
        this.cliente = cliente;
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(Investimento investimento) {
        if (investimento.getCliente() != this.cliente) {
            throw new InvestimentoNaoPertenceAoClienteException("O investimento não pertence ao dono da carteira.");
        }
        this.investimentos.add(investimento);
    }

    public double calcularValorTotalInvestido() {
        double total = 0;
        for (Investimento investimento : investimentos) {
            total += investimento.getSaldo();
        }
        return total;
    }

    public List<Investimento> getInvestimentos() {
        return investimentos;
    }
}
