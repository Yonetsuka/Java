package br.com.fiap;

public class Televisor{
  //variáveis
  private int volume,canal;

  //construtores vazios
  public Televisor(){
    
  }
  public Televisor(int volume, int canal){
    this.volume = volume;
    this.canal = canal;
  }
  //get e set
  public int getVolume(){
    return volume;
  }
  public void setVolume(int volume){
    //thix.volume = volume;
    try{
      if(volume < 10 && volume > 0){
        this.volume = volume;
      }else{
        this.volume = 0;
        throw new Exception("Volume fora do parâmetro(0-10)");
      }
    }catch(Excepton e){
      System.out.println("Erro: "+ e.getMessage());
    }
  }
  public int getCanal(){
    return canal;
  }
  public void setCanal(int canal){
    //this.canal = canal;
    try{
      if(canal == 2 || canal == 4 || canal == 5 || canal ==13){
        this.canal = canal;
      }else{
        this.canal = 2;
        throw new Exception("Canal fora do parâmetro(2,4,5 ou 13)");
      }
    }catch(Excepton e){
      System.out.println("Erro: "+ e.getMessage());
    }
  }
  //métodos da classe
  public void aumentarVolume(){
    if(volume < 10){
      volume++;
    }
  }
  public void diminuirVolume(){
    if(volume > 0){
      volume--;
    }
  }
}
