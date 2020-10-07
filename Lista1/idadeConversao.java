package exercicios;

import java.util.Scanner;

public class idadeConversao {

	public static void main(String[] args) {
		
		int idadeEmAnos, anos, meses, dias, totalDias;
		try (Scanner ler = new Scanner(System.in)) {	
			
			System.out.println("Quantos anos de vida você tem? ");
			idadeEmAnos = ler.nextInt();
			
			System.out.println("Quantos meses de vida você tem? ");
			meses = ler.nextInt();
			
			System.out.println("Quantos dias de vida você tem? ");
			dias = ler.nextInt();
			
			
		}
		
		anos = idadeEmAnos * 365;
		meses = meses * 30;
		totalDias = anos + meses + dias;
		System.out.println("Você tem " + totalDias  + " dias de vida, Parabéns!");

	}

}
