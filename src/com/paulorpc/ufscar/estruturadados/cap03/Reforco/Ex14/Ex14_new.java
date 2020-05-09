package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex14;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class Ex14_new {
	
	public static void main(String[] args) {
		
		ListaCircular_new l1 = new ListaCircular_new();
		
		l1.add(new Node("Paulo", 30, null));
		l1.add(new Node("João", 26, null));
		l1.add(new Node("Dani", 31, null));
		l1.add(new Node("Débora", 28, null));
		
		//l1.printlist();
		l1.remove();
		l1.printlist();
		
	}

}
