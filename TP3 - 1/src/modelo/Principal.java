package modelo;
import java.util.Scanner;
import controle.*;
public class Principal {
	

	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0;
		
		ControleProduto lp = new ControleProduto();
		ControleMedida lmed= new ControleMedida();
		ControleCategoria lcat= new ControleCategoria();
		
		
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