
package com.genera.aeronaves;

public class Aeronave {
	private String nome;
	private int velocidadeMax;
	private int capacidadeCombustivel;
	private boolean voando;
	
	
	public Aeronave(String nome, int velocidadeMax, int capacidadeComnustivel) {
		this.nome = nome;
		this.velocidadeMax = velocidadeMax;
		this.capacidadeCombustivel = capacidadeComnustivel;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public int getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(int capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	
	
	public boolean isVoando() {
		return voando;
	}


	public void setVoando(boolean voando) {
		this.voando = voando;
	}


	public String decolar() {
		this.voando = true;
		return "a aeronave decolou";
	}
	public String pousar() {
		this.voando = false;
		return "a aeronave pousou";
	}
	
	
	
}
