package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_5 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
        n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
		
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um n�mero do teclado: ");
			num = leia.nextInt();
			
			soma= soma + num;
			
		}while(num != 0);
		
		System.out.println("\nA soma dos n�meros �: "+ soma);
	}

}
