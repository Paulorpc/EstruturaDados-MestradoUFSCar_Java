package com.paulorpc.ufscar.estruturadados.cap07.Criatividade;

public class Ex08 {
	
	public static void main (String[] args) {
		
		LinkedBinaryTree<String> t = new LinkedBinaryTree<>();
		LinkedBinaryTree<String> t1 = new LinkedBinaryTree<>();
		LinkedBinaryTree<String> t2 = new LinkedBinaryTree<>();
		
		t.addRoot("Raiz");
		
		t1.addRoot("Subtree 1");
		t1.addLeft(t1.root(), "Filho Esquerda 1");
		t1.addRight(t1.root(), "Filho Direta 1");
		
		t2.addRoot("Subtree 2");
		t2.addLeft(t2.root(), "Filho Esquerda 2");
		t2.addRight(t2.root(), "Filho Direta 2");
		
		t.attach(t.root(), t1, t2);	
		System.out.println( t.preOrderIdentado(t.root()) );
				
		
	}

}

