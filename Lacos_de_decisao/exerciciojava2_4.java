package Exercicios_dia1_do9;

import java.util.Scanner;

public class exerciciojava2_4 {
	
	public static void main(String[] args) {
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
        n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
        �mpar exiba o n�mero elevado ao quadrado. */
		
		float num, raizp, elevadoi;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um n�mero: ");
		num = leia.nextFloat();
		
		if(num%2 == 0) {
			
			raizp = (float) Math.sqrt(num);
			
			System.out.println("\nO n�mero "+ num+ " � par e sua raiz quadrada �: "+ raizp);
		}
		else if(num%2 != 0) {
			
			elevadoi = (float) Math.pow(num, 2);
			
			System.out.println("\nOn�mero "+ num+ " � impar e seu valor elevado ao quadrado �: "+ elevadoi);
		}
		
		
	}

}
