package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_2 {
	
	public static void main(String[] args) {
		
		/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
		
		int num , par=0, imp=0, x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
			
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
			
			if(num%2 ==0) {
				
				par++;
				
			}
			else {
				
				imp++;
			}
		}
		
		System.out.println("\nO n�mero de pares digitados �: "+ par+ " e o de impares �: "+ imp);
	}

}
