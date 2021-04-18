package modelo;

public class UnidadeDeMedida {

int id;
String nome;





public UnidadeDeMedida(int a , String b){
	id = a;
	nome = b;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public UnidadeDeMedida(int b){
	id = b;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "ID: " + id + "\nNome da unidade de medida = " + nome +"\n";
}


}
