package pacote_1_TP3;

import java.util.Arrays;

public class Carrinho {
	//Atributos
	private double precoTotal;
	private Produto produtos[];
	
	//Métodos
	public Carrinho(double a, Produto b[]){
		precoTotal = a;
		produtos[0]= b[0];
	}
	
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Preço total do carrinho= " + precoTotal + ", produtos=" + Arrays.toString(produtos);
	}
	
	
	
}
