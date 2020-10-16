/* 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */
package exerciciosLista5;

public class Cliente {
	private String nome;
	private int telefone;
	private String endereco;
	public String pedido;
	public double preco;
	
	public Cliente(String nome, int telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void fazerPedido(String saborPizza) {
		
		pedido = saborPizza;
		pedido.toUpperCase();
		if(pedido == "mussarela" || pedido == "calabresa") {
			preco = 24.90;
		} else {
			preco = 49.90;
		}
		
	}
	
	public void resumoPedido() {
		System.out.printf("Cliente: %s \nTelefone: %d \nEndereço p/ Entrega: %s \nPizza sabor: %s Custa R$ %.2f", this.nome, this.telefone, this.endereco, this.pedido, this.preco);
		System.out.println("\n------------------------------\n");
	}

}
