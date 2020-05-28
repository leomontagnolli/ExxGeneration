package com.genera.exx4;

public class Caminhao extends Veiculo {
	private int cargaMaxima;
	private int alturaMax;
	private int comprimento;
	
	
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public int getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	
	public void entrCamn (int carga, int altura, int compri) {
		this.cargaMaxima = carga;
		this.alturaMax = altura;
		this.comprimento = compri;
	}
	
	
	public void mostrarCamn () {
		System.out.println("Carga maxima:" + this.cargaMaxima + " Altura maxima:" + this.alturaMax + " Comprimento: " + this.comprimento);
	}
	
	

}
