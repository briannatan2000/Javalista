package controle;
import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ControleCategoria implements Lista {

	
		int id= 0;
		Scanner ler = new Scanner (System.in);
		
		public ArrayList<Categoria>  categorias = new ArrayList<Categoria>();
		

		
		
		//cadastro de categoria manual
		{
		Categoria fruta1 = new Categoria(id, "Fruta, verdura e legume");
		
		categorias.add(fruta1);
		}

		@Override
		public void adicionarItens() {
			// TODO Auto-generated method stub
		
			System.out.print("Insira o nome da nova categoria: \n");
			
			id=id+1;
			Categoria novaCategoria = new Categoria(id , ler.next());
			categorias.add(novaCategoria);
			System.out.print("Nova categoria criada: "+ categorias.get(id) + "\n");
			 	
			}
		
			 
		
		

		@Override
		public void exlcuirItens() {
			System.out.print("Qual categoria você gostaria de excluir? Digite o ID conforme a abaixo:\n");
			System.out.print(categorias.toString()+"\n");
			categorias.remove(ler.nextInt());
		}

		@Override
		public void editarItens() {
			System.out.print("Qual categoria você gostaria de editar? Digite o ID conforme a abaixo:\n");
			System.out.print(categorias.toString()+"\n");
			int id = ler.nextInt();
			System.out.print("O que você gostaria de editar?\n (nome, sigla)");
			
			switch (ler.next()) {
				case "nome":
				categorias.get(id).setNome(ler.next());
				
			
			}
		}
	}

