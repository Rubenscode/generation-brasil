/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */
package exerciciosLista3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int idade = 0, intervalo1 = 0, intervalo2 = 0;
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.print("Qual a sua idade? ");
			idade = read.nextInt();
			
			while(idade != -99) {
				System.out.print("Qual a sua idade? ");
				idade = read.nextInt();
				
				if(idade >= 1 && idade < 21) {
					intervalo1++;
				} else if(idade > 50) {
					intervalo2++;
				}

			}
		}
		
		System.out.println("Total de " + intervalo1 + " pessoas < 21 anos.");
		System.out.println("Total de " + intervalo2 + " pessoas > 50 anos.");
	}

}
