package br.com.fiap;

import javax.swing.JOptionPane;

public class VerIdade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anoPr = 0, anoNa = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o ano de agora: ");
			anoPr = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o ano que você nasceu: ");
			anoNa = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "Você possui" + (anoPr - anoNa));
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Formato incorreto do número");
		}
	}

}
