package modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeMedidas implements Lista {
	int i=0;


	
	public ArrayList<UnidadeDeMedida> medidas=new ArrayList<UnidadeDeMedida>();
	
	//cadastro de medidas manual
	{
	UnidadeDeMedida quilograma = new UnidadeDeMedida(0,"kg");

	medidas.add(quilograma);
	}

	@Override
	public void adicionarItens() {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		System.out.print("Insira o nome da nova medida: \n");
		i=i+1;
		UnidadeDeMedida novaMedida = new UnidadeDeMedida(i,ler.next());
		medidas.add(novaMedida);
		System.out.print(medidas.get(i));
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


		
	


