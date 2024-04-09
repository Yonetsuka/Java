package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class VerData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1,data2,formatoUSA;
		LocalDate dataInicial,dataFinal;
		try {
			data1 = JOptionPane.showInputDialog("Digite uma data incial: ");
			data2 = JOptionPane.showInputDialog("Digite uma data final: ");
			
			formatoUSA = data1.substring(6,10);
			formatoUSA += "-" + data1.substring(3,5);
			formatoUSA += "-" + data1.substring(0,2);
			dataInicial = LocalDate.parse(formatoUSA);
			formatoUSA = data2.substring(6,10);
			formatoUSA += "-" + data2.substring(3,5);
			formatoUSA += "-" + data2.substring(0,2);
			dataFinal = LocalDate.parse(formatoUSA);
			Period periodo = Period.between(dataInicial, dataFinal);
			JOptionPane.showMessageDialog(null, "Data inicial: "+ data1 +
				"\n" + "Data final: " + data2 + "\n"
				+ "Entre as datas fornecidas existem " + periodo.getYears()
				+ "anos, " + periodo.getMonths() + "meses, " + periodo.getDays()
				+ "dia(s).");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
	}

}
