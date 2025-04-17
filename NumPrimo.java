import java.util.Scanner;

public class NumPrimo {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite um número inteiro:");
    int numeroDigitado = leitura.nextInt();

    int divisores = 0;

    for (int i = 1; i <= numeroDigitado; i++) {
      if (numeroDigitado % i == 0) {
        divisores++;
      }
    }

    if (divisores == 2) {
      System.out.println("O número digitado é um número primo.");
    } else {
      System.out.println("O número digitado não é um número primo.");
    }

    leitura.close();
  }
}
