package com.paulorpc.ufscar.estruturadados.cap06.Criatividade.Ex7_49_Ingles;


import java.util.ArrayList;
import java.util.ListIterator;


/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		ListIterator<Integer> it = l.listIterator();
		
		for (int i=0; i< 3; i++)
			it.next();
		
		System.out.println(  it.next().toString() );
		it.previous();
		System.out.println(  it.previous().toString() );
	
		

	}

}
