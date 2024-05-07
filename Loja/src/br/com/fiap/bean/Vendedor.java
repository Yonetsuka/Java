package br.com.fiap.bean;
/**
 * 
 * @author Cássio
 *
 */

public class Vendedor implements Funcionario{
	//variáveis 
	private String nome;
	private float valorHoraTrabalho,comissao;
	//gets e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHoraTrabalho() {
		return valorHoraTrabalho;
	}
	public void setValorHoraTrabalho(float valorHoraTrabalho) {
		this.valorHoraTrabalho = valorHoraTrabalho;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	//método
	/**
	 * Calcula o salário do vendedor
	 */
	public float calcularSalario() {
		float salario = (((valorHoraTrabalho * 40) * 4) * (1 + comissao/100));
		return salario;
	}
}
