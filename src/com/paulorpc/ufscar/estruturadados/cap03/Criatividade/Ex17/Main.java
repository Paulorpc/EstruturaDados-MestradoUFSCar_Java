package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex17;


public class Main {

	public static void main(String[] args) {
		
		int[] v = new int[]{9,8,1,2,2,5,13,10,23,6};
		
		v = EvenFirst(v);
		
		for (int x : v)
			System.out.print(" " +x);
		
		System.out.println("\n\n Obs: Jamais farei novamente esta merda, principalmente manuscrito :/");

	}
	
	public static int[] EvenFirst(int[] vet) {
		return _EvenFirst(vet, 0, 1, 0, false, false);
	}
	
	private static int[] _EvenFirst(int[] vet, int i, int j, int k, boolean ordenar, boolean ordenado) {
		
		int aux;
		boolean cond1 = false;
		
		if (!ordenar) {
			
			if ( i+1 < vet.length ) {
				
				// i é par
				if(vet[i]%2 == 0)
					vet = _EvenFirst(vet, i+1, i+2, 0, false, false);
					
				// i é impar
				else {
					
					// j não terminou de percorrer o vetor
					if (j < vet.length){
						
						//e j é par
						if (vet[j] % 2 == 0){
							aux = vet[i];
							vet[i] = vet[j];
							vet[j] = aux;
							vet = _EvenFirst(vet, i+1, i+2, 0, false, false);
						}
						// e j é também é impar
						else	
							vet = _EvenFirst(vet, i, j+1, 0, false, false);
					}
				}
				
				
			}
			vet  = _EvenFirst(vet, 0, 1, 0, true, false);
			
		}
		// odernação do vetor
		// i e j são pares	
		
		if (k < vet.length && !ordenado ) {
			
			if (i+1 < vet.length && j<vet.length) {
				
				if ( (vet[i]%2 == 0 && vet[j]%2 == 0) || (vet[i]%2 != 0 && vet[j]%2 != 0) ) {
					
					if (vet[i] > vet[j]) {
						aux = vet[i];
						vet[i] = vet[j];
						vet[j] = aux;
						cond1 = true;
					}
					vet = _EvenFirst(vet, i+1, j+1, 0, true, false);
				}
			}
			else {
				if (cond1)
					vet = _EvenFirst(vet, 0, 1, k+1, true, false);
				else
					vet = _EvenFirst(vet, 0, 1, k+1, true, true);
					
			}		
		}
		return vet;
	}

}
