package br.com.fiap;

public class FolhaDePagamento {

	public double salarioBruto, valorPlanoDeSaude,descontoINSS;
	public int numeroDeDependentes;
	
	
	public double calcularSalarioLiquido() {
		double salarioLiquido = salarioBruto - (salarioBruto / 100 * descontoINSS) - valorPlanoDeSaude * numeroDeDependentes;
		return salarioLiquido;
	}
}
