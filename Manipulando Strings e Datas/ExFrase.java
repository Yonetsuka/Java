package br.com.fiap;

import javax.swing.JOptionPane;

public class ExFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Digite sua frase: ");
		System.out.println("Frase que você digitou: " + frase);
		// quantidade de caracter
		int qtCh = frase.length();
		System.out.println("Quantidade de caracteres: " + qtCh);
		// exibindo em maiusculo
		String maius = frase.toUpperCase();
		System.out.println("Frase em maiusculo: " + maius);
		// substituindo palavras da frase por outra do usuário
		String p1 = JOptionPane.showInputDialog("Digite uma palavra da frase que você deseja"
				+ " substituir: ");
		String p2 = JOptionPane.showInputDialog("Digite por qual palavra você deseja substituir: ");
		String frase2 = frase.replace(p1, p2);
		// quantidade de caracteres(de novo)
		int qtCh2 = frase2.length();
		System.out.println("Quantidade de caracteres: " + qtCh2);		
	}

}
