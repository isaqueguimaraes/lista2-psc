import java.util.Scanner;

public class Senha {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    int senhaCorreta = 1234;

    while (true) {
      System.out.println("Digite a senha:");
      int senhaDigitada = leitura.nextInt();

      if (senhaDigitada == senhaCorreta) {
        System.out.println("Senha correta.");
        break;
      }

      else {
        System.out.println("Senha incorreta! Tente novamente.\n");
      }
    }
  }
}
