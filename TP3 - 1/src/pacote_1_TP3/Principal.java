package pacote_1_TP3;

public class Principal {
	
	static Produto p1;
	
	public static void main(String[] args) {
		p1 = new Produto("Biscoito", 4, "un", 8.96, "Lanches");
		
		System.out.println(p1.toString());
	}
}