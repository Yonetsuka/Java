package br.com.fiap.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Gestante;

public class UsaGestante {

	public static void main(String[] args) {
		Gestante gravida1;
		String nome, data1, dataFormatada, dataBrasil;
		LocalDate dataDaGestacao;
		try {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			data1 = JOptionPane.showInputDialog("Digite inicio da gestacao");
			dataFormatada = data1.substring(6, 10);
			dataFormatada += "-" + data1.substring(3, 5);
			dataFormatada += "-" + data1.substring(0, 2);
			dataDaGestacao = LocalDate.parse(dataFormatada);
			gravida1 = new Gestante(nome, dataDaGestacao);
			JOptionPane.showMessageDialog(null, gravida1.getDataDaGestacao());
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			dataBrasil = gravida1.getDataDaGestacao().format(dtf);
			JOptionPane.showMessageDialog(null, "Exibindo informacoes"
					+ "\nNome: " + gravida1.getNome()
					+ "\nData da gestacao: " + dataBrasil
					+ "\nTempo de gestacao: " + gravida1.tempoDeGestacao() + " meses");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
