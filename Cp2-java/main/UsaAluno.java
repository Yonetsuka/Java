//Nome: Cássio Eid Kobayashi Yonetsuka Rm:99678
//Nome: Allan Von Ivanov Rm:98705
package br.com.fiap.main;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import br.com.fiap.bean.Aluno;
import java.time.Period;

public class UsaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gerando variáveis
		Period periodo;
		String aux,nome,formatoUSA;
		int rm;
		LocalDate dataNasc, dataAtual;
		dataAtual = LocalDate.now();
		//instanciando com construtor vazio
		Aluno aluno1, aluno2 = new Aluno();
		//instanciando com construtor com passagem de parâmetros
		aux = "2005-10-25";
		dataNasc = LocalDate.parse(aux);
		Aluno aluno3 = new Aluno(99678,"Cássio Yonetsuka",dataNasc);
		aux = "2005-06-22";
		dataNasc = LocalDate.parse(aux);
		Aluno aluno4 = new Aluno(98705,"Allan Von Ivanov",dataNasc);
		//pedindo as informações aos usuários
		//aluno 1
		nome = JOptionPane.showInputDialog("Digite o nome do aluno1: ");
		aux =  JOptionPane.showInputDialog("Digite o rm do aluno1: ");
		rm = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Digite a data de nascimento\n(Separe com /): ");
		formatoUSA = aux.substring(6,10);
		formatoUSA += "-" + aux.substring(3,5);
		formatoUSA += "-" + aux.substring(0,2);
		dataNasc = LocalDate.parse(formatoUSA);
		aluno1 = new Aluno(rm,nome,dataNasc);
		//aluno 2
		nome = JOptionPane.showInputDialog("Digite o nome do aluno2: ");
		aux =  JOptionPane.showInputDialog("Digite o rm do aluno2: ");
		rm = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Digite a data de nascimento\n(Separe com /): ");
		formatoUSA = aux.substring(6,10);
		formatoUSA += "-" + aux.substring(3,5);
		formatoUSA += "-" + aux.substring(0,2);
		dataNasc = LocalDate.parse(formatoUSA);
		aluno2 = new Aluno(rm,nome,dataNasc);
		JOptionPane.showMessageDialog(null, "Lista de alunos:");
		aux = aluno1.calculaIdadeCompleta(dataAtual);
		periodo = Period.parse(aux);
		JOptionPane.showMessageDialog(null, "Aluno1\nNome: " + aluno1.getNome()+
				"\nRM: " + aluno1.getRm() + "\nData de nascimento: " + 
				periodo.getYears() + " anos, " + periodo.getMonths() + " meses, "
				+ periodo.getDays() + " dias.");
		aux = aluno2.calculaIdadeCompleta(dataAtual);
		periodo = Period.parse(aux);
		JOptionPane.showMessageDialog(null, "Aluno2\nNome: " + aluno2.getNome()+
				"\nRM: " + aluno2.getRm() + "\nData de nascimento: " + 
				periodo.getYears() + " anos, " + periodo.getMonths() + " meses, "
				+ periodo.getDays() + " dias.");
		aux = aluno3.calculaIdadeCompleta(dataAtual);
		periodo = Period.parse(aux);
		JOptionPane.showMessageDialog(null, "Aluno3\nNome: " + aluno3.getNome()+
				"\nRM: " + aluno3.getRm() + "\nData de nascimento: " + 
				periodo.getYears() + " anos, " + periodo.getMonths() + " meses, "
				+ periodo.getDays() + " dias.");
		aux = aluno4.calculaIdadeCompleta(dataAtual);
		periodo = Period.parse(aux);
		JOptionPane.showMessageDialog(null, "Aluno4\nNome: " + aluno4.getNome()+
				"\nRM: " + aluno4.getRm() + "\nData de nascimento: " + 
				periodo.getYears() + " anos, " + periodo.getMonths() + " meses, "
				+ periodo.getDays() + " dias.");
		
	}

}
