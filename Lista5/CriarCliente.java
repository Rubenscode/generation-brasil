package exerciciosLista5;

public class CriarCliente {

	public static void main(String[] args) {
		Cliente mari = new Cliente("Mariana", 25098755, "Rua do porto 17 - Iguatemi");
		Cliente joao = new Cliente("João", 22008977, "Rua sonho por sonho 25 - Jardim");
		
		mari.fazerPedido("mussarela");
		mari.resumoPedido();
		
		joao.fazerPedido("Camarão");
		joao.resumoPedido();
	}

}
