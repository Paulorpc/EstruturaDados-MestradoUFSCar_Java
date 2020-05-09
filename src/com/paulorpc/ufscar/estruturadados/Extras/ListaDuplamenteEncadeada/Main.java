package com.paulorpc.ufscar.estruturadados.Extras.ListaDuplamenteEncadeada;


public class Main {

	public static void main(String[] args) throws Exception {

		ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();

		ld.addFirst(new DNode("Paulo", null, null));
		ld.addLast(new DNode("Fabricio", null, null));
		ld.addLast(new DNode("dani", null, null));

		System.out.println("-- lista --\n");
		ld.getSize();
		ld.printLDE();
		System.out.println("--\n");

		// ld.addFirst(new DNode("Dani", null, null));
		// ld.addFirst(new DNode("Fabricio", null, null));

		ld.addPos(2, new DNode("Jorge", null, null));
		ld.addPos(5, new DNode("Matheus", null, null));

		ld.removePos(2);
		ld.removePos(4);

		System.out.println("-- lista --\n");
		ld.getSize();
		ld.printLDE();
		System.out.println("--\n");

		ld.getFirst().printNode();
		ld.getLast().printNode();

	}

}
