/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 Infantil  -  15-17 Juvenil  -  18-25 Adulto */
package exerciciosLista2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int idade;

		System.out.println("O sistema que dada a idade de um nadador(a) o classifica em uma categoria:");

		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Qual a idade da pessoa? ");
			idade = read.nextInt();
		}
		
		if(idade >= 10 && idade <= 14)
		{
			System.out.println("Categoria: Infaltil");
		}
		else if(idade >= 15 && idade <= 17)
		{
			System.out.println("Categoria: Juvenil");
		}
		else if(idade >= 18 && idade <= 25 )
		{
			System.out.println("Categoria: Adulto");
		}
		else
		{
			System.out.println("Desculpe, mas no momento não aceitamos nadadores com essa idade. Estamos trabalhando nisso! Obrigado.");
		}

	}

}
