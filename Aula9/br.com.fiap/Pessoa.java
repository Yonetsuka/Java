package from br.com.fiap

public class Pessoa(){
  private String Nome;
  private int AnoNascimento;

  public Pessoa(){
    
  }
  public Pessoa(String Nome, int AnoNascimento){
    this.Nome = Nome;
    this.AnoNascimento = AnoNascimento;
  }
  //get e set
  public String getNome(){
    return Nome;
  }
  public void setNome(String Nome){
    this.Nome = Nome;
  }
  public String getAnoNascimento(){
    return AnoNascimento;
  }
  public void setNome(int AnoNascimento){
    this.AnoNascimento = AnoNascimento;
  }
}
