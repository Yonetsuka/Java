package br.com.fiap;

import java.util.Scanner;

public class UsaPoupanca2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumConta;
		String donoConta;
		float saldoConta;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Digite o id da sua conta: ");
			NumConta = scan.nextInt();
			System.out.println("Digite o seu nome: ");
			donoConta = scan.nextLine();
			System.out.println("Digite o saldo da sua conta: ");
			saldoConta = scan.nextFloat();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
