package com.genera.collectionsEx1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestandoMain {
	public static void main(String[] args) {
		Telefone tel1 = new Telefone("44447744", 1);
		Telefone tel2 = new Telefone("44446644", 2);
		Telefone tel3 = new Telefone("45454444", 3);
		Telefone tel4 = new Telefone("44440144", 1);
		
		List<Telefone> agenda = new ArrayList<>();
		
		agenda.add(tel1);
		agenda.add(tel2);
		agenda.add(tel3);
		agenda.add(tel4);
		
		Iterator<Telefone> itr = agenda.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next().getNmrTelefone());
			}
		
		
	}
}
