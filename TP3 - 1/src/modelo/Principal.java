package modelo;
import java.util.Scanner;
public class Principal {
	

	
	public static void main(String[] args) {
		
		int i = 0;
		
		ListaDeProdutos lp = new ListaDeProdutos();
		ListaDeMedidas lmed= new ListaDeMedidas();
		ListaDeCategorias lcat= new ListaDeCategorias();
		Scanner ler = new Scanner (System.in);
		
		while ( i<1) {
			switch (ler.nextInt()) {
			
			case 1: 
			//adiciona produtos
			lp.adicionarItens();
			System.out.print("Deseja adicionar mais? (true or false)");
			if (ler.nextBoolean()==false) {
				i=1;
							
			}
			
			case 2:
			//adiciona medidas
			lmed.adicionarItens();
			System.out.print("Deseja adicionar mais? (true or false)");
			if (ler.nextBoolean()==false) {
				i=1;
							
			}
				
			case 3:
			//adiciona categorias
			lcat.adicionarItens();
			System.out.print("Deseja adicionar mais? (true or false)");
			if (ler.nextBoolean()==false) {
				i=1;
							
			}
				
			case 4:
			
			//Fazer compra
			lp.fazerCompras();
			System.out.print("Deseja adicionar mais? (true or false)");
			if (ler.nextBoolean()==false) {
				i=1;
							
			}
		}
		
}
		
		

	}
}