package ExerciciosArray;

import java.util.Scanner;

public class exerciciojava4_2 {
	
	public static void main(String[] args) {
		
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
        Os n�meros pares digitados;  A soma dos n�meros pares digitados; 
        Os n�meros �mpares digitados; A quantidade de n�meros �mpares digitados. */
		
		int[] num = new int[6];
		int quanti=0, somap=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<6; x++) {
			
			System.out.println("\nDigite um n�mero: ");
			num[x] = leia.nextInt();
			
			if(num[x]%2 ==0) {
				
				somap = somap + num[x];
				System.out.println("\nO n�mero "+ num[x]+ " � par.");
				
			}else {
				
				quanti++;
				System.out.println("\nO n�mero "+ num[x]+ " � impar.");
			}
			
		}
		System.out.println("\nA soma dos pares �: "+ somap);
		System.out.println("\nA quantidade de n�meros impares �: "+ quanti);
	}

}
