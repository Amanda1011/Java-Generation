/*5- Crie um programa que leia um número do teclado ate que encontre um
numero igual a zero. No final, mostre a soma dos  numeros
digitados.(DO...WHILE)*/
package Bloco1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int num= 1, somaTotal= 0;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			somaTotal += num;
		}
		while(num != 0);
		
		System.out.println("\nA soma dos números foi: "+ somaTotal);
	}

}
