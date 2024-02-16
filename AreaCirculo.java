package br.com.fiap;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int raio = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o raio do circulo: ");
			raio = scan.nextInt();
			System.out.println("A área do círculo é: " + (Math.PI * (raio * raio)));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número");
		}
	}

}
