package com.paulorpc.ufscar.estruturadados.cap04.Reforco.Ex10;


public class Main {
	
	/*
	
	
	Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this
	order. Suppose further that you have an initially empty queue Q. Give a code
	fragment that uses only D and Q (and no other variables) and results in D storing
	the elements in the order (1,2,3,5,4,6,7,8).
	
	R: D = {1,2,3,4,5,6,7,8} =>* {1,2,3,5,4,6,7,8}

	1. Removo do inicio/final deck adicionando nfila
	
	D={5}
	Q={1,2,3,4,8,7,6}
	
	2. Volto para inicio/final deck de forma que inverta o 4 e 5
	
	D={3,2,1,5,4,8,7,6}
	Q={}
	
	3. Volto para fila para removendo do inicio/final do deck de forma a inverter ordem na fila
	
	D={5,4}
	Q={3,2,1,6,7,8}
	
	4. Retorno adicionando inicio/final deck
	
	==> D={1,2,3,5,4,6,7,8}
	==> Q={}
	
	 */

}
