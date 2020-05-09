package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex7_11_Ingles;


import java.util.Iterator;
import net.datastructures.Position;

/**
 * @author paulo
 * @date 18 de jun de 2017
 *
 */
public class Iteracoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedPositionalList<String> l = new LinkedPositionalList<>();
		l.addFirst("Paulo");
		l.addFirst("Dani");
		l.addFirst("Gui");
		l.addFirst("fabricio");
		l.addFirst("Tati");
		
		for( String it : l )
			System.out.print(" " + it);
		
		//pula linha
		System.out.println("\n");
		
		for ( Position<String> it : l.positions() )
			System.out.print( " "+ it.getElement().toString() );

		//pula linha
		System.out.println("\n");

		
		Iterator<String> it = l.iterator();
		while (it.hasNext())
			System.out.print( " " + it.next() );

		//pula linha
		System.out.println("\n");

		
		Iterator<Position<String>> it2= l.positions().iterator();
		while (it2.hasNext())
			System.out.print( " " + it2.next().getElement() );
		
		//pula linha
		System.out.println("\n");

		
		Iterable<Position<String>> itb = l.positions();
		for( Position<String> it3 : itb )
			System.out.print( " "+ it3.getElement().toString() );
		
		

		
	}

}
