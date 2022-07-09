package Bloco1;

import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		float  maiorNum = 0, num;
		Scanner leia = new Scanner(System.in);
		
			System.out.println("Digite o primeiro número: ");
			num = leia.nextFloat();
		if(num >maiorNum)
		{
			maiorNum = num;
		}
			System.out.println("Digite o segundo número: ");
			num = leia.nextFloat();
		if(num > maiorNum)
		{
			maiorNum = num;
		}
			System.out.println("Digite o terceiro número: ");
			num = leia.nextFloat();
		if(num > maiorNum) 
		{
			
			maiorNum = num;
		}
			System.out.printf("\nO maior número digitado é: " + maiorNum);

	}
}
