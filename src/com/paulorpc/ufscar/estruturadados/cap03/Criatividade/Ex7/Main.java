package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex7;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.ListaEncadeada;
import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ListaEncadeada l1 = new ListaEncadeada();
		ListaEncadeada l2 = new ListaEncadeada();
		ListaEncadeada listas = new ListaEncadeada();
		
		l1.adicionaFim(new Node("Paulo", 30, null));
		l1.adicionaFim(new Node("Dani", 31, null));
		
		l2.adicionaFim(new Node("Gui", 26, null));
		l2.adicionaFim(new Node("Tati", 24, null));
		
		listas.concatenaListaS(l1, l2);
		
		if (!true) {
			System.out.println("L1: ");
			l1.printLista();
			System.out.println("\nL2: ");
			l2.printLista();
		}
		else {
			listas.printLista();
		}
			

	}

}
