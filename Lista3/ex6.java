/* 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */
package exerciciosLista3;

import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		int num, multiplo3 = 0, soma = 0, media;
		
		try (Scanner read = new Scanner(System.in)) {
			do {
				System.out.println("Entre com um n�mero");
				num = read.nextInt();
				
				if(num % 3 == 0 && num != 0) {
					multiplo3++;
					soma = soma + num;	
				}
				
			} while(num != 0);
		}
		
		media = soma / multiplo3; 
		System.out.println("A media de n�mero multiplos de 3 = " + media);
	}

}
