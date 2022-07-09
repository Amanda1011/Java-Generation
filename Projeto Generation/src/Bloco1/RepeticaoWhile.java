/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
package Bloco1;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		
		int idade= 0, idadeMenor21= 0, idadeMaior50= 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade = leia.nextInt();
		
		while(idade!= -99)
		{ 
			if(idade <21)
				{
					idadeMenor21 = idadeMenor21 +1;
					
				}
				if(idade >50)
				{
					idadeMaior50= idadeMaior50 +1;
				}
				System.out.println("Informe a idade: ");
				idade = leia.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos foi: "+ idadeMenor21);
		System.out.println("\nO total de pessoas com mais de 50 anos foi: "+ idadeMaior50);
					
	}

}
