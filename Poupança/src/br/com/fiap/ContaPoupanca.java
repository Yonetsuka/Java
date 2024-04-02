package br.com.fiap;

public class ContaPoupanca {
	private int numConta;
	private String donoConta;
	private float saldoConta;
	
	public ContaPoupanca() {
		
	}
	public ContaPoupanca(int numConta, String donoConta, float saldoConta) {
		this.numConta = numConta;
		this.donoConta = donoConta;
		this.saldoConta = saldoConta;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getDonoConta() {
		return donoConta;
	}
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}
	public float getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public void realizaSaque(float valor) {
		try {
			if(valor > saldoConta) {
				throw new Exception("Valor de saque maior que o saldo");
			}
			else {
				saldoConta -= valor;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void realizaDeposito(float valor) {
		saldoConta += valor;
	}
}
