package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_6 {

	public static void main(String[] args) {
		
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
        final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		
		int num, multi=0, soma=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			
			if(num%3 == 0) {
			
			soma = soma + num;
			multi++;
			
			}
			
		}while(num != 0);
		
		multi = multi -1;
		media= soma/multi;
		
		System.out.printf("\nA media dos n�meros multiplos de 3 �: %.2f", media);
        System.out.println("\nr"+ soma);
        System.out.println("\np"+ multi);
	}

}
