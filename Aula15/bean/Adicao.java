package br.com.fiap.main;

public class Adicao{
  private int numInteiro1, numInteiro2;
  private double numReal1, numReal2;
  //contrutor vazio
  public Adicao(){
    
  }
  // gets e sets
  public int GetNumInteiro1(){
    return numInteiro1;
  }
  public void SetNumInteiro1(int numInteiro1){
    this.numInteiro1 = numInteiro1;
  }
  public int GetNumInteiro2(){
    return numInteiro2;
  }
  public void SetNumInteiro2(int numInteiro2){
    this.numInteiro2 = numInteiro2;
  }
  public double GetNumReal1(){
    return numReal1;
  }
  public void SetNumReal1(double numReal1){
    this.numReal1 = numReal1;
  }
  public double GetNumReal2(){
    return numReal2;
  }
  public void SetNumReal2(double numReal2){
    this.numReal2 = numReal2;
  }
  // métodos da classe
  public int soma(int num1, int num2){
    int soma = num1 + num2;
    return soma;
  }
  puublic double soma(double num1, double num2){
    double soma = num1 + num2;
    return soma;
  }
}
