package br.com.fiap

public class Radio{
  //atributos
  private int volume;
  private float estacao;

  //construtor vazio
  public Radio(){
  }
  public Radio(int volume, float estacao){
    setVolume(volume);
    setEstacao(estacao);
  }

  //get e set
  public int getVolume(){
    return volume;
  }
  public void setVolume(int volume){
    //this.volume = volume;
    try{
      if(volume >= 0 && volume <= 10){
        this.volume = volume;
      }else{
        throw new Exception("Volume fora da faixa permitida");
      }
    }catch(Exception e){
      System.out.println("Erro: "+ e.getMessage());
    }
  }
  public float getEstacao(){
    return estacao;
  }
  public void setEstacao(float estacao){
    //this.estacao = estacao;
    try{
      if(estacao >= 80.0f && estacao <= 105.0f){
        this.estacao = estacao;
      }else{
        this.estacao = 80.0f;
        thow new Exception("Estação fora da faixa permitida");
      }
    }catch(Exception e){
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
