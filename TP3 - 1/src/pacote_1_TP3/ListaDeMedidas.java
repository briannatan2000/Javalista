package pacote_1_TP3;

public class ListaDeMedidas extends Lista {
	
	public UnidadeDeMedida medidas[]=new UnidadeDeMedida[2];
	
	//cadastro de medidas manual
	{
	UnidadeDeMedida quilograma = new UnidadeDeMedida();
	quilograma.nome = "kg";
	medidas[0]= quilograma;
	}
}
