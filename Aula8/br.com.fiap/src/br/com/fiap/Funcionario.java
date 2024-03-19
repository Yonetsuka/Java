package br.com.fiap;

public class Funcionario {
	private String nome;
	private float valorHora;
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	//funções
	
	public float salario(int horasSemana) {
		float ValorSemana = horasSemana * valorHora;
		float Total = ValorSemana * 4;
		return Total;
	}
}
