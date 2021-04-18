package modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeMedidas implements Lista {
	int id=0;
	Scanner ler = new Scanner (System.in);

	
	public ArrayList<UnidadeDeMedida> medidas=new ArrayList<UnidadeDeMedida>();
	
	//cadastro de medidas manual
	{
	UnidadeDeMedida medida1 = new UnidadeDeMedida(0,"quilograma", "kg");

	medidas.add(medida1);
	}

	@Override
	public void adicionarItens() {
		// TODO Auto-generated method stub
		
		System.out.print("Insira o nome da nova medida e depois sua sigla: \n");
		id=id+1;
		UnidadeDeMedida novaMedida = new UnidadeDeMedida(id,ler.next(), ler.next());
		medidas.add(novaMedida);
		System.out.print(medidas.get(id));
	}

	@Override
	public void exlcuirItens() {
		System.out.print("Qual unidade de medida você gostaria de excluir? Digite o ID conforme a abaixo:\n");
		System.out.print(medidas.toString()+"\n");
		medidas.remove(ler.nextInt());
		
	}

	@Override
	public void editarItens() {
		System.out.print("Qual unidade de medida você gostaria de editar? Digite o ID conforme a abaixo:\n");
		System.out.print(medidas.toString()+"\n");
		int id = ler.nextInt();
		System.out.print("O que você gostaria de editar?\n (nome, sigla)");
		
		switch (ler.next()) {
			case "nome":
			medidas.get(id).setNome(ler.next());
			
			case "sigla":
			medidas.get(id).setSigla(ler.next());
			
			
		}
		
	}
}


		
	


