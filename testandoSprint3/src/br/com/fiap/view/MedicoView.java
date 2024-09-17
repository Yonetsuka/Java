package br.com.fiap.view;

import br.com.fiap.controller.MedicoController;
import javax.swing.*;

public class MedicoView {
    public static void main(String[] args) {
        int idMedico,idade,treinos;
        String nome,senha,especialidade;
        String[] escolha = {"inserir","alterar","excluir","listar"};
        int opcao;
        MedicoController medicoController = new MedicoController();
        do {

        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim do programa");
    }
}
