package br.com.fiap.dao;

import java.sql.Connection;

public class CarroDAO{
  private Connection con;

  public CarroDAO(Connection con){
    this.con = con;
  }
  public Connection getCon(){
    return con;
  }
  public String inserir(Carro carro){
    String sql = "insert into ddd_carro (placa,cor,descricao) values(?,?,?)"
  }
  try(PreparedStatement  ps = getCon().prepareStatement(sql);){
    ps.setString(1, carro.getPlaca());
    ps.setString(2, carro.getCor());
    ps.setString(3, carro.getDescricao());
    if(ps.executeUpdate() > 0){
      return "Inserido com sucesso!";
    }else{
      return "Falha ao inserir!";
    }
  }catch(SQLException e){
    return "Erro de SQL:\n" + e.getMessage();
  }
}
