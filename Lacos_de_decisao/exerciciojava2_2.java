package Exercicios_dia1_do9;

import java.util.Scanner;

public class exerciciojava2_2 {

	public static void main(String[] args) {
		
		/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
		
		float num1, num2, num3, menor=0, medio=0, maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o segundo n�mero: ");
		num2 = leia.nextFloat();
		System.out.println("\nDigite o terceiro n�mero: ");
		num3 = leia.nextFloat();
		
		if(num1 < num2 && num1 < num3) {
			
			menor = num1;
		}
		else if(num2 < num1 && num2 < num3) {
			
			menor = num2;
		}
		else if(num3 < num1 && num3 < num2) {
			
			menor = num3;
		}
        if(num1 > num2 && num1 > num3) {
			
			maior = num1;
		}
		else if(num2 > num1 && num2 > num3) {
			
			maior = num2;
		}
		else if(num3 > num1 && num3 > num2) {
			
			maior = num3;
		}
        if(num1 > menor && num1 < maior) {
	
	        medio = num1;
        }
        else if(num2 > menor && num2 < maior) {
	
        	menor = num2;
        }
        else if(num3 > menor && num3 < maior) {
	
        	menor = num3;
        }
        
        System.out.println("\n"+ menor+ "\n"+ medio+ "\n"+ maior);
	}

}
