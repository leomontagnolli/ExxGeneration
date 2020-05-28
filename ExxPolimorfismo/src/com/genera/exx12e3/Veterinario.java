package com.genera.exx12e3;

public class Veterinario {
	
	public String examinar(Animal animal, Animal animal2,Animal animal3) {
		String res = "o " + animal.getNome() + " fez " + animal.emitirSom();
		String res2 = "o " + animal2.getNome() + animal2.emitirSom();
		String res3 = "o " + animal3.getNome() + " " + animal3.emitirSom();
		
		
		return res + " " + res2 + " " + res3;
	}

}
