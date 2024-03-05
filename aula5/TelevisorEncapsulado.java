package br.com.fiap;

public class TelevisorEncapsulado {
	//variáveis
	private int volume;
	private int canal;
	
	//gets e sets
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		//this.volume = volume;
		try {
			if (volume <= 20 && volume >= 0) {
				this.volume = volume;
			}
			else {
				throw new Exception("Volume fora da faixa permitida (0 a 20)");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		//this.canal = canal;
		try {
			if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
				this.canal = canal;
			}
			else {
				throw new Exception("Canal fora da lista permitida(2,4,5,7,13)");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	//voids
	public void aumentarVolume() {
		if (volume < 20) {
			volume ++;
		}
	}
	
	public void diminuirVolume() {
		if (volume > 0) {
			volume --;
		}
	}
	
	public void mostrar() {
		System.out.println("Volume: " + volume + "\nCanal: " + canal);
	}
	
}
