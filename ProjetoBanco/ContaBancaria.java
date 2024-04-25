package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class ContaBancaria{
  private String cliente;
  private int numConta;
  private float saldo;

  public ContaBancaria(){
    
  }
  public ContaBancaria(String cliente, int numConta, float saldo){
    this.cliente = cliente;
    this.numConta = numConta;
    this.saldo = saldo;
  }

  public String getCliente(){
    return cliente;
  }
  public void setCliente(String cliente){
    this.cliente = cliente;
  }
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

  public float sacar(float valor){
    try{
      if(valor <= saldo){
        saldo = saldo - valor;
        JOptionPane.showMessageDialog(null, "Saldo atual:" + saldo);
      }
      else{
        throw new Exception("Valor inválido");
      }
      catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
      }
    }
  public float depositar(float valor){
    saldo = saldo + valor;
    JOptionPane.showMessageDialog(null, "Saldo atual:" + saldo);
  }
}
