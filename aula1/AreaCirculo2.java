package br.com.fiap;

import javax.swing.JOptionPane;

public class AreaCirculo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int raio = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o raio do círculo: ");
			raio = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "A área do círculo é: " + (Math.PI * (raio * raio)));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
