package com.paulorpc.ufscar.estruturadados.cap06.Criatividade.Ex7_44_Ingles;


/**
 * @author paulo
 * @date 3 de jun de 2017
 *
 */
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Describe a method for performing a card shuffle of a list of 2n
		 * elements, by converting it into two lists. A card shuffle is a
		 * permutation where a list L is cut into two lists, L1 and L2, where L1
		 * is the first half of L and L2 is the second half of L, and then these
		 * two lists are merged into one by taking the first element in L1, then
		 * the first element in L2, followed by the second element in L1, the
		 * second element in L2, and so on.
		 */
		
		ArrayList<Integer> l = new ArrayList<>();
		ArrayList<Integer> lshuffled = new ArrayList<>();
		
		for(int i=0; i<11; i++)
			l.add(i, i+1);
		
		System.out.println( l.toString() );	
		
		lshuffled = l.cardShufle();
		
		System.out.println( lshuffled.toString() );

	}

}
