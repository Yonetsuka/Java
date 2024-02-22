package br.com.fiap;

import java.util.Scanner;

public class AreaRetangulo {
        public static void main(String[] args) {
        		// TODO Auto-generated method stub
        		int ladoMaior = 0, ladoMenor = 0;
        		Scanner scan;
        		try {
        			scan = new Scanner(System.in);
        			System.out.println("Digite o lado maior do retângulo: ");
        			ladoMaior = scan.nextInt();
              System.out.println("Digite o lado menor do retângulo: ");
              ladoMenor = scan.nextInt();
        			System.out.println("A área do círculo é: " + (raio * raio));
        		} catch (Exception e) {
        			// TODO: handle exception
        			System.out.println("Formato incorreto do número");
            }
    }
}
