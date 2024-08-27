package br.com.fiap.main;
/**
* Classe que cria e vê atributos da carta de DragonBall
* @author Cássio
* @version 1.0
*/

import javax.swing.*;
import br.com.fiap.bean.DragonBallSuper;

public class UsaDBSuper{
  public static void main(String[] args){
    String aux, Nome, path;
    Int Ki,Tecnicas,Velocidade,Transformacoes, opcao;
    DragonBallSuper personagem;
    do{
      try{
        aux = JOptionPane.showInputDialog("Escolha:\n1. Cadastrar\n2. Consultar");
        opcao = Integer.parseInt(aux);
        path = JOptionPane.showInputDialog("Digite o camiho da pasta:");
        personagem = new DragonBallSuper();
        switch(opcao){
          case 1:
            Nome = JOptionPane.showInputDialog("Digite o nome do personagem: ");
            Ki = JOptionPane.showInputDialog("Digite a quantidade de ki do personagem: ");
            Tecnicas = JOptionPane.showInputDialog("Digite a quantidade de tecnicas do personagem: ");
            Velocidade = JOptionPane.showInputDialog("Digite a velocidade do personagem: ");
            Transformacoes = JOptionPane.showInputDialog("Digite a quantidade de transformações do personagem: ");
            personagem.setNome(Nome);]
            persongem.setKi(Ki);
            personagem.setTecnicas(Tecnicas);
            personagem.setVelocidade(Velocidade);
            personagem.setTransformacoes(Transformacoes);
            JOptionPane.showMessageDialog(null, pessoa.grava(path));
            break;
          case 2:
            nome = JOptionPane.showInputDialog("Digite o nome do personagem: ");
            personagem.setNome(nome);
            personagem = personagem.ler(path);
            if(personagem ==  null){
              JOptionPane.showMessageDialog(null,"Caminho e/ou personagem informado inexistente");
            }else{
              JOptionPane.showMessageDialog(null,"Exibindo dados:\nCaminho: " + path + "\nArquivo: " +
                                           path + "/" + personagem.getNome() + ".txt" + "\nNome: " + personagem.getNome() + 
                                           "\nKi: " + personagem.getKi() + "\nTécnicas: " + personagem.getTecnicas() + "\nVelocidade: " + personagem.getVelocidade() +
                                           "\nTransformações: " + personagem.getTransformacoes());
              break;
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
