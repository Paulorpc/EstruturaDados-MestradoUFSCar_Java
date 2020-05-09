package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex9;


public class Ex9 {
	
	public static void main(String[] args) throws Exception{
		
		ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();
		
		Dnode paulo = new Dnode("Paulo", 30, null, null);
		Dnode dani = new Dnode("Dani", 31, null, null);
		Dnode gui = new Dnode("Gui", 27, null, null);
		Dnode fabricio = new Dnode("Fabricio", 27, null, null);
		Dnode tasso = new Dnode("Tasso", 40, null, null);
		
		ld.adicionaDepoisDe(ld.getFirst(), paulo);
		ld.adicionaDepoisDe(paulo, dani);
		ld.adicionaDepoisDe(dani, gui);
		ld.adicionaDepoisDe(gui, fabricio);
		ld.adicionaDepoisDe(fabricio, tasso);
		
//		ld.adicionaInicio(new Dnode("Paulo", 30, null, null));
//		ld.adicionaInicio(new Dnode("Dani", 31, null, null));
//		ld.adicionaInicio(new Dnode("Gui", 27, null, null));
//		ld.adicionaInicio(new Dnode("Fabricio", 27, null, null));
		
//		ld.getFirst().printDnode();
//		ld.getFirst().getNext().printDnode();
//		ld.getFirst().getNext().getNext().printDnode();
//		ld.getLast().printDnode();

		ld.printList();
//		ld.getNext(2).printDnode();
		
//		ld.getNodeMeio().getPrevious().printDnode();
//		ld.getNodeMeio().printDnode();
//		ld.getNodeMeio().getNext().printDnode();
		
	}

}
