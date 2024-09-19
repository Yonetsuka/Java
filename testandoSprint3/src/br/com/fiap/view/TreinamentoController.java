package br.com.fiap.view;

import br.com.fiap.controller.TreinamentoController;
import javax.swing.*;

public class TreinamentoController{
  int idTreinamento, idMedico, opcao;
  String titulo, status;
  String[] escolha = {"inserir","alterar","excluir","listar"};
  TreinamentoController treinamentoController = new TreinamentoController();
  do{
    try{
      opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular o carro", "Escolha", JOptionPane.DEFAULT_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,escolha,escolha[0]);
      switch(opcao){
        case 0:
          idTreinamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do treinamento: "));
          idMedico = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do medico: "));
          titulo = JOptionPane.showInputDialog("Digite o titulo do treinamento: ");
          status = JOptionPane.showInputDialog("Digite o status do treinamento: ");
          System.out.println(treinamentoController.inserirTreinamento(idTreinamento,titulo,status,idMedico));
          break;
        case 1:
          idTreinamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do treinamento: "));
          idMedico = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do medico: "));
          titulo = JOptionPane.showInputDialog("Digite o titulo do treinamento: ");
          status = JOptionPane.showInputDialog("Digite o status do treinamento: ");
          System.out.println(treinamentoController.alterarTreinamento(idTreinamento,titulo,status,idMedico));
          break;
        case 2:
          idTreinamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do treinamento: "));
          System.out.println(treinamentoController.alterarTreinamento(idTreinamento));
          break;
        case 3:
          idTreinamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do treinamento: "));
          System.out.println(treinamentoController.listarUmTreinamento(idTreinamento));
          break;
        default:
          System.out.println("Opção inválida");
      }
    }catch(Exception e){
      System.out.println("Erro: " + e.getMessage());
    }
  }while(JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim do programa");
}
