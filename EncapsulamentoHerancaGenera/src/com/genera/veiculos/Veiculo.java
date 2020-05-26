package com.genera.veiculos;

public class Veiculo {
	private int NmrRodas;
	private String placa;
	private int kmRodado;
	private int velocidadeAtual;
	
	
	public Veiculo(int nmrRodas, String placa, int kmRodado) {
		NmrRodas = nmrRodas;
		this.placa = placa;
		this.kmRodado = kmRodado;
	}
	
	public Veiculo () {
		
	}
	
	public int getNmrRodas() {
		return NmrRodas;
	}
	public void setNmrRodas(int nmrRodas) {
		NmrRodas = nmrRodas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	public int getVelocidadeAtual() {
		return this.velocidadeAtual;
	}
	
	public static String venderVeiculo (Veiculo veiculo) {
		String placa = veiculo.getPlaca();
		
		return placa + " este veiculo foi vendido";
		
	}
	
	public void acelerar (int valor) {
		this.velocidadeAtual +=valor;
	}
	
	public void frear () {
		this.velocidadeAtual = 0;
	}
	
	public String fazerCurva () {
		if(this.velocidadeAtual >= 70) {
			return "Capotou, diminua a velocidade para fazer curvas";
		}
		else {
			return "Curva bem sucedida";
		}
	}
	

}
