/* 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */
package exerciciosLista2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int num1, num2, num3, numMaior;
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Digite um n�mero:");
			num1 = read.nextInt();
			
			System.out.println("Digite outro n�mero:");
			num2 = read.nextInt();
			
			System.out.println("Digite um n�mero:");
			num3 = read.nextInt();
		}
		
		if(num1 > num2) {
			numMaior = num1;
		} else if (num2 > num3) {
			numMaior = num2;
		} else {
			numMaior = num3;
		}
		
		System.out.println("O maior n�mero �: " + numMaior);

	}

}
