/* Faça um sistema que leia a idade de uma pessoa expressa em dias
e mostre-a expressa em anos, meses e dias. */
package exercicios;

import java.util.Scanner;

public class idadeAnosMesesDias {

	public static void main(String[] args) {
		int anos, meses, dias;
		
		try (Scanner ler = new Scanner(System.in)) {

			System.out.println("Digite sua idade em dias: ");
			dias = ler.nextInt();
			
		}
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		
		System.out.println("A idade " + anos + "ano(s) " + meses + " mes(es) " + dias + " e dia(s)");
	}

}
