package br.com.fiap;

public class radio {
	//atributos
	public int volume;
	public float estacao;
	
	//métodos
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	public void trocarEstacao(float e) {
		estacao = e;
	}
	public void mostrar() {
		System.out.println("Volume atual: " + volume);
		System.out.println("Estação atual: " + estacao);
	}
}