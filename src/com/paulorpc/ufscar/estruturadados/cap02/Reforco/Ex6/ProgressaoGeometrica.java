package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex6;

public class ProgressaoGeometrica extends Progressao {
	
	long base;
	
	public ProgressaoGeometrica() {
		this(2);
	}
	
	public ProgressaoGeometrica(long base) {
		cur = first = 1;
		this.base = base;
	}
	
	public double nextValue(){
		return cur *= base;
	}	

}
