package br.com.fiap.model.dto;

public class Treinamento{
  private int treinamentoID;
  private String titulo;
  private String status;

  public int getTreinamentoID(){
    return treinamentoID;
  }
  public void setTreinamentoID(int treinamentoID){
    this.treinamentoID = treinamentoID;
  }

  public String getTitulo(){
    return titulo;
  }
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public String getStatus(){
    return status;
  }
  public void setStatus(String status){
    this.status = status;
  }
}
