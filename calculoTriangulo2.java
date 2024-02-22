package br.com.fiap;

import javax.swing.JOptionPane;

public class calculoTriangulo2{
  int base = 0, altura = 0;
	String aux;
  try {
			aux = JOptionPane.showInputDialog("Digite a base do triângulo: ");
			base = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a altura do triângulo: ");
			altura = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "A área do triângulo é: " + ((base * altura) / 2));
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Formato incorreto do número");
		}
	}

}
