package Exercicios_dia1_do9;

import java.util.Scanner;

public class exerciciojava2_1 {

	public static void main(String[] args) {
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		int num1, num2, num3, maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do número 1:");
		num1 = leia.nextInt();
		System.out.println("\nDigite o valor do número 2: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o valor do número 3: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			
			maior = num1;
		}
		else if(num2 > num1 && num2 > num3) {
			
			maior = num2;
		}
		else if(num3 > num1 && num3 > num2){
			
			maior = num3;
		}
		
		System.out.println("\nO maior número é: "+ maior);

	}

}
