package modelo;

import java.util.ArrayList;
import java.util.Date;

public class HistoricoCompra {

	private ArrayList<Carrinho> compra = new ArrayList<Carrinho>();
	private String nome;
	private int id;
	private Date data;
	private double precoTotal;
	

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public ArrayList<Carrinho> getCompra() {
		return compra;
	}

	public void setCompra(ArrayList<Carrinho> compra) {
		this.compra = compra;
	}
	public void addCompra(Carrinho produto) {
		compra.add(produto);
	}
	@Override
	public String toString() {
		return "ID: " + id + "\nCompra: " + nome + "\n";
	}

	
}
