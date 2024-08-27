package br.com.fiap.main;

/**
 * Classe que cria e vê atributos da carta de DragonBall
 * @author Cássio Eid Kobayashi Yonetsuka RM:99678
 * @version 1.0
 */

import javax.swing.*;
import br.com.fiap.bean.DragonBallSuper;
import java.io.IOException;


public class UsaDBSuper {
    public static void main(String[] args) {
        String aux, Nome, path;
        int Ki,Tecnicas,Velocidade,Transformacoes, opcao;
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
                        aux = JOptionPane.showInputDialog("Digite a quantidade de ki do personagem: ");
                        Ki = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Digite a quantidade de tecnicas do personagem: ");
                        Tecnicas = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Digite a velocidade do personagem: ");
                        Velocidade = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Digite a quantidade de transformações do personagem: ");
                        Transformacoes = Integer.parseInt(aux);
                        personagem.setNome(Nome);
                        personagem.setKi(Ki);
                        personagem.setTecnicas(Tecnicas);
                        personagem.setVelocidade(Velocidade);
                        personagem.setTransformacoes(Transformacoes);
                        JOptionPane.showMessageDialog(null, personagem.gravar(path));
                        break;
                    case 2:
                        Nome = JOptionPane.showInputDialog("Digite o nome do personagem: ");
                        personagem.setNome(Nome);
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
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de conversão\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }while(JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", 0 , 3) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}
