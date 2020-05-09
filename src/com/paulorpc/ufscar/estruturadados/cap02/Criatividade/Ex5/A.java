package com.paulorpc.ufscar.estruturadados.cap02.Criatividade.Ex5;

public class A {
	
	private int x;
	
	public A(){
		this.x=1;
	}
		
	public A(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void printMe(){
		System.out.println("Sou o A");
	}
	
	public void printX(){
		System.out.println(getX());
	}
	
	public int getXdeA() {
		return this.x;
	}

}
