package com.paulorpc.ufscar.estruturadados.cap08.Criatividade.Ex14;


public class Main {

	public static void main(String[] args) {
		
		HeapPriorityQueue<Integer, String> t = new HeapPriorityQueue<>();
		
		t.insert(2, "C");
		t.insert(5, "A");
		t.insert(4, "C");
		t.insert(15, "K");
		t.insert(9, "F");
		t.insert(7, "Q");
		t.insert(6, "Z");
		t.insert(16, "X");
		t.insert(25, "J");
		t.insert(14, "E");
		
		t.preOrder(7);

	}

}
