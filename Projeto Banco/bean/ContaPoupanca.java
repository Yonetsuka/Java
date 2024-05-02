package br.com.fiap;

public class ContaPoupanca implements ContaBancaria{
  private int numConta;
  private float saldo;

  public ContaPoupanca(){}
  //gets e sets
  public int getNumConta(){
    return numConta;
  }
  public void setNumConta(int numConta){
    this.numConta = numConta;
  }
  public float getSaldo(){
    return saldo;
  }
  public void setSaldo(float saldo){
    this.saldo = saldo;
  }
  //métodos
  public float sacar(float valor){
    try{
      if(valor <= saldo){
        saldo -= valor;
      }else{
        throw new Exception("Saldo inválido");
      }
    }catch(Exception e){
      Suystem.out.println(e.getMessage());
    }
    return saldo;
  }

  public float depositar(){
    saldo += valor;
    return valor;
  }
}
