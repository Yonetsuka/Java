package br.com.fiap;

import java.util.Scanner;

public class calculoTrapezio2{
  public static void main(String[] args) {
    int baseMaior = 0, baseMenor = 0, altura = 0;
    String aux;
	try {
		aux = JOptionPane.showInputDialog("Digite a base maior do trapézio: ");
		baseMaior = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Digite a base menor do trapézio: ");
		baseMenor = Integer.parseInt(aux);
    aux = JOptionPane.showInputDialog("Digite a altura do trapézio: ");
		altura = Integer.parseInt(aux);
		JOptionPane.showMessageDialog(null, "A área do trapézio é: " + ((BaseMaior + baseMenor) * altura) / 2);
	} catch (Exception e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "Formato incorreto do número");
	}
	}
	
}
