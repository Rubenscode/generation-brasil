/* 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */
package exerciciosLista3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		int num, i, par = 0, impar = 0;
		try (Scanner read = new Scanner(System.in)) {
			
			for(i = 0; i <= 9; i++){
				System.out.println("Entre com " + (i+1) + "� n�mero ");
				num = read.nextInt();
				
				if (num % 2 == 0){
					par++;
				} else {
					impar++;
				}	
			}
			
		}
		
		System.out.println("Total " + par + " n�meros pares!");
		System.out.println("Total " + impar + " n�meros �mpares!");
	}

}
