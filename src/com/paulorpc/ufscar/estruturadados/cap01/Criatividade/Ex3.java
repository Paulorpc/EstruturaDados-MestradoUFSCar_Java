package com.paulorpc.ufscar.estruturadados.cap01.Criatividade;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex3 teste = new Ex3();
		
		int[] vet = new int[52];
		
		for(int i = 0; i < 52; i++){
			vet[i] = i+1;
		}
		
		vet = teste.embaralha(vet);
		
		for(int i : vet){
			System.out.println(i);
		}
		
	}

	public int[] embaralha(int vetor[]){
		
		int n = vetor.length;
		
		int[] vetAux =  new int[52];
		
		for(int i = 0; i < n; i++){
			vetAux[i] = -1;
		}
		
		Random gerador = new Random();
		
		int j = 0;
		
		boolean igualdade = true;
		
		for(int i = 0; i < n; i++){
			igualdade = true;
			while(igualdade){
				j = gerador.nextInt(52);
				if(vetAux[j] == -1) igualdade = false;
			}
			vetAux[j] = vetor[i];
		}
		
		return vetAux;
	}
	
}
