package modelo;

import java.util.*;

public class Dados {
	private  ArrayList<Produto> produtos = new ArrayList<Produto>();
	private int qtdProd = 0;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private int qtdCat = 0;
	private ArrayList<UnidadeDeMedida> medidas = new ArrayList<UnidadeDeMedida>();
	private int qtdMed = 0;
	
	
	public void fillWithSomeData() {
		
			UnidadeDeMedida medida1 = new UnidadeDeMedida(qtdMed,"quilograma", "kg");

			medidas.add(medida1);
			
			Categoria fruta1 = new Categoria(qtdCat, "Fruta, verdura e legume");
			
			categorias.add(fruta1);
			Produto p1 = new Produto(qtdProd,"Biscoito", 4, "un", 8.96, "Lanches");

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
	
	

}