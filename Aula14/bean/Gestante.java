package br.com.fiap.bean;

import java.time.LocalDate;

public class Gestante{
  private String nome;
  private LocalDate dataDeGestacao;
  //construtor vazio
  public Gestante(){
    
  }
  public Gestante(String nome, LocalDate dataDeGestacao){
    this.nome = nome;
    this.dataDeGestacao = dataDeGestacao;
  }
  //gets e setters
  
  //método
  public int tempoDegestacao(){
    
  }
}
