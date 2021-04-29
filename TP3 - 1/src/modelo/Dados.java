package modelo;

import java.util.*;

public class Dados {
	private  ArrayList<Produto> produtos = new ArrayList<Produto>();
	private int qtdProd = 0;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private int qtdCat = 0;
	private ArrayList<UnidadeDeMedida> medidas = new ArrayList<UnidadeDeMedida>();
	private int qtdMed = 0;
	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	private int qtdCar = 0;
	private double preco;
	
	public void fillWithSomeData() {
		
			UnidadeDeMedida medida1 = new UnidadeDeMedida(qtdMed,"Quilograma", "kg");
			qtdMed+=1;
			UnidadeDeMedida medida2 = new UnidadeDeMedida(qtdMed,"Unidade", "un");
			qtdMed+=1;
			UnidadeDeMedida medida3 = new UnidadeDeMedida(qtdMed,"Mililitro", "ml");

			medidas.add(medida1);
			medidas.add(medida2);
			medidas.add(medida3);
			
			Categoria categoria1 = new Categoria(qtdCat, "Fruta, verdura e legume");
			qtdCat+=1;
			Categoria categoria2 = new Categoria(qtdCat, "Lanches");
			qtdCat+=1;
			Categoria categoria3 = new Categoria(qtdCat, "Produtos de Limpeza");
			
			categorias.add(categoria1);
			categorias.add(categoria2);
			categorias.add(categoria3);
			
			Produto p1 = new Produto(qtdProd,"Biscoito", 4, "un", 8.96, categoria2.getNome(),0, 0);

			produtos.add(p1);
	}
	
	public  ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void inserirEditarProduto(Produto novoProduto) {
		produtos.add(novoProduto);
		
	}
	
	public ArrayList<Categoria> getCategoria() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	public void inserirEditarCategoria(Categoria novaCategoria) {
		categorias.add(novaCategoria);

	}
	
	public ArrayList<UnidadeDeMedida> getMedidas() {
		return medidas;
	}
	public void setMedidas(ArrayList<UnidadeDeMedida> medidas) {
		this.medidas = medidas;
	}

	public void inserirEditarMedida(UnidadeDeMedida novaMedida) {
		medidas.add(novaMedida);

	}
	public  ArrayList<Produto> getCarrinho() {
		return carrinho;
	}
	public void inserirCarrinho(Produto novoProduto) {
		carrinho.add(novoProduto);

	}
	public double getPrecoCarrinho() {
		return preco;
	}
	public void setPrecoCarrinho(float novoPreco) {
		preco=novoPreco;
	}

	public void adicionarPrecoTotal (double precoProduto) {
		preco+=precoProduto;
	}
	
	
	

}