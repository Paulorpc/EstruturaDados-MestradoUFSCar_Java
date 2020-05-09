package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex5_e_7;


/**
 * @author paulo
 * @date 28 de mai de 2017
 */
public class Main {
	
	
	public static void main(String[] args) {
		
		DLinkedList<Integer> l = new DLinkedList<>();
		l.addFirst(1);
		l.addFirst(5);
		l.addFirst(3);
		l.addLast(9);
		l.addBefore(l.getElement(2), 6);
		
		System.out.println( l.toString() );

	}	

}
