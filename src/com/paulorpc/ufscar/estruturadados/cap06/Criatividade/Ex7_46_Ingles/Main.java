package com.paulorpc.ufscar.estruturadados.cap06.Criatividade.Ex7_46_Ingles;


/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {
	
	/**
	 * Modify the LinkedPositionalList class to support a method swap(p, q) that
	 * causes the underlying nodes referenced by positions p and q to be
	 * exchanged for each other. Relink the existing nodes; do not create any
	 * new nodes
	 */
	
	public static void main(String[] args) {
		
		LinkedPositionalList<Integer> l = new LinkedPositionalList<>();
		
		l.addFirst(5);
		l.addFirst(4);
		l.addFirst(3);
		l.addFirst(2);
		l.addFirst(1);
		
		System.out.println(l.toString());
		System.out.println(l.first());
		System.out.println(l.last());
		
		l.swap(l.first(), l.last());
		
		System.out.println(l.toString());
		System.out.println(l.first());
		System.out.println(l.last());
		
	}

}
