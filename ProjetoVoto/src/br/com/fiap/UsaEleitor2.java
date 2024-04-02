package br.com.fiap;

import java.util.Scanner;
import java.time.LocalDate;

public class UsaEleitor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
	        	System.out.println("Eleitor 1");
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

			String nome;
			int anoNascimento, numTItulo,zona,secao;         
		}
		catch(Exception e){
			System.out.println("Algo deu errado");
		}
		Eleitor eleitor1 = new Eleitor(nome, anoNascimento, numTitulo, zona, secao);
		        System.out.println("O nome do primeiro eleitor é " + eleitor1.getNome() +
		        ", \nele possui " + eleitor1.calculaIdade(2024) + " anos, \ntem o número de título "
		        + eleitor1.getNumTitulo() + ", \né da zona " + eleitor1.getZona() + " \ne da seção " +
		        eleitor1.getSecao());
		try{
				scan= new Scanner(System.in);
				System.out.println("Eleitor 2");
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

			} 
		catch{
			System.out.println("Algo deu errado");
		}
			
		        Eleitor eleitor2 = new Eleitor(nome, anoNascimento, numTitulo, zona, secao);
		        System.out.println("O nome do primeiro eleitor é " + eleitor2.getNome() +
		        ", \nele possui " + eleitor2.calculaIdade(2024) + " anos, \ntem o número de título "
		        + eleitor2.getNumTitulo() + ", \né da zona " + eleitor2.getZona() + " \ne da seção " +
		        eleitor2.getSecao());
	}

}
