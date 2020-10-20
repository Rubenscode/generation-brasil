package exerciciosLista6;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao, double comissao) {
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do operário(a): " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco()
						   +"\nValor Producao: " + valorProducao
						   +"\nComissao: " + comissao + "%");
	}
	
	public void calcularValorArtigo() {
		double valor_total = valorProducao + (valorProducao*(comissao/100));
		System.out.println("O valor total a ser recebido pelo(a) operário(a) " + getNome() + " é = " + valor_total);
	}
	

}