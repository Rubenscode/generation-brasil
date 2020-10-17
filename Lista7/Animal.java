package exerciciosLista7;

public class Animal {
	private String nome;
	private int idade;
	private String som;
	private String movimento;
	
	public Animal() {

	}
	
	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public void emitirSom() {
		
	}
	
	public void movimento() {
		
	}
	
	public void infoAnimal() {
		System.out.printf("Nome: %s \nIdade: %d \nEmite o som: %s \nAção: %s", getNome(), getIdade(), getSom(), getMovimento());
		System.out.println("\n--------------------------");
	}
	
}
