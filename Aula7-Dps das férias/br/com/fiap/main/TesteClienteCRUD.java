package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD{
  public static void main(String[] args){
    do{
      Connection con = ConnectionFactory.abrirConexao();
      Cliente cliente = new Cliente();
      ClienteDAO clienteDAO = new ClienteDAO(con);
      try{
        String escolha = JOptionPane.showInputDialog(null, "O que deseja fazer ?\n1)Inserir\n2)Alterar\n3)Excluir\n4)Listar");
        switch(escolha){
          case "1":
            String aux = JOptionPane.showInputDialog(null, "Digite o id do cliente: ");
            Int idCliente = Integer.parseInt(aux);
            String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
            String placa = JOptionPane.showInputDialog(null, "Digite placa: ");
            cliente.setIdCliente(idCliente);
            cliente.setNomeCliente(nomeCliente);
            cliente.setPlaca(placa);
            System.out.println(ClienteDAO.inserir(cliente));
          case "2":
            String aux = JOptionPane.showInputDialog(null, "Digite o id do cliente: ");
            Int idCliente = Integer.parseInt(aux);
            String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
            String placa = JOptionPane.showInputDialog(null, "Digite placa: ");
            cliente.setIdCliente(idCliente);
            cliente.setNomeCliente(nomeCliente);
            cliente.setPlaca(placa);
            System.out.println(ClienteDAO.alterar(cliente));
          case "3":
            String aux = JOptionPane.showInputDialog(null, "Digite o id do cliente: ");
            Int idCliente = Integer.parseInt(aux);
            cliente.setIdCliente(idCliente);
            System.out.println(ClienteDAO.excluir(cliente));
          case "4":
            ArrayList<Cliente> resultado = clienteDAO.listarTodos();
            if(resultado != null){
              for(Cliente cliente: resultado){
                  System.out.println("Id Cliente: " + cliente.getIdPlaca());
                  System.out.println("Nome cliente: " + cliente.getNomeCliente());
                  System.out.println("Placa: " + cliente.getPlaca());
              }
            }
        }
      }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de conversão\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
      }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
      ConnectionFactory.fecharConexao(con);
    }while(JOptionPane.showConfirmDialog(null,"Deseja continuar ?","Atenção",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
    JOptionPane.showMessageDialog(null, "Fim do programa");
}
