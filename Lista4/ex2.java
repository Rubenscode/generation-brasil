/* 2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
  Os n�meros pares digitados;
  A soma dos n�meros pares digitados;
  Os n�meros �mpares digitados;
  A quantidade de n�meros �mpares digitados.
package exerciciosLista4; */
package exerciciosLista4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int[] array = new int[6];
		int par = 0, impar = 0;
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			array[i] = read.nextInt();
		}
		
		System.out.printf("N�meros pares digitados: ");
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				System.out.printf("%d  ", array[i]);
				par++;
			}
		}
		System.out.printf("\ntotal = %d pares", par);
		
		System.out.printf("\nN�meros �mpares digitados: ");
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 1) {
				System.out.printf("%d  ", array[i]);
				impar++;
			}
		}
		System.out.printf("\nTotal = %d impares", impar);

	}

}
