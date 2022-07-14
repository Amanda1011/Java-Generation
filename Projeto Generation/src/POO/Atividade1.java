package POO;

public class Atividade1 {

	public static void main(String[] args) {
		
		Cliente c1= new Cliente();
		c1.setNome("Laura");
		c1.setEmail("MLaura@.com");
		c1.setEndereco("Rua bom jardim");
		c1.setCpf("123.456.789.10");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getEmail());
		System.out.println(c1.getEndereco());
		System.out.println(c1.getCpf());
	}

}
