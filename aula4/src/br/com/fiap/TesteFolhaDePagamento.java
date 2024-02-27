package br.com.fiap;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salarioLiq;
		FolhaDePagamento folhaDePagamento1 = new FolhaDePagamento();
		
		folhaDePagamento1.salarioBruto = 5000;
		folhaDePagamento1.valorPlanoDeSaude = 50;
		folhaDePagamento1.numeroDeDependentes = 2;
		
		salarioLiq = folhaDePagamento1.calcularSalarioLiquido();
		System.out.println("Seu salário líquido é: "+ salarioLiq);
	}

}
