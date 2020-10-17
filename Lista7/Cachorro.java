package exerciciosLista7;

public class Cachorro extends Animal {
	
	public Cachorro() {
	
	}
	
	@Override
	public void emitirSom() {
		System.out.println("auau");
	}
	
	@Override
	public void movimento() {
		System.out.println("Correr atras de motoqueiro\n");
	}
}
