package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Pessoa{
  //atributos
  private String nome;
  private LocalDate dataNascimento;

  //construtor vazio
  public Pessoa(){
    
  }
  //construtor com passagem de parâmetros
  public Pessoa(String nome,LocalDate dataNascimento){
    this.nome = nome;
    setDataNascimento(dataNascimento);
  }
  //get e set
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public LocalDate setDataNascimento(){
    return dataNascimento;
  }
  public void setDataNascimento(LocalDate dataNascimento){
    //this.dataNascimento = dataNascimento;
    LocalDate inicio = LocalDate.parse("1899-12-31");
    LocalDate fim = LocalDate.now();
    try{
      if(dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)){
        this.dataNascimento = dataNascimento;
      }else{
        throw new Exception("Data fora da faixa permitida");
      }
    }catch(Esception e){
      JOptionPane.showMessageDialog(null,e.getMessage());
      System.exit(0);//encerra oprograma após o erro
    }
  }
  //método da classe
  public int calculaIdade(){
    LocalDate dataAtual = LocalDate.now();
    Period idade = Period.between(dataNascimento,dataAtual);
    return idade.getYears;
  }
}
