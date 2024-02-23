package br.com.fiap;

import java.util.Scanner;

public class CalculoTrapezio{
  public static void main(String[] args) {
    int baseMaior = 0, baseMenor = 0, altura = 0;
    Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite a base maior do trapézio: ");
			baseMaior = scan.nextInt();
      System.out.println("Digite a base menor do trapézio: ");
			baseMenor = scan.nextInt();
      System.out.println("Digite a altura do trapézio: ");
			altura = scan.nextInt();
			System.out.println("A área do trapézio é: " + ((BaseMaior + baseMenor) * altura) / 2);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Formato incorreto do número");
		}
	}

}
