package com.paulorpc.ufscar.estruturadados.cap02.Criatividade.Ex5;

public class abc {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A b1 = new B();
		
		A c1 = new C();
		C c2 = new C();
		
		a1.printMe();
		b1.printMe();
		c1.printMe();
		c2.printMe();
		
		a1.setX(100);
		b1.setX(200);
		c1.setX(300);
		c2.setX(400);
		
		System.out.println();
		
		System.out.println( a1.getX() );
		System.out.println( b1.getX() );
		System.out.println( c1.getX() );
		System.out.println( ((C) c1).getX() );
		
		System.out.println();
		
		c2.setX(9);
		c2.setXdeA(10);
		c2.setXdeB(11);
		
		System.out.println( c2.getX() );
		System.out.println( c2.getXdeA() );
		System.out.println( c2.getXdeB() );
		
	}
	

}
