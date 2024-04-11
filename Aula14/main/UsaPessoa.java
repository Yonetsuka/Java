package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class UsaPessoa(){
  
  public static void main(String[]args){
    Pessoa p1;
    String aux, nome, dataNasc;
    LocalDate minhaData;
    try{
      nome = JOptionPane.showInputDialog("Digite seu nome: ");
      aux = JOptionPane.showInputDialog("Digite a data de nascimento: ");
      dataNasc = aux.subString(6,10);
      dataNasc += aux.subString(3,5);
      dataNasc += aux.subString(0,2);

      minhaData = LocalDate.parse(dataNasc);
      p1 = new Pessoa(nome, minhaData);

      JOptionPane.showMessageDialog(null,"Dado no formato EUA\nData de nascimento: " + p1.getDataNascimento());

      DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      String dataFormatada = p1.getDataNascimento().format(dft);

      JOptionPane.showMessageDialog(null,"Dados pessoais: \nNome: " + p1.getNome() + "\nData de nascimento: " + dataFormatada + "\nIdade: " + p1.calculaIdade() + " anos");
    }catch(Exception e){
      JOptionPane.showMessaDialog(null,e.getMessage);
    }
  }
}
