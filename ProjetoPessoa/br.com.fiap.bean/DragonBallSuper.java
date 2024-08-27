package br.com.fiap.bean;
/**
*  Classe para as cartas de Dragon Ball
*  @author Cássio
*  @version 1.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class DragonBallSuper implements IDBSuper{
  public String Nome;
  public int Ki,Tecnicas,Velocidade,Transformacoes;

  public DragonBallSuper(){}

  public String getNome(){
    return Nome;
  }
  public void setNome(String Nome){
    this.Nome = Nome;
  }

  public int getKi(){
    return Ki;
  }
  public void setKi(int Ki){
    this.Ki = Ki;
  }

  public int getTecnicas(){
    return Tecnicas;
  }
  public void setTecnicas(int Tecnicas){
    this.Tecnicas = Tecnicas;
  }

  public int getVelocidade(){
    return Velocidade;
  }
  public void setVelocidade(int Velocidade){
    this.Velocidade = Velocidade;
  }

  public int getTransformacoes(){
    return Transformacoes;
  }
  public void setTransformaccoes(int Transformacoes){
    this.Transformacoes = Transformacoes;
  }
  /**
  * método para ler o conteúdo do arquivo em que será gravado os atributos
  * @author Cássio
  * @param path - caminho até chegar o local onde o arquivo está
  * @return DragonBallSuper - irá trazer todos os atributos da carta
  */
  public DragonBallSuper ler(String path) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader(path + "/" +  nome + ".txt"));
    Nome = br.readLine();
    Ki = br.readLine();
    Tecnicas = br.readLine();
    Velocidade = br.readLine();
    Transformacoes = br.readLine();
    br.close();
    return this;
  }

  /**
  * método para gravar o conteúdo do arquivo em um txt no diretório especificado
  * @author Cássio
  * @param path - caminho até chegar o local onde o arquivo será gravado
  * @return String - irá mostrar se o arquivo conseguiu ser ou não gravado
  */
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
      return "Arquivo gravado com sucesso"
    }catch(){
      return "Falha ao gravar arquivo: " + e.getMessage();
    }
  }  
}
