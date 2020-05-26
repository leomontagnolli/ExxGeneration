package com.genera.aeronaves;

public class Principal {

	public static void main(String[] args) {
	Aeronave aviao = new Aeronave("Jatof200", 400, 200);
	
		System.out.printf("O nome do avião é %s", aviao.getNome());
		
		System.out.println(aviao.decolar());
		
		if(aviao.isVoando()) {
			System.out.println("Aviao no ceu");
		}
		
		aviao.pousar();
		
		if(!aviao.isVoando()) {
			System.out.println("Avião não esta voando");
		}

	}

}
