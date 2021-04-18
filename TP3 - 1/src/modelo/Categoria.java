package modelo;

public class Categoria {
	String nome;

	public Categoria(String a){
		nome = a;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Nome da categoria= " + nome;
	}

	


}
