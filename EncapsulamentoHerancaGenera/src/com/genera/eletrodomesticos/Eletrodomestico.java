package com.genera.eletrodomesticos;

public class Eletrodomestico {
	private String nome;
	private float voltagem;
	private boolean ligado;
	
	
	
	public Eletrodomestico(String nome, float voltagem, boolean ligado) {
		this.nome = nome;
		this.voltagem = voltagem;
		this.ligado = ligado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLihado(boolean lihado) {
		this.ligado = lihado;
	}
	
	
	

}
