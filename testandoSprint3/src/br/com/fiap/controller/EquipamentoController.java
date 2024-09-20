package br.com.fiap.controller;

import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dao.EquipamentoDAO;
import br.com.fiap.model.dto.Equipamento;
import java.sql.Connection;
import java.sql.SQLException;

public class EquipamentoControlller{
  public String inserirEquipamento(int idEquipamento, String descricao, int idInstituto){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Equipamento equipamento = new Equipamento();
    equipamento.setIdEquipamento(idEquipamento);
    equipamento.setDescricao(descricao);
    equipamento.setIdInstituto(idInstituto);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.inserir(equipamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String alterarEquipamento(int idEquipamento, String descricao, int idInstituto){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Equipamento equipamento = new Equipamento();
    equipamento.setIdEquipamento(idEquipamento);
    equipamento.setDescricao(descricao);
    equipamento.setIdInstituto(idInstituto);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.alterar(equipamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String excluirEquipamento(int idEquipamento){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Equipamento equipamento = new Equipamento();
    equipamento.setIdEquipamento(idEquipamento);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.excluir(equipamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String listarUmEquipamento(int idEquipamento){
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Equipamento equipamento = new Equipamento();
    equipamento.setIdEquipamento(idEquipamento);
    InstitutoDAO institutoDAO = new InstitutoDAO();
    resultado = institutoDAO.listarUm(equipamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }
}
