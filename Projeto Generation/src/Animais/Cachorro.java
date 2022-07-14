package Animais;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	public String latir(){
		return "Au.. Au!";
	}
	public String correr() {
		return "Correndo..";
	}
				
}
