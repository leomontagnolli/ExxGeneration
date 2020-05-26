package com.genera.eletrodomesticos;

public class Principal {
	public static void main(String[] args) {
		Eletrodomestico dvd = new Eletrodomestico("DVD", 112.0f, true);
		
		System.out.println(dvd.getNome());
		System.out.println(dvd.getVoltagem());
		System.out.println(dvd.isLigado());
		
		Eletrodomestico tv = new Eletrodomestico("TV 42", 220.0f, false);
		
		System.out.println(tv.getNome());
		System.out.println(tv.getVoltagem());
		System.out.println(tv.isLigado());
	}

}
