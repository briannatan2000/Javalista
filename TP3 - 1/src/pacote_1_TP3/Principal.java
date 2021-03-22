package pacote_1_TP3;

public class Principal {
	

	
	public static void main(String[] args) {
		

		
		ListaDeProdutos lp = new ListaDeProdutos();
		ListaDeMedidas lmed= new ListaDeMedidas();
		ListaDeCategorias lcat= new ListaDeCategorias();
		
		//adiciona produtos
		lp.adicionarItens();
		
		//adiciona medidas
		lmed.adicionarItens();
		
		//adiciona categorias
		lcat.adicionarItens();
	
		System.out.println(lp.produtos[1].toString());
		
		//Fazer compra
		lp.fazerCompras();
		
		
		

	}
}