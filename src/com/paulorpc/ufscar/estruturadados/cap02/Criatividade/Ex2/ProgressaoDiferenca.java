package com.paulorpc.ufscar.estruturadados.cap02.Criatividade.Ex2;

import com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex6.Progressao;

public class ProgressaoDiferenca extends Progressao {
		
	public ProgressaoDiferenca(double first, double cur){
		setFirst(first);
		setCur(cur); 
	}
	
	public double nextValue() {
		double dif = Math.abs( getFirst() - getCur() );
		setFirst( getCur() );
		setCur(dif);
				
		return dif;
	}
	

}
