/* 1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR) */
package exerciciosLista3;

public class ex1 {

	public static void main(String[] args) {
		
		int num;
		System.out.println("N�meros (1000 a 1999) / 11 o resto = 5;");
		for(int i = 1000; i <= 1999; i++)
			if(i % 11 == 5) {
				num = i;
				System.out.println(num);
			}
	}

}






