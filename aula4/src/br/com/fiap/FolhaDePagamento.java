package br.com.fiap;

public class FolhaDePagamento {

	double salarioBruto, valorPlanoDeSaude;
	int numeroDeDependentes;
	
	public static double descontoINSS(double numero, double porcentagem) {
        return (porcentagem / 100) * numero;
	}
	
	public double calcularSalarioLiquido() {
		double salarioLiquido = salarioBruto - descontoINSS(salarioBruto, 10) - valorPlanoDeSaude * numeroDeDependentes;
		return salarioLiquido;
	}
}
