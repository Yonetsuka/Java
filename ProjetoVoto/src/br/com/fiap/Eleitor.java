package br.com.fiap;

public class Eleitor {
	//variáveis
	private String nome;
	private int anoNascimento, numTitulo, zona, secao;
	//construtor vazio
	public Eleitor() {
		
	}
	public Eleitor(String nome,int anoNascimeto,int numTitulo, int zona, int secao) {
		this.nome = nome;
		this.anoNascimeto = anoNascimeto;
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
		if (anoNascimento - 16 < 2024 && anoNascimento >= 1900) {
			this.anoNascimento = anoNascimento;
		}
		else {
			System.out.println("Ano de nascimento fora da faixa permitida");
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
