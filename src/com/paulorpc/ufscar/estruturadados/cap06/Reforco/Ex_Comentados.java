package com.paulorpc.ufscar.estruturadados.cap06.Reforco;


/**
 * @author paulo
 * @date 18 de jun de 2017
 *
 */
public class Ex_Comentados {
	
	/*
	 * R6.1
	 * 
	 * Draw a representation, akin to Example 7.1, of an initially empty list L after performing 
	 * the following sequence of operations: add(0, 4), add(0, 3), add(0, 2), add(2, 1), add(1, 5), 
	 * add(1, 6), add(3, 7), add(0, 8).
	 * 
	 * 
	 * A = [8,2,6,5,7,3,1,4]
	 * 
	 */
	
	
	/*
	 * R6.2 
	 * 
	 * Give a justification of the running times shown in Table 7.1 for the methods of
	 * an array list implemented with a (nonexpanding) array.
	 * 
	 * 
	 * Os métodos isEmpty(), size(), get() e set() são O(1), pois podemos executar a ação diretamente através 
	 * do indice, ou seja, a execução ocorre em tempo constante. Já os métodos add() e remove() ocorrem em
	 * O(n), pois é necessários deslocar os elementos seguintes a 'i' (desloca n-i+1 elementos) para frente para adicionar e para trás para
	 * remover.
	 * 
	 * Um problema do Array não extensível é que por ter seu tamanho fixo, não podemos ultrapassar o tamanho
	 * estimado inicialmente e, principalmente, o disperdicio de memória uma vez que ela é alocada incialmente.   
	 * 
	 */

	/*
	 * cap 6 - R7.21 (livro ingles 6ed)
	 * 
	 * Given the set of element {a,b,c,d,e, f } stored in a list, show the final
	 * state of the list, assuming we use the move-to-front heuristic and access
	 * the elements according to the following sequence: (a,b,c,d,e, f ,a,c, f
	 * ,b,d,e).
	 * 
	 * 
	 * A heuristica (regra) move to front coloca cada elemento acessado no topo da lista.
	 * logo, ao acessar o estado final será o inverso da lista de sequencia de acesso original.
	 * 
	 */
}
