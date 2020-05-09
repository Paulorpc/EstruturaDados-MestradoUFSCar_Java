package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex7_5_Ingles;


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
		
		/*
		 * The java.util.ArrayList includes a method, trimToSize(), that
		 * replaces the underlying array with one whose capacity precisely
		 * equals the number of elements currently in the list. Implement such a
		 * method for our dynamic version of the ArrayList class from Section
		 * 7.2.
		 */
		
		ArrayList l = new ArrayList(50);
		l.add(0, 5);
		l.add(0, 4);
		l.add(0, 3);
		l.add(0, 2);
		l.add(0, 1);
		
		// tamanho original instanciado
		System.out.println("Capacity: " +l.getCapacity() +" -> " +l.toString());
		
		l.trimToSize();
		
		// tamanho reduzido ao tamanho de elementos
		System.out.println("Capacity: " +l.getCapacity() +" -> " +l.toString());
		
		l.add(0, -1);
		
		// não existe posição para próximo elemento, então é feito resize duplicando tamanho do vetor
		System.out.println("Capacity: " +l.getCapacity() +" -> " +l.toString());
		
		l.trimToSize();
		
		// tamanho reduzido ao tamanho de elementos
		System.out.println("Capacity: " +l.getCapacity() +" -> " +l.toString());

	}

}
