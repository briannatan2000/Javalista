package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaOpcoes implements ActionListener {
	
	private static JFrame janela = new JFrame("JavaLista");
	private static JLabel titulo = new JLabel("Opções");
	private static JButton prod = new JButton("Produtos");
	private static JButton cat = new JButton("Categoria");
	private static JButton uniMed = new JButton("Unidade de Medida");
	public static ControleDados dados = new ControleDados();

	
	public  TelaOpcoes() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		uniMed.setBounds(140, 100, 100, 30);
		cat.setBounds(140, 150, 100, 30);
		prod.setBounds(140, 50, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(prod);
		janela.add(cat);
		janela.add(uniMed);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TelaOpcoes menu = new TelaOpcoes();
		
		prod.addActionListener(menu);
		uniMed.addActionListener(menu);
		cat.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == prod)
			new TelaEditaveis().mostrarDados(dados, 1);
		

		if(src == uniMed)
			new TelaEditaveis().mostrarDados(dados, 2);
			
		if(src == cat)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matrícula", null, 
					JOptionPane.INFORMATION_MESSAGE);
	}
}
