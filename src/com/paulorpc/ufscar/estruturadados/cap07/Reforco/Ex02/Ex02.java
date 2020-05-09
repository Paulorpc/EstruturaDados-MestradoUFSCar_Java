package com.paulorpc.ufscar.estruturadados.cap07.Reforco.Ex02;


import java.util.Stack;

import net.datastructures.Position;

public class Ex02 {
	
	public static void main(String[] args) {
		
		LinkedBinaryTree<String> t = new LinkedBinaryTree<String>();
		
		t.addRoot("*");
		t.addLeft(t.root(), "+");
		t.addRight(t.root(), "3");
		
		for (Position<String> pos : t.preorder())
			if (pos.getElement().toString().equals("+")) {
				t.addLeft(pos,  "3");
				t.addRight(pos, "1");
			}		
		
		Stack<String> s = new Stack<>();
		System.out.println(t.posOrderOperacao(t.root(), s));
		
	}

}
