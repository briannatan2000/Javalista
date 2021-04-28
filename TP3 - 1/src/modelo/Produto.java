package modelo;

public class Produto {
//Atributos
	private String nome;
	private int quantidade;
	private String unidade;
	private double preco;
	private String categoria;
	private int id;
	private int posCat;
	private int posMed;
	
//Metodos (to pensando em colocar os métodos como comprar do tipo boolean e cadastrar, alterar e excluir nas listas)
	
	public Produto(int a, String b, int c, String d, double e, String f, int g, int h){
		id = a;
		nome = b;
		quantidade = c;
		unidade = d;
		preco = e;
		categoria = f;
		posCat = g;
		posMed = h;
	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosCat() {
		return posCat;
	}
	public void setPosCat(int PosCat) {
		this.posCat = posCat;
	}
	
	public int getPosMed() {
		return posMed;
	}
	public void setPosMed(int PosMed) {
		this.posMed = posMed;
	}
	

	@Override
	public String toString() {

		return  "ID = " + id + "Nome do Produto = " + nome + "\nQuantidade = " + quantidade + "\nUnidade = " + unidade + "\nPreco = " + preco
				+ "\nCategoria = " + categoria + "\n";

	}

	}