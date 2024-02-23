package br.com.fiap;

public class UsaRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radio radio1 = new radio();
		
		radio1.volume = 5;
		radio1.estacao = 89.5f;
		
		
		radio1.aumentarVolume();
		radio1.trocarEstacao(30.8f);
		radio1.mostrar();
		
		radio1.trocarEstacao(92.5f);
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.mostrar();
		
	}

}
