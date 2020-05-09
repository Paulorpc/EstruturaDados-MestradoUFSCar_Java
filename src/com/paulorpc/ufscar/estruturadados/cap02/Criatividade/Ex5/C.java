package com.paulorpc.ufscar.estruturadados.cap02.Criatividade.Ex5;


public class C extends B {
	
	private int x;
	
	public C(){
		x = 3;
	}
	
	public C(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setXdeB(int x){
		super.setX(x);
	}
	
	public void printMe(){
		System.out.println("Sou o C");
	}

}
