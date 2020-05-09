package com.paulorpc.ufscar.estruturadados.cap02.Criatividade.Ex3;

import com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex6.Progressao;

public class ProgressaoRaiz extends Progressao {
	
	double first;
	double cur;
	
	public ProgressaoRaiz(){
		this.first = 65.536;
	}
	
	public ProgressaoRaiz(double first) {
		this.first = first;
	}
	
	public double nextValue(){
		cur = Math.sqrt(first);
		this.first = cur;
		
		return cur;
	}	

}
