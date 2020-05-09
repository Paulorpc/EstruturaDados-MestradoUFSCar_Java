package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex10;


public class maiorElementoRecursao {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,10,9,4, 20};
		Vetor v = new Vetor(arr);
		
		v.printVetor();
		
		System.out.println("O maior elemento é: " +v.maior());
			
	}

}


