package br.com.fiap.model.dto;

public class Treinamento{
  private int treinamentoID, idMedico;
  private String titulo;
  private String status;

  public int getTreinamentoID(){
    return treinamentoID;
  }
  public void setTreinamentoID(int treinamentoID){
    this.treinamentoID = treinamentoID;
  }

  public int getIdMedico(){
    return idMedico;
  }

  public void setIdMedico(int idMedico){
    this.idMedico = idMedico;
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
