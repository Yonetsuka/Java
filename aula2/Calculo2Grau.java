package br.com.fiap;

import java.util.Scanner;

public class Calculo2grau{
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0, delta = 0, resposta1 = 0, resposta2 = 0;
		Scanner scan;
    try {
			scan = new Scanner(System.in);
			System.out.println("Digite o elemento a da equação: ");
			a = scan.nextInt();
			System.out.println("Digite o elemento b da equação: ");
			b = scan.nextInt();
			System.out.println("Digite o elemento c da equação: ");
			c = scan.nextInt();
      delta = b * b - 4 * a * c;
      System.out.println("O delta da equação é: " + delta);
      raizDelta = Math.sqrt(delta);
      resposta1 = (-b + raizDelta) / 2 * a;
      resposta2 = (-b - raizDelta) / 2 * a;
      System.out.println("A resposta da equação é: " + resposta1 + "e" + resposta2);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número");
		}
	}

}
