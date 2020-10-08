/* 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */
package exerciciosLista3;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		int num, soma = 0;
		
		try (Scanner read = new Scanner(System.in)) {
			do {
				System.out.println("Digite um número: ");
				num = read.nextInt();
				soma = soma + num;
			} while (num != 0);
		}
		System.out.println("A soma dos números digitados: " + soma);
	}

}
