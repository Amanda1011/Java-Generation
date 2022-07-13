/*1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
* e o escreva em seguida. Encontre após a maior pontuação e a apresente. */
package Bloco1;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] vetor1 = new int[5];
		int maiorPont =0;

		for(int x=0; x<5; x++)
		{
			System.out.println("Entre com o valor: ");
			vetor1[x] = ler.nextInt();
			
			if (vetor1[x] > maiorPont)
			{
				maiorPont = vetor1[x];
			}
		}
		for (int x=0; x<5; x++)
		{
			System.out.println("\nValor posição: "+ vetor1[x]);
		}
			System.out.println("\nO maior valor foi de: "+ maiorPont);
		

	}

}
