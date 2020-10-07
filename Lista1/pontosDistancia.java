/* 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
V(x2-x1)^2 + (y2-y1)^2 */
package exercicios;

import java.lang.Math;
import java.util.Scanner;

public class pontosDistancia {

	public static void main(String[] args) {
		int x1, x2, y1, y2, distancia;

		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Entre com o valor de x1: ");
			x1 = ler.nextInt();
			
			System.out.println("Entre com o valor de x2: ");
			x2 = ler.nextInt();
			
			System.out.println("Entre com o valor de y1: ");
			y1 = ler.nextInt();
			
			System.out.println("Entre com o valor de y2: ");
			y2 = ler.nextInt();
		}

		distancia = (int)(Math.sqrt((Math.pow(x2-x1,2.0))+(Math.pow(y2-y1,2.0))));

		System.out.printf("A distancia entre dois pontos quaisquer é: " + distancia);
	}

}


