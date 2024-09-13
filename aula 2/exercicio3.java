//Definir a classe Pessoa
class Pessoa{
  //Atributos da classe
  String nome;
  int idade;


//Constructor para inicializar os atributos
public Pessoa(String nome, int idade){
  this.nome = nome;
  this.idade = idade;
}
  //Método para exibir informaçoes de Pessoa
  public void exibirInformacoes(){
    System.out.println("Nome:" + nome);
    System.out.println("Idade:" + idade);
  }
}
public class Main {
  public static void main(String[] args) {
    //Criando um objeto Pessoa
    Pessoa pessoa1 = new Pessoa("Laura" ,16);
    Pessoa pessoa2 = new Pessoa("Suelen", 18);
    Pessoa pessoa3 = new Pessoa("Sofia" ,16);
    
    pessoa1.exibirInformacoes();
    pessoa2.exibirInformacoes();
    pessoa3.exibirInformacoes();
  }
}