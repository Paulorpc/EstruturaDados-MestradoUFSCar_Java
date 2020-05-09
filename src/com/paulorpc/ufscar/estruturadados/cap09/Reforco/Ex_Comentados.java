package com.paulorpc.ufscar.estruturadados.cap09.Reforco;


public class Ex_Comentados {
	
	/*
	 * R9.1
	 * 
	 * Tempo constante O(1), pois para inserção em sequencia não ordenada, não é necessário percorrer os elementos.  
	 * 
	 */

	
	/*
	 * R9.2
	 * 
	 * Bastaria escrever o método insert chamando put e find chamando get, pois os parametros e retornos seriam os mesmos.
	 * 
	 */
	
	
	/*
	 * R9.5
	 * 
	 * caderno
	 * 
	 */
	
	/*
	 * R9.6
	 * 
	 * Caderno
	 * 
	 */

	/*
	 * R9.13
	 * 
	 * As tabelas hash não mantem nenhuma informação sobre ordenação de seus
	 * elementos em sua estrutura de dados, ou seja, gerar uma tabela hash com
	 * chaves ordenadas descaracterizaria a principal função do hash que é
	 * manter a homogenedade no elementos na tabela.
	 * 
	 */
	
	/*
	 * R9.14
	 * 
	 * Há duas situações que podemos considerar para o pior caso. A primeira é
	 * no caso de uma função de compressão ineficiente que gere o mesmo valor
	 * hash levando a gravação dos elementos no mesmo indice do bucket array.
	 * Com isso, a inserção levaria O(n) uma vez que precisaria percorrer o
	 * array 'secundário' comparando as chaves antes de inserir o elemento.
	 * 
	 * O segundo pior caso, seria na situação de um tabela (bucket array) com
	 * fator de carga (n/N) acima de 1. Neste caso tb começaria a gerar colisões
	 * em todas as inserções, sendo necessaário percorrer o vetor secundário
	 * antes da inserção do elemento.
	 * 
	 */
	
}
