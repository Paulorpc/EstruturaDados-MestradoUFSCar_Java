package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex6;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.ListaEncadeada;
import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class Main {
	
	public static void main (String[] args) throws Exception {
		
//		ListaEncadeadaReversa lr = new ListaEncadeadaReversa();
//		
//		lr.adicionaFim(new Node("Paulo", 30, null));
//		lr.adicionaFim(new Node("Dani", 31, null));
//		lr.adicionaFim(new Node("Gui", 26, null));
//		lr.adicionaFim(new Node("Tati", 24, null));	
//		
//		if (!true)
//			lr.printLista();
//		else {
//			lr.inverterLista();
//			lr.printLista();
//		}
		
		
		ListaEncadeada le = new ListaEncadeada();
		
		le.adicionaFim(new Node("Paulo", 30, null));
		le.adicionaFim(new Node("Dani", 31, null));
		le.adicionaFim(new Node("Gui", 26, null));
		le.adicionaFim(new Node("Tati", 24, null));	
		
		if (!true)
			le.printLista();
		else {
			le.inverterLista(le.getTamanho(), true, null);
			le.printLista();
		}
		//le.getCabeca().printNode();
		//le.getCauda().printNode();
		
	}

}
