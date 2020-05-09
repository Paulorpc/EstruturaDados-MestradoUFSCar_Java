package com.paulorpc.ufscar.estruturadados.cap01.Criatividade;


public class Ex1 {
	
	public static void main(String[] args) {
		
		Ex1 teste = new Ex1();
		
		int vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(teste.temProdutoPar(vet));
		
	}
	
	public boolean temProdutoPar(int vetor[]){
		
		boolean aux = false;
		
		for(int i = 0; i <= vetor.length-1; i++){
			for(int j = 0; j <= vetor.length-1; j++){
				if((vetor[i]*vetor[j])%2 == 0){
					System.out.println("Posicao " + i + ": " + vetor[i]);
					System.out.println("Posicao " + j + ": " + vetor[j]);
					System.out.println();
					aux = true;
				}
			}
		}
		
		return aux;
	}
	
}
