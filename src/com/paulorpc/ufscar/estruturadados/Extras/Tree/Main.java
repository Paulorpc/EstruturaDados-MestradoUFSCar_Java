package com.paulorpc.ufscar.estruturadados.Extras.Tree;


import net.datastructures.Position;

public class Main {

	public static void main(String[] args) {
		
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<Integer>();
		t.addRoot(1);
		t.addLeft(t.root(), 2);
		
		for (Position<Integer> pos : t.preorder())
			System.out.println(pos.getElement().toString());

	}

}
