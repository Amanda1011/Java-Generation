 package POO;

public class Atividade4 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("Joaquim");
		func.setSalario(1700);
		func.setSetor("Vendedor");
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		System.out.println(func.getSetor());
	}

}
