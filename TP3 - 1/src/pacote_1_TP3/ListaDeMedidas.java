package pacote_1_TP3;

import java.util.Scanner;

public class ListaDeMedidas implements Lista {
	int i=0;


	
	public UnidadeDeMedida medidas[]=new UnidadeDeMedida[2];
	
	//cadastro de medidas manual
	{
	UnidadeDeMedida quilograma = new UnidadeDeMedida("kg");

	medidas[i]= quilograma;
	}

	@Override
	public void adicionarItens() {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		System.out.print("Insira o nome da nova medida: \n");
		UnidadeDeMedida novaMedida = new UnidadeDeMedida(ler.next());
		i=i+1;
		medidas[i]= novaMedida;
		System.out.print("Nova unidade de medida criada: " + medidas[i].nome + "\n");
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

