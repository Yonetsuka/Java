package br.com.fiap.view;

import br.com.fiap.controller.ClienteController;
import javax.swing.*;

public class ClienteView{
  public static void main(String[] args){
    String nomeCliente,placa;
    String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
    int opcao, idCliente;
    ClienteController clienteController = new ClienteController();
    do{
      try{
        opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular o cliente", "Escolha", JOptionPane.DEFAULT_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,escolha,escolha[0]);
        switch(opcao){
          case 0:
            nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
            placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
            System.out.println(clienteController.inserirCliente(nomeCliente, placa));
            break;
          case 1:
            idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
            nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
            placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
            System.out.println(clienteController.inserirCliente(idCliente,nomeCliente, placa));
            break;
          case 2:
            idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
            System.out.println(clienteController.excluirCliente(idCliente));
            break;
          case 3:
            idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
            JOptionPane.showMessageDialog(null, clienteController.listarUmCliente(idCliente));
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
}
