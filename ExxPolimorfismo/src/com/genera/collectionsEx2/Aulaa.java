package com.genera.collectionsEx2;

import java.util.ArrayList;

public class Aulaa {
	private String titulo;
	private int tempo;
	
	public Aulaa() {
		//metodo construtor
		this.titulo = titulo;
		this.tempo = tempo;
	}
		//getters e setters
		public String getTitulo() {
		return titulo;
		}
		public int getTempo() {
		return tempo;
		}

	
		public static void main(String[] args) {
			//declarando e inicializando strings
			String aula1 = "Modelando classe da aula";
			String aula2 = "Conhecendo mais listas";
			String aula3 = "Trabalhando com cursos e sets";
			
			//instanciando objeto da classe ArrayList
			ArrayList<String> aulas = new ArrayList<>();
			//adicionando items ao array
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);
			
			//imprimindo arrays e o tamanho do array
			System.out.println(aulas);
			System.out.println(aulas.size());
			
			
			// cuidado! <= faz sentido aqui?
			for (int i = 0; i <= aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
			}
			
			//o for esta com erro pq o array contem posicoes 0,1 e 2. mas o array Size conta a partir de 1
			
			
			
		}


}
