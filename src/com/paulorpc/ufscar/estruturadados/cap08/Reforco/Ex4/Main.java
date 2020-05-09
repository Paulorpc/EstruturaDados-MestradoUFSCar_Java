package com.paulorpc.ufscar.estruturadados.cap08.Reforco.Ex4;


public class Main {

	public static void main(String[] args) {
		
		MaxHeap<Integer, String> h = new MaxHeap<>();
		
		h.insert(4, "C");
		h.insert(5, "A");
		h.insert(6, "Z");
		h.insert(15, "K");
		h.insert(9, "F");
		h.insert(7, "Q");
		h.insert(20, "B");
		h.insert(16, "X");
		h.insert(25, "J");
		h.insert(14, "E");
		h.insert(12, "H");
		h.insert(11, "S");
		h.insert(8, "W");
		
		System.out.println( h.max().getValue() );
		
		
	}

}
