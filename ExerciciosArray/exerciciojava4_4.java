package ExerciciosArray;

import java.util.Scanner;

public class exerciciojava4_4 {
	
	public static void main(String[] args) {
		
		/*Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
        (1) somar as duas matrizes (2) subtrair a primeira matriz da segunda 
        (3) adicionar uma constante as duas matrizes (4) imprimir as matrizes 
        Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o 
        o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz. */
		
		float[][] matriz1 = new float[2][2], matriz2 =new float[2][2], matriz3 = new float[2][2];
		float constante;
		int op, l, c ;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0; l<2; l++) {
			
			for(c=0; c<2; c++) {
				
				System.out.printf("\nIndique os valores da primeira matriz[%d][%d]: ", l+1, c+1);
				matriz1[l][c] = leia.nextFloat();
			}
		}
		for(l=0; l<2; l++) {
			
			for(c=0; c<2; c++) {
				
				System.out.printf("\nIndique os valores da segunda matriz[%d][%d]", l+1, c+1);
				matriz2[l][c] = leia.nextFloat();
			}
		}
		
		System.out.println("\t\tMenu de op��es");
		System.out.println("\n1- Somar as duas matrizes.");
		System.out.println("\n2- Subtraiz a primeira matriz da segunda.");
		System.out.println("\n3- Adicionar uma constante as duas matrizer.");
		System.out.println("\n4- Imprimir as duas matrizes.");
		System.out.println("\nIndique a op��o desejada:");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			for(l=0; l<2; l++) {
				
				for(c=0; c<2; c++) {
					
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.println("\nSoma: "+ matriz3[l][c]);
				}
			}break;
		case 2:
			for(l=0; l<2; l++) {
				for(c=0; c<2; c++) {
					
					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
					System.out.println("\nSubtra��o: "+ matriz3[l][c]);
					
				}
			}break;
		case 3:
			for(l=0; l<2; l++) {
				for(c=0; c<2; c++) {
					
					System.out.println("\nInforme o valor da constante: ");
					constante = leia.nextFloat();
					
					matriz1[l][c] = matriz1[l][c] + constante;
					matriz2[l][c] = matriz2[l][c] + constante;
					System.out.println("\nA primeira matriz somada a constande �: "+ matriz1[l][c]);
					System.out.println("\nA segunda matriz somada a constante �: "+ matriz2[l][c]);
					
				}
			}break;
		case 4: 
			for(l=0; l<2; l++) {
				
				for(c=0; c<2; c++) {
					
					System.out.println("\nOs valores da primeira matriz s�o: "+ matriz1[l][c]);
					System.out.println("\nOs valores da segunda matriz s�o: "+ matriz2[l][c]);
				}		
			}break;
			default:
				System.out.println("\nOp��o invalida.");
		}
		
	}
}
		