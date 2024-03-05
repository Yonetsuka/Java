package br.com.fiap;

public class RadioEncapsulado {
	private int volume;
	private float estacao;
	//get e set
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		//this.volume = volume;
		try {
			if (volume <= 100 && volume >= 0) {
				this.volume = volume;
			}
			else {
				throw new Exception("Volume fora da faixa permitida (0 a 100)");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public float getEstacao() {
		return estacao;
	}

	public void setEstacao(float estacao) {
		//this.estacao = estacao;
		try {
			if (estacao >= 80.0f && estacao <= 105.0f) {
				this.estacao = estacao;
			}
			else {
				throw new Exception("Volume fora da faixa permitida (0 a 100)");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	//métodos
	public void aumentarVolume() {
		if (volume < 100) {
			volume ++;
		}
	}
	
	public void DiminuirVolume() {
		if (volume > 0) {
			volume --;
		}
	}
	
	public void mostrar() {
		System.out.println("Volume: " + volume + "\nEstação: " + estacao);
	}
}
