package com.paulorpc.ufscar.estruturadados.Extras.SomaVetor;


public class SomaRecursao {

	// soma Recursão
	public int SomaR(int[] vet, int n, int total) {

		if (n < vet.length) {
			total = vet[n] + SomaR(vet, ++n, total);
		}
		return total;
	}

	// Recursão Binária
	public int SomaRBin(int[] vet, int n, int total) {

		if (n + 1 < vet.length)
			total = vet[n] + vet[n + 1] + SomaRBin(vet, n + 2, total);
		else if (n < vet.length)
			total = vet[n] + SomaRBin(vet, n + 2, total);

		return total;
	}
}
