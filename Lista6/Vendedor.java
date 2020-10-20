/* 6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que será adicionado ao vencimento base do Vendedor). */
package exerciciosLista6;

import java.util.Scanner;

public class Vendedor extends Pessoa {
	Scanner in = new Scanner(System.in);
	private double valorVendas;
	private double comissao = 0;
	private double precoUnitario;
	private int quantidade;
	
	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, double valorVendas, double precoUnitario, int quantidade) {
		super(nome,endereco,cpf,telefone,idade);
		this.valorVendas = valorVendas;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public Scanner getIn() {
		return in;
	}

	public void setIn(Scanner in) {
		this.in = in;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	public void vender() {
		System.out.println("O valor do artigo e quantidade do mesmo é inserido individualmente!\nPara finalizar entre com 0 no preço e quantidade!");
		do {
			System.out.print("\nQuantidade de artigos do mesmo tipo? ");
			quantidade = in.nextInt();
			System.out.print("\nQual o preço do artigo escolhido? R$");
			precoUnitario = in.nextDouble();
			
			
			this.valorVendas = valorVendas + (precoUnitario * quantidade);
		}
		while(quantidade != 0);
	}
	
	public void receberComissao() {
		double taxa = 0.10;
		this.comissao = comissao + (this.valorVendas * taxa);
	}
	
	public void resumoDeVendas() {
			System.out.printf("\nVendedor: %s \nCPF: %d \nIdade: %d \nTelefone: %d \nEndereço: %s ", getNome(), getCpf(), getIdade(), getTelefone(), getEndereco());
	}
	
}
