package exercicios;

import java.util.Scanner;

public class idadeConversao {

	public static void main(String[] args) {
		
		int idadeEmAnos, anos, meses, dias, totalDias;
		try (Scanner ler = new Scanner(System.in)) {	
			
			System.out.println("Quantos anos de vida voc� tem? ");
			idadeEmAnos = ler.nextInt();
			
			System.out.println("Quantos meses de vida voc� tem? ");
			meses = ler.nextInt();
			
			System.out.println("Quantos dias de vida voc� tem? ");
			dias = ler.nextInt();
			
			
		}
		
		anos = idadeEmAnos * 365;
		meses = meses * 30;
		totalDias = anos + meses + dias;
		System.out.println("Voc� tem " + totalDias  + " dias de vida, Parab�ns!");

	}

}
