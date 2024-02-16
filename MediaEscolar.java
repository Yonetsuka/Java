package br.com.fiap;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite 4 números inteiros");
			nota1 = scan.nextInt();
			nota2 = scan.nextInt();
			nota3 = scan.nextInt();
			nota4 = scan.nextInt();
			System.out.println("Média do aluno: " + ((nota1 + nota2 +nota3 + nota4) / 4 ));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número");
		}
	}

}
