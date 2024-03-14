package br.com.fiap;

public class Calculadora {
	private int num1,num2;
	
	public int getNum1(){
		return num1;
	}
	
	public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public void getNum2(){
		return num2;
	}
	
	public void setNum2(int num2){
		try {
			if (num2 > 0) {
				this.num2 = num2;
			}
			else {
				throw new Exception("Numero 2 menor que zero");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public void  soma(int num1, int num2){
		System.out.println("A soma dos numeros 1 e 2 é: " + (num1 + num2));
	}
	public void  subtracao(int num1, int num2){
		System.out.println("A subtração dos numeros 1 e 2 é: " + (num1 - num2));
	}
	public void multiplicacao(int num1, int num2){
		System.out.println("A multiplicação dos numeros 1 e 2 é: " + (num1 * num2));
	}
	public void divisao(){
		System.out.println("A divisão dos numeros 1 e 2 é: " + (num1 / num2));
	}
}