package POO_Heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {

		List<String> listaEstoque = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		int op;

		do {

			System.out.println("1- deseja adicionar um produto a lista?");
			System.out.println("2- deseja remover um produto da lista?");
			System.out.println("3- deseja atualizat a lista de produtos?");
			System.out.println("4- Mostrar a lista de produtos");
			System.out.println("5- Se você deseja fechar o programa");
			System.out.println("\nDigite a opção desejada: ");
			op = leia.nextInt();

			switch (op) {

			case 1:

				leia.nextLine();
				System.out.println("\nEscreva o  produto que deseja adicionar:");
				String produto = leia.next();
				listaEstoque.add(produto);
				System.out.println(listaEstoque);
				break;
			case 2:

				leia.nextLine();
				for (String rproduto : listaEstoque) {

					System.out.println("\nEscreva o produto que deseja remover:");
					produto = leia.next();

					if (listaEstoque.contains(produto)) {
						listaEstoque.remove(produto);
						System.out.println(listaEstoque);
					} else {

						System.out.println("\nProduto não encontrado.");
					}
				}
				break;
			case 3:

				leia.nextLine();
				System.out.println("\nDigite o produto que deseja trocar:");
				String troca = leia.next();
				System.out.println("\nEscreva o produto que deseja trocar por " + troca + ":");
				String novoP = leia.next();

				if (listaEstoque.contains(troca)) {

					listaEstoque.remove(troca);
					listaEstoque.add(novoP);
					System.out.println(listaEstoque);
				} else {

					System.out.println("\nProduto não encontrado.");
				}
				break;
			case 4:

				leia.nextLine();
				System.out.println("\nItens do Estoque:");
				System.out.println(listaEstoque);
				break;
			case 5:

				System.out.println("\nObrigado por utilizar o programa.");
				break;
			default:

				System.out.println("\nOpção invalida.");
			}

		} while (op != 5);

	}

}
