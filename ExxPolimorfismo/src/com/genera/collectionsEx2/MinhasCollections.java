package com.genera.collectionsEx2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	public static void main(String[] args) {
		//instanciando Array list de Inteiros
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		//adicionando itens ao array
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		
		
		//Foreach de cada elemento da lista
		for(Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		//Lista set que exclui qualquer elemento repetido
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		//Elemento sera excluido por ser repetido e estarmos usando o HashSet
		meuSet.add(1);
		
		//Instanciando iterator para percorrer a lista com has next()
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
		
	}
}