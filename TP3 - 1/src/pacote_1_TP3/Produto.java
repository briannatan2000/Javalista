package pacote_1_TP3;

public class Produto {
//Atributos
	private String nome;
	private int quantidade;
	private String unidade;
	private double preco;
	private String categoria;
	
	
//Metodos (to pensando em colocar os métodos como comprar do tipo boolean e cadastrar, alterar e excluir nas listas)
	
	public Produto(String a, int b, String c, double d, String e){
		nome = a;
		quantidade = b;
		unidade = c;
		preco = d;
		categoria = e;
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

	@Override
	public String toString() {
		return "Nome do Produto=" + nome + ", quantidade=" + quantidade + ", unidade=" + unidade + ", preco=" + preco
				+ ", categoria=" + categoria;
	}

	}