package view;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import modelo.Produto;


public class TelaEditaveis implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroProduto;
	private JButton comprarProdutoCarrinho;
	private JButton refreshProdutoCarrinho;
	private JButton refreshProduto;
	private JButton cadastroUnidadeMedida;
	private JButton refreshUnidadeMedida;
	private JButton adicionaItem;
	private JButton refreshItem;
	private JButton cadastroCategoria;
	private JButton refreshCategoria;
	private static ControleDados dados;
	private JList<String> listaProdutosCadastrados;
	private JList<String> listaProdutosCarrinho;
	private JList<String> listaUnidadeMedidasCadastrados;
	private JList<String> listaCategoriasCadastrados;
	private double precoTotal;
	private String totalPagar ;
	JLabel total = new JLabel();

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de produtos cadastrados (JList)
			String[] nomesProdutos = new String[dados.getProdutos().size()];
			for (int i=0; i<dados.getProdutos().size();i++) {
				nomesProdutos[i]= dados.getProdutos().get(i).getNome();
			}
			
			listaProdutosCadastrados = new JList<String>(nomesProdutos);
			janela = new JFrame("Produto");
			titulo = new JLabel("Produtos Cadastrados");
			cadastroProduto = new JButton("Cadastrar");
			refreshProduto = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaProdutosCadastrados.setBounds(20, 50, 350, 120);
			listaProdutosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProdutosCadastrados.setVisibleRowCount(10);

			cadastroProduto.setBounds(70, 177, 100, 30);
			refreshProduto.setBounds(200, 177, 100, 30);

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

			break;

			case 2:// Mostrar dados de professores cadastrados (JList)
				
				String[] nomesMedidas = new String[dados.getMedidas().size()];
				for (int i=0; i<dados.getMedidas().size();i++) {
					nomesMedidas[i]= dados.getMedidas().get(i).getNome();
				}
			listaUnidadeMedidasCadastrados = new JList<String>(nomesMedidas);
			janela = new JFrame("Unidadade de Medidas");
			titulo = new JLabel("Unidades de Medidas Cadastrados");
			cadastroUnidadeMedida = new JButton("Cadastrar");
			refreshUnidadeMedida = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaUnidadeMedidasCadastrados.setBounds(20, 50, 350, 120);
			listaUnidadeMedidasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaUnidadeMedidasCadastrados.setVisibleRowCount(10);


			cadastroUnidadeMedida.setBounds(70, 177, 100, 30);
			refreshUnidadeMedida.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaUnidadeMedidasCadastrados);
			janela.add(cadastroUnidadeMedida);
			janela.add(refreshUnidadeMedida);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroUnidadeMedida.addActionListener(this);
			refreshUnidadeMedida.addActionListener(this);
			listaUnidadeMedidasCadastrados.addListSelectionListener(this);
			break;
			
			case 3:// Mostrar dados categorias cadastrados (JList)
				
				String[] nomesCategorias = new String[dados.getMedidas().size()];
				for (int i=0; i<dados.getCategoria().size();i++) {
					nomesCategorias[i]= dados.getCategoria().get(i).getNome();
				}
			listaCategoriasCadastrados = new JList<String>(nomesCategorias);
			janela = new JFrame("Categorias");
			titulo = new JLabel("Categorias Cadastradas");
			cadastroUnidadeMedida = new JButton("Cadastrar");
			refreshUnidadeMedida = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaCategoriasCadastrados.setBounds(20, 50, 350, 120);
			listaCategoriasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaCategoriasCadastrados.setVisibleRowCount(10);


			cadastroCategoria.setBounds(70, 177, 100, 30);
			refreshCategoria.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaUnidadeMedidasCadastrados);
			janela.add(cadastroUnidadeMedida);
			janela.add(refreshUnidadeMedida);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCategoria.addActionListener(this);
			refreshCategoria.addActionListener(this);
			listaCategoriasCadastrados.addListSelectionListener(this);
			break;
			
				
			case 4:// Mostrar dados de produtos cadastrados (JList)
				String[] prodCarrinho = new String[dados.getProdutos().size()];
				for (int i=0; i<dados.getProdutos().size();i++) {
					prodCarrinho[i]= dados.getProdutos().get(i).getNome();
				}
				
				listaProdutosCarrinho = new JList<String>(prodCarrinho);
				janela = new JFrame("Produto");
				titulo = new JLabel("Produtos Cadastrados");
				comprarProdutoCarrinho = new JButton("Comprar");
				refreshProdutoCarrinho = new JButton("Refresh");

				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				listaProdutosCarrinho.setBounds(20, 50, 350, 120);
				listaProdutosCarrinho.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaProdutosCarrinho.setVisibleRowCount(10);

				comprarProdutoCarrinho.setBounds(70, 177, 100, 30);
				refreshProdutoCarrinho.setBounds(200, 177, 100, 30);

				janela.setLayout(null);

				janela.add(titulo);
				janela.add(listaProdutosCarrinho);
				janela.add(comprarProdutoCarrinho);
				janela.add(refreshProdutoCarrinho);

				janela.setSize(400, 250);
				janela.setVisible(true);

				comprarProdutoCarrinho.addActionListener(this);
				refreshProdutoCarrinho.addActionListener(this);
				listaProdutosCarrinho.addListSelectionListener(this);

				break;

				
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo Produto
		if(src == cadastroProduto) {
			new TelaDetalhe().inserirEditar(1, dados, this, dados.getProdutos().size()+1);
		}


		// Atualiza a lista de nomes de alunos mostrada no JList
		if(src == refreshProduto) {
			String[] nomesProdutos = new String[dados.getProdutos().size()];
			for (int i=0; i<dados.getProdutos().size();i++) {
				nomesProdutos[i]= dados.getProdutos().get(i).getNome();
			}
			
			listaProdutosCadastrados.setListData(nomesProdutos);			
			listaProdutosCadastrados.updateUI();
		}
		if (src == cadastroUnidadeMedida) {
			new TelaUnidadeMedida().inserirEditar(1, dados, this, dados.getMedidas().size()+1);
		}
		
		if(src == refreshUnidadeMedida) {
			String[] nomesMedidas = new String[dados.getMedidas().size()];
			for (int i=0; i<dados.getMedidas().size();i++) {
				nomesMedidas[i]= dados.getMedidas().get(i).getNome();
			}
			
			listaUnidadeMedidasCadastrados.setListData(nomesMedidas);			
			listaUnidadeMedidasCadastrados.updateUI();
		}
		if (src == cadastroCategoria) {
			new TelaCategoria().inserirEditar(1, dados, this, dados.getCategoria().size()+1);
		}
		
		if(src == refreshCategoria) {
			String[] nomesMedidas = new String[dados.getCategoria().size()];
			for (int i=0; i<dados.getCategoria().size();i++) {
				nomesMedidas[i]= dados.getCategoria().get(i).getNome();
			}
			
			listaCategoriasCadastrados.setListData(nomesMedidas);			
			listaCategoriasCadastrados.updateUI();
		}
		if (src == comprarProdutoCarrinho) {
		
		}
		
		if(src == refreshProdutoCarrinho) {
			String[] prodCarrinho = new String[dados.getProdutos().size()];
			for (int i=0; i<dados.getProdutos().size();i++) {
				prodCarrinho[i]= dados.getProdutos().get(i).getNome();
			}
			
			listaProdutosCarrinho.setListData(prodCarrinho);			
			listaProdutosCarrinho.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaProdutosCadastrados) {
			 new TelaDetalhe().inserirEditar(2, dados, this, 
					listaProdutosCadastrados.getSelectedIndex());
			
		}
		if(e.getValueIsAdjusting() && src == listaUnidadeMedidasCadastrados) {
			 new TelaUnidadeMedida().inserirEditar(2, dados, this, 
					 listaUnidadeMedidasCadastrados.getSelectedIndex());
			
		}
		if(e.getValueIsAdjusting() && src == listaCategoriasCadastrados) {
			 new TelaCategoria().inserirEditar(2, dados, this, 
					 listaCategoriasCadastrados.getSelectedIndex());
			
		}
		if(e.getValueIsAdjusting() && src == listaProdutosCarrinho) {
			telaCompra(dados.getProdutos().get(listaProdutosCarrinho.getSelectedIndex()));
			
		}
		
		

	}
	
	private void telaCompra(Produto prod) {
		
		janela = new JFrame("Compra");
		titulo = new JLabel("Adicionar no carrinho");
		JLabel nomeProd = new JLabel ("Produto: " + prod.getNome());
		nomeProd.setBounds(50, 50, 100, 30);
		JLabel nomePreco = new JLabel ("Preço: " + prod.getPreco());
		nomePreco.setBounds(50, 80, 100, 30);
		adicionaItem = new JButton("Confirmar");
		refreshItem = new JButton("Cancelar");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		adicionaItem.addActionListener((action)->{
			dados.inserirCarrinho(prod);
			dados.adicionarPrecoTotal(prod.getPreco());
			janela.dispose();
			new TelaCarrinho().mostrarDados(dados);
			
		})
		
		;
		
		janela.setLayout(null);

		adicionaItem.setBounds(70, 177, 100, 30);
		refreshItem.setBounds(200, 177, 100, 30);
		janela.add(nomeProd);
		janela.add(nomePreco);
		janela.add(adicionaItem);
		janela.add(refreshItem);
		janela.add(titulo);
		janela.setSize(400, 250);
		janela.setVisible(true);

		
	}

}