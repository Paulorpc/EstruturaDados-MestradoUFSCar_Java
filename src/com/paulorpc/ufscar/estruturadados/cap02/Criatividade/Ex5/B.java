package com.paulorpc.ufscar.estruturadados.cap02.Criatividade.Ex5;

public class B extends A {
	
	private int x;
	
	public B(){
		x = 2;
	}
	
	public B(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setXdeA(int x){
		super.setX(x);
	}

//	public void printMe(){
//		System.out.println("Sou o B");
//	}
	
	public int getXdeB() {
		return this.x;
	}

}
