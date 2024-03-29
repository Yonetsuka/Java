package br.com.fiap

public class ArCondicionado{
	//variáveis
	private int temperatura;
	private String modo;
	//gets e sets
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		try {
			if (volume <= 26 && volume >= 15) {
				this.temperatura = temperatura;
			}
			else {
				throw new Exception("Temperatura fora da faixa permitida (15 a 26)");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public String getModo() {
		return modo;
	}
	public void setModo(int modo) {
		try {
			if (modo.equals("Ventilar") || modo.equals("Aquecer") || modo.equals("Resfriar") ) {
				this.modo = modo;
			}
			else {
				throw new Exception("Modo não identificado");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	//voids
	public void aumentarTemperattura(){
		if(temperatura < 26){
			temperatura ++;
		}
	}
	public void diminuirTemperattura(){
		if(temperatura > 15){
			temperatura --;
		}
	}
	public void trocarModo(String modo){
		try {
			if (modo.equals("Ventilar") || modo.equals("Aquecer") || modo.equals("Resfriar") ) {
				this.modo = modo;
			}
			else {
				throw new Exception("Modo não identificado");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void mostrar(){
		System.out.println("Temperatura: " + temperatura + "\nModo: " + modo);
	}
}
