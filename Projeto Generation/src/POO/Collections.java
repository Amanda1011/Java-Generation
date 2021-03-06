package POO;
/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Collections {
	
	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n****************************************************");
			System.out.println("\nDigite(1) para adicionar produtos ao estoque");
			System.out.println("\nDigite(2) para remover produtos do estoque");
			System.out.println("\nDigite(3) para atualizar os produtos do estoque");
			System.out.println("\nDigite(4) para mostrar todos os produtos do estoque");
			System.out.println("\n(0) Digite sua opção: ");
			System.out.println("\n*****************************************************");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
			break;
			
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);				
				}
				else {
					System.out.println("\nProduto não existe no estoque.");
				}
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar: " +verifica);
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					String novo = leia.nextLine();
					estoque.add(novo);
				}
				else {
					System.out.println("\nProduto não existe no estoque.");
				}
				System.out.println(estoque);
			break;
			
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
			break;
			
			case 0:
				System.out.println("\nPrograma finalizado....");
			break;
			default: 
				System.out.println("\nOpção inválida!");
			}
		}
		while(op!=0);
		
	}
}
