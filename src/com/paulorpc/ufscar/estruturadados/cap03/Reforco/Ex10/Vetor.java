package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex10;


public class Vetor {
	
	private int[] vetor;
	private int tamanho;
	private int cont; 
	private int maior;
	
	public Vetor(int[] a) {
		vetor = a;
		tamanho = a.length;
		cont = 0;
	}
	
	public int maior() {
		if ( vetor[cont] < vetor[cont+1] )
			maior = vetor[cont+1];
		
		if(cont < tamanho-2) {
			cont++;
			maior();
		}
		
		return maior;
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public void printVetor() {
		System.out.print("[");
		for(int i=0; i<tamanho; i++) {
			if (i < tamanho-1)
				System.out.print(vetor[i] + ", ");
			else
				System.out.print(vetor[i]);  
				
		}
		System.out.print("]");
		System.out.println();
	}
	
	
}
