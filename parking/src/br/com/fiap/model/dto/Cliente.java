package br.com.model.dto;
public class CLiente{
  private int idCliente;
  private String nomeCliente, placa;

  public Cliente(){}

  public int getIdCLiente(){
    return idCliente;
  }
  public void setIdCliente(int idCliente){
    this.idCliente = idCliente;
  }

  public String getNomeCliente(){
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente){
    this.nomeCliente = nomeCliente;
  }

  public String getPlaca(){
    return placa;
  }
  public void setPlaca(String placa){
    this.placa = placa;
  }
}
