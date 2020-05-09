package com.paulorpc.ufscar.estruturadados.cap04.Criatividade.Ex3;


/**
 * @author paulo
 * @date 15 de mai de 2017
 *
 */
public class Ex3 {
	
	/*
	
	 Suppose Alice has picked three distinct integers and placed them into a stack S in
	random order. Write a short, straightline piece of pseudocode (with no loops or
	recursion) that uses only one comparison and only one variable x, yet that results
	in variable x storing the largest of Alice’s three integers with probability 2/3.
	Argue why your method is correct
	 
	R: S = {5, 1, 4}
	
	maio(S) {
	
		x = S.pop();
		
		if ( x < S.top )
			x = S.pop();
	
	}
	
	R: Retiro o elemento do topo da pilha e comparo com o elemento que ficou no topo, se o elemento X for maior que o
	elemento do topo, não faço nada, senão x recebe este elemento. Desta forma, entre 3 elementos, x sempre receberá o
	maior entre os dois do topos, logo tenho uma chance de 2/3 de ter o maior elemento em x.
	 
	 
	 */

}
