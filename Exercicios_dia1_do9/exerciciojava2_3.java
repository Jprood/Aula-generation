package Exercicios_dia1_do9;

import java.util.Scanner;

public class exerciciojava2_3 {
	
	public static void main(String[] args) {
		
		/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
        categoria ela se encontra 10-14 infantil, 15-17 juvenil e 18-25 adulto*/
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			
			System.out.println("\nParab�ns, voc� est� na categoria infantil.");
			
		}
		else if(idade >= 15 && idade <= 17) {
			
			System.out.println("\nParab�ns, voc� est� na categoria juvenil.");
			
		}
		else if(idade >= 18 && idade <= 25) {
			
			System.out.println("\nParab�ns, voc� est� na categoria adulto.");
		}
		else {
			
			System.out.println("\nSinto muito, sua idade n�o se ad�qua a nenhuma categoria>");
		}
	}

}
