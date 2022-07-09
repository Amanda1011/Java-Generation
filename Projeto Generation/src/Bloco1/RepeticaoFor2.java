/*2- Ler 10 números e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
package Bloco1;

import java.util.Scanner;

public class RepeticaoFor2 {

	public static void main(String[] args) {
		
		int num=0, contPar=0, contImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=1; x<=10; x++)
		{
			System.out.print("\nEntre com um número: ");
			num = leia.nextInt();
			if(num % 2 ==0)
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
		}
		
			System.out.print("\nNúmeros pares: " +contPar);
			System.out.print("\nNúmeros ímpares: " +contImpar);

	}

}
