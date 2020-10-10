/* 2- Faça um programa que receba 6 números inteiros e mostre:
  Os números pares digitados;
  A soma dos números pares digitados;
  Os números ímpares digitados;
  A quantidade de números ímpares digitados.
package exerciciosLista4; */
package exerciciosLista4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int[] array = new int[6];
		int par = 0, impar = 0;
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			array[i] = read.nextInt();
		}
		
		System.out.printf("Números pares digitados: ");
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				System.out.printf("%d  ", array[i]);
				par++;
			}
		}
		System.out.printf("\ntotal = %d pares", par);
		
		System.out.printf("\nNúmeros ímpares digitados: ");
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 1) {
				System.out.printf("%d  ", array[i]);
				impar++;
			}
		}
		System.out.printf("\nTotal = %d impares", impar);

	}

}
