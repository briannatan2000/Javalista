package pacote_1_TP3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ListaDeCategorias implements Lista {
	int i= 1;
	
	
	public Categoria  categorias[] = new Categoria[10];
	
	
	//cadastro de categoria manual
	{
	Categoria fruta = new Categoria();
	fruta.nome = "Frutas/verduras/legumes";
	categorias[0]= fruta;
	}

	@Override
	public void adicionarItens() {
		// TODO Auto-generated method stub
		Categoria novaCategoria = new Categoria();
		 try (Scanner ler = new Scanner (System.in)) {
			novaCategoria.nome = ler.next();
		}
		 System.out.print(categorias.length+"\n");
		 
		 categorias[i]=novaCategoria;
		 i=categorias.length+1;
	
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