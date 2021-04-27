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
	



	

	
}
