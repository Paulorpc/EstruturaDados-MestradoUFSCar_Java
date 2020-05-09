package com.paulorpc.ufscar.estruturadados.Extras.PatternMatching;


public class matching {

	public static void main(String[] args) {
	
		int i = PatternMatching.findKMP("teste: DAABAABCDAABEAABCDAABCF".toCharArray(), "AABCDAABC".toCharArray());
		System.out.print(i);
		
	}

}
