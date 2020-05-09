package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex9;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.ListaEncadeada;
import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		ListaEncadeada l1 = new ListaEncadeada();
		
		l1.adicionaFim(new Node("Paulo", 30, null));
		l1.adicionaFim(new Node("Dani", 31, null));
		l1.adicionaFim(new Node("Gui", 26, null));
		l1.adicionaFim(new Node("Tati", 24, null));
		l1.adicionaFim(new Node("Matheus", 22, null));
		l1.adicionaFim(new Node("Jorge", 21, null));
		
		if (!true)
			l1.printLista();
		else {
			l1.trocaElementoPosicao(3,6);
			l1.printLista();
			l1.getCauda().printNode();
		}
		
		
	}

}
