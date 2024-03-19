package br.com.fiap;

public class usaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Astrogildo");
		pessoa1.setAnoNascimento(1988);
		int idade = pessoa1.calculaIdade(2024);
		System.out.println("Nome " + pessoa1.getNome());
		System.out.println("Idade " + idade);
	}

}
