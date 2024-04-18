package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Gestante {
	private String nome;
	private LocalDate dataDaGestacao;
	
	public Gestante() {}

	public Gestante(String nome, LocalDate dataDaGestacao) {
		this.nome = nome;
		setDataDaGestacao(dataDaGestacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDaGestacao() {
		return dataDaGestacao;
	}

	public void setDataDaGestacao(LocalDate dataDaGestacao) {
		try {
			LocalDate dataAtual = LocalDate.now();
			Period periodo = Period.between(dataDaGestacao, dataAtual);
			int ano = periodo.getYears();
			int meses = periodo.getMonths();
			if (ano == 0 && meses <= 9) {
				this.dataDaGestacao = dataDaGestacao;
			} else {
				throw new Exception("Data invalida!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); //encerrando o programa após o erro
		}		
	}
	
	public int tempoDeGestacao() {
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataDaGestacao, dataAtual);
		return periodo.getMonths();
	}
}
