package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_3 {
	
	public static void main(String[] args) {
		
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
        21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		int idade=0, menor21=0, maior50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99) {
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				
				menor21++;
				
			}else if(idade > 50) {
				
				maior50++;
			}
		}
		
		System.out.println("\nO número de pessoas com a idade inferior a 21 anos são de:"+ menor21+
				" e o total de pessoas com mais de 50 anos são de: "+ maior50);
	}

}
