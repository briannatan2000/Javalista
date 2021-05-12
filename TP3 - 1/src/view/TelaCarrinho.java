package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;  
import java.util.Date;
import javax.swing.*;
import javax.swing.event.*;


import java.text.DateFormat;
import java.text.ParseException;

import controle.*;
import modelo.Carrinho;
import modelo.Produto;
public class TelaCarrinho implements ActionListener, ListSelectionListener {
	private static ControleDados dados;
	private JFrame janela;
	private JLabel titulo;
	private JButton realizarCompra;
	private JButton addItem;
	private JButton ok;
	private JButton refreshProduto;
	private JTextArea totalCompra ;
	private JList<String> listaProdutosnoCarrinho;
	private boolean res =false; 
	JLabel total = new JLabel();
	private Date data1= new Date();
	private ArrayList<Carrinho> historico = new ArrayList<Carrinho>();

	

	
	public ControleDados mostrarDados(ControleDados d){

	
		dados = d;
		data1 =null;
		String[] nomesProdutosCarrinho = new String[dados.getCarrinho().size()];
			for (int i=0; i<dados.getCarrinho().size();i++) {
				nomesProdutosCarrinho[i]= dados.getCarrinho().get(i).getNome();
			}
		
			listaProdutosnoCarrinho = new JList<String>(nomesProdutosCarrinho);
			janela = new JFrame("Carrinho");
			titulo = new JLabel("Produtos a ser comprados");
			realizarCompra = new JButton("Comprar");
			addItem = new JButton ("+ Produto");
			refreshProduto = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaProdutosnoCarrinho.setBounds(20, 50, 350, 120);
			listaProdutosnoCarrinho.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProdutosnoCarrinho.setVisibleRowCount(10);

			realizarCompra.setBounds(20, 177, 100, 30);
			refreshProduto.setBounds(150, 177, 100, 30);
			addItem.setBounds(280, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaProdutosnoCarrinho);
			janela.add(realizarCompra);
			janela.add(refreshProduto);
		
			janela.add(addItem);
			

			janela.setSize(400, 250);
			janela.setVisible(true);

			realizarCompra.addActionListener(this);
			refreshProduto.addActionListener(this);
			addItem.addActionListener(this);
			listaProdutosnoCarrinho.addListSelectionListener(this);

			return dados;
	
}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaProdutosnoCarrinho) {
	
		
			new TelaDetalhe().inserirEditar(3, dados, 
					listaProdutosnoCarrinho.getSelectedIndex());
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo Produto
	
		
		if(src == refreshProduto) {
			
			String[] nomesProdutosCarrinho = new String[dados.getCarrinho().size()];
			for (int i=0; i<dados.getCarrinho().size();i++) {
				nomesProdutosCarrinho[i]= dados.getCarrinho().get(i).getNome();
				
			}
			
			listaProdutosnoCarrinho.setListData(nomesProdutosCarrinho);			
			listaProdutosnoCarrinho.updateUI();
		}
		if(src == addItem) {
			new TelaEditaveis().mostrarDados(dados, 4);
			
		
		}
		if(src == realizarCompra) {
			janela.dispose();
			finalizaCompra(dados);
		
		
				
	
		}
	}
	
	@SuppressWarnings("deprecation")
	public void finalizaCompra(ControleDados d){
		dados = d;

			
			
			
			
			janela = new JFrame("Compra finalizada");
			titulo = new JLabel("Compra finalizada");
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			totalCompra = new JTextArea("Compra realizada com Sucesso!\n Total da compra: R$" + dados.getPrecoCarrinho());
			totalCompra.setBounds(90, 120, 250, 30);
			JLabel labelNomeCompra = new JLabel ("Nome da compra:");
			labelNomeCompra.setBounds(20,50,180,25);
			JTextField NomeCompra = new JTextField (200);
			NomeCompra.setBounds(150, 50, 180,25);
			JLabel labelData = new JLabel("Data da compra: ");
			labelData.setBounds(20, 80, 180, 25);
			JTextField dataCompra = new JTextField(200);
			dataCompra.setBounds(150, 80, 180, 25);



		
			
			listaProdutosnoCarrinho.setBounds(20, 50, 350, 120);
			listaProdutosnoCarrinho.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProdutosnoCarrinho.setVisibleRowCount(10);
			


		

			janela.setLayout(null);
			janela.add(totalCompra);
			janela.add(labelNomeCompra);
			janela.add(NomeCompra);
			janela.add(dataCompra);
			janela.add(labelData);
			janela.add(titulo);
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			
			
			
			

		
			

			
			
			
			ok = new JButton ("ok");
			ok.setBounds(280, 177, 100, 30);
			janela.add(ok);
			ok.addActionListener((action)->{
				String sDate1 = dataCompra.getText();
				
				SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy");
			
					try {
						data1 = formatter.parse(sDate1);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				
				
				
				Carrinho compra = new Carrinho();
				
				
				dados.getCompra().add(compra);
				Produto[] novoProduto = new Produto[dados.getCarrinho().size()];
				for (int i=0; i<dados.getCarrinho().size();i++) {
					novoProduto[i]= dados.getCarrinho().get(i);
					dados.getCompra().get(dados.getCompra().size()-1).getProdutos().add(novoProduto[i]);
				}
				
				dados.getCompra().get(dados.getCompra().size()-1).setData(data1);
				
				dados.getCompra().get(dados.getCompra().size()-1).setNome(NomeCompra.getText());
				
				

				
				
				
				dados.zeraPrecoTotal();
				dados.getCarrinho().clear();
				
				janela.dispose();
			});
			
			


	
}

}
