package br.com.fiap;

public class UsaEleitor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eleitor eleitor1 = new Eleitor();
		Eleitor eleitor2 = new Eleitor();
		eleitor1.setNome("Rodrigo");
		eleitor1.setAnoNascimento(1945);
		eleitor1.setNumTitulo(4);
		eleitor1.setZona(52);
		eleitor1.setSecao(5);
		eleitor2.setNome("Lourenzo");
		eleitor2.setAnoNascimento(2003);
		eleitor2.setNumTitulo(86);
		eleitor2.setZona(13);
		eleitor2.setSecao(7);
		System.out.println("O nome do primeiro eleitor é " +  eleitor1.getNome() +
				", \nele possui " + eleitor1.calculaIdade(2024) + " anos, \ntem o numero de titulo "
				+ eleitor1.getNumTitulo() + ", \né da zona " + eleitor1.getZona() + " \ne da seção " +
				eleitor1.getSecao());
		System.out.println("\nO nome do segundo eleitor é " +  eleitor2.getNome() +
				", \nele possui " + eleitor2.calculaIdade(2024) + " anos, \ntem o numero de titulo "
				+ eleitor2.getNumTitulo() + ", \né da zona " + eleitor2.getZona() + " \ne da seção " +
				eleitor2.getSecao());
	}

}
