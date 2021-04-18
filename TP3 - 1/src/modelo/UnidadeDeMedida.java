package modelo;

public class UnidadeDeMedida {

int id;
String nome;
String sigla;




public UnidadeDeMedida(int a , String b, String c){
	id = a;
	nome = b;
	sigla = c;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}






public String getSigla() {
	return sigla;
}

public void setSigla(String sigla) {
	this.sigla = sigla;
}

@Override
public String toString() {
	return "ID: " + id + "\nNome da unidade de medida = " + nome +"\nSigla: " + sigla + "\n";
}


}
