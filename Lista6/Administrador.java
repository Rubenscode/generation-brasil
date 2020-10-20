/* 4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias). */
package exerciciosLista6;

import java.util.*;

public class Administrador extends Pessoa {
	
	Scanner ler = new Scanner(System.in);
	
	private double estadia;
	private double viagens;
	
	
	public Administrador(String nome, String endereco, String cpf, int telefone, int idade, double estadia, double viagens)
	{
		super(nome, endereco, cpf, telefone, idade); 
		this.estadia = estadia;
		this.viagens = viagens;
	}

	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}

	public double getEstadia() {
		return estadia;
	}

	public void setEstadia(double estadia) {
		this.estadia = estadia;
	}

	public double getViagens() {
		return viagens;
	}

	public void setViagens(double viagens) {
		this.viagens = viagens;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do administrador: " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco());
	}
	public void totalAjuda() {
		double ajudaDeCustos = estadia + viagens;
		System.out.println("Ajuda de Custos: " + ajudaDeCustos);
	}

	
}