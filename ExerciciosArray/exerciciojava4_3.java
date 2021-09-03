package ExerciciosArray;

import java.util.Scanner;

public class exerciciojava4_3 {

	public static void main(String[] args) {
		
		/* Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		final int linha=3, coluna=3;
		int[][] num = new int[linha][coluna];
		int quantMaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0; l<linha; l++) {
			
			for(int c=0; c<coluna; c++) {
				
				System.out.println("\nDigite um valor para matriz: ");
				num[l][c] = leia.nextInt();
				
				if(num[l][c] >10) {
					
					quantMaior++;
					System.out.println("\no valor "+ num[l][c]+ " é maior que 10. ");
				}
			}
		}
		
		System.out.println("A quantodade de números maiores que 10 é de: "+ quantMaior);

	}

}
