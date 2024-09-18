package br.com.fiap.controller;

import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dao.TreinamentoDAO;
import br.com.fiap.model.dto.Treinamento;

public class TreinametoController{
  public String inserirTreinamento(int treinamentoID, String titulo, String status, int idMedico)
  throws ClassNotFoundException, SQLException{
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Treinamento treinamento = new Treinamento();
    treinamento.setTreinamentoID(treinamentoID);
    treinamento.setTitulo(titulo);
    treinamento.setStatus(status);
    treinamento.setIdMedico(idMedico);
    TreinamentoDAO treinamentoDAO = new TreinamentoDAO();
    TreinamentoDAO.inserir(treinamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String alterarMedico(int treinamentoID, String titulo, String status, int idMedico)
  throws ClassNotFoundException, SQLException{
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Treinamento treinamento = new Treinamento();
    treinamento.setTreinamentoID(treinamentoID);
    treinamento.setTitulo(titulo);
    treinamento.setStatus(status);
    treinamento.setIdMedico(idMedico);
    TreinamentoDAO treinamentoDAO = new TreinamentoDAO();
    TreinamentoDAO.alterar(treinamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String excluirMedico(int treinamentoID)throws ClassNotFoundException, SQLException{
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Treinamento treinamento = new Treinamento();
    treinamento.setTreinamentoID(treinamentoID);
    TreinamentoDAO treinamentoDAO = new TreinamentoDAO();
    TreinamentoDAO.excluir(treinamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }

  public String listarUmMedico(int treinamentoID)throws ClassNotFoundException, SQLException{
    String resultado;
    Connection con = ConnectionFactory.abrirConexao();
    Treinamento treinamento = new Treinamento();
    treinamento.setTreinamentoID(treinamentoID);
    TreinamentoDAO treinamentoDAO = new TreinamentoDAO();
    TreinamentoDAO.listaUm(treinamento);
    ConnectionFactory.fecharConexao(con);
    return resultado;
  }
}
