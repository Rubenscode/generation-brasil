/* 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente. */
package exercicios;

import java.util.Scanner;

public class mediaFinalAluno {

	public static void main(String[] args) {
		
		int media , n1, n2, n3 , p1, p2, p3;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("O peso da primeira nota � 2 !");
			System.out.println("Digite sua primeira nota:");
			n1 = ler.nextInt();
			

			System.out.println("O peso da segunda nota � 3 !");
			System.out.println("Digite sua segunda nota:");
			n2 = ler.nextInt();
			
			System.out.println("O peso da terceira nota � 5 !");
			System.out.println("Digite sua terceira nota:");
			n3 = ler.nextInt();
		}
		
		p1 = 2;
		p2 = 3;
		p3 = 5;
		
		media = ( (n1 * p1) + (n2 * p2) + (n3 * p3) ) / (p1 + p2 + p3); 

		System.out.println("Sua media ponderada �: " + media);
	}

}
