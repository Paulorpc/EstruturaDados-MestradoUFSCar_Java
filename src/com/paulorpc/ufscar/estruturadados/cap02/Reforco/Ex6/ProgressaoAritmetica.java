package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex6;

public class ProgressaoAritmetica extends Progressao {
	
	double inc;
	
	public ProgressaoAritmetica() {
		this(1);
	}
	
	public ProgressaoAritmetica(long inc) {
		this.inc = inc;
	}
	
	public double nextValue() {
		return cur += inc;
		
	}
	
}
