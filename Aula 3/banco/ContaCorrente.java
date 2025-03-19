package banco;

import java.util.Scanner;

public class ContaCorrente {
    double saldo;
    int agencia;
    int numeroDaConta;
    String nome;

    Scanner scanner = new Scanner(System.in);

    public void consultarSaldo(){
        System.out.println("Olá " + this.nome + "\nSeu saldo é: " + this.saldo);
    }

    public boolean sacarDinheiro(int agencia, int numeroDaConta, double valorDoSaque) {

        while (this.agencia != agencia) {
            System.err.println("Número de agência não encontrado!\nDigite novamente: ");
            agencia = scanner.nextInt();
        }

        while (this.numeroDaConta != numeroDaConta) {
            System.err.println("Número da conta incorreta!\nDigite novamente: ");
            numeroDaConta = scanner.nextInt();
        }

        while (this.saldo <= 0 || this.saldo < valorDoSaque) {
            System.err.println("Saldo insuficiente para operação!\nTente fazer um depósito antes ou digite um novo valor para saque: ");
            valorDoSaque = scanner.nextDouble();
        }

        this.saldo -= valorDoSaque;
        return true;
    }

    public boolean depositarDinheiro(int agencia, int numeroDaConta, double valorDoDeposito) {

        while (this.agencia != agencia) {
            System.err.println("Número de agência não encontrado!\nDigite novamente: ");
            agencia = scanner.nextInt();
        }

        while (this.numeroDaConta != numeroDaConta) {
            System.err.println("Número da conta incorreta!\nDigite novamente: ");
            numeroDaConta = scanner.nextInt();
        }

        this.saldo += valorDoDeposito;
        return true;
    }

    public boolean transferirDinheiro(ContaCorrente contaDestinatario, double valorDaTransferencia) {
        boolean sucessoSaque = this.sacarDinheiro(this.agencia, this.numeroDaConta, valorDaTransferencia);

        if (sucessoSaque) {
            contaDestinatario.depositarDinheiro(contaDestinatario.agencia, contaDestinatario.numeroDaConta, valorDaTransferencia);
        } else {
            System.out.println("Problemas na conta remetente! Tente novamente mais tarde.");
        }

        return true;
    }
}
