/* 1- Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.

(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
              A[0], A[1] e A[5] do vetor e mostre na tela esta soma.

(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.

(d) Mostre na tela cada valor do vetor A, um em cada linha. */
package exerciciosLista4;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] A = {1,0,5,-2,-5,7};
		int soma = 0;
		
		System.out.println("Vetor A:");
		for(int i = 0; i < 6; i++) {
			System.out.printf(" %d ", A[i]);
		}
		
		soma = A[0] + A[1] + A[5];
		System.out.println("\nA soma dos valores em A[0] + A[1] + A[5] = " + soma);
		
		System.out.println("\nNeste ponto o valor em A[4] foi alterado para 100:");
		A[4] = 100;
		
		
		System.out.println("\nVetor A Alterado:");
		for(int i = 0; i < 6; i++) {
			System.out.printf("A[%d] = %d\n", i, A[i]);
		}
		
		
		

	}

}
