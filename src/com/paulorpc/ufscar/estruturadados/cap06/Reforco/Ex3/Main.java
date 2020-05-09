package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex3;


/**
 * @author paulo
 * @date 28 de mai de 2017
 *
 */
public class Main {
	
	/*
	 * Give an implementation of the stack ADT using an array list for storage
	 *  
	 */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		if(!true) {	
			System.out.println("true");
			PilhaArrayList<Integer> p = new PilhaArrayList<>();
			p.push(1);
			p.push(2);
			p.push(5);
			p.push(10);
			
			System.out.println( p.top() );
			p.pop();
			p.pop();
			System.out.println( p.top() );
			p.pop();
			//p.pop();
			System.out.println( p.top() );
		}
		else {
			System.out.println("false");
			PilhaVetor<Integer> p = new PilhaVetor<>();
			p.push(1);
			p.push(2);
			p.push(5);
			p.push(10);
			
			System.out.println( p.top() );
			p.pop();
			p.pop();
			System.out.println( p.top() );
			p.pop();
			//p.pop();
			System.out.println( p.top() );
		}
	}
}
