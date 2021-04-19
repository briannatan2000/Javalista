package controle;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.*;

public class ControleProduto implements Lista {


		double precoTotal=0;
		int id=0;
		int j=0;
		public ArrayList<Produto> produtos =new ArrayList<Produto>();
		ControleCategoria lcat = new ControleCategoria ();
		ControleMedida lmed = new ControleMedida();
		Scanner ler = new Scanner (System.in);
		
		//Cadastro de Produtos manual
		{
			Produto p1 = new Produto(0,"Biscoito", 4, "un", 8.96, "Lanches");

			produtos.add(p1);
		}
		public String getNome() {
			return produtos.get(id).getNome();
		}

		@Override
		public  void adicionarItens() {
		
			
			
			System.out.print("Insira o nome, quantidade, unidade de medida, preço e categoria do produto: \n");
			id = id + 1;
			Produto novoProduto = new Produto(id,ler.next(), ler.nextInt(),ler.next(),ler.nextDouble(),ler.next());
			produtos.add(novoProduto);
			
			
		
			System.out.print(produtos.toString()+"\n");
		}
		
		public double fazerCompras() {
			System.out.print("O que deseja?\n");
		
			System.out.print(produtos.toString() + "\n");
			
			while (j <1){
			
			
			System.out.print("Digite o ID do produto\n");
			int produtoAtual=ler.nextInt();
			precoTotal = precoTotal + produtos.get(produtoAtual).getPreco()*produtos.get(produtoAtual).getQuantidade();
			System.out.print("Deseja algo mais? (true or false)");
			if(ler.nextBoolean()==false) {
				j=1;
			}
			else { j=0;
			}
			}
			System.out.print("Compra feita com sucesso, total: " + precoTotal);
			
			
			return precoTotal;
		}

		@Override
		public void exlcuirItens() {
			// TODO Auto-generated method stub
			System.out.print("Qual produto você gostaria de excluir? Digite o ID conforme a abaixo:\n");
			System.out.print(produtos.toString()+"\n");
			produtos.remove(ler.nextInt());
		}

		@Override
		public void editarItens() {
			// TODO Auto-generated method stub
			System.out.print("Qual produto você gostaria de editar? Digite o ID conforme a abaixo:\n");
			System.out.print(produtos.toString()+"\n");
			int id = ler.nextInt();
			System.out.print("O que você gostaria de editar?\n (nome, quantidade, unidade de medida, categoria, preco)");
			
			switch (ler.next()) {
				case "nome":
				produtos.get(id).setNome(ler.next());
				
				case "quantidade":
				produtos.get(id).setQuantidade(ler.nextInt());
				
				case "unidade de medida":
					produtos.get(id).setUnidade(ler.next());
				
				case "categoria":
					produtos.get(id).setCategoria(ler.next());
				
				case "preco":
				produtos.get(id).setPreco(ler.nextDouble());
			}
			

			


		}
	
}
