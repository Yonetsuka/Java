package br.com.fiap;

import java.util.Scanner;

public class UsaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario1 = new Funcionario();
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			funcionario1.setNome(scan.next());
			System.out.println("Digite o quanto ganha por hora: ");
			funcionario1.setValorHora(scan.nextFloat());
			System.out.println("Nome: " + funcionario1.getNome() + 
					"\nSalário: " + funcionario1.salario(6) + "reais");
		} catch(Exception e) {
			
		}
	}

}
