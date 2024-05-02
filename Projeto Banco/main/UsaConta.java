package br.com.fiap.main;

import javax.swing.JOptionPane;

public class UsaConta{
  public static void main(String[] args){
    String aux,escolha = "sim";
    int numConta,opcao;
    float saldo,valor;
    while(escolha.equalsignoreCase("sim"){
      try{
        aux = JOptionPane.showINputDialog("Digite o número da conta");
        numConta = Integer.parseInt(aux);
        aux = JOptionPane.showINputDialog("Digite o saldo da conta");
        saldo = Float.parseFloat(aux);
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumConta(conta);
        cp.setSaldo(saldo);
        aux = JOptionPane.showInputDialog("Escolha a ação:  \n(1)Saque: \n(2)Depósito: ");
        opcao = Integer.parsseInt(aux);
        switch(opcao){
          case 1:
            aux = JOptionPane.showInputDialog("Digite o valor a ser sacado: ");
            valor = Float.parseFloat(aux);
            JOptionPane.showMessageDialog(null,"Dados da conta: "
                                         + "\nNúmero da conta: " + numConta 
                                          + "\nSaldoAtual:R$ " + cp.sacar(valor));
            break;
          case 2:
            aux = JOptionPane.showInputDialog("Digite o valor a ser depositado: ");
            valor = Float.parseFloat(aux);
            JOptionPane.showMessageDialog(null,"Dados da conta: "
                                          + "\nNúmero da conta: " + numConta 
                                          + "\nSaldoAtual:R$ " + cp.depositar(valor));
            break;
          default:
            throw new Exception("Opção inválida");
        }
         escolha = JOptiionPane.showInputDialog("Deseja continuar?"); 
      }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
      }
      catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
      }
    }
    JOptionPane.showMessageDialog(null,"Fim de programa!");
  }
}
