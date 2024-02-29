package br.com.fiap;

import java.util.Scanner;

public class AreaRetangulo {
        public static void main(String[] args) {
        		// TODO Auto-generated method stub
            FolhaDePagamento folhaDePagamento1 = new FolhaDePagamento();
        		double salarioBruto, valorPlanoDeSaude,descontoINSS,salarioLiq;
            int numeroDeDependentes;
        		Scanner scan;
        		try {
        			scan = new Scanner(System.in);
        			System.out.println("Digite o salário bruto: ");
        			salarioBruto = scan.nextDouble();
              System.out.println("Digite o número de dependentes: ");
              numeroDeDependentes = scan.nextInt();
              System.out.println("Digite a porcentagem de desconto do INSS: ");
              descontoINSS = scan.nextDouble();
              System.out.println("Digite o valor do plano de saúde: ");
              valorPlanoDeSaude = scan.nextDouble();
              folhaDePagamento1.salarioBruto = salarioBruto;
          		folhaDePagamento1.valorPlanoDeSaude = valorPlanoDeSaude;
          	  folhaDePagamento1.descontoINSS = descontoINSS;
          		folhaDePagamento1.numeroDeDependentes = numeroDeDependentes;
              salarioLiq = folhaDePagamento1.calcularSalarioLiquido();
        			System.out.println("As informações são: \nSalarioBruto: "+ salarioBruto + "\nValor do plano de Saúde:");
              System.out.println(valorPlanoDeSaude + "\nDesconto do INSS: " + descontoINSS + "\nNumero de dependentes: ");
              System.out.println(numeroDeDependentes + "\nSalário Liquido: " salarioLiq)
        		} catch (Exception e) {
        			// TODO: handle exception
        			System.out.println("Formato incorreto do número");
            }
    }
}
