package br.com.fiap;

public class UsarradioEncapsulado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioEncapsulado radio1 = new RadioEncapsulado();
		
		radio1.setEstacao(85.1f);
		radio1.setVolume(90);
		radio1.mostrar();
		
		radio1.setEstacao(95.2f);
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.mostrar();
	}

}
