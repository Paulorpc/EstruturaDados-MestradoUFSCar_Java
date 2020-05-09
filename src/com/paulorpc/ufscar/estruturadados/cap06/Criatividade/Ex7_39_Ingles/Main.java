package com.paulorpc.ufscar.estruturadados.cap06.Criatividade.Ex7_39_Ingles;


import net.datastructures.Position;

/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Suppose we want to extend the PositionalList abstract data type with
		 * a method, moveToFront(p), that moves the element at position p to the
		 * front of a list (if not already there), while keeping the relative
		 * order of the remaining elements unchanged. Show how to implement this
		 * method using only existing methods of the PositionalList interface
		 * (not details of our LinkedPositionalList implementation).
		 */
		
		
		LinkedPositionalList<String> l = new LinkedPositionalList<>();
		l.addFirst("Paulo");
		l.addFirst("Dani");
		l.addFirst("Fabricio");
		l.addFirst("Gui");
		l.addFirst("God");

		if(!true) {
			System.out.println(l.toString());
			l.moveToFront( l.after(l.after(l.first())) );
			System.out.println(l.toString());
		}
		else {
			Iterable<Position<String>> it = l.positions();
			for(Position<String> pos : it) {
				if (pos.getElement().equals("Paulo"))
					l.moveToFront(pos);
			}
			System.out.println(l.toString());
		}

	}

}
