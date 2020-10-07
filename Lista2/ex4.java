/* 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. */
package exerciciosLista2;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		double num;
		
		System.out.println("Digite um n�mero qualquer:");
		try (Scanner read = new Scanner(System.in)) {
			num = read.nextDouble();
		}
		
		if(num == 0){
			System.out.println(num + " � um n�mero neutro.");
		}  else if(num % 2 == 0) {
				System.out.println(num + " � par");
				if(num < 0) {
					System.out.println("N�o � possivel calcular raiz quadrada de n�meros negativos!");
				} else {
					num = Math.sqrt(num);
					System.out.printf("A raiz quadrada = %.2f" , num);
				}
			
		} else {
			System.out.println(num + " � �mpar");
			num = Math.pow(num, 2);
			System.out.println("Elevado ao quadrado = " + num);
		} 

	}

}
