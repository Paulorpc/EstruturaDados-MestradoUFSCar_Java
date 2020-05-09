package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex22;

import com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex21.ListaCircular;
import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		ListaCircular l1 = new ListaCircular();
		ListaCircular l2 = new ListaCircular();
		
		l1.add(new Node("Paulo", 31, null));
		l1.add(new Node("Gui", 27, null));
		l1.add(new Node("Dani", 32, null));
		l1.add(new Node("Marcela", 24, null));
		l1.add(new Node("Pedro", 32, null));
		l1.add(new Node("Livia", 24, null));
		
		if (true)
			l2 = l1.splitList();
		
		
		System.out.println("[ Lista 1 ]\n");
		l1.printLista();
		
		System.out.println("[ Lista 2 ]\n");
		l2.printLista();
				
	}
}
