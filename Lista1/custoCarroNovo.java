/* 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
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
			
		System.out.println("Preço do carro novo R$" + custoConsumidor);

	}

}
