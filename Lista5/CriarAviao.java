package exerciciosLista5;

public class CriarAviao {

	public static void main(String[] args) {
		Aviao boeing737 = new Aviao("Branco e Vermelho", 230);
	
		System.out.printf("Nosso avi�o � um Boeing 737\nNossa capacidade � de %d passageiros\nCor: %s",boeing737.getCapacidade(), boeing737.getCor());
		
		boeing737.limitePassageiro(231);
	}

}
