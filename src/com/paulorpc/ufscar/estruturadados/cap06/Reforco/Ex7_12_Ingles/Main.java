package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex7_12_Ingles;

/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {

	public static void main(String[] args) {

		/*
		 * Suppose we want to extend the PositionalList abstract data type with
		 * a method, indexOf(p), that returns the current index of the element
		 * stored at position p. Show how to implement this method using only
		 * other methods of the PositionalList interface (not details of our
		 * LinkedPositionalList implementation).
		 */

		LinkedPositionalList<Integer> l = new LinkedPositionalList<>();
		l.addFirst(10);
		l.addFirst(9);
		l.addFirst(7);
		l.addFirst(5);
		l.addFirst(1);
		
		System.out.println(l.toString());
		System.out.println("Position: " +l.last().getElement() );
		System.out.println("Position index : " +l.indexOf(l.last()));
		
	}

}
