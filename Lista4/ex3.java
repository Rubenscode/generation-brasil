/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */
package exerciciosLista4;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		int[][] array = new int[3][3];
		int maiorDez = 0;
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.printf("indice[%d][%d] = ", i, j );
				array[i][j] = read.nextInt();
				
				if(array[i][j] > 10) {
					maiorDez++;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
					System.out.printf("[%d]  ", array[i][j]);
			}
			System.out.println("");
		}
		System.out.printf("\nTotal %d números da matriz são maiores que 10", maiorDez);
	}	
}


