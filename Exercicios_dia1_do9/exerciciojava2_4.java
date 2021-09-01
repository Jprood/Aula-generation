package Exercicios_dia1_do9;

import java.util.Scanner;

public class exerciciojava2_4 {
	
	public static void main(String[] args) {
		
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
        número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
        ímpar exiba o número elevado ao quadrado. */
		
		float num, raizp, elevadoi;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um número: ");
		num = leia.nextFloat();
		
		if(num%2 == 0) {
			
			raizp = (float) Math.sqrt(num);
			
			System.out.println("\nO número "+ num+ " é par e sua raiz quadrada é: "+ raizp);
		}
		else if(num%2 != 0) {
			
			elevadoi = (float) Math.pow(num, 2);
			
			System.out.println("\nOnúmero "+ num+ " é impar e seu valor elevado ao quadrado é: "+ elevadoi);
		}
		
		
	}

}
