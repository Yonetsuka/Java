package br.com.fiap.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

@SuppressWarnings("serial")
public class GUIAreas extends JPanel {

	private JLabel lbLado, lbAltura, lbImagem;
	private JTextArea taResultados;
	private JTextField tfLado, tfAltura;
	private JButton btQuadrado, btRetangulo, btTriangulo;
	private ImageIcon imagem1;
	
	public GUIAreas() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		setBackground(Color.darkGray);
		
		lbLado = new JLabel("Lado:", JLabel.RIGHT);
		lbLado.setFont(new Font("Verdana", Font.BOLD, 14));
		lbLado.setForeground(Color.white);
		lbAltura = new JLabel("Altura:", JLabel.RIGHT);
		lbAltura.setFont(new Font("Verdana", Font.BOLD, 14));
		lbAltura.setForeground(Color.white);
		tfLado = new JTextField();
		tfAltura = new JTextField();		
		taResultados = new JTextArea("Cálculo da Área", 5, 250);
		taResultados.setFont(new Font("Verdana", Font.BOLD, 14));
		taResultados.setForeground(Color.blue);
		taResultados.setBackground(Color.orange);
		taResultados.setEditable(false);
		imagem1 = new ImageIcon(getClass().getResource("images/question.png"));
		lbImagem = new JLabel(imagem1);		
		btQuadrado = new JButton("Área do Quadrado");
		btRetangulo = new JButton("Área do Retângulo");
		btTriangulo = new JButton("Área do Triângulo");
		lbLado.setBounds(10, 30, 100, 25);
		tfLado.setBounds(140, 30, 120, 25);
		lbAltura.setBounds(10, 65, 100, 25);
		tfAltura.setBounds(140, 65, 120, 25);
		btQuadrado.setBounds(30, 290, 140, 30);
		btRetangulo.setBounds(220, 290, 140, 30);
		btTriangulo.setBounds(410, 290, 140, 30);		
		lbImagem.setBounds(280, 30, 128, 128);
		taResultados.setBounds(280, 170, 250, 100);		
		add(lbLado);
		add(tfLado);
		add(lbAltura);
		add(tfAltura);
		add(btQuadrado);
		add(btRetangulo);
		add(btTriangulo);
		add(lbImagem);
		add(taResultados);		
	}
	
	private void definirEventos() {
		btQuadrado.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (tfLado.getText().isBlank()) {
						throw new Exception("Preencha valor de Lado");
					} else {
						Quadrado quad = new Quadrado();
						quad.setLado(Float.parseFloat(tfLado.getText()));
						String resultados = "Cálculo da Área"
								+ "\nQuadrado de Lado: " + quad.getLado()
								+ "\nÁrea do Quadrado: " + quad.calculaArea();
						taResultados.setForeground(Color.blue);
						taResultados.setText(resultados);
						imagem1 = new ImageIcon(getClass().getResource("images/quadrado.png"));
						lbImagem.setIcon(imagem1);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage(), 
							"Erro", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		btRetangulo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (tfLado.getText().isBlank() || tfAltura.getText().isBlank()) {
						throw new Exception("Preencha todos os campos!");
					} else {
						Retangulo ret = new Retangulo();
						ret.setLado(Float.parseFloat(tfLado.getText()));
						ret.setAltura(Float.parseFloat(tfAltura.getText()));
						String resultados = "Cálculo da Área"
								+ "\nRetângulo de Lado: " + ret.getLado()
								+ "\nRetângulo de Altura: " + ret.getAltura()
								+ "\nÁrea do Retângulo: " + ret.calculaArea();
						taResultados.setForeground(Color.magenta);
						taResultados.setText(resultados);
						imagem1 = new ImageIcon(getClass().getResource("images/retangulo.png"));
						lbImagem.setIcon(imagem1);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage(), 
							"Erro", JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		
		btTriangulo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (tfLado.getText().isBlank() || tfAltura.getText().isBlank()) {
						throw new Exception("Preencha todos os campos!");
					} else {
						Triangulo tri = new Triangulo();
						tri.setLado(Float.parseFloat(tfLado.getText()));
						tri.setAltura(Float.parseFloat(tfAltura.getText()));
						String resultados = "Cálculo da Área"
								+ "\nTriângulo de Lado: " + tri.getLado()
								+ "\nTriângulo de Altura: " + tri.getAltura()
								+ "\nÁrea do Triângulo: " + tri.calculaArea();
						taResultados.setForeground(Color.red);
						taResultados.setText(resultados);
						imagem1 = new ImageIcon(getClass().getResource("images/triangulo.png"));
						lbImagem.setIcon(imagem1);
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage(), 
							"Erro", JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		
	}
}
