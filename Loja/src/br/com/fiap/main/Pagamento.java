package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.bean.VigiaNoturno;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.Freelancer;

public class Pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux,escolha = "sim";
		String nome;
		int opcao;
		float valorHoraTrabalho,comissao,adicionalNoturno,salario;
		
		while(escolha.equalsIgnoreCase("sim")) {
			try {
				nome = JOptionPane.showInputDialog("Digite o seu nome: ");
				aux = JOptionPane.showInputDialog("Digite o valor que você recebe por hora: ");
				valorHoraTrabalho = Float.parseFloat(aux);
				aux = JOptionPane.showInputDialog("Escolha o tipo de funcionário que você é:  "
						+ "\n(1)Vigia Noturno \n(2)Vendedor \n(3)Freelancer");
				opcao = Integer.parseInt(aux);
				switch(opcao) {
					case 1:
						aux = JOptionPane.showInputDialog("Digite o adicional que você ganha: ");
						adicionalNoturno = Float.parseFloat(aux);
						VigiaNoturno VN = new VigiaNoturno();
						VN.setNome(nome);
						VN.setValorHoraTrabalho(valorHoraTrabalho);
						VN.setAdicionalNoturno(adicionalNoturno);
						salario = VN.calcularSalario();
						JOptionPane.showMessageDialog(null, "Dados do funcionário"
								+"\nNome: " + nome + "\nSalário: " + salario);
						break;
					case 2:
						aux = JOptionPane.showInputDialog("Digite o adicional que você ganha da comissão: ");
						comissao = Float.parseFloat(aux);
						Vendedor V = new Vendedor();
						V.setNome(nome);
						V.setValorHoraTrabalho(valorHoraTrabalho);
						V.setComissao(comissao);
						salario = V.calcularSalario();
						JOptionPane.showMessageDialog(null, "Dados do funcionário"
								+"\nNome: " + nome + "\nSalário: " + salario);
						break;
					case 3:
						Freelancer FL = new Freelancer();
						FL.setNome(nome);
						FL.setValorHoraTrabalho(valorHoraTrabalho);
						salario = FL.calcularSalario();
						JOptionPane.showMessageDialog(null, "Dados do funcionário"
								+"\nNome: " + nome + "\nSalário: " + salario);
						break;
				}
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			opcao = JOptionPane.showConfirmDialog(null,"Deseja continuar ?","Atenção:",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(opcao == 1) {
				break;
			}
		}
		JOptionPane.showMessageDialog(null,"Fim de programa!");
	}

}
