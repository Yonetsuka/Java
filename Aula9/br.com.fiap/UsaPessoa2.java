package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2{
  public static void main(String[] args){
    Pessoa pessoa3;
    String Nome;
    int AnoNascimento;
    Scanner scan;
    try{
      scan = new Scanner(System.in);
      System.out.println("Digite o seu nome e ano de nascimento: ");
      //Nome = scan.nextLine();
      //AnoNascimento = scan.nextInt();
      //pessoa3 = new Pessoa(Nome, AnoNascimento);

      pessoa3 = new Pessoa(scan.nextLine(),scan.nextInt());
      int idade = pessoa3.calculaIdade(2024);
      
      System.out.println("Nome: " +  pessoa3.getNome());
      System.out.println("Idade: " + idade + "anos");
    }
    catch(Esception e){
      System.out.println("Nome e/ou ano de nascimento incorretos.");
    }
  }
}
