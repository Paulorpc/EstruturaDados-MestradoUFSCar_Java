package com.paulorpc.ufscar.estruturadados.Extras.ListaduplamenteEncadeadaSentIteravel;


import java.util.Iterator;

import com.paulorpc.ufscar.estruturadados.Extras.ListaEncadeadaGenerica.Carro;


public class Main {
	
	public static void main(String[] args) throws Exception {

		ListaDuplamenteEncadeadaSentIteravel<Carro> ld = new ListaDuplamenteEncadeadaSentIteravel<>();
		ListaDuplamenteEncadeadaSentIteravel<Carro> ld2 = new ListaDuplamenteEncadeadaSentIteravel<>();

		
		ld.addFirst(new DNode<Carro>(new Carro("Monza", 4), null, null));
		ld.addFirst(new DNode<Carro>(new Carro("Astra", 4), null, null));
		ld.addFirst(new DNode<Carro>(new Carro("Pegeout", 4), null, null));

		// System.out.println("-- lista --\n");
		// ld.getSize();
		// ld.printLDE();
		// System.out.println("--\n");

		// ld.addFirst(new DNode("Dani", null, null));
		// ld.addFirst(new DNode("Fabricio", null, null));
		//
		// ld.addPos(2, new DNode("Jorge", null, null));
		// ld.addPos(5, new DNode("Matheus", null, null));

		// ld.removePos(2);
		// ld.removePos(4);

		// System.out.println("-- lista --\n");
		// ld.getSize();
		// ld.printLDE();
		// System.out.println("--\n");

		// ld.getFirst().printNode();
		// ld.getLast().printNode();

		int menu = 2;
		
		switch (menu) {
			case 1: 
				ld2 = ld.clone();
				
				ld2.removePos(1);
				ld2.removePos(1);
				
				System.out.println("-- lista 1--\n");
				ld.printLDE();
				
				System.out.println("-- lista 2--\n");
				ld2.printLDE();			
		break;
		case 2:
			Iterator<Carro> iCarros = ld.iterator();
			while ( iCarros.hasNext() )
				System.out.println( iCarros.next().toString() );
		break;
		case 3:
			// nao sei se ta certo
			Iterable listaIteravel = ld.iterable();
			System.out.println( listaIteravel.iterator().next().toString() );
		break;
		}

	}

}