package br.com.fiap.view;

public class ParkingView{
  public static void main(String[] args){
    String placa,cor,descricao, nomeCliente;
    int opcao1,opcao2,idCliente;
    String[] escolha1{"Inserir","Alterar","Excluir","Listar"};
    String[] escolha2{"Carro","Cliente"}
    CarroController carroController = new CarroController();
    ClienteController clienteController = new ClienteController();
    do{
      try{
        opcao1 = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para decidir qual manipular", "Escolha", JOptionPane.DEFAULT_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,escolha2,escolha2[0]);
        switch(opcao1){
          case 0:
            opcao2 = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular o carro", "Escolha", JOptionPane.DEFAULT_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,escolha1,escolha1[0]);
            placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
            switch(opcao2){
              case 0:
                cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
                descricao = JOptionPane.showInputDialog("Digite a descrição do carro: ");
                System.out.println(carroController.inserirCarro(placa,cor,descricao));
                break;
              case 1:
                cor = JOptionPane.showInputDialog("Digite a nova cor do carro: ");
                descricao = JOptionPane.showInputDialog("Digite a nova descrição do carro: ");
                System.out.println(carroController.alterarCarro(placa,cor,descricao));
                break;
              case 2:
                System.out.println(carroController.excluirCarro(placa));
                break;
              case 3:
                JOptionPane.showMessageDialog(null, carroController.listarUmCarro(placa));
                break;
              default:
                System.out.println("Opção inválida");
            }
            break;
          case 1:
            opcao2 = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular o cliente", "Escolha", JOptionPane.DEFAULT_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,escolha1,escolha1[0]);
            switch(opcao2){
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
            }
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
