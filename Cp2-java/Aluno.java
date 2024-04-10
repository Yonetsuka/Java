package br.com.fiap

import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Aluno{
    //variáveis
    Period periodo;
    private int rm;
    private String nome, formatoUSA;
    private LocalDate dataDeNascimento;
    //construtores vazios
    public Aluno(){

    }
    public Aluno(int rm, String nome, LocalDate dataDeNascimento){
        setRm(rm);
        this.nome = nome;
        setDataDeNascimento(dataDeNascimento);
    }
    //gets e setters
    public int getRm(){
        return rm;
    }
    public void setRm(int rm){
        //this.rm = rm;
        try{
            if(rm >= 97001 && rm <= 551999){
                this.rm = rm;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public LocalDate getDataDeNascimento(){
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento){
        //this.dataDeNascimento = dataDeNascimento;
        try{
            int ano = dataDeNascimento.getYear();
            if(this.ano <= 1900){
                this.dataDeNascimento = dataDeNascimento;
            }
            else{
                throw new Exception("Ano abaixo de 1900");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //método
    public String calculaIdadeCompleta(int anoAtual){
        //anoNascimento = dataDeNascimento.getYear();
        //periodo = Period.between(anoAtual - anoNascimento);
        //return periodo.getYears();
        int dia = anoAtual / 1000000;
        int mes = (anoAtual / 10000) % 100;
        int ano = anoAtual % 10000;
        LocalDate dataLocalDate = LocalDate.of(ano, mes, dia);
        periodo = Period.between(anoAtual - anoNascimento);
        return periodo;
    }
}