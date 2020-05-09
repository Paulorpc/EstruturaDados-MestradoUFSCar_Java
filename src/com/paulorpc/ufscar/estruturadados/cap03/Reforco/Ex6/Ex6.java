package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6;


public class Ex6 {
	
	public static void main(String[] args) throws Exception {
		
		ListaEncadeada le = new ListaEncadeada();
				
		le.adicionaFim(new Node("Dani", 31, null));
		le.adicionaInicio(new Node("Paulo", 30, null));
		le.adicionaInicio(new Node("Fabricio", 24, null));
		le.adicionaInicio(new Node("Pedro", 29, null));
		//le.adicionaFim(new Node("Gui", 27, null));
		//le.removeInicio();		
		
		//System.out.println("Qtde de nós: " + le.getTamanho());
		//le.printCabeca();
		//le.printCauda();
		
		//le.getListaNode(3).printNode();
		
		le.printLista();
		le.removeFim();
		le.printLista();
		
		//le.getPenultimoNode().printNode();
		
		//le.printLista();
	}

}
