package br.com.fiap;

public class UsaTelevisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor televisor1 = new Televisor();
		
		televisor1.volume = 8;
		televisor1.canal = 45;		
		televisor1.mostrar();
		
		televisor1.trocarCanal(902);
		televisor1.aumentarVolume();
		televisor1.aumentarVolume();
		televisor1.aumentarVolume();
		televisor1.mostrar();
		
	}

}
