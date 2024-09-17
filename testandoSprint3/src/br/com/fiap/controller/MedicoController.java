package br.com.fiap.controller;

import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dao.MedicoResidenteDAO;
import br.com.fiap.model.dto.MedicoResidente;

import java.sql.Connection;
import java.sql.SQLException;

public class MedicoController {
    public  String inserirMedico(int idmedico, String nome, int idade, String senha, String especialidade,
                                 int treinos)throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        MedicoResidente medicoResidente = new MedicoResidente();
        medicoResidente.setIdMedico(idmedico);
        medicoResidente.setNome(nome);
        medicoResidente.setIdade(idade);
        medicoResidente.setSenha(senha);
        medicoResidente.setEspecialidade(especialidade);
        medicoResidente.setTreinos(treinos);
        MedicoResidenteDAO medicoResidenteDAO = new MedicoResidenteDAO(con);
        resultado = medicoResidenteDAO.inserir(medicoResidente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }
    public String alterarMedico(int idmedico, String nome, int idade, String senha, String especialidade,
                                int treinos)throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        MedicoResidente medicoResidente = new MedicoResidente();
        medicoResidente.setIdMedico(idmedico);
        medicoResidente.setNome(nome);
        medicoResidente.setIdade(idade);
        medicoResidente.setSenha(senha);
        medicoResidente.setEspecialidade(especialidade);
        medicoResidente.setTreinos(treinos);
        MedicoResidenteDAO medicoResidenteDAO = new MedicoResidenteDAO(con);
        resultado = medicoResidenteDAO.alterar(medicoResidente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String excluirMedico(int idmedico)throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        MedicoResidente medicoResidente = new MedicoResidente();
        medicoResidente.setIdMedico(idmedico);
        MedicoResidenteDAO medicoResidenteDAO = new MedicoResidenteDAO(con);
        resultado = medicoResidenteDAO.excluir(medicoResidente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String listarUmMedico(int idmedico)throws ClassNotFoundException, SQLException{
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        MedicoResidente medicoResidente = new MedicoResidente();
        medicoResidente.setIdMedico(idmedico);
        MedicoResidenteDAO medicoResidenteDAO = new MedicoResidenteDAO(con);
        resultado = medicoResidenteDAO.listarUm(medicoResidente);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }
}
