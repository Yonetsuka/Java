package br.com.fiap.bean;

public class Calculadora{
  private float numero1, numero2;

  public Calculadora(){}

  public float GetNumero1(){
    return numero1;
  }
  public void SetNumero1(float numero1){
    this.numero1 = numero1;
  }
  public float GetNumero2(){
    return numero2;
  }
  public void SetNumero2(float numero2){
    this.numero1 = numero2;
  }
  public float adicao(){
    float resultado = numero1 + numero2;
    return resultado;
  }
  public float subtracao(){
    float resultado = numero1 - numero2;
    return resultado;
  }
  public float multiplicacao(){
    float resultado = numero1 * numero2;
    return resultado;
  }
  public float divisao(){
    if(numero2 == 0){
      num2igual0Exception("Não se pode dividir por zero")
    }
    float resultado = numero1 / numero2;
    return resultado;
  }
}
