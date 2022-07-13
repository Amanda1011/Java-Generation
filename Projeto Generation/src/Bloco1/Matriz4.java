/*/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
package Bloco1;

import java.util.Scanner;

public class Matriz4 {

	public static void main(String[] args) {
		int  somaValores=0, somaPrimeiraDiagonal = 0;
		int numeros[][]= new int [3][3], linha, coluna;
		
		Scanner leia = new Scanner(System.in);

		for (linha= 0; linha <3; linha++)
		{
			for(coluna= 0; coluna <3; coluna++)
			{
				System.out.print("Entre com um número: ");
				numeros[linha] [coluna] = leia.nextInt();
				
				somaValores = somaValores + numeros[linha] [coluna];
				
				if (linha == coluna)
				{
					somaPrimeiraDiagonal += somaPrimeiraDiagonal + numeros[linha][coluna];
				}
			}
		}
				System.out.println("\nA soma dos valores totais é: "+ somaValores);
				System.out.println("\nA soma dos valores totais é: "+ somaPrimeiraDiagonal);
	}

}
