import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1;
    int tentativa = 0;
    int chute;
    boolean acertou = false;

    while (!acertou) {
      // Solicitando um número para o usuário
      System.out.println("""
                         s̷e̷c̷r̷e̷t̷o̷
                         
                        """);
      System.out.println("Digite um número entre 1 e 100");
      chute = scanner.nextInt();
      tentativa++;
      // Verificando se o chute é maior ou menor que o número secreto
      if (chute == numeroSecreto) {
        System.out.println("""

                           🅟🅐🅡🅐🅑🅔🅝🅢
                          """);
        System.out.println("Parabéns você acertou o número secreto em: " + tentativa + "     tentativas");
        acertou = true;
      } else if (chute > numeroSecreto) {
        System.out.println("O número secreto é menor! Tente novamente");
      } else {
        System.out.println("O número secreto é maior! Tente novamente");
      }
    }
    scanner.close();
  }
}