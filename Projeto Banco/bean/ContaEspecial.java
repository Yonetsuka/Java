package br.com.fiap.bean;
/**
*
* @author Cássio
*
**/
import javax.swing.JOptionPane;

public class ContaEspecial implements ContaBancaria{
  private int numConta;
  private float saldo,limite;

  public ContaEspecial(){}

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
  public float getLimite(){
    return limite;
  }
  public void setLimite(float limite){
    this.limite = limite;
  }

  public float sacar(float valor){
    try{
      if(valor <= saldo){
        saldo -= valor;
      }else{
        throw new Exception("Saldo inválido");
      }
    }catch(exception e){
      JOptionPane.showMessageDialog(null,e.getMesseage());
    }
    return saldo;
  }
  public float depositar(float valor){
    saldo += valor;
    return saldo;
  }
}
