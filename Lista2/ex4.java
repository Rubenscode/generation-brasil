/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */
package exerciciosLista2;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		double num;
		
		System.out.println("Digite um número qualquer:");
		try (Scanner read = new Scanner(System.in)) {
			num = read.nextDouble();
		}
		
		if(num == 0){
			System.out.println(num + " É um número neutro.");
		}  else if(num % 2 == 0) {
				System.out.println(num + " é par");
				if(num < 0) {
					System.out.println("Não é possivel calcular raiz quadrada de números negativos!");
				} else {
					num = Math.sqrt(num);
					System.out.printf("A raiz quadrada = %.2f" , num);
				}
			
		} else {
			System.out.println(num + " é ímpar");
			num = Math.pow(num, 2);
			System.out.println("Elevado ao quadrado = " + num);
		} 

	}

}
