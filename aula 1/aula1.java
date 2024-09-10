import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto scanner para ler o teclado
    Scanner scanner = new Scanner(System.in);

    // Solicitando o nome do Usuario
    System.out.printf("Digite seu nome: ");
    String nome = scanner.nextLine();

    // Solicitando a idade do Usuario
    System.out.printf("Digite sua idade: ");
    String idade = scanner.nextLine();

    // Exibindo o que o usuario digitou no teclado
    System.out.println("Olá " + nome + " você tem " + idade + " anos");

    // Fechando o scanner
    scanner.close();
  }
}