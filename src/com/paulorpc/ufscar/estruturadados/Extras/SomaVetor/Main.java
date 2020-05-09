package com.paulorpc.ufscar.estruturadados.Extras.SomaVetor;


public class Main {

	public static void main(String[] args) {

		int[] vet = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		SomaRecursao r = new SomaRecursao();
		SomaRecursao rb = new SomaRecursao();

		System.out.println(r.SomaR(vet, 0, 0));
		System.out.print(rb.SomaRBin(vet, 0, 0));

	}

}
