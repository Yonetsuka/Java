package br.com.fiap.main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SupressWarnings("Serial")
public class GUIPrincipal extends JFrame{
  private Container contentPane;
  private JMenuBar mnBarra;
  private JMenu mnArquivo, mnFuncionario;
  private JMenuItem miSair,MiFreelancer,miVendedor, miVigiaNoturno;

  public GUIPrincipal(){
    inicializarComponentes();
    definirEventos();
  }

  private void inicializarComponentes(){
    setTitle("Janela principal");
    setBounds(0,0,600,400);
    contentPane = getcontentPane();

    mnBarra = new JMenubar();
    mnArquivo = new JMenu("Arquivo");
    mnArquivo.setMnemonic('A');
    mnFuncionario = new JMenu("Funcionario");
    mnFuncionario.setMnemonic('F');
    miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource(
      "images/exit_icon.png")));
    miFreelancer = new JMenuItem("Freelancer");
    miVendedor = new JMenuItem("Vendedor");
    miVigiaNoturno = new JMenuItem("Vigia Noturno");

    setJMenuBar(mnBarra);
    mnBarra.add(Arquivo);
    mnBarra.add(mnFuncionario);
    mnArquivo.add(miSair);
    mnFuncionario.add(miFreelancer);
    mnFuncionario.add(miVendedor);
    mnFuncionario.add(miVigiaNoturno);
  }

  private void definirEventos(){
    miSair.addActionListener(new ActionListaner(){
      public void actionPerformed(ActionEvent e){
        System.exit(0);
      }
    });

    miFreelancer.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
        // declarar e instanciar objeto de GUIFreelancer
         contentPane.removeAll();
         // adicionar o objeto GUIFreelancer ao contentPane
         contentPane.validate();
      }
  )};

  public static void main(String [] args){
    GUIPrincipal frame = new GUIPrincipal();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension tela = Toolkit..getDefaultToolKit().getScreensize();
    frame.setLocation((tela.width - frame.getWidth()) / 2,
                     (tela.height - frame.getHeight()) / 2);
    frame.setVisible(true);
    
  }
}
