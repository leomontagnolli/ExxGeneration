package com.genera.aeronaves;

public class Principal {

	public static void main(String[] args) {
	Aeronave aviao = new Aeronave("Jatof200", 400, 200);
	
		System.out.printf("O nome do avi�o � %s", aviao.getNome());
		
		System.out.println(aviao.decolar());
		
		if(aviao.isVoando()) {
			System.out.println("Aviao no ceu");
		}
		
		aviao.pousar();
		
		if(!aviao.isVoando()) {
			System.out.println("Avi�o n�o esta voando");
		}

	}

}
