package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeProdutos implements Lista{
	double precoTotal=0;
	int id=0;
	int j=0;
	public ArrayList<Produto> produtos =new ArrayList<Produto>();
	ListaDeCategorias lcat = new ListaDeCategorias ();
	ListaDeMedidas lmed = new ListaDeMedidas();
	
	
	//Cadastro de Produtos manual
	{
		Produto p1 = new Produto(0,"Biscoito", 4, "un", 8.96, "Lanches");

		produtos.add(p1);
	}

	@Override
	public  void adicionarItens() {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
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
		
		Scanner ler=new Scanner (System.in);
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
		
	}

	@Override
	public void editarItens() {
		// TODO Auto-generated method stub
		

		


	}

}
