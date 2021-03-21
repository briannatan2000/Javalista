package pacote_1_TP3;

public class ListaDeCategorias extends Lista {

	public Categoria categorias [] = new Categoria [2];
	
	//cadastro de categoria manual
	{
	Categoria fruta = new Categoria();
	fruta.nome = "Frutas/verduras/legumes";
	categorias[0]= fruta;
	}
}
