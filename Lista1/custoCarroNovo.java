/* 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor. */
package exercicios;

import java.util.Scanner;

public class custoCarroNovo {

	public static void main(String[] args) {
		
		double percentagemDistribuidor, impostos, custoDeFabrica, custoConsumidor;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Qual o custo de fabrica do carro escolhido? ");
			custoDeFabrica = ler.nextDouble();
		}
		
	    percentagemDistribuidor = custoDeFabrica * 0.28;
		impostos = custoDeFabrica * 0.45;
		custoConsumidor = custoDeFabrica + impostos + percentagemDistribuidor;
			
		System.out.println("Pre�o do carro novo R$" + custoConsumidor);

	}

}
