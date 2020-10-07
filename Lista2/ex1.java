/* 1- Faça um programa que receba três inteiros e diga qual deles é o maior. */
package exerciciosLista2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int num1, num2, num3, numMaior;
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Digite um número:");
			num1 = read.nextInt();
			
			System.out.println("Digite outro número:");
			num2 = read.nextInt();
			
			System.out.println("Digite um número:");
			num3 = read.nextInt();
		}
		
		if(num1 > num2) {
			numMaior = num1;
		} else if (num2 > num3) {
			numMaior = num2;
		} else {
			numMaior = num3;
		}
		
		System.out.println("O maior número é: " + numMaior);

	}

}
