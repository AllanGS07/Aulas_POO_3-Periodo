package banco;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua agência: ");
        conta1.agencia = scanner.nextInt();
        System.out.println("Digite o número da sua conta: ");
        conta1.numeroDaConta = scanner.nextInt();
        System.out.println("Digite o seu nome: ");
        conta1.nome = scanner.next();
        System.out.println("Digite o seu saldo inicial: ");
        conta1.saldo = scanner.nextDouble();

        System.out.println("\n\nDigite o número da sua agência: ");
        conta2.agencia = scanner.nextInt();
        System.out.println("Digite o número da sua conta: ");
        conta2.numeroDaConta = scanner.nextInt();
        System.out.println("Digite o seu nome: ");
        conta2.nome = scanner.next();
        System.out.println("Digite o seu saldo inicial: ");
        conta2.saldo = scanner.nextDouble();

        conta1.consultarSaldo();
        conta2.consultarSaldo();

        System.out.println("Digite o valor do saque na conta 1: ");
        double valorDoSaque = scanner.nextDouble();
        conta1.sacarDinheiro(conta1.agencia, conta1.numeroDaConta, valorDoSaque);
        conta1.consultarSaldo();

        System.out.println("Digite o valor do depósito na conta 2: ");
        double valorDoDeposito = scanner.nextDouble();
        conta2.depositarDinheiro(conta2.agencia, conta2.numeroDaConta, valorDoDeposito);
        conta2.consultarSaldo();

        System.out.println("Digite o valor da transferência da conta 2 para a conta 1: ");
        double valorDaTransferencia = scanner.nextDouble();
        conta2.transferirDinheiro(conta1, valorDaTransferencia);

        conta1.consultarSaldo();
        conta2.consultarSaldo();

        scanner.close();
    }
}