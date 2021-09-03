package ExerciciosArray;

import java.util.Scanner;

public class exerciciojava4_2 {
	
	public static void main(String[] args) {
		
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
        Os números pares digitados;  A soma dos números pares digitados; 
        Os números ímpares digitados; A quantidade de números ímpares digitados. */
		
		int[] num = new int[6];
		int quanti=0, somap=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<6; x++) {
			
			System.out.println("\nDigite um número: ");
			num[x] = leia.nextInt();
			
			if(num[x]%2 ==0) {
				
				somap = somap + num[x];
				System.out.println("\nO número "+ num[x]+ " é par.");
				
			}else {
				
				quanti++;
				System.out.println("\nO número "+ num[x]+ " é impar.");
			}
			
		}
		System.out.println("\nA soma dos pares é: "+ somap);
		System.out.println("\nA quantidade de números impares é: "+ quanti);
	}

}
