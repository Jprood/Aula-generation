package Exercicios_dia2_do9;

import java.util.Scanner;

public class exerciciojava3_4 {

	public static void main(String[] args) {
		
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
        (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
        que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
        o número de pessoas calmas; o número de mulheres nervosas;o número de homens agressivos;o número de outros calmos;
        o número de pessoas nervosas com mais de 40 anos;o número de pessoas calmas com menos de 18 anos.*/
		
		int op1, op2, idade, menor=0, maior=0, m=0, h=0, o=0, c=0, n=0, a=0, mn=0, ha=0, oc=0, maiorn=0, menorc=0 , x=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5) {
			
			System.out.println("\nInforme sua idade: ");
			idade = leia.nextInt();
			
			if(idade <18) {
				
				menor++;
				
			}else if(idade >40) {
				
				maior++;
			}
			
			System.out.println("\n1 Se seu sexo for feminino.");
			System.out.println("\n2 Se seu sexo for masculino.");
			System.out.println("\n3 Se seu sexo for outros.");
			
			System.out.println("\nDigite a opção escolhida: ");
			op1 = leia.nextInt();
			
			switch(op1) {
			
			case 1:
				m++;
			case 2:
				h++;
			case 3:
				o++;
			
			}
			
			System.out.println("\n1 Se você se considera uma pessoa calma.");
			System.out.println("\n2 Se você se considera uma pessoa nervosa.");
			System.out.println("\n3 Se você se considera uma pessoa agressiva.");
			
			System.out.println("\nDigite a opção escolhida: ");
			op2 = leia.nextInt();
			
			switch(op2) {
			
			case 1:
				c++;
			case 2:
				n++;
			case 3:
				a++;
				
			}
			
			if(op1 == 1 && op2 == 2) {
				
				mn++;
			}else if(op1 == 2 && op2 == 3) {
				
				ha++;
			}else if(op1 == 3 && op2 == 1) {
				
				oc++;
			}else if(idade >40 && op2 == 2) {
				
				maiorn++;
			}else if(idade <18 && op2 == 1) {
				
				menorc++;
			}
			
			x++;
		}
		
		System.out.println("\nO número de pessoas calmas é de: "+ c);
		System.out.println("\nO número de mulheres nervosas é de: "+ mn);
		System.out.println("\nOnúmero de homens agressivos é de: "+ ha);
		System.out.println("\nO número de outros calmos é de: "+ oc);
		System.out.println("\nO número de pessoas com mais de 40 nervosas é de: "+ maiorn);
		System.out.println("\nO número de pessoas com menos de 18 anos calmas é de: "+ menorc);
		

	}

}