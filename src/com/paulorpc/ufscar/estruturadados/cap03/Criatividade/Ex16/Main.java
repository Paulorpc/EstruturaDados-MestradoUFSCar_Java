package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex16;


public class Main {
	
	public static void main (String[] args) {
		
		int vet[] = {1,2,3,4};
		//int vet[] = {2,3,5,6,9,10};
		int cont=0;
		int[] res1;
		int[] res2;
		
		// Sem recursão
		res1 = somaAnt(vet);
		for(int x:res1) {
			if (x != 0) {
				System.out.print(" " +x);
				++cont;
			}
		}
		System.out.println("\nQtde somas: " +cont);
		System.out.println();
		
		// Com Recursão
		cont = 0;
		res2 = somaAntRec(vet);
		for (int r : res2) {
			if (r != 0) {
				System.out.print(" " +r);
				++cont;
			}
		}
		System.out.println("\nQtde somas: " +cont);
	}
	
	// Sem recursão
	public static int[] somaAnt(int[] vet) {
		int tam= vet.length*(vet.length+1)/2;
		int res[] = new int[tam];
		int l=0;
		
		for(int i=2; i<vet.length; i++)
			for(int j=0; j<i; j++) {
				for(int k=j+1; k<i; k++) {
					if (k>j && vet[i] == vet[j] + vet[k])
						res[l++] = vet[i]; 
				}
			}
		return res;		
	}
	
	// Com recursão
	public static int[] somaAntRec(int[] vet) {
		
		int i = 2;
		int j = 0;
		int k = j+1;
		int l = 0;
		int tam= vet.length*(vet.length+1)/2;
		int igualdade[] = new int[tam];	
		
		return _SomaAntRec(vet, i, j, k, l, igualdade, true);
	}
	
	private static int[] _SomaAntRec(int[] vet, int i, int j, int k, int l, int[] igualdade, boolean fazRecursao){
		
		int[] resultado = igualdade;	
				
		if (i < vet.length) {
			if (j < i-1) {				
				if (k < i) {
					if (vet[i] == vet[j]+vet[k]) {
						igualdade[l] = vet[i];						
						resultado = _SomaAntRec(vet, i, j, k+1, l+1, igualdade, fazRecursao);
						fazRecursao = false;
					}
					k++;
					if (fazRecursao) {
						_SomaAntRec(vet, i, j, k, l, igualdade, fazRecursao);
						fazRecursao = false;
					}
				}
				j++;
				k=j+1;
				if(fazRecursao) {
					_SomaAntRec(vet, i, j, k, l, igualdade, fazRecursao);
					fazRecursao = false;
				}
			}
			i++;
			j=0;
			k=j+1;
			if (fazRecursao)
				_SomaAntRec(vet, i, j, k, l, igualdade, fazRecursao);
		}
		return resultado;
	}
}