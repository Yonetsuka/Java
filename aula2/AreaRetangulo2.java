package br.com.fiap;

import javax.swing.JOptionPane;

public class AreaRetangulo2 {
        public static void main(String[] args) {
        		// TODO Auto-generated method stub
        		int ladoMaior = 0, ladoMenor = 0;
        		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o lado maior: ");
			ladoMaior = Integer.parseInt(aux);
      aux = JOptionPane.showInputDialog("Digite o lado menor: ");
      ladoMenor = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "A área do retângulo é: " + (ladoMaior * ladoMenor));
		} catch (Exception e) {
			// TODO: handle exception
      JOptionPane.showMessageDialog(null, "Formato incorreto do número");
		}
	}

}
