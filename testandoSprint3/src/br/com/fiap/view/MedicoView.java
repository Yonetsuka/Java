package br.com.fiap.view;

import br.com.fiap.controller.MedicoController;
import javax.swing.*;

public class MedicoView {
    public static void main(String[] args) {
        int idMedico,idade;
        String nome,especialidade;
        String[] escolha = {"inserir","alterar","excluir","listar"};
        int opcao;
        MedicoController medicoController = new MedicoController();
        do {
            try{
                opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular o carro", "Escolha", JOptionPane.DEFAULT_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,escolha,escolha[0]);
                switch(opcao){
                    case 0:
                        idMedico = JOptionPane.showInputDialog("Digite o id novo do médico: ");
                        nome = JOptionPane.showInputDialog("Digite o nome do médico: ");
                        idade = JOptionPane.showInputDialog("Digite a idade do médico: ");
                        especialidade = JOptionPane.showInputDialog("Digite a especialidade do médico: ");
                        System.out.println(medicoController.inserirMedico(idMedico,nome,idade,especialidade));
                        break;
                    case 1:
                        idMedico = JOptionPane.showInputDialog("Digite o id novo do médico: ");
                        nome = JOptionPane.showInputDialog("Digite o nome do médico: ");
                        idade = JOptionPane.showInputDialog("Digite a idade do médico: ");
                        especialidade = JOptionPane.showInputDialog("Digite a especialidade do médico: ");
                        System.out.println(medicoController.alterarMedico(idMedico,nome,idade,especialidade));
                        break;
                    case 2:
                        idMedico = JOptionPane.showInputDialog("Digite o id do médico a ser deletado: ");
                        System.out.println(medicoController.excluirMedico(idMedico));
                        break;
                    case 3:
                        idMedico = JOptionPane.showInputDialog("Digite o id do médico a ser procurado: ");
                        System.out.println(medicoController.listarUmMedico(idMedico));
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }catch(Exception e){
                System.out.println("Erro: " + e.getMessage());
            }
        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim do programa");
    }
}
