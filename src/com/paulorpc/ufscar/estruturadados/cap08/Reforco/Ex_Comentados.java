package com.paulorpc.ufscar.estruturadados.cap08.Reforco;


public class Ex_Comentados {
	
	/*
	 * Ex8.1
	 * 
	 * Para que a árvore seja um Heap, de acordo com a circunstancia do
	 * exercicio, o nodo chamado no nível anterior deve ser o nodo pai e deve
	 * obdecer as regras de uma arvore heap, ou seja, se for uma arvore com o
	 * minimo no topo, então o nodo pai deverá ser menor ou igual ao filho e
	 * poderá ter no máximo dois filhos.
	 * 
	 */
	
	/*
	 * Ex8.2
	 * 
	 * [5,4,7,1]
	 * [5,4,7]
	 * [5,4,7,3,6]
	 * [5,7,6]
	 * Vetor final [7,8]
	 *  
	 */
	
	/*
	 * 8.3
	 * 
	 * Optaria por um fila de prioridade baseada em TAD Árvore HEAP, pois
	 * terimos a leitura do primeiro registro a sair em tempo constante O(1) e fariamos
	 * inserções e remoções com tempo logartimo O(log n).
	 * 
	 * Talvez consideraria um sequencia ordenada, pois a prioridade para ler e remover o 
	 * próximo voo pode ser necessário em tempo constante, já a inserção de novos voos
	 * poderia ser feito em tempo linear. 
	 * 
	 */
	
	/*
	 * 8.5
	 * 
	 * Selecion Sort: 	Insere na fila desordenado O(1) e remove o menor O(n). Tempo de ordenação total O(n²). Gargalo, 2 fase.
	 * Insertion Sort: 	Insere na fila ordenado O(n) e remove o menor O(1). Tempo de ordenação total O(n²). Gargalo, 1 fase.
	 * 
	 * 1a fase
	 * s = [22,15,36,44,10,3,9,13,29,25], [36,44,10,3,9,13,29,25] ... []
	 * f = [22], [22,15] ... [22,15,36,44,10,3,9,13,29,25]
	 * 
	 * 2 fase
	 * s = [], [3], [3,9] ... [3,9,10,13,15,22,25,29,36,44]
	 * f = [22,15,36,44,10,3,9,13,29,25], [22,15,36,44,10,9,13,29,25], [22,15,36,44,10,13,29,25], ... []
	 * 
	 */
	
	/*
	 * 8.7
	 * 
	 * carderno
	 * 
	 */
	
	/*
	 * 8.8
	 * 
	 * No topo ou no maior nível da árvore.  
	 * 
	 */
}
