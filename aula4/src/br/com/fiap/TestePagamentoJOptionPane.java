package br.com.fiap;

import javax.swing.JOptionPane;

public class TestePagamentoJOptionPane {
        public static void main(String[] args) {
        		// TODO Auto-generated method stub
        		FolhaDePagamento folhaDePagamento1 = new FolhaDePagamento();
        		double salarioBruto, valorPlanoDeSaude,descontoINSS,salarioLiq;
            int numeroDeDependentes;
        		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o salario bruto: ");
			salarioBruto = Double.parseDouble(aux);
      aux = JOptionPane.showInputDialog("Digite o valor do plano de saúde: ");
      valorPlanoDeSaude = Double.parseDouble(aux);
      aux = JOptionPane.showInputDialog("Digite o valor da porcentagem de desconto do INSS: ");
      descontoINSS = Double.parseDouble(aux);
      aux = JOptionPane.showInputDialog("Digite o numero de dependentes: ");
			numeroDeDependentes = Integer.parseInt(aux);
      folhaDePagamento1.salarioBruto = salarioBruto;
      folhaDePagamento1.valorPlanoDeSaude = valorPlanoDeSaude;
      folhaDePagamento1.descontoINSS = descontoINSS;
      folhaDePagamento1.numeroDeDependentes = numeroDeDependentes;
      salarioLiq = folhaDePagamento1.calcularSalarioLiquido();
			JOptionPane.showMessageDialog(null, "O salário bruto é: " + salarioBruto);
      JOptionPane.showMessageDialog(null, "O valor do plano de saúde é: " + valorPlanoDeSaude);
      JOptionPane.showMessageDialog(null, "A porcentagem de desconto é: " + descontoINSS + "%");
      JOptionPane.showMessageDialog(null, "O número de dependentes é: " + numeroDeDependentes);
      JOptionPane.showMessageDialog(null, "O salário líquido é: " + salarioLiq);
		} catch (Exception e) {
			// TODO: handle exception
      JOptionPane.showMessageDialog(null, "Formato incorreto do número");
		}
	}

}
