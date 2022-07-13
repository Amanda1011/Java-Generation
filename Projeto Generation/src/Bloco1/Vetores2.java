/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
package Bloco1;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] lancamento = new int[10];
		int i, maiorLancamento= 0, mediaLancamento = 0, somaLancamento = 0;
		
		
		for(i=0; i<10; i++)
		{
			System.out.println("Jogue o dado: ");
			lancamento[i] = ler.nextInt();
			while(lancamento[i]< 1 || lancamento [i]> 6)
			{
				System.out.println("\nJogue novamente: ");
				lancamento[i] = ler.nextInt();
			}
			somaLancamento += lancamento[i];
			if(lancamento[i] == 6)
			{
				maiorLancamento++;
			}
		}
			mediaLancamento = somaLancamento/10;
			System.out.println("\nA média de lançamento foi: "+ mediaLancamento);
			System.out.println("\nQuantidade de maior pontuação: "+ maiorLancamento);
		
		
		
		

	}

}
