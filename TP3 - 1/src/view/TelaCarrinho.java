package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import modelo.Produto;
public class TelaCarrinho implements ActionListener, ListSelectionListener {
	private static ControleDados dados;
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroProduto;
	private JButton addItem;
	private JButton refreshProduto;

	private JList<String> listaProdutosCadastrados;

	JLabel total = new JLabel();
	public void mostrarDados(ControleDados d){
		dados = d;

			String[] nomesProdutos = new String[dados.getProdutos().size()];
			for (int i=0; i<dados.getProdutos().size();i++) {
				nomesProdutos[i]= dados.getProdutos().get(i).getNome();
			}
			
			listaProdutosCadastrados = new JList<String>(nomesProdutos);
			janela = new JFrame("Carrinho");
			titulo = new JLabel("Produtos a ser comprados");
			cadastroProduto = new JButton("Comprar");
			addItem = new JButton ("Adicionar produto");
			refreshProduto = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaProdutosCadastrados.setBounds(20, 50, 350, 120);
			listaProdutosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProdutosCadastrados.setVisibleRowCount(10);

			cadastroProduto.setBounds(20, 177, 100, 30);
			refreshProduto.setBounds(150, 177, 100, 30);
			addItem.setBounds(280, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaProdutosCadastrados);
			janela.add(cadastroProduto);
			janela.add(refreshProduto);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroProduto.addActionListener(this);
			refreshProduto.addActionListener(this);
			listaProdutosCadastrados.addListSelectionListener(this);


	
}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
