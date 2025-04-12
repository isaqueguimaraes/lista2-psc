import java.util.Scanner;

public class Urna {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    int votosJair = 0;
    int votosCarlos = 0;
    int votosNeves = 0;
    int votosNulo = 0;
    int votosBranco = 0;

    while (true) {
      System.out.println("\nBem-vindo(a) à Urna Eletrônica.");
      System.out.println("Digite 1 para votar no candidato JAIR RODRIGUES;");
      System.out.println("Digite 2 para votar no candidato CARLOS LUZ;");
      System.out.println("Digite 3 para votar no candidato NEVES ROCHA;");
      System.out.println("Digite 4 para votar NULO;");
      System.out.println("Digite 5 para votar em BRANCO;");
      System.out.println("Digite 6 para ENCERRAR a votação.");
      System.out.print("Digite seu voto: ");
      int votoUsuario = leitura.nextInt();

      if (votoUsuario == 6) {
        break;
      }

      switch (votoUsuario) {
        case 1:
          votosJair++;
          break;

        case 2:
          votosCarlos++;
          break;

        case 3:
          votosNeves++;
          break;

        case 4:
          votosNulo++;
          break;

        case 5:
          votosBranco++;
          break;

        default:
          System.out.println("Voto inválido!");
      }
    }

    int votosTotais = votosJair + votosCarlos + votosNeves + votosNulo + votosBranco;

    double porcentagemNulo = (double) votosNulo / votosTotais * 100;

    double porcentagemBranco = (double) votosBranco / votosTotais * 100;

    System.out.println("\nFim da votação.");
    System.out.println("Candidato Jair Rodrigues: " + votosJair + " votos.");
    System.out.println("Candidato Carlos Luz: " + votosCarlos + " votos.");
    System.out.println("Candidato Neves Rocha: " + votosNeves + " votos.");
    System.out.printf("Porcentagem de votos NULOS: %.0f%%\n", porcentagemNulo);
    System.out.printf("Porcentagem de votos em BRANCO: %.0f%%\n", porcentagemBranco);

    if (votosJair > votosCarlos && votosJair > votosNeves) {
      System.out.println("\nO candidato Jair Rodrigues foi o vencedor da eleição.");
    } else if (votosCarlos > votosJair && votosCarlos > votosNeves) {
      System.out.println("\nO candidato Carlos Luz foi o vencedor da eleição.");
    } else if (votosNeves > votosJair && votosNeves > votosCarlos) {
      System.out.println("\nO candidato Neves Rocha foi o vencedor da eleição.");
    } else {
      System.out.println("\nHouve empate entre os candidatos.");
    }
    leitura.close();
  }
}