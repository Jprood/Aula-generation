package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_6 {

	public static void main(String[] args) {
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no
        final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		
		int num, multi=0, soma=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			if(num%3 == 0) {
			
			soma = soma + num;
			multi++;
			
			}
			
		}while(num != 0);
		
		multi = multi -1;
		media= soma/multi;
		
		System.out.printf("\nA media dos números multiplos de 3 é: %.2f", media);
        System.out.println("\nr"+ soma);
        System.out.println("\np"+ multi);
	}

}
