package Animais;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public String grunhir() {
		return  "Huf..Huf..";
	}
	
	public String subirArvore() {
		return "Subindo...";
	}
}
