import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    // 1- Criação de um array
    int[] numbers = { 2, 1, 3, 5, 7, 9 };
    System.out.println("Meu array de numeros" + Arrays.toString(numbers));

    // 2-Acessando um elemento pelo index[]
    System.out.println("O elemento da posição 2 é: " + numbers[2]);

    // 3-Modificando um valor especifico no array
    numbers[3] = 0;
    System.out.println("O novo valor da posição 3 é:" + Arrays.toString(numbers));

    // 4-Criando um array de strings
    String[] frutas = { "Pera", "Maça", "Manga", "Melão", "Uva", "Melancia", "Morango", "Goiaba" };
    // Exibindo a lista de frutas
    for (int i = 0; i < frutas.length; i++) {
      System.out.println("Fruta" + (i + 1) + ":" + frutas[i]);
    }
    System.out.println("--------------------------------------");
    // 5-Instanciando um array de string
    String[] carros = new String[4];

    // Adcionando valores ao array
    carros[0] = "BMW";
    carros[1] = "Mercedes";
    carros[2] = "Audi";
    carros[3] = "Tesla";

    for (int i = 0; i < carros.length; i++) {
      System.out.println("Carro" + (i + 1) + ":" + carros[i]);
    }

    System.out.println("--------------------------------------");
    // 6-Ordenando um array crescente
    Arrays.sort(numbers);
    System.out.println("Array ordenado:" + Arrays.toString(numbers));

    Integer[] numeros = { 5, 3, 1, 0, 9, 6 };
    Arrays.sort(numeros, Collections.reverseOrder());
    System.out.println("Array em ordem decrescente:" + Arrays.toString(numeros));

    System.out.println("---------------------------------------");
    
    //7-buscando um elemento no array metodo 
    int index = Arrays.binarySearch(numbers, 9);
    if(index >=0){
      System.out.println("Valor encontrado na posição:" + index);
    }else{
      System.out.println("Valor não encontrado");
    }

    System.out.println("---------------------------------------");
    
      //8-Preencher um array com um determinado valor
    int[] lista = new int[5];
    Arrays.fill(lista, 10);
    System.out.println("Lista preenchida:" + Arrays.toString(lista));
  }
}
