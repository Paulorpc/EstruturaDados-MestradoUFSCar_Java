package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex8;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex9.Dnode;
import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex9.ListaDuplamenteEncadeada;

public class main {

	public static void main(String[] args) throws Exception {
		ListaDuplamenteEncadeada l1 = new ListaDuplamenteEncadeada();
		ListaDuplamenteEncadeada l2 = new ListaDuplamenteEncadeada();
		ListaDuplamenteEncadeada listas = new ListaDuplamenteEncadeada();
		
		l1.adicionaInicio(new Dnode("Paulo", 30, null, null));
		l1.adicionaInicio(new Dnode("Dani", 31, null, null));
		
		l2.adicionaInicio(new Dnode("Gui", 27, null, null));
		l2.adicionaInicio(new Dnode("Fabricio", 27, null, null));
		
		
		int i = 1;
		
		if (i == 0) {
			System.out.println("L1: ");
			l1.printList();
			System.out.println("\nL2: ");
			l2.printList();
		}
		else if (i==1){
			l1.adicionaListaInicio(l2);
			l1.printList();
		}
		// não fiz
		else if(i==2) {
			listas.concatenaListas(l1, l2);
			listas.printList();
		}
		
	}

}
