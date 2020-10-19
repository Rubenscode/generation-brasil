/* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da List;
Atualizar dados da List.
Apresentar todos os dados da List. */
package exerciciosLista7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections {

	public static void main(String arg[]) {
		Collection<String> estoque = new ArrayList<String>();

		int opcao;
		String produto;
		String produtoAtualizado;

		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("Escolha uma das opções: \n(1) - Adicionar um Produto \n"
					+ "(2) - Remover um Produto \n(3) - Atualizar um Produto \n(4) - Mostrar Estoque");
			opcao = read.nextInt();

			switch (opcao) {
			
			case 1:
				System.out.println("Digite o produto para adicionar ao estoque:");
				produto = read.next().toLowerCase();
				estoque.add(produto);
				break;

			case 2:
				System.out.println("Digite o produto para remover do estoque:");
				produto = read.next().toLowerCase();
				estoque.remove(produto);
				break;

			case 3:
				System.out.println("Digite o produto para verificar no estoque:");
				produto = read.next().toLowerCase();

				if (estoque.contains(produto)) {
					System.out.println("Digite o produto para substitui-lo do estoque:");
					produtoAtualizado = read.next().toLowerCase();
					estoque.remove(produto);
					estoque.add(produtoAtualizado);
				} else {
					System.out.printf("Produto: %s não foi localizado em nosso estoque\nTente novamente com um produto existente.\n", produto);
				}
				break;

			case 4:
				System.out.printf("\nProdutos: %s\n", estoque);
				
				for (String item : estoque) {
					System.out.printf("Item: %s\n", item);
				}
				break;

			default:
				if (opcao < 0 || opcao > 4) {
					System.out.printf("A Opção (%d) Selecionada: É invalida!\nDigite 0 para Sair ou ", opcao);
				} else {
					System.out.printf("A Opção (%d) Selecionada: Programa Finalizado!", opcao);
				}

			}

		} while (opcao != 0);
		
	}
}