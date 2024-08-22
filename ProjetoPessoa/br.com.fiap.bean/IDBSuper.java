package br.com.fiap.bean;

import java.io.Bufferreader;

public interface IDBSuper{
  public DragonBallSuper ler(String path){
    Bufferreader br = new BufferedReader(new FileReader(path + "/" + codigo + ".txt"));
    br.close();
    return this;
  }
  public String gravar(String path){
    File dir = new File();
    if(!dir.exists()){
        dir.mkdir();
    }
    PrintWriter pw = new PrintWriter(path + "/" + codigo + ".txt");
    pw.close();
  }
}
