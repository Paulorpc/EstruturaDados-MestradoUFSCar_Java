package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex14;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class Ex14 {

	public static void main(String[] args) {
		
		ListaCircular lc = new ListaCircular();
		
		lc.add(new Node("Paulo", 30, null));
		lc.add(new Node("Dani", 31, null));
		lc.add(new Node("Gui", 27, null));
		lc.add(new Node("Fabricio", 24, null));
		
		System.out.print(lc.toString());

	}

}
