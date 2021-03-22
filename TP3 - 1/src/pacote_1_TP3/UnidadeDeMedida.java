package pacote_1_TP3;

public class UnidadeDeMedida {
String nome;


public UnidadeDeMedida(String a){
	nome = a;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

@Override
public String toString() {
	return "Nome da unidade de medida = " + nome;
}

}
