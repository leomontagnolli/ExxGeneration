package com.genera.exx4;

public class CarroPasseio extends Veiculo {
	
	private String cor;
	private String modelo;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void entrPass (String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public String mostrPass () {
		return "Cor: " + this.cor + "Modelo:" + this.modelo;
	}
	

}
