package br.com.fiap.controller;

import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dao.EquipamentoVRDAO;
import br.com.fiap.model.dto.EquipamentoVR;
import java.sql.Connection;
import java.sql.SQLException;

public class EquipamentoVRControlller{
  public String inserirEquipamento(int idEquipamento, String descricao, int idInstituto){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    EquipamentoVR equipamentoVR = new EquipamentoVR();
    equipamentoVR.setIdEquipamento(idEquipamento);
    equipamentoVR.setDescricao(descricao);
    equipamentoVR.setIdInstituto(idInstituto);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.inserir(equipamentoVR);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String alterarEquipamento(int idEquipamento, String descricao, int idInstituto){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    EquipamentoVR equipamentoVR = new EquipamentoVR();
    equipamentoVR.setIdEquipamento(idEquipamento);
    equipamentoVR.setDescricao(descricao);
    equipamentoVR.setIdInstituto(idInstituto);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.alterar(equipamentoVR);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String excluirEquipamento(int idEquipamento){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    EquipamentoVR equipamentoVR = new EquipamentoVR();
    equipamentoVR.setIdEquipamento(idEquipamento);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.excluir(equipamentoVR);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String listarUmEquipamento(int idEquipamento){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    EquipamentoVR equipamentoVR = new EquipamentoVR();
    equipamentoVR.setIdEquipamento(idEquipamento);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.listarUm(equipamentoVR);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }
}
