package com.paulorpc.ufscar.estruturadados.cap07.Reforco.Ex02;

import net.datastructures.Position;

public class ExerciciosEuler {

	public static void main(String[] args) {
		
		// Percorrimento com método de euler para imprimir uma expressão aritmética completa
		// Exemplo página 276, 7.20
		
		LinkedBinaryTree<String> t = new LinkedBinaryTree<>();
		
		t.addRoot("-");
		t.addLeft(t.root(), "/");
		t.addRight(t.root(), "+");
		
		for (Position<String> pos : t.preorder()) {
			if (pos.getElement().toString().equals("/")) {
				t.addLeft(pos,  "*");
				t.addRight(pos, "+");
			}
			if (pos.getElement().toString().equals("+")) {
				t.addLeft(pos,  "*");
				t.addRight(pos, "6");
				break;
			}
		}
		for (Position<String> pos : t.preorder()) {
			if (pos.getElement().toString().equals("*") && t.parent(pos).getElement().toString().equals("/")) {
				t.addLeft(pos,  "+");
				t.addRight(pos, "3");
			}
			if (pos.getElement().toString().equals("*") && t.parent(pos).getElement().toString().equals("+")) {
				t.addLeft(pos,  "3");
				t.addRight(pos, "-");
			}
		}
		for (Position<String> pos : t.preorder()) {
			if (pos.getElement().toString().equals("+") && t.parent(pos).getElement().toString().equals("*")) {
				t.addLeft(pos,  "3");
				t.addRight(pos, "1");
			}
			if (pos.getElement().toString().equals("+") && t.parent(pos).getElement().toString().equals("/")) {
				t.addLeft(pos,  "-");
				t.addRight(pos, "2");
			}
		}
		boolean b = true;
		for (Position<String> pos : t.preorder()) {
			if (pos.getElement().toString().equals("-") && t.isExternal(pos) && b) {
				t.addLeft(pos,  "9");
				t.addRight(pos, "5");
				b = false;
			}
			if (pos.getElement().toString().equals("-") && t.isExternal(pos) && !b) {
				t.addLeft(pos,  "7");
				t.addRight(pos, "4");
			}
		}
		
//		t.eulerPrintExpressão(t.root());
//		System.out.print( "\n" + t.eulerNroDescendentes(t.root(), 0) + " Descendentes");
//		System.out.print( "\n" + t.eulerNroNiveis(t.root()) + " Níveis");
		
	}

}
