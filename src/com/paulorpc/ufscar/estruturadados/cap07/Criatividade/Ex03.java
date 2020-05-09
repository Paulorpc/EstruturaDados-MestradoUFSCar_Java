package com.paulorpc.ufscar.estruturadados.cap07.Criatividade;


import net.datastructures.Position;

public class Ex03 {
	
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
			if (pos.getElement().toString().equals("c1.1.1"))
				t.addLeft(pos,  "c1.1.1.1");
			
			if (pos.getElement().toString().equals("c1.2"))
				t.addRight(pos, "c1.2.2");
		}
		
		t.height(t.root());
		
		
		t.preOrderPaulo(t.root());
		System.out.println();
		for( Position<String> pos : t.preorder())
			System.out.println(pos.getElement().toString());
		
		System.out.println("---\n");
		t.inOrderPaulo(t.root());
		System.out.println();
		for( Position<String> pos : t.inorder())
			System.out.println(pos.getElement().toString());

		System.out.println("---\n");
		t.posOrderPaulo(t.root());
		System.out.println();
		for( Position<String> pos : t.postorder())
			System.out.println(pos.getElement().toString());
		
	}

}
