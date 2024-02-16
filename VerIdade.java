package br.com.fiap;

import java.util.Scanner;

public class VerIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anoPr = 0, anoNa = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano atual: ");
			anoPr = scan.nextInt();
			System.out.println("Digite o ano q nasceu: ");
			anoNa = scan.nextInt();
			System.out.println("Você possui " + (anoPr - anoNa) + "anos de idade");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número");
		}
	}

}
