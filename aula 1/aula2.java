import java.util.Scanner;
//Somando dois numeros

public class Main {
  public static void main(String[] args) {
    //Criando um objeto Scanner
    Scanner scanner = new Scanner(System.in);

    //Digite o primeiro numero 
    System.out.print("Digite o primeiro numero: ");
    int num1 = scanner.nextInt();

    //Digite os dois  numeros 
    System.out.print("Digite o segundo numero: ");
    int num2 = scanner.nextInt();

    //Somando os dois numeros
    int soma = num1 + num2;

    //Exibindo o resultado
    System.out.println("A soma é:" + soma);

    //Fechando o Scanner
    scanner.close();
  }

 
}