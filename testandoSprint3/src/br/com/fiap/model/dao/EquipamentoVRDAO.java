package br.com.fiap.model.dao;

import br.com.fiap.model.dto.EquipamentoVR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipamentoVRDAO{
  private Connection con;
  private EquipamentoVR equipamentoVR;

  public EquipamentVRDAO(Connection con){
    this.con = con;
  }
  public Connection getCon(){
    return con;
  }

  public String inserir(Object object){
    String sql = "insert into equipamentvr(idequipamento,descricao,idinstituto) values(?,?,?)";
    try(PreparedStatement ps = getCon().prepareStatement()){
      ps.setInt(1,equipamentoVR.getIdEquipamento());
      ps.setString(2,equipamentoVR.getDescricao());
      ps.setInt(3,equipamentoVR.getIdInstituto());
      if(ps.executeUpdate() > 0){
        return "Inserido com sucesso";
      }else{
        return "Erro ao inserir";
      }
    }catch(SQLException e){
      return "Erro: " + e.getMessage();
    }
  }

  public String alterar(Object object){
    String sql = "update equipamentovr set descricao = ?,idinstituto = ?  where idequipamento = ?";
    try(PreparedStatement ps = getCon().prepareStatement()){
      ps.setString(1,equipamentoVR.getDescricao());
      ps.setInt(2,equipamentoVR.getIdInstituto());
      ps.setInt(3,equipamentoVR.getIdEquipamento());
      if(ps.executeUpdate() > 0){
        return "Alterado com sucesso";
      }else{
        return "Erro ao alterar";
      }
    }catch(SQLExcption e){
      return "Erro: " + e.getMessage();
    }
  }

  public String excluir(Object object){
    String sql = "delete from equipamentovr where idequipamento = ?";
    try(PreparedStatement ps = getCon().prepareStatement()){
      ps.setInt(1,equipamentoVR.getIdEquipamento());
      if(ps.executeUpdate() > 0){
        return "Excluido com sucesso"
      }else{
        return "Erro ao excluir"
      }
    }catch(SQLException e){
      return "Erro: " + e.getMessage();
    }
  }

  public String listarUm(Object object){
    String sql = "select * from equipamentovr where idequipamento = ?";
    try(PreparedStatement ps = getCon().prepareStatement()){
      ps.setInt(1,equipamentoVR.getIdEquipamento());
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
        return "Id do equipamento: " + equipamentoVR.getIdEquipamento() + "\nDescrição: " + rs.getString("descricao") +
          "\nId do instituto: " + rs.getInt("idinstituto");
      }else{
        return "Registro não encontrado";
      }
    }catch(SQLExcpetion e){
      return "Erro: " + e.getMessage();
    }
  }
}
