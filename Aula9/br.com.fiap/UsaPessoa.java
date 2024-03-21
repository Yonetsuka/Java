package br.com.fiap

public class UsaPessoa(){
  public static void main(String[] args){
    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa("Berisvaldo",1980);

    pessoa1.SetNome("Roberto");
    pessoa1.setAnoNascimento(1988);
    int idade = pessoa1.calculaIdade(2024);

    System.out.println("Nome: " + pessoa1.getNome());
    System.out.println("Idade: " + idade + " anos"());
    System.out.println("Nome: " + pessoa2.getNome());
    System.out.println("Idade: " + pessoa1.calculaIdade(2024) + " anos"());
  }
}
