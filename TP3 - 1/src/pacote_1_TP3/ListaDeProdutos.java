package pacote_1_TP3;

import java.util.Scanner;

public class ListaDeProdutos implements Lista{
	double precoTotal=0;
	
	public Produto produtos[]=new Produto[2];
	ListaDeCategorias lcat = new ListaDeCategorias ();
	ListaDeMedidas lmed = new ListaDeMedidas();
	int i=0;
	
	//Cadastro de Produtos manual
	{
		Produto p1 = new Produto("Biscoito", 4, "un", 8.96, "Lanches");

		
		
		produtos [i] = p1;
	}

	@Override
	public  void adicionarItens() {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		System.out.print("Insira o nome, quantidade, unidade de medida, pre�o e categoria do produto: \n");
		Produto novoProduto = new Produto(ler.next(), ler.nextInt(),ler.next(),ler.nextDouble(),ler.next());
		i=i+1;
		produtos[i]= novoProduto;
		System.out.print(produtos[i].toString()+"\n");
	}
	
	public double fazerCompras() {
		System.out.print("O que deseja?\n");
		for (int i = 0 ;i< 2; i++){
		System.out.print("ID: " + i + "\n" + produtos[i].toString() + "\n");
		}
		int j=0;
		while ( j <1) {
		Scanner ler=new Scanner (System.in);
		System.out.print("Digite o n�mero do produto\n");
		int produtoAtual=ler.nextInt();
		precoTotal = precoTotal + produtos[produtoAtual].getPreco()*produtos[produtoAtual].getQuantidade();
		System.out.print("Deseja algo mais? (true or false)");
		if(ler.nextBoolean()==false) {
			j=1;
		}
		else j=0;
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
		
=======
		
		
		produtos [0] = p1;

	}

}
