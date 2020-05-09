package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex7_11_Ingles;


/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Describe an implementation of the positional list methods addLast and
		 * addBefore realized by using only methods in the set {isEmpty, first,
		 * last, before, after, addAfter, addFirst}.
		 */
		
		LinkedPositionalList<Integer> l = new LinkedPositionalList<>();
		l.addFirst(5);
		l.addFirst(4);
		l.addFirst(3);
		l.addFirst(2);
		l.addFirst(1);
		
		System.out.println(l.toString());
		
		l.addBefore(l.first(), 10);
		l.addAfter(l.last(), 11);
		
		System.out.println(l.toString());

	}

}
