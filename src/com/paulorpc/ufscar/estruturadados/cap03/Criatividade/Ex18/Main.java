package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex18;


public class Main {

	public static void main(String[] args) {
				
		System.out.print( SReverso("post") );
		
	}
	
	public static String SReverso(String str) {
		char[] ar = str.toCharArray();
		String rt;
		
		ar = _sR(ar, 0, ar.length-1);
		rt = String.valueOf(ar).toLowerCase();
		
		try {
			
			int sPos = rt.indexOf('s');
			rt = 'S' + rt.substring(0, sPos) + rt.substring(sPos+1, rt.length());
			
		} catch (Exception e){}
		
		return rt;
	}
	
	private static char[] _sR(char[] arr, int i, int j) {
		
		char aux;
		
		if (i < arr.length/2) {
			aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
			arr = _sR(arr, i+1, j-1);
		}
		return arr;
	}
}
