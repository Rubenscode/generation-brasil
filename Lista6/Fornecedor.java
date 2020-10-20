package exerciciosLista6;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String cpf, int telefone, int idade, double valorCredito, double valorDivida) {
		super(nome, endereco, cpf, telefone, idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	} 
	
	public void imprimirInfo() {
		System.out.println("\nNome do fornecedor(a): " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco()
						   +"\nValor Credito: " + valorCredito
						   +"\nValorDivida: " + valorDivida);
	}
	
	public void obterSaldo() {
		double saldo = valorCredito - valorDivida;
		System.out.println("O saldo referente ao fornecedor " + getNome() +  " é = " + saldo);
	}
	 
}