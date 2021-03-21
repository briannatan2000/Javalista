package pacote_1_TP3;

public class ListaDeProdutos {
	
	public Produto produtos[]=new Produto[2];
	ListaDeCategorias lcat = new ListaDeCategorias ();
	ListaDeMedidas lmed = new ListaDeMedidas();
	
	//Cadastro de Produtos manual
	{
		Produto p1 = new Produto("Biscoito", 4, "un", 8.96, "Lanches");
		
		
		produtos [0] = p1;
	}

}
