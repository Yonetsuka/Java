package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa();
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			pessoa1.setNome(scan.next());
			System.out.println("Digite seu ano de nascimento: ");
			pessoa1.setAnoNascimento(scan.nextInt());
			System.out.println("Nome: " + pessoa1.getNome() + 
					"\nIdade: " + pessoa1.calculaIdade(2024) + "anos");
		}
		catch(Exception e){
			System.out.println("Nome e/ou data de nascimento inválido");
		}
	}

}
