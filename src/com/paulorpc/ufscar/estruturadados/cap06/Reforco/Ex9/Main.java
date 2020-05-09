package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex9;


/**
 * @author paulo
 * @date 2 de jun de 2017
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		
		System.out.println(l.toString());
		
		
		l.inverterLista();
		System.out.println(l.toString());
		

	}

}
