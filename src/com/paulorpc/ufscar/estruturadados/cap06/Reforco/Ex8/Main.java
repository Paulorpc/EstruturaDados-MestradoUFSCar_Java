package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex8;


import java.util.Iterator;

/**
 * @author paulo
 * @date 29 de mai de 2017
 *
 */
public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		NodePositionList<Integer> l = new NodePositionList<>();
		l.addFirst(5);
		l.addLast(2);
		l.addLast(4);
		l.remove( l.first() );
		l.addLast(5);
		l.addFirst(1);
		//System.out.print( l.toString() );
		
		if(!true) {
			Iterator<Integer> it = l.iterator();
			
			System.out.println("Iterador elementos:");
			
			while(it.hasNext())
				System.out.print( it.next().toString() + " ");
		}
		else {
			Iterable<Position<Integer>> it2 = l.positions();
			int count = 0;
			
			System.out.println("Iterador Posições (foreach):");
			
			for (Position<Integer> a: it2) {
				System.out.print( a.element().toString() + " ");
				count++;
				if (l.size() == count) 
					System.out.println("\nEureka: Qtde elementos = "+count);
			}
		}
		
	}
		
}
