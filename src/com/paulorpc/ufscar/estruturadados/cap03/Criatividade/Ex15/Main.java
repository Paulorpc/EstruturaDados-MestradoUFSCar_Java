package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex15;


public class Main {

	public static void main(String[] args) {
		
		int[] vet= new int[]{1,8,0,2,1,3,20};
		int[] rs= new int[]{};
		
		rs = MaiorMenor(vet);
		System.out.println( "Menor: " +rs[0] );
		System.out.println( "Maior: " +rs[1] );

	}
	
	public static int[] MaiorMenor(int[] vet) {
	
		int maior = vet[0];
		int menor = vet[0];
		
		return _MaiorMenorRecursao(vet, 0, maior, menor);
	}
	
	private static int[] _MaiorMenorRecursao (int[] vet, int n, int maior, int menor) {
		
		int[] resultado = new int[]{menor, maior};
		
		if (n+2 < vet.length){
			
			if (vet[n+1] > maior) maior = vet[n+1];
			if (vet[n+2] > maior) maior = vet[n+2];
						
			if (vet[n+1] < menor) menor = vet[n+1];
			if (vet[n+2] < menor) menor = vet[n+2];
			
			resultado = _MaiorMenorRecursao(vet, n+2, maior, menor);
		}
		return resultado;
	}

}
