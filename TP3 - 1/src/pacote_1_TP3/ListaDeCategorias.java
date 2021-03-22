package pacote_1_TP3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ListaDeCategorias implements Lista {

	int i= 0;
	
	
	public Categoria  categorias[] = new Categoria[2];

	
	
	//cadastro de categoria manual
	{
	Categoria fruta = new Categoria("Frutas/verduras/legumes");
	
	categorias[i]= fruta;
	}

	@Override
	public void adicionarItens() {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		System.out.print("Insira o nome da nova categoria: \n");
		Categoria novaCategoria = new Categoria(ler.next());
		i=i+1;
		categorias[i]= novaCategoria;
		System.out.print("Nova categoria criada: "+ categorias[i].nome + "\n");
		 	
		}
	
		 
	
	

	@Override
	public void exlcuirItens() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarItens() {
		// TODO Auto-generated method stub
		
	}

	
}