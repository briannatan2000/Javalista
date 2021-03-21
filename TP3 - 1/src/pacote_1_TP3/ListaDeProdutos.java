package pacote_1_TP3;

public class ListaDeProdutos {
	
	public Produto produtos[]=new Produto[2];
	ListaDeCategorias lcat = new ListaDeCategorias ();
	ListaDeMedidas lmed = new ListaDeMedidas();
	
	//Cadastro de Produtos manual
	{
		Produto maça = new Produto();
		maça.nome="maça";
		maça.categoria = lcat.categorias[0].nome;
		maça.unidade = lmed.medidas[0].nome;
		
		produtos [0] = maça;
	}

}
