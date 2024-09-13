import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Instanciando o objeto Scaneer
   Scanner scanner = new Scanner(System.in); 
    System.out.print("Quantos numeros você deseja inserir?");
    int tamanho = scanner.nextInt();

    //Criando um array para armazenar os numeros
    int[] numeros = new int[tamanho];

    //Preenchendo todo o array
    for(int i = 0; i < tamanho; i++){
      System.out.print("Digite o número" + (i+1) + ":");
      numeros[i] = scanner.nextInt();
    }

    //Exibindo todos os valores do array
    System.out.println("Você inseriu os números:");
    for(int i = 0; i < tamanho; i++){
      System.out.print(numeros[i]);
    }
    scanner.close();
  }
}