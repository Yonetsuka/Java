//Nome: Cássio Eid Kobayashi Yonetsuka Rm:99678
//Nome: Allan Von Ivanov Rm:98705
package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Aluno{
    //variáveis
    Period periodo;
    public int rmAntes,rmDepois;
    private int rm;
    private String nome;
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
            else {
            	throw new Exception("Rm fora da faixa");
            }
        }catch(Exception e){
        	JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0);
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
            if(ano >= 1900){
                this.dataDeNascimento = dataDeNascimento;
            }
            else{
                throw new Exception("Ano abaixo de 1900");
            }
        }catch(Exception e){
        	JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0);
        }
    }
    //método
    public String calculaIdadeCompleta(LocalDate anoAtual){
        //anoNascimento = dataDeNascimento.getYear();
        //periodo = Period.between(anoAtual - anoNascimento);
        //return periodo.getYears();
    	periodo = Period.between(dataDeNascimento, anoAtual);
    	String idade = periodo.toString();
    	return idade;
    }
}
