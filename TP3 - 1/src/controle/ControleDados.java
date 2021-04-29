package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public ArrayList<Produto> getProdutos() {
		return this.d.getProdutos();
	}
		
	public ArrayList<Categoria> getCategoria() {
		return this.d.getCategoria();
	}
	
	public ArrayList<UnidadeDeMedida> getMedidas() {
		return this.d.getMedidas();
	}

	public  ArrayList<Produto> getCarrinho() {
		return this.d.getCarrinho();
	}
	public void inserirCarrinho(Produto novoProduto) {
		this.d.inserirCarrinho(novoProduto);

	}
	public double getPrecoCarrinho() {
		return this.d.getPrecoCarrinho();
	}
	public void setPrecoCarrinho(float novoPreco) {
		this.d.setPrecoCarrinho(novoPreco);
	}

	public void adicionarPrecoTotal (double precoProduto) {
		this.d.adicionarPrecoTotal(precoProduto);
	}
	

	
}
