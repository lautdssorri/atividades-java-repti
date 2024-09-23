
//Aproximação do número PI com n interacoes
public class Main {
  public static void main(String[] args) {
    int iteracoes = 100;
    double pi = 0.0;

    // Iniciando a aproximacao
    for (int i = 0; i < iteracoes; i++) {
      if (i % 2 == 0) {
        pi += 1.0 / (2 * i + 1);
        System.out.println("Iteracoes " + i + ":" + pi);
      } else {
        pi -= 1.0 / (2 * i + 1);
        System.out.println("Iteracoes " + i + ":" + pi);
      }
    }
    pi *= 4; // Multiplicando por 4
    System.out.println("O número aproximado foi:" + pi);
  }
}
