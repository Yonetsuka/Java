package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite 2 números inteiros");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			System.out.println("Valor 1: " + num1 + "\nValor2: " + num2);
			System.out.println("Soma dos valores: " + (num1 + num2));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número");
		}
	}

}
