package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_1 {

	public static void main(String[] args) {
		
		/*Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
        obtemos resto = 5. (FOR) */
		
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1000;x<=1999;x++) {
			
			if(x%11 == 5) {
				
				System.out.println(x);
			}
		}

	}

}
