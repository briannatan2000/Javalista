package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class Home implements ActionListener {
	
	private static JFrame janela = new JFrame("Javalista");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton lista = new JButton("Nova Lista");
	private static JButton historico = new JButton("Histórico");
	private static JButton opcoes = new JButton("Opções");
	public static ControleProduto dados = new ControleProduto();
	
	public Home() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		lista.setBounds(140, 100, 100, 30);
		historico.setBounds(140, 150, 100, 30);
		opcoes.setBounds(140, 50, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(lista);
		janela.add(historico);
		janela.add(opcoes);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Home menu = new Home();
		
		lista.addActionListener(menu);
		historico.addActionListener(menu);
		opcoes.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == lista)
			new ViewMenu();
		
		if(src == historico)
			new Historico();
		
		if(src == opcoes)
			new Opcoes();
	}
}

