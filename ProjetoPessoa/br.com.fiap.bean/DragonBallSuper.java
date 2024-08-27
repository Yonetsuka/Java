package br.com.fiap.bean;

public class DragonBallSuper implements IDBSuper{
  public String Nome;
  public int Ki,Tecnicas,Velocidade,Transformacoes;

  public DragonBallSuper(){}

  public String getNome(){
    return Nome;
  }
  public void setNome(String Nome){
    this.Nome = Nome;
  }

  public int getKi(){
    return Ki;
  }
  public void setKi(int Ki){
    this.Ki = Ki;
  }

  public int getTecnicas(){
    return Tecnicas;
  }
  public void setTecnicas(int Tecnicas){
    this.Tecnicas = Tecnicas;
  }

  public int getVelocidade(){
    return Velocidade;
  }
  public void setVelocidade(int Velocidade){
    this.Velocidade = Velocidade;
  }

  public int getTransformacoes(){
    return Transformacoes;
  }
  public void setTransformaccoes(int Transformacoes){
    this.Transformacoes = Transformacoes;
  }

  
}
