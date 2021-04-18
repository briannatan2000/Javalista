package modelo;

public class Categoria {
	String nome;
	int id;
	
	public Categoria(int a, String b){
		id = a;
		nome = b;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "ID: " + id + "\nNome da categoria= " + nome + "\n";
	}

	


}
