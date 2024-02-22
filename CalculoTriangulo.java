package br.com.fiap;

import java.util.Scanner;

public class CalculoTriangulo {
  public static void main(String[] args) {
    int base = 0, altura = 0;
    Scanner scan;
    try {
			scan = new Scanner(System.in);
			System.out.println("Digite o tamanho da base do triângulo");
			base = scan.nextInt();
      			System.out.println("Digite a altura do triâncgulo");
			altura = scan.nextInt();
			System.out.println("A área do triângulo é: " + ((base * altura) / 2) );
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número");
		}
	}

}
