import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 0.0;
        int opcao;

        do {
            System.out.println("\n==========================");
            System.out.println("   SISTEMA BANCÁRIO");
            System.out.println("==========================");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Extrato");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();

                    if (saque <= 0) {
                        System.out.println("Erro: Digite um valor positivo.");
                    } else if (saque > saldo) {
                        System.out.println("Erro: Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Erro: Digite um valor positivo.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("\n===== EXTRATO =====");
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
