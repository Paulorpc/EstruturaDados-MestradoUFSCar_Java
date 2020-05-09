package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex6;


public class Progressao {
	
	double first;
	double cur;
	

	public double getFirst() {
		return first;
	}

	public void setFirst(double first) {
		this.first = first;
	}

	public double getCur() {
		return cur;
	}

	public void setCur(double cur) {
		this.cur = cur;
	}

	public Progressao() {
		cur = first = 0;
	}
	
	public double firstValue(){
		return first;
	}
	
	public double nextValue() {
		return ++cur;
	}
	
	public void printProgressao(int n) {
		for (int i=0; i<n; i++)
			System.out.println(" " + nextValue());
	}

}
