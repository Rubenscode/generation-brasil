/* 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente. */
package exerciciosLista2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Digite um n�mero:");
			num1 = read.nextInt();
			
			System.out.println("Digite outro n�mero:");
			num2 = read.nextInt();
			
			System.out.println("Digite um n�mero:");
			num3 = read.nextInt();
		}
			
			if(num1 < num2 && num2 < num3) {
				System.out.printf("A ordem crescente � %d %d %d",num1, num2, num3);
			} 
			
			if (num1 < num3 && num3 < num2) {
				System.out.printf("A ordem crescente � %d %d %d",num1, num3, num2);
			}
			
			if (num2 < num1 && num1 < num3) {
				System.out.printf("A ordem crescente � %d %d %d",num2, num1, num3);
			}
			
			if (num2 < num3 && num3 < num1) {
				System.out.printf("A ordem crescente � %d %d %d",num2, num3, num1);
			}
			
			if(num3 < num1 && num1 < num2) {
				System.out.printf("A ordem crescente � %d %d %d",num3, num1, num2);
			}
			
			if (num3 < num2 && num2 < num1) {
				System.out.printf("A ordem crescente � %d %d %d",num3, num2, num1);
			}

	}
}
