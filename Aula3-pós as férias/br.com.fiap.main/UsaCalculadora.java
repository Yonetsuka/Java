package br.com.fiap.main;

import javax.swing.*;
import br.com.fiap.bean.num2igual0Exception;
import br.com.fiap.bean.Calculadora;

public class UsaCalculadora{
  public static void main(String[] args){
    do{
      try{
      String aux = JOptionPane.showInputDialog(null,"Digite o numero 1: ");
      Float num1 = Float.parseFloat(aux);
      aux = JOptionPane.showInputDialog(null,"Digite o numero 2: ");
      Float num2 = Float.parseFloat(aux);
      Calcuadora calculadora = new Calculadora();
      calculadora.setNumero1(num1);
      calculadora.setNumero2(num2);
      String escolha = JOptionPane.showInputDialog(null,"Escolha a operação para realizar  \n1:Adição\n2:Subtração\n3:Multiplicação\n4:Divisão");
      swtich(escolha){
        case "1":
          float soma = calculadora.adicao();
          JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
          break;
        case "2":
          float subtracao = calculadora.subtracao();
          JOptionPane.showMessageDialog(null, "A subtração dos números é: " + subtracao);
          break;
        case "3":
          float multiplicacao = calculadora.multiplicacao();
          JOptionPane.showMessageDialog(null, "A multiplicação dos números é: " + multiplicacao);
          break;
        case "4":
          float divisao = calculadora.divisao();
          JOptionPane.showMessageDialog(null, "A divisão dos números é: " + divisao);
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
      }
    }catch(NumberFormatException e){
      JOptionPane.showMessageDialog(null,"Erro de conversão." +
                                   e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
    }
  }
    while(JOptionPane.showConfirmDialog(null,"Deseja continuar ?","Atenção",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
    JOptionPane.showMessageDialog(null, "Fim do programa");
}
