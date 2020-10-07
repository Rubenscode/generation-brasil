/* 4. Escreva um sistema que leia três números inteiros e positivos
(A, B, C) e calcule a seguinte expressão:  D = R + S / 2 , ONDE R = (A + B)² E S = (B + C)² */
package exercicios;

import java.util.Scanner;

public class calculeExpressao {

	public static void main(String[] args) {
		int a, b, c;
		double s, d, r;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o valor de A: ");
			a = ler.nextInt();
			System.out.println("Digite o valor de B: ");
			b = ler.nextInt();
			System.out.println("Digite o valor de C: ");
			c = ler.nextInt();
		}
		
		r = Math.pow(a + b, 2.0);
		s = Math.pow(b + c, 2.0);
		d = (r + s) / 2;
		
		System.out.println("O resultado da expressão D = " + d);
	}

}
