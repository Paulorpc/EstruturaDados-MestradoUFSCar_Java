package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex5;


public class Produto {
	
		
	public static void main(String[] args) {
		
		Recursao r = new Recursao(5, 20);
		r.printProduto();		
		
	}
	
}

class Recursao {
	
	private int total;
	private int cont;
	private int m, n;
	
	public Recursao(int m, int n) {
		this.total = 0;		
		
		int aux; 
		if (m < n) {
			aux = m;
			this.m = n;
			this.n = aux;
		}
		else {
			this.m = m;
			this.n = n;
		}
		cont = this.n;
	}
	
	public int produto() {
	
		if (m < 0 || n < 0)
			throw new IllegalArgumentException("Produto de inteiros positivos.");
		
		if (cont > 0) {
			total += m;
			cont--;
			produto();
		}
		return total;	
	}
	
	public void printProduto() {
		System.out.println(m + " X " +n +" = " +produto());
	}
}