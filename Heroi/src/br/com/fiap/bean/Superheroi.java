package br.com.fiap.bean;

import javax.swing.*;
import java.util.Arrays;

public class Superheroi {

    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;

    public Superheroi() {
    }

    public Superheroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String[] getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void listaHeroi(){
        String exibe = "Nome do superherói: " + nome + "\nIdentidade secreta: " + idSecreta;
        int cont = 1;
        for (String i : poderes){
            exibe += "\npoder " + cont + ": " + i;
            cont++;
        }
        for (String i : fraquezas){
            exibe += "\nFraquezas " + cont + ": " + i;
            cont++;
        }
        JOptionPane.showMessageDialog(null,exibe);
    }
}
