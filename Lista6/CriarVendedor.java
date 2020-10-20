package exerciciosLista6;

public class CriarVendedor {

	public static void main(String[] args) {
		Vendedor rubens = new Vendedor("Rubens", "Rua Maverick 45", "44055899", 25009977, 25, 0, 0, 0);
		rubens.vender();
		
		System.out.println("Comissao:"+rubens.getComissao());
		System.out.println("Venda:"+rubens.getValorVendas());
	}
	 
}
