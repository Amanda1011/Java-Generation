package Animais;

public class CachorroCavaloPreguica {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Bolinha", 6);
		String somLatir = cachorro.latir();
		System.out.println(somLatir);
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		
		Cavalo cavalo = new Cavalo("Cristhian", 8);
		String somRelinchar = cavalo.relinchar();
		System.out.println(somRelinchar);
		System.out.println("Nome do cavalo: "+ cavalo.getNome());
		System.out.println("Idade: "+ cavalo.getIdade());
		
		Preguica preguica = new Preguica("Cigana", 11);
		String somGrunir = preguica.grunir();
		System.out.println(somGrunir);
		System.out.println("Nome da preguiça: "+ preguica.getNome());
		System.out.println("Idade: "+ preguica.getIdade());
	}
} 

