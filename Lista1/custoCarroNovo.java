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
