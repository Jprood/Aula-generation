package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_5 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia um número do teclado até que encontre um
        número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número do teclado: ");
			num = leia.nextInt();
			
			soma= soma + num;
			
		}while(num != 0);
		
		System.out.println("\nA soma dos números é: "+ soma);
	}

}
