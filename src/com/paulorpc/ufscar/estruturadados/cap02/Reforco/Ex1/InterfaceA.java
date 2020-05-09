package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex1;

public interface InterfaceA extends InterfaceB {
	
	public String getA();
	public String getAA();
	public String getAAA();
	
	public String getB();
	
	/*
	 * 
	 * Resposta: É possível uma interface extender outras, porém se uma interface A extender uma 
	 * interface B, então B não poderá extender A devido a hieranquia de classes.   
	 *  
	 */
	

}
