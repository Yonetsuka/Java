package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;
import javax.swing.*;
import java.util.ArrayList;

public class UsaSuperHeroi{
  public static void main(String[] args){
    SuperHeroi liga;
    String aux, nome, idSecreta, escolha = "sim";
    while(escolha.equalsIgnoreCase("sim")){
      try{
        nome = JOptionPane.showMessageDialog("Digite o nome do herói: ");
        idSecreta = JOptionPane.showMessageDialog("Digite a identidade secreta do herói: ");
        String avancar = "continua";
        ArrayList<String> poderes = new ArrayList<String>();
        while(avancar.equalsIgnoreCase("continua")){
          aux = JOptionPane.showInputDialog("Digite o poder deste herói: \"fim\" para encerrar.");
          if(aux.equalsignoreCase("fim")){
            avancar = "fim";
          }else{
            poderes.add(aux);
          }
        }
        avancar = "continua";
        ArrayList<String> fraquezas = new ArrayList<String>();
        while(avancar.equalsIgnoreCase("continua")){
          aux = JOptionPane.showInputDialog("Digite a fraqueza deste herói: \"fim\" para encerrar.");
          if(aux.equalsignoreCase("fim")){
            avancar = "fim";
          }else{
            fraquezas.add(aux);
          }
        }
        liga = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
        liga.listaHeroi();
        escolha = JOptionPane.showInputDialog("Deseja continuar?");
      }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
      }
    }
    JOptionPane.showMessageDialog("Fim do programa");
  }
}
