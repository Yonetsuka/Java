package br.com.fiap;

public class Pessoa {
	private String nome;
	private int anoNascimento;
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	//voids e funções
	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}
		
	
}
