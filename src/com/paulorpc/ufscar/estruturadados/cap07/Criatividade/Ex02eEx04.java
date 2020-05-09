package com.paulorpc.ufscar.estruturadados.cap07.Criatividade;


import net.datastructures.Position;

public class Ex02eEx04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		LinkedBinaryTree<String> t = new LinkedBinaryTree<>();
		
		t.addRoot("Raiz");
		t.addLeft(t.root(), "c1.1");
		t.addRight(t.root(), "c1.2");
		
		for (Position<String> pos : t.preorder())
			if (pos.getElement().toString().equals("c1.1")) {
				t.addLeft(pos,  "c1.1.1");
				t.addRight(pos, "c1.1.2");
			}
				
		for (Position<String> pos : t.preorder()) {
			if (pos.getElement().toString().equals("c1.1.1")) {
				t.addLeft(pos,  "c1.1.1.1");
			}
			
			if (pos.getElement().toString().equals("c1.2")) {
				t.addRight(pos, "c1.2.2");
			}
		}
		
		if(!true)
			t.printPreorder2();
		else
			t.printPreorder3();
		
	}
		
}

