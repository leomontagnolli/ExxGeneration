package com.genera.collectionsEx1;

public class Telefone {
	private String nmrTelefone;
	private int tipoTelefone; //0 residencial / 1 comercial / 2 celular
	
	
	public Telefone(String telefone, int tipo) {
		this.nmrTelefone = telefone;
		this.tipoTelefone = tipo;
	}
	
	
	public String getNmrTelefone() {
		return nmrTelefone;
	}
	public void setNmrTelefone(String nmrTelefone) {
		this.nmrTelefone = nmrTelefone;
	}
	public int getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(int tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	

}
