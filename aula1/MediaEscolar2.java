package br.com.fiap;

import javax.swing.JOptionPane;

public class MediaEscolar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a primeira nota: ");
			nota1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a segunda nota: ");
			nota2 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a terceira nota: ");
			nota3 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a quarta nota: ");
			nota4 = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "Media: " + ((nota1 + nota2 +nota3 + nota4) / 4 ));
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Formato incorreto do número");
		}
	}

}
