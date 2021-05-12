package view;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

import controle.ControleDados;

public class tabelaCompra extends JFrame {
	JTable table;
	
	public tabelaCompra(ControleDados d, int pos) {
		ControleDados dados = d;
		setLayout(new FlowLayout());
		Object [][] data = new Object [dados.getCompra().get(pos).getProdutos().size()][4];
		
		String[] colunaNomes = {"Produto", "Preço", "Quantidade", "Data da compra"};
		String[] nomeProdutosDaCompra = new String[dados.getCompra().get(pos).getProdutos().size()];
		double[] precoProdutosDaCompra = new double[dados.getCompra().get(pos).getProdutos().size()];
		int[] qtdProdutosDaCompra = new int[dados.getCompra().get(pos).getProdutos().size()];
		String [] dataCompra = new String[dados.getCompra().get(pos).getProdutos().size()];

		SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print(formatter.format(dados.getCompra().get(dados.getCompra().size()-1).getData()));
		
		for (int i=0; i<dados.getCompra().get(pos).getProdutos().size();i++) {
			for (int linha=0;linha<nomeProdutosDaCompra.length ; linha++) {
			nomeProdutosDaCompra[i]= dados.getCompra().get(pos).getProdutos().get(i).getNome();

			precoProdutosDaCompra[i]= dados.getCompra().get(pos).getProdutos().get(i).getPreco();

			qtdProdutosDaCompra[i]= dados.getCompra().get(pos).getProdutos().get(i).getQuantidade();
		
			dataCompra[i]=formatter.format( dados.getCompra().get(pos).getData());
			
			for (int coluna=0;coluna<4;coluna++) {
				data[linha][0]= nomeProdutosDaCompra[i];
				data[linha][1]=precoProdutosDaCompra[i];
				data[linha][2]=qtdProdutosDaCompra[i];
				data[linha][3]=dataCompra[i];
			}
			
			}
		}
		
		

		

		
		table = new JTable (data, colunaNomes);
		table.setPreferredScrollableViewportSize(new Dimension (500,50));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	
	}

}
