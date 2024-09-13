import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //Criando uma instancia do Scanner
    Scanner scanner = new Scanner(System.in);

    //Solicitando o tamanho do array
    System.out.println("Quantos numeros voce deseja inserir?");
    int tamanho = scanner.nextInt();

    //Criando um array
    int[] numeros = new int[tamanho];

    //Inserindo os numeros no Array
    for(int i = 0; i < tamanho; i++){
      System.out.println("Digite o numero" + (i+1) + ":");
      numeros[i] = scanner.nextInt();
    }

    //Ordenando o Array com o sort
    Arrays.sort(numeros);

    //Exibindo todos os numeros do Array
    for(int i = 0; i < tamanho; i++){
      System.out.println(numeros[i]);
    }

    //Fechando o Scanner
    scanner.close();
  }
   }
