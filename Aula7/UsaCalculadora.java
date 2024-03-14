package from br.com.fiap

import java.util.Scanner;

public class UsaCalculadora(){
	public static void main(String[] args){
		while True(){
			Calculadora calculadora = new Calculadora();
			Scanner scan;
			int resposta, num1, num2;
			try{
				System.out.println(Somar(1));
				System.out.println(Subtrair(2));
				System.out.println(Multiplicar(3));
				System.out.println(Dividir(4));
				resposta = scan.nextInt();
				if(reposta == 1){
					System.out.println("Digite o primeiro número: ");
					calculadora.setNum1(scan.nextInt());
					System.out.println("Digite o segundo número(não pode ser menor ou igual a zero): ");
					calculadora.setNum2(scan.nextint());
					calculadora.soma(calculadora.getNum1,calculadora.getNum2);
				}
				else if(reposta == 2){
					System.out.println("Digite o primeiro número: ");
					calculadora.setNum1(scan.nextInt());
					System.out.println("Digite o segundo número(não pode ser menor ou igual a zero): ");
					calculadora.setNum2(scan.nextint());
					calculadora.subtracao(calculadora.getNum1,calculadora.getNum2);
				}
				else if(reposta == 3){
					System.out.println("Digite o primeiro número: ");
					calculadora.setNum1(scan.nextInt());
					System.out.println("Digite o segundo número(não pode ser menor ou igual a zero): ");
					calculadora.setNum2(scan.nextint());
					calculadora.multiplicacao(calculadora.getNum1,calculadora.getNum2);
				}
				else if(reposta == 4){
					System.out.println("Digite o primeiro número: ");
					calculadora.setNum1(scan.nextInt());
					System.out.println("Digite o segundo número(não pode ser menor ou igual a zero): ");
					calculadora.setNum2(scan.nextint());
					calculadora.divisao(calculadora.getNum1,calculadora.getNum2);
				}
				else{
					throw new Exception("Opção inválida")
				}
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}