import java.util.Scanner;

public class Caixa {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    double saldo = 0;

    System.out.println("Bem vindo(a) ao Caixa Eletrônico!\n");

    while (true) {
      System.out.println("Selecione uma das opções a seguir:");
      System.out.println("Digite 1 para consultar seu saldo;");
      System.out.println("Digite 2 para efetuar um saque;");
      System.out.println("Digite 3 para fazer um depósito;");
      System.out.println("Digite 4 para encerrar o atendimento.");
      System.out.print("Digite sua escolha: ");
      int escolha = leitura.nextInt();

      if (escolha == 4) {
        System.out.println("Atendimento finalizado. Agradecemos a preferência.");
        break;
      }

      switch (escolha) {
        case 1:
          System.out.println("\nVocê escolheu Consultar Saldo.");
          System.out.printf("Seu saldo é: R$ %.2f.\n", saldo);
          System.out.println("\nBem vindo(a) de volta ao menu inicial.");
          break;

        case 2:
          System.out.println("\nVocê escolheu realizar um saque.");
          System.out.println("Digite o valor que você deseja sacar:");
          System.out.print("R$ ");
          double valorSaque = leitura.nextDouble();

          if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente!");
          } else {
            System.out.printf("\nVocê realizou um saque no valor de: R$ %.2f.\n", valorSaque);
            saldo -= valorSaque;
          }
          System.out.println("\nBem vindo(a) de volta ao menu inicial.");
          break;

        case 3:
          System.out.println("\nVocê escolheu realizar um depósito.");
          System.out.println("Digite o valor que você deseja depositar:");
          System.out.print("R$ ");
          double valorDeposito = leitura.nextDouble();
          System.out.printf("\nVocê realizou um depósito no valor de R$ %.2f.\n", valorDeposito);
          System.out.println("\nBem vindo(a) de volta ao menu inicial.");

          saldo += valorDeposito;
          break;

        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
    leitura.close();
  }
}
