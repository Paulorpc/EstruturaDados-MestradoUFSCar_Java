package com.paulorpc.ufscar.estruturadados.cap07.Criatividade;


import net.datastructures.Position;

public class Ex05 {
	
	public static void main (String[] args) {
		
		LinkedBinaryTree<String> t = new LinkedBinaryTree<>();
		
		t.addRoot("Vendas");
		t.addLeft(t.root(), "Nacional");
		t.addRight(t.root(), "Internacional");
		
		for (Position<String> pos : t.preorder())
			if (pos.getElement().toString().equals("Internacional")) {
				t.addLeft(pos,  "Canada");
				t.addRight(pos, "Ultramar");
			}
				
		for (Position<String> pos : t.preorder()) {
			if (pos.getElement().toString().equals("Ultramar")) {
				t.addLeft(pos,  "Africa");
				t.addRight(pos, "Europa");
			}
			
		}
		System.out.println( t.preOrderIdentado(t.root()) );
		
	}

}
