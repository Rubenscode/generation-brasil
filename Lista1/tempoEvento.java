 /* 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma
f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
package exercicios;

import java.util.Scanner;

public class tempoEvento {

	public static void main(String[] args) {
		int horas, minutos, segundos, totalSegundos;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite o tempo de dura��o do evento em segundos: ");
			totalSegundos = ler.nextInt();
		}
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;

		System.out.println("A dura��o do evento teve " + horas + "hora(s) " + minutos + "minuto(s) " + segundos + "segundo(s) ");

	}

}

