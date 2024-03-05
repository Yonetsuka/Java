package br.com.fiap;

public class UsaTelevisorEncapsulado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelevisorEncapsulado televisor1 = new TelevisorEncapsulado();
		
		televisor1.getCanal();
		televisor1.getVolume();
		
		televisor1.setCanal(5);
		televisor1.setVolume(12);
		televisor1.mostrar();
		
		televisor1.setCanal(40);
		televisor1.setVolume(50);
		televisor1.mostrar();
	}

}
