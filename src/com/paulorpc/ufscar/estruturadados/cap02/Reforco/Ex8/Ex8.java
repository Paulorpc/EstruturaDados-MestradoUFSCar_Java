package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex8;

import com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex6.Progressao;
import com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex6.ProgressaoGeometrica;

public class Ex8 {
	
	public static void main (String[] args) {
		
		Progressao p = new ProgressaoGeometrica();
		Progressao n = new Progressao();
		
		n = (Progressao) p;
		
		System.out.println(n.firstValue());
		
	}
	
	/*
	 * 
	 * Funciona normalmente, pois "progressao" é superclasse de "ProgressaoGeometrica", logo é possiver
	 * faser o cast e exibir o valor normalmente. 
	 * 
	 * 	
	 */

}
