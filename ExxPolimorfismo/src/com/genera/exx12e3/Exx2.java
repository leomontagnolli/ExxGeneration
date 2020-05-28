package com.genera.exx12e3;

public class Exx2 {
	
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
		System.out.println(emitirSomDoAnimal(dog));
		System.out.println(emitirSomDoAnimal(cavalo));
		System.out.println(emitirSomDoAnimal(preguica));
		
		dog.setNome("Cachorro");
		dog.setIdade(3);
		
		cavalo.setNome("Pé de pano ");
		cavalo.setIdade(10);
		
		preguica.setNome("Sid");
		preguica.setIdade(4);
		
		Veterinario veterinario = new Veterinario();
		
		
		String exame = veterinario.examinar(dog, cavalo, preguica);
		
		System.out.println(exame);
		
		
		
		
	}
	public static String emitirSomDoAnimal (Animal animal) {
		return animal.emitirSom();
	}
}
