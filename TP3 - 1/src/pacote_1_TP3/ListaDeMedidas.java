package pacote_1_TP3;

public class ListaDeMedidas implements Lista {
	
	public UnidadeDeMedida medidas[]=new UnidadeDeMedida[2];
	
	//cadastro de medidas manual
	{
	UnidadeDeMedida quilograma = new UnidadeDeMedida();
	quilograma.nome = "kg";
	medidas[0]= quilograma;
	}

	@Override
	public void adicionarItens() {
		// TODO Auto-generated method stub
		
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
