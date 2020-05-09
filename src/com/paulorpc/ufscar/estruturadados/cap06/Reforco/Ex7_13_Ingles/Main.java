package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex7_13_Ingles;


/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {

	public static void main(String[] args) {

		/*
		 * Suppose we want to extend the PositionalList abstract data type with
		 * a method, findPosition(e), that returns the first position containing
		 * an element equal to e (or null if no such position exists). Show how
		 * to implement this method using only existing methods of the
		 * PositionalList interface (not details of our LinkedPositionalList
		 * implementation).
		 */

		LinkedPositionalList<Integer> l = new LinkedPositionalList<>();
		l.addFirst(10);
		l.addFirst(9);
		l.addFirst(7);
		l.addFirst(5);
		l.addFirst(1);
		
		System.out.println(l.toString());
		System.out.println( l.findPosition(7).getElement().toString() );
		System.out.println( l.indexOf(l.findPosition(5)) );
		
	}

}
