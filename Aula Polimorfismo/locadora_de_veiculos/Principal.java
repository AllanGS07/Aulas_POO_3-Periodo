package locadora_de_veiculos;

public class Principal {
    public static void main(String[] args) {
        // Criando alguns carros
        CarroPopular carroPopular1 = new CarroPopular(true, "Fiat", "Mobi", "ABC1234", 2023, 100.0, 50, true);
        CarroSUV carroSUV1 = new CarroSUV("Toyota", "Corolla Cross", "DEF5678", 2024, 250.0, 100, true, 450, "4x2",
                "Flex");
        CarroLuxo carroLuxo1 = new CarroLuxo("Mercedes-Benz", "Classe C", "GHI9012", 2025, 500.0, 200, true, 6, 480.0f,
                true);
        Carro carroGenerico = new Carro("Volkswagen", "Gol", "JKL3456", 2022, 80.0, 40, true, 0); // Carro genérico sem
                                                                                                  // renovações grátis

        // Criando clientes
        PessoaFisica clientePF1 = new PessoaFisica("123.456.789-00", "Rua A, 123", "João Silva", "99999-1111");
        PessoaFisica representanteEmpresa = new PessoaFisica("111.222.333-44", "Rua Rep, 1", "Maria Rep", "98888-2222");
        PessoaJuridica clientePJ1 = new PessoaJuridica("12.345.678/0001-99", representanteEmpresa, "Avenida B, 456",
                "Empresa XYZ", "3333-4444");

        // Testando empréstimo e devolução para Pessoa Física com Carro Popular
        System.out.println("--- Teste Pessoa Física com Carro Popular ---");
        System.out.println("Carro Popular " + carroPopular1.getMarca() + " " + carroPopular1.getModelo()
                + " disponível? " + carroPopular1.isDisponivel());
        System.out.println("Cliente " + clientePF1.getNome() + " pode alugar? " + clientePF1.podeRealizarEmprestimo());

        Emprestimo emprestimo1 = null;
        try {
            emprestimo1 = new Emprestimo(clientePF1, carroPopular1);
            System.out.println(
                    "Empréstimo realizado para " + clientePF1.getNome() + " com o carro " + carroPopular1.getModelo());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }

        if (emprestimo1 != null) {
            System.out.println("Carro Popular " + carroPopular1.getMarca() + " " + carroPopular1.getModelo()
                    + " disponível? " + carroPopular1.isDisponivel());
            System.out.println(
                    "Cliente " + clientePF1.getNome() + " pode alugar? " + clientePF1.podeRealizarEmprestimo());
            System.out.println("Quantidade de empréstimos do cliente " + clientePF1.getNome() + ": "
                    + clientePF1.getQuantidadeEmprestimos());

            // Testando renovações
            System.out.println("\\nTestando renovações para Carro Popular (1 grátis):");
            emprestimo1.renovar(); // 1ª renovação (grátis)
            emprestimo1.renovar(); // 2ª renovação (paga)
            System.out.println("Quantidade de renovações: 2");

            emprestimo1.devolver();
            System.out.println("Empréstimo devolvido.");
            System.out.println("Valor da multa: R$" + emprestimo1.getValorMulta());
            System.out.println("Valor total do aluguel: R$" + emprestimo1.getValorTotal());
            System.out.println("Carro Popular " + carroPopular1.getMarca() + " " + carroPopular1.getModelo()
                    + " disponível? " + carroPopular1.isDisponivel());
            System.out.println(
                    "Cliente " + clientePF1.getNome() + " pode alugar? " + clientePF1.podeRealizarEmprestimo());
            System.out.println("Quantidade de empréstimos do cliente " + clientePF1.getNome() + ": "
                    + clientePF1.getQuantidadeEmprestimos());
        }

        // Testando empréstimo e devolução para Pessoa Jurídica com Carro de Luxo
        System.out.println("\\n--- Teste Pessoa Jurídica com Carro de Luxo ---");
        Emprestimo emprestimo2 = null;
        try {
            emprestimo2 = new Emprestimo(clientePJ1, carroLuxo1);
            System.out.println(
                    "Empréstimo realizado para " + clientePJ1.getNome() + " com o carro " + carroLuxo1.getModelo());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }

        if (emprestimo2 != null) {
            // Testando renovações
            System.out.println("\\nTestando renovações para Carro de Luxo (5 grátis):");
            for (int i = 0; i < 7; i++) { // 7 renovações (5 grátis, 2 pagas)
                emprestimo2.renovar();
            }
            System.out.println("Quantidade de renovações: 7");
            emprestimo2.devolver();
            System.out.println("Empréstimo devolvido.");
            System.out.println("Valor da multa: R$" + emprestimo2.getValorMulta());
            System.out.println("Valor total do aluguel: R$" + emprestimo2.getValorTotal());
        }

        // Testando limite de empréstimo para Pessoa Física
        System.out.println("\\n--- Teste Limite Empréstimo Pessoa Física ---");
        Emprestimo emprestimoPF_extra1 = null;
        Emprestimo emprestimoPF_extra2 = null;
        try {
            // Primeiro empréstimo (deve funcionar)
            emprestimoPF_extra1 = new Emprestimo(clientePF1, carroSUV1);
            System.out.println("Primeiro empréstimo para " + clientePF1.getNome() + " com " + carroSUV1.getModelo()
                    + " realizado.");

            // Tentativa de segundo empréstimo (deve falhar)
            System.out.println("Tentando segundo empréstimo para " + clientePF1.getNome() + " com "
                    + carroGenerico.getModelo() + "...");
            emprestimoPF_extra2 = new Emprestimo(clientePF1, carroGenerico);
            System.out.println("Segundo empréstimo realizado (ERRO ESPERADO AQUI).");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar empréstimo para " + clientePF1.getNome() + ": " + e.getMessage());
        } finally {
            if (emprestimoPF_extra1 != null) {
                emprestimoPF_extra1.devolver(); // Garante a devolução do carro
                System.out.println(carroSUV1.getModelo() + " devolvido.");
            }
        }

        // Testando carro indisponível
        System.out.println("\\n--- Teste Carro Indisponível ---");
        System.out.println(
                carroPopular1.getModelo() + " disponível antes do empréstimo? " + carroPopular1.isDisponivel());
        Emprestimo emprestimoTemp = new Emprestimo(clientePF1, carroPopular1); // Aluga o carro popular
        System.out.println(
                carroPopular1.getModelo() + " disponível após primeiro empréstimo? " + carroPopular1.isDisponivel());

        try {
            System.out.println(
                    "Tentando alugar " + carroPopular1.getModelo() + " novamente para " + clientePJ1.getNome());
            new Emprestimo(clientePJ1, carroPopular1); // Tenta alugar o mesmo carro
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }
        emprestimoTemp.devolver(); // Devolve o carro popular
        System.out.println(carroPopular1.getModelo() + " disponível após devolução? " + carroPopular1.isDisponivel());

    }
}
