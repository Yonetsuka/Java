package br.com.fiap.bean;

/**
 *  Classe para as cartas de Dragon Ball
 *  @author Cássio Eid Kobayashi Yonetsuka
 *  @version 1.0
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class DragonBallSuper /*implements IDBSuper*/{
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
    public void setTransformacoes(int Transformacoes){
        this.Transformacoes = Transformacoes;
    }
    /**
     * método para ler o conteúdo do arquivo em que será gravado os atributos
     * @author Cássio Eid Kobayashi Yonetsuka
     * @param path - caminho até chegar o local onde o arquivo está
     * @return DragonBallSuper - irá trazer todos os atributos da carta
     */

    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + "/" +  Nome + ".txt"));
        Nome = br.readLine();
        Ki = Integer.parseInt(br.readLine());
        Tecnicas = Integer.parseInt(br.readLine());
        Velocidade = Integer.parseInt(br.readLine());
        Transformacoes = Integer.parseInt(br.readLine());
        br.close();
        return this;
    }

    /**
     * método para gravar o conteúdo do arquivo em um txt no diretório especificado
     * @author Cássio Eid Kobayashi Yonetsuka RM:99678
     * @param path - caminho até chegar o local onde o arquivo será gravado
     * @return String - irá mostrar se o arquivo conseguiu ser ou não gravado
     */

    public String gravar(String path){
        try{
            File dir = new File(path);
            if(!dir.exists()){
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + Nome + ".txt");
            pw.println(Nome);
            pw.println(Ki);
            pw.println(Tecnicas);
            pw.println(Velocidade);
            pw.println(Transformacoes);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso";
        }catch(IOException e){
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}
