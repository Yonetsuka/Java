package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Geometria{
  private float lado, altura;
  private double raio;
  //construtor vazio
  public Geometria(){
    
  }
  public float GetLado(){
    return lado;
  }
  public void SetLado(float lado){
    this.lado = lado;
  }
  public float GetAltura(){
    return altura;
  }
  public void SetAltura(float altura){
    this.altura = altura;
  }
  public double GetRaio(){
    return raio;
  }
  public void SetRaio(double raio){
    this.raio = raio;
  }
  //métodos da classe
  public void calculaArea(float lado){
    setLado(lado);
    float area = this.lado * this.lado;
    JOptionPane.showMessageDialog(null,"Área do quadrado é " + area);
  }
  public void calculaArea(float lado, float altura){
    setLado(lado);
    setAltura(altura);
    float area = this.lado * this.altura;
    JOptionPane.showMessageDialog(null,"Área do retângulo é " + area);
  }
  public void calculaArea(double raio){
    setRaio(raio);
    final double PI = 3,1416;
    double area = PI * math.pow(this.raio,2);
    JOptionPane.showMessageDialog(null,"Área do círculo é " + area);
  }
}
