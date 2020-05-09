package com.paulorpc.ufscar.estruturadados.Extras.ListaduplamenteEncadeadaSent;

import com.paulorpc.ufscar.estruturadados.Extras.ListaDuplamenteEncadeada.DNode;

public class Main {

	public static void main(String[] args) throws Exception {

		ListaDuplamenteEncadeadaSent ld = new ListaDuplamenteEncadeadaSent();
		ListaDuplamenteEncadeadaSent ld2 = new ListaDuplamenteEncadeadaSent();

		ld.addFirst(new DNode("Paulo", null, null));
		ld.addLast(new DNode("Fabricio", null, null));
		ld.addLast(new DNode("dani", null, null));

		// System.out.println("-- lista --\n");
		// ld.getSize();
		// ld.printLDE();
		// System.out.println("--\n");

		// ld.addFirst(new DNode("Dani", null, null));
		// ld.addFirst(new DNode("Fabricio", null, null));
		//
		// ld.addPos(2, new DNode("Jorge", null, null));
		// ld.addPos(5, new DNode("Matheus", null, null));

		// ld.removePos(2);
		// ld.removePos(4);

		// System.out.println("-- lista --\n");
		// ld.getSize();
		// ld.printLDE();
		// System.out.println("--\n");

		// ld.getFirst().printNode();
		// ld.getLast().printNode();

		ld2 = ld.clone();

		ld2.removePos(1);
		ld2.removePos(1);

		System.out.println("-- lista 1--\n");
		ld.printLDE();

		System.out.println("-- lista 2--\n");
		ld2.printLDE();

	}

}