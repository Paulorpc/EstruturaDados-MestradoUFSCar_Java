package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex19;

public class Main {

	public static void main(String[] args) {

		if(EhPalindromo("pauloCezar"))
			System.out.print("Isso ai! :)");
		else
			System.out.print("Deu ruim Joe");

	}
	
	public static boolean EhPalindromo(String palavra) {
		
		String palavraInvertida;
		palavraInvertida = String.valueOf( _EhPalindromo( palavra.toCharArray(), 0, palavra.length()-1 ) );
		
		return palavra.equalsIgnoreCase(palavraInvertida); 
	}

	private static char[] _EhPalindromo(char[] arr, int i, int j) {
		
		char aux;
		
		if (i < arr.length/2) {
			aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
			arr = _EhPalindromo(arr, i+1, j-1);
		}
		return arr;
		
	}
}
