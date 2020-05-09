package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex2;


public class RecurcaoNxN {
	
	public static void main(String[] args) {
		
		int tam = 50;
		int[] vet = new int[tam];
		
		for(int i=0; i<tam; i++)
			vet[i] = i+1;
		
		Recursao r = new Recursao( vet );
		r.montaMatriz(0);
		
		r.printMe();
		
	}
}




