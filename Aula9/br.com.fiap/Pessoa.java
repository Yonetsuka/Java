package from br.com.fiap

public class Pessoa(){
  private String Nome;
  private int AnoNascimento;

  public Pessoa(){
    
  }
  public Pessoa(String Nome, int AnoNascimento){
    this.Nome = Nome;
    //this.AnoNascimento = AnoNascimento;]
    setAnoNacimento(anoNascimento);
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
  public void setAnoNascimento(int AnoNascimento){
    LocalDate anoAtual =LocalDate.now();
    try{
      if(anoNascimento >= 1900 && anoNeascimento <= anoAtual.getYear()){
        this.AnoNascimento = AnoNascimento;
      } else{
        throw new Exception("Valor incorreto! (1900-ano atual)");
      }
    }
    catch(Exception e){
      System.out.println(e.getMessage);
    }
  }

  public int calculaIdade(int anoAtual){
    int idade = anoAtual - AnoNascimento;
    return idade;
  }
}
