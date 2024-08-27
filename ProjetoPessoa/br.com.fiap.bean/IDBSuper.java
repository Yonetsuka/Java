package br.com.fiap.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public interface IDBSuper{
  public DragonBallSuper ler(String path){
    BufferedReader br = new BufferedReader(new FileReader(path + "/" +  nome + ".txt"));
    Nome = br.readLine();
    Ki = br.readLine();
    Tecnicas = br.readLine();
    Velocidade = br.readLine();
    Transformacoes = br.readLine();
    br.close();
    return this;
  }
  public String gravar(String path){
    try{
      File dir = new File(path);
      if(!dir.exists()){
        dir.mkdir();
      }
      PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
      pw.println(Nome);
      pw.println(Ki);
      pw.println(Tecnicas);
      pw.println(Velocidade);
      pw.println(Transformacoes);
      pw.flush();
      pw.close();
    }catch(){
      return "Falha ao gravar arquivo: " + e.getMessage();
    }
  }
}
