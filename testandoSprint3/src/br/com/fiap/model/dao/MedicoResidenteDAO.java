package br.com.fiap.model.dao;

import br.com.fiap.model.dto.MedicoResidente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicoResidenteDAO implements IDAO{
    private Connection con;
    private MedicoResidente medicoResidente;

    public MedicoResidenteDAO(Connection con){
        this.con = con;
    }

    private Connection getCon(){
        return con;
    }

    public String inserir(Object object){
        medicoResidente = (MedicoResidente) object;
        String sql = "insert into MEDICORESIDENTE(idmedico,nome,idade,senha,especialidade,treinos) values(?,?,?,?,?,?)";
        try(PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setInt(1, medicoResidente.getIdMedico());
            ps.setString(2, medicoResidente.getNome());
            ps.setInt(3,medicoResidente.getIdade());
            ps.setString(4,medicoResidente.getSenha());
            ps.setString(5,medicoResidente.getEspecialidade());
            ps.setInt(6,medicoResidente.getTreinos());
            if(ps.executeUpdate() > 0){
                return "inserido com sucesso";
            }else{
                return "erro ao inserir";
            }
        }catch(SQLException e){
            return "Erro de sql: " + e.getMessage();
        }
    }

    public String alterar(Object object){
        medicoResidente = (MedicoResidente) object;
        String sql = "update MEDICORESIDENTE set nome = ?,idade = ?, senha = ?, especialidade = ?, treinos = ? where idmedico = ?";
        try(PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setString(1, medicoResidente.getNome());
            ps.setInt(2,medicoResidente.getIdade());
            ps.setString(3,medicoResidente.getSenha());
            ps.setString(4,medicoResidente.getEspecialidade());
            ps.setInt(5,medicoResidente.getTreinos());
            ps.setInt(6,medicoResidente.getIdMedico());
            if(ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            }else{
                return "Erro ao alterar";
            }
        }catch(SQLException e){
            return "Erro de sql: " + e.getMessage();
        }
    }

    public String excluir(Object object){
        medicoResidente = (MedicoResidente) object;
        String sql = "delete from MEDICORESIDENTE where idmedico = ?";
        try(PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setInt(1,medicoResidente.getIdMedico());
            if(ps.executeUpdate() > 0){
                return "Erro ao excluir";
            }else{
                return "Erro ao alterar";
            }
        }catch(SQLException e){
            return "Erro de sql: " + e.getMessage();
        }
    }

    public String listarUm(Object object){
        medicoResidente = (MedicoResidente) object;
        String sql = "select * from MEDICORESIDENTE where idmedico = ?";
        try(PreparedStatement ps = getCon().prepareStatement(sql)){
            ps.setInt(1,medicoResidente.getIdMedico());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return "Id medico: " + medicoResidente.getIdMedico() + "\nNome: " + rs.getString("nome") +
                        "\nSenha: " + rs.getString("senha") + "\nIdade: " + rs.getInt("idade") +
                        "\nEspecialidade: " + rs.getString("especialidade") + "\nTreinos: " + rs.getString("treinos");
            }else{
                return "registro não encontrado";
            }
        }catch(SQLException e){
            return "Erro de sql: " + e.getMessage();
        }
    }
}