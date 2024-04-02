package br.com.fiap;

import java.util.Scanner;
import java.time.LocalDate;

public class UsaEleitor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Digite seu nome:");
	        String nome = scan.nextLine();
	        
	        System.out.println("Digite seu ano de nascimento:");
	        int anoNascimento = scan.nextInt();
	        
	        System.out.println("Digite seu número de título:");
	        int numTitulo = scan.nextInt();
	        
	        System.out.println("Digite sua zona:");
	        int zona = scan.nextInt();
	        
	        System.out.println("Digite sua seção:");
	        int secao = scan.nextInt();
	        
	        Eleitor eleitor3 = new Eleitor(nome, anoNascimento, numTitulo, zona, secao);
	        System.out.println("O nome do primeiro eleitor é " + eleitor3.getNome() +
	                ", \nele possui " + eleitor3.calculaIdade(2024) + " anos, \ntem o número de título "
	                + eleitor3.getNumTitulo() + ", \né da zona " + eleitor3.getZona() + " \ne da seção " +
	                eleitor3.getSecao());
	         
		}
		catch(Exception e){
			System.out.println("Algo deu errado");
		}
	}

}
