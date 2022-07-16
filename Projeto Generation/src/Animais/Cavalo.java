package Animais;

public class Cavalo extends Animal { 
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	public String relinchar() {
		return "relinchando...";
	}
	public String correr() {
		return "Correndo...";
	}

}
