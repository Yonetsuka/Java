package br.com.fiap;

public class ArCondicionado {
	int temperatura;
	String modo;

	public void  aumentarTemperatura(){
		temperatura++;
	}
	public void  diminuirTemperatura(){
		temperatura--;
	}
	public void trocarModo(String mode){
		modo = mode;
	}
	public void mostrar(){
		System.out.println("Modo: "+modo+ "Temperatura: " + temperatura + "C°")
	}
}
