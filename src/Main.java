import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco SPI!!\n");
        while (true) {
            System.out.println("Qual o tipo da sua conta?");
            System.out.println("1. Conta Corrente");
            System.out.println("2. Conta Poupança");
            System.out.println("3. Sair\n");

            System.out.print("Digite o número de sua opção: ");
            int escolhaConta = scanner.nextInt();

            TipoDeConta contaSelecionada;

            if (escolhaConta == 1) {
                contaSelecionada = new ContaCorrente();
                System.out.println("\nConta Corrente selecionada.");
            } else if (escolhaConta == 2) {
                contaSelecionada = new ContaPoupanca();
                System.out.println("\nConta Poupança selecionada.");
            } else if (escolhaConta == 3) {
                System.out.println("\nO Banco SPI agradece por utilizar o nosso serviço!!");
                System.out.println("Tenha um ótimo dia e volte sempre.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            operacoesConta(contaSelecionada, scanner);
        }

        scanner.close();
    }

