package pacote_1_TP3;

public class ListaDeProdutos {
	
	public Produto produtos[]=new Produto[2];
	ListaDeCategorias lcat = new ListaDeCategorias ();
	ListaDeMedidas lmed = new ListaDeMedidas();
	
	//Cadastro de Produtos manual
	{
		Produto ma�a = new Produto();
		ma�a.nome="ma�a";
		ma�a.categoria = lcat.categorias[0].nome;
		ma�a.unidade = lmed.medidas[0].nome;
		
		produtos [0] = ma�a;
	}

}
