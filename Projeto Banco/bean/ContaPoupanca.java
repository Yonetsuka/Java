package br.com.fiap;
/**
*
* @author Cássio
* @version 1.0
*
**/
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
  /**
  * permite sacar o valor informado
  * valor não pode ser maior que o valor de saldo
  * @author Cássio
  * @param float valor - valor indicado a ser sacado
  * @return float - valor do saldo(ataulizado)
  **/
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

  /**
  * permite depositar o valor informado
  * @author Cássio
  * @param float valor - valor indicado a ser sacado
  * @return float - valor do saldo(ataulizado)
  **/
  public float depositar(){
    saldo += valor;
    return valor;
  }
}
