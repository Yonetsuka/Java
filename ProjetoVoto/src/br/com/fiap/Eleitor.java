package br.com.fiap;

import java.time.LocalDate;

public class Eleitor {
	//variáveis
	private String nome;
	private int anoNascimento, numTitulo, zona, secao;
	//construtor vazio
	public Eleitor() {
		
	}
	public Eleitor(String nome,int anoNascimento,int numTitulo, int zona, int secao) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.zona = zona;
		this.secao = secao;
	}
	//gets e sets
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
		//this.anoNascimento = anoNascimento;
		try{
			int anoAtualMenos16 = LocalDate.now().getYear() - 16;
			if (anoNascimento <= anoAtualMenos16 && anoNascimento >= 1900) {
				this.anoNascimento = anoNascimento;
			}
			else {
				throw new Exception("Ano de nascimento fora da faixa permitida");
			}
		}catch{
			System.out.println(e.getMessage());
		}
	}
	public int getNumTitulo() {
		return numTitulo;
	}
	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	//void
	public int calculaIdade(int anoAtual){
		return anoAtual - anoNascimento;
	}
	
}
