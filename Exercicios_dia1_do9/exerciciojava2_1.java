package Exercicios_dia1_do9;

import java.util.Scanner;

public class exerciciojava2_1 {

	public static void main(String[] args) {
		/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
		
		int num1, num2, num3, maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do n�mero 1:");
		num1 = leia.nextInt();
		System.out.println("\nDigite o valor do n�mero 2: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o valor do n�mero 3: ");
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
		
		System.out.println("\nO maior n�mero �: "+ maior);

	}

}
