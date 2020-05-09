package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex11;

public class Maryland extends State {
	
	Maryland(){}
	public void printMe(){ System.out.println("Read it"); }
	public static void main(String[] args) {
		Region mid = new State();
		State md = new Maryland();
		Object obj = new Place();
		Place usa = new Region();
		md.printMe();
		mid.printMe();
		((Place) obj).printMe();
		obj = md;
		((Maryland) obj).printMe();
		obj = usa;
		((Place) obj).printMe();
		usa = md;
		((Place) usa).printMe();
	}
	
}


/*
 * 
 * Read it 
 * Ship it
 * Buy it
 * Read it
 * Box it
 * Read it
 * 
 */

