package br.com.fiap.main;

import javax.swing.*;
import br.com.fiap.bean.Pessoa;

public class UsaPessoa{
  public static void main(String[] args){
    String aux,codigo,nome,email,path;
    int opcao;
    Pessoa pessoa;
    do{
      try{
        aux = JOptionPane.showInputDialog("Escolha:\n1. Cadastrar\n2. Consultar");
        opcao = Integer.parseInt(aux);
        path = JOptionPane.showInputDialog("Digite o camiho da pasta:");
        Pessoa = new Pessoa();
        switch(opcao){
          case 1:
            codigo = JOptionPane.showInputDialog("Digite o codigo");
            nome = JOptionPane.showInputDialog("Digite o nome");
            email = JOptionPane.showInputDialog("Digite o email");
            pessoa.setCodigo(codigo);
            pessoa.setNome(nome);
            pessoa.setEmail(email);
            JOptionPane.showMEssageDialog(null, pessoa.grava(path));
            break;
          case 2:
            codigo = JOptionPane.showInputDialog("Digite o código:");
            pessoa.setCodigo(codigo);
            pessoa = pessoa.ler(path);
            if(pessoa ==  null){
              JOptionPane.showMessageDialog(null,"Caminho e/ou código informado inexistente");
            }else{
              JOptionPane.showMessageDialog(null,"Exibindo dados:\nCaminho: " + path + "\nArquivo: " +
                                           path + "/" + pessoa.getCodigo() + ".txt" + "\nCódigo: " + pessoa.getCodigo() + 
                                           "\nNome: " + pessoa.getNome() + "\nEmail: " + pessoa.getEmail());
              break;
            }
          default:
            JOptionPane.showMessageDialog(null,"Escolha incorreta");
        }
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Erro de conversão\n" + e.getMessage(), "ERRO", JOptionPane.ERROR__MESSAGE);
      }
      catch(IOException e){
        JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo\n" + e.getMessage(), "ERRO", JOptionPane.ERROR__MESSAGE);
      }
      catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "ERRO", JOptionPane.ERROR__MESSAGE);
      }
    }while(JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", 0 , 3) == 0);
    JOptionPane.showMessageDialog(null, "Fim de programa!");
  }
}
