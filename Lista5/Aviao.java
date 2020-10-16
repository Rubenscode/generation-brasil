package exerciciosLista5;

public class Aviao {
	private String cor;
	private int capacidade;

	public Aviao(String cor, int capacidade) {
		this.cor = cor;
		this.capacidade = capacidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void limitePassageiro(int passageiros){
		if(passageiros > 230) {
			
			System.out.println("\nO limite de passageiros excedeu!!!\n"+"\nCapacidade "+getCapacidade()+", os passageiros restantes vão embarcar no proximo voo");
		} else if (passageiros < 1){
			System.out.println("Valor invalido");
		} else{
			System.out.println("Temos muito espaço no nosso Boeing 737");
		}
		
	}
}
