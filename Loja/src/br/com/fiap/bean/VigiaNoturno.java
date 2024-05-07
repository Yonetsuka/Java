package br.com.fiap.bean;
/**
 * 
 * @author Cássio
 *
 */
public class VigiaNoturno implements Funcionario{
	//atributos/variáveis
	private String nome;
	private float valorHoraTrabalho, adicionalNoturno;
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
	public float getAdicionalNoturno() {
		return adicionalNoturno;
	}
	public void setAdicionalNoturno(float adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	//método
	/**
	 * calcula o salário do vigia noturno
	 */
	public float calcularSalario() {
		float salario = ((valorHoraTrabalho * 40) * 4 + adicionalNoturno);
		return salario;
	}
}
