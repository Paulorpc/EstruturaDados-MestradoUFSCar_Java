package com.paulorpc.ufscar.estruturadados.cap09.Criatividade.HashMap;


import net.datastructures.ChainHashMap;

public class Understading {

	public static void main(String[] args) {
		
		ChainHashMap<Integer, String> h = new ChainHashMap<>();
		
		h.put(1, "Paulo");
		h.put(2, "Paulo");
		h.put(3, "Paulo");
		
		System.out.println( h.size() );
		System.out.println( h.get(1) );

	}

}
