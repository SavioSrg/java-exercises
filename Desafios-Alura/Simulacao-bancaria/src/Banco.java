import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Rodrigo";
        String tipoConta = "Corrente";
        double saldo = 1512.32;
        int opcao = 0;

        Scanner input = new Scanner(System.in);

        String menu = """
                ***************************
                   1 - Consultar saldos
                   2 - Receber valor
                   3 - Transferir valor
                   4 - Sair
                ***************************
                """;

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("____________________________");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$" + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    int valorReceber = input.nextInt();
                    saldo += valorReceber;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor da transferência: ");
                    int valorTranferencia = input.nextInt();
                    if (valorTranferencia > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorTranferencia;
                        System.out.println("Saldo atualizado: " + saldo);
                    }
                    break;
                default:
                    System.out.printf("A opção %d é inválido!\n" +
                            "Selecione uma opção do nosso menu de atendimento:\n" +
                            "%s", opcao, menu);
                    opcao = input.nextInt();
            }
        }
    }
}
