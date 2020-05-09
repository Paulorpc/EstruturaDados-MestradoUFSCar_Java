package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex6;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.ListaEncadeada;
import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class ListaEncadeadaReversa extends ListaEncadeada {
	
	private Node cabecaInv;
	private Node caudaInv;
	
	public void inverterLista() throws Exception {
		
	Node aux = null;
	
	cabecaInv = getCauda();
	caudaInv = getCabeca();
	
	aux = cabecaInv;
	for(int i=getTamanho()-1; i>0; i--) {
		aux.setNext( getListaNode(i) );
		aux = aux.getNext();
	}
	
	setCabeca(cabecaInv);
	}
	
}
