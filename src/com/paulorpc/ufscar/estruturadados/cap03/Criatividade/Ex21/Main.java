package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex21;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		ListaCircular l1 = new ListaCircular();
		ListaCircular l2 = new ListaCircular();
		
		if (false){
			// Não pode ser desta forma, pois ao adicionar os mesmos nós na lista 2 muda a referencia   
			// entre os nós da lista lista 1 uma vez que o apontamento dos nós são os mesmos.
			
			// Se fizer desta forma, as listas realmente precisam ser identicas para que uma não altere a outras. 
			Node n1 = new Node("Paulo", 31, null);
			Node n2 = new Node("Gui", 27, null);
			Node n3 = new Node("Dani", 32, null);
			Node n4 = new Node("Marcela", 24, null);
			
			l1.add(n1);
			l1.add(n2);
			l1.add(n3);
			l1.add(n4);
			
			l2.add(n1);
			l2.add(n2);
			l2.add(n3);
			l2.add(n4);
			
			if(l1.compareReferenciasList(l2))
				System.out.println("==> listas idênticas\n");
			else
				System.out.println("==> listas diferentes\n");
		}
		else {
			l1.add(new Node("Paulo", 31, null));
			l1.add(new Node("Gui", 27, null));
			l1.add(new Node("Dani", 32, null));
			l1.add(new Node("Marcela", 24, null));
			
			l2.add(new Node("Paulo", 31, null));
			l2.add(new Node("Gui", 27, null));
			l2.add(new Node("Dani", 32, null));
			l2.add(new Node("Marcela", 24, null));
			
			if(l1.compareList(l2))
				System.out.println("==> listas idênticas\n");
			else
				System.out.println("==> listas diferentes\n");
		}
		
		
		System.out.println("[ Lista 1 ]\n");
		l1.printLista();
		
		System.out.println("[ Lista 2 ]\n");
		l2.printLista();
		
	}

}
