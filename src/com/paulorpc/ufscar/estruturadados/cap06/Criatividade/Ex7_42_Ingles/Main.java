package com.paulorpc.ufscar.estruturadados.cap06.Criatividade.Ex7_42_Ingles;


/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {

	/*
	 * Describe a nonrecursive method for reversing a positional list
	 * represented with a doubly linked list using a single pass through the
	 * list.
	 */

	public static void main(String[] args) {
		
		LinkedPositionalList<String> l = new LinkedPositionalList<>();
		l.addFirst("Paulo");
		l.addFirst("Dani");
		l.addFirst("Fabricio");
		l.addFirst("Gui");
		l.addFirst("God");
		
		System.out.println(l.toString());
		l.reverse();
		
		System.out.println(l.toString());
	}

}
