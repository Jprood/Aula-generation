package ExerciciosArray;

import java.util.Scanner;

public class exerciciojava4_1 {
	
	public static void main(String[] args) {
		
      /* Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
     (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
     (b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
     (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
     (d) Mostre na tela cada valor do vetor A, um em cada linha. */
		
		int[] num = {1, 0, 5, -2, -5, 7};
		int soma=0, valores;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<6; x++) {
			
			
			if(num[x] == num[0] || num[x] == num[1] || num[x] == num[5] ) {
				
				soma = soma + num[x];
			}
			else if(num[x] == num[4]) {
				
				num[4] = 100;
			}
			
			System.out.println("\nO valor do vetor "+ x+ " � "+ num[x]);
		
		}
		
		System.out.println("\nA soma dos vetores da posi��o 0, 1, 5 � igual a:"+ soma);
		
	}
}
