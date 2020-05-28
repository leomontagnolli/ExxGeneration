package com.genera.exx4;

public class Veiculo {
	private float pesoKg;
	private float velMax;
	private float preco;
	
	
	public float getPesoKg() {
		return pesoKg;
	}
	public void setPesoKg(float pesoKg) {
		this.pesoKg = pesoKg;
	}
	public float getVelMax() {
		return velMax;
	}
	public void setVelMax(float velMax) {
		this.velMax = velMax;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void entrVeic(float peso, float velocidademax, float preco) {
		this.pesoKg = peso;
		this.velMax= velocidademax;
		this.preco = preco;
	}
	
	public void mostrarDados() {
		
		System.out.println("Peso:" + this.pesoKg +" VelMax: " + this.velMax + " Preço: " + this.preco);
		
	}
}
