package programa_investimentos;

import exceptions.TipoClienteInvalidoException;

public class Principal {
    public static void main(String[] args) {
        // Criando clientes
        PessoaFisica clientePF = new PessoaFisica("João da Silva", "joao.silva@email.com", "123.456.789-00");
        PessoaJuridica clientePJ = new PessoaJuridica("Empresa XYZ", "contato@xyz.com", "12.345.678/0001-99");

        // Criando carteiras
        CarteiraInvestimentos carteiraPF = new CarteiraInvestimentos(clientePF);
        CarteiraInvestimentos carteiraPJ = new CarteiraInvestimentos(clientePJ);

        System.out.println("--- Cenário Inicial ---");

        // Criando e adicionando investimentos para Pessoa Física
        try {
            Investimento tesouro = new TesouroPrefixado(clientePF, 10000, "Tesouro Prefixado 2029", 0.10);
            carteiraPF.adicionarInvestimento(tesouro);
            System.out.println("Tesouro Prefixado adicionado à carteira de " + clientePF.getNome());

            Investimento acoes = new AcaoBolsa(clientePF, 5000, "PETR4", "Petrobras PN", 10.00);
            carteiraPF.adicionarInvestimento(acoes);
            System.out.println("Ações da Petrobras adicionadas à carteira de " + clientePF.getNome());

        } catch (TipoClienteInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Criando e adicionando investimentos para Pessoa Jurídica
        try {
            Investimento debenture = new Debenture(clientePJ, 20000, "Empresa ABC", 0.12, 0.20);
            carteiraPJ.adicionarInvestimento(debenture);
            System.out.println("Debênture adicionada à carteira de " + clientePJ.getNome());

            Investimento fundo = new FundoInvestimento(clientePJ, 15000, "Fundo Multimercado Y", "98.765.432/0001-11", 0.02);
            carteiraPJ.adicionarInvestimento(fundo);
            System.out.println("Fundo de Investimento adicionado à carteira de " + clientePJ.getNome());

        } catch (TipoClienteInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nValor total investido por " + clientePF.getNome() + ": R$ " + String.format("%.2f", carteiraPF.calcularValorTotalInvestido()));
        System.out.println("Valor total investido por " + clientePJ.getNome() + ": R$ " + String.format("%.2f", carteiraPJ.calcularValorTotalInvestido()));

        // Testando restrições
        System.out.println("\n--- Testando Restrições ---");
        try {
            System.out.println("Tentando adicionar Debênture para Pessoa Física...");
            new Debenture(clientePF, 1000, "Empresa Invalida", 0.10, 0.20);
        } catch (TipoClienteInvalidoException e) {
            System.out.println("SUCESSO: " + e.getMessage());
        }

        try {
            System.out.println("Tentando adicionar Tesouro Prefixado para Pessoa Jurídica...");
            new TesouroPrefixado(clientePJ, 1000, "Tesouro Invalido", 0.08);
        } catch (TipoClienteInvalidoException e) {
            System.out.println("SUCESSO: " + e.getMessage());
        }

        // Simulando passagem de meses
        System.out.println("\n--- Simulando Passagem de 3 Meses ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Mês " + i + " ---");
            // Simula para PF
            for (Investimento inv : carteiraPF.getInvestimentos()) {
                inv.simularPassagemDeMes();
                System.out.println("Saldo atual de " + inv.getClass().getSimpleName() + " de " + clientePF.getNome() + ": R$ " + String.format("%.2f", inv.getSaldo()));
            }
            System.out.println("Valor total na carteira de " + clientePF.getNome() + ": R$ " + String.format("%.2f", carteiraPF.calcularValorTotalInvestido()));

            // Simula para PJ
            for (Investimento inv : carteiraPJ.getInvestimentos()) {
                inv.simularPassagemDeMes();
                System.out.println("Saldo atual de " + inv.getClass().getSimpleName() + " de " + clientePJ.getNome() + ": R$ " + String.format("%.2f", inv.getSaldo()));
            }
            System.out.println("Valor total na carteira de " + clientePJ.getNome() + ": R$ " + String.format("%.2f", carteiraPJ.calcularValorTotalInvestido()));
        }

        // Testando projeções
        System.out.println("\n--- Testando Projeções (12 meses) ---");
        Investimento tesouroDaCarteira = carteiraPF.getInvestimentos().get(0);
        System.out.println("Projeção do Tesouro Prefixado para " + clientePF.getNome() + " em 12 meses: R$ " + String.format("%.2f", tesouroDaCarteira.calcularSaldoProjetado(12)));

        Investimento debentureDaCarteira = carteiraPJ.getInvestimentos().get(0);
        System.out.println("Projeção da Debênture para " + clientePJ.getNome() + " em 12 meses: R$ " + String.format("%.2f", debentureDaCarteira.calcularSaldoProjetado(12)));
    }
}
