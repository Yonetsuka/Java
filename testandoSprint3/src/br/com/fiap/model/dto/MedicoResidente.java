package br.com.fiap.model.dto;

public class MedicoResidente {
    private int idMedico,idade,treinos;
    private String nome,senha,especialidade;

    public int getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTreinos() {
        return treinos;
    }

    public void setTreinos(int treinos) {
        this.treinos = treinos;
    }
}
