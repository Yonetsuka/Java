package br.com.fiap;

import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class MenipulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mudando uma frase
		String frase = "O rato roeu a roupa do rei de Roma";
		JOptionPane.showMessageDialog(null, frase);
		// exibindo a quantidade de caracteres
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, qtChar);
		// exibindo a frase em maiusculo
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		// exibindo a frase em minusculo
		String minuscula = frase.toLowerCase();
		JOptionPane.showMessageDialog(null, minuscula);
		// exibindo a frase entre o indicie 30 e 34
		String palavra = frase.substring(30,34);
		JOptionPane.showMessageDialog(null, palavra);
		// trocando a palavra roupa por parede
		String frase2 = frase.replace("roupa", "parede");
		JOptionPane.showMessageDialog(null, frase2);
		
		// verificando uma senha
		String senha;
		senha = JOptionPane.showInputDialog("Digite a sua senha: ");
		//diferenciando minusculas e maiusculas
		if (senha.equals("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null,"Teste 1: Acesso Autorizado!");
		}else {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesse negado!");
		}
		//sem diferenciação de minuscula e maiuscula
		if (senha.equalsIgnoreCase("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null,"Teste 2: Acesso Autorizado!");
		}else {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesse negado!");
		}
	}

}
