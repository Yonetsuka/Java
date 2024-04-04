package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaTelevisor{
  public static void main(String[]args){
    Televisor televisor1;
    String aux;
    int volume,canal;
    try{
      aux = JOPtionPane.showInputDialog("Escolha o volume: ");
      volume = Integer.parseInt(aux);
      aux = JOptionPane.showInputDialog("Escolha o canal: ");
      canal = Integer.parseInt(aux);

      televisor1 = new Televisor(volume,canal);

      JOptionPane.showMessageDialog(null,"Volume: "+ televisor1.getVolume()
                                   + "\nCanal: " + televisor1.getCanal());
      aux = JOptionPane.showInputDialog(null, "Escolha uma opção: "
                                   + "\n(1)Aumentar o volume"
                                   + "\n(2)Diminuir o volume"
                                   + "\n(3)Trocar de canal");
      escolha = Integer.parseInt(aux);

      switch(escolha){
        case 1:
          televisor1.aumentarVolume();
          break;
        case 2:
          televisor1.diminuirVolume();
          break;
        case 3:
          aux = JOptionPane.showInputDialog("Escolha o canal");
          canal = Integer.parseInt(aux);
          televisor1.setCanal(canal);
          break;
        default:
          throw new Exception("Opção inválida(1-3)");
      }
      JOptionPane.showMessageDialog(null,"Volume: "+ televisor1.getVolume()
                                   + "\nCanal: " + televisor1.getCanal());
    }catch{
      System.out.println("Erro: "+ e.getMessage());
    }
  }
}
