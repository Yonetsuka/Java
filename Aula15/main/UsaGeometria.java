package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

public class UsaGeometria{
  public static void main(String[] args){
    Geometria geo1 = new Geometria();
    String aux,escolha = "sim";
    int opcao;
    while(escolha.equalsIgnoreCase("sim")){
      try{
        aux = JOptionPane.showInputDialog(null,"Qual área deseja calcular ?" + "\n1)Quadrado\n2)Retângulo\n3)Círculo"));
        opcao =  Integer.parseInt(aux);
        switch(opcao){
          case 1:
            aux = JOptionPane.showMessageDialog("Digite o valor de lado: ");
            float lado1 = float.parseFloat(aux);
            geo1.calculaArea(lado1);
            break;
          case 2:
            aux = JOptionPane.showMessageDialog("Digite o valor de lado: ");
            float lado2 = float.parseFloat(aux);
            aux = JOptionPane.showMessageDialog("Digite o valor da altura: ");
            float altura2 = float.parseFloat(aux);
            geo1.calculaArea(lado2, altura2);
            break;
          case 3:
            aux = JOptionPane.showMessageDialog("Digite o valor do raio: ");
            double raio3 = float.parseFloat(aux);
            geo1.calculaArea(raio3);
            break;
          default:
            throw new Exception("Escolha incorreta");
        }
        escolha = JOptionPane.showInputDialog(null, "Deseja continuar ?(sim ou não)");
      }catch(Exception e){
        JOptionPane.showMEssageDialog(null,"Erro: " + e.getMessage());
      }
    }
    JOptionPane.showMessageDialog(null, "Fim do programa");
  }
}
