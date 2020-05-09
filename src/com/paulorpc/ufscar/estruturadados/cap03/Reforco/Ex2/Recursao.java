package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex2;


public class Recursao {
	
	int[] vet;
	int n;
	int[][] mat;
	
	public Recursao(){}
	
	public Recursao(int[] vet){
		this.vet = vet;
		this.n = tamanhoN();
		inicializaMatriz();
	}
		
	public void montaMatriz(int i) {
		
		boolean sair = false;
				
		for (int j=0; j<this.n; j++) {
			for(int k=0; k<this.n; k++) {
				if (this.mat[j][k] == -1) {
					
					if (i < vet.length ) {
						this.mat[j][k] = vet[i];
						montaMatriz(++i);
					}
					else {
						this.mat[j][k] = 0;
						montaMatriz(++i);
					}
					
				}
			}
		}			
	}
	
	public void printMe() {
		
		for (int j=0; j<this.n; j++) {
			for(int k=0; k<this.n; k++) {
				System.out.print("[" + this.mat[j][k] + "] ");
			}
			System.out.println();
		}
	}
	
	public void inicializaMatriz() {
		
		int[][] mat = new int[this.n][this.n];
		
		for (int j=0; j<n; j++) {
			for(int k=0; k<n; k++) {
				mat[j][k] = -1;
			}
		}
		
		this.mat = mat;
				
	}
	
//	private int tamanhoN() {
//		int tam = vet.length;
//		int n = 0;
//		
//		for (int i=0; i<tam; i++){
//			n = i+1;
//			if ( tam < (n*n) ) break;
//		}
//		return n;
//	}
	
	private int tamanhoN() {
	
		int tam = vet.length;	
		int i=1;
		n=1;
		
		while(i<tam){
			if ( i <= (n*n) ) i++;
			else n++;
		}
		return n;
	}

}
