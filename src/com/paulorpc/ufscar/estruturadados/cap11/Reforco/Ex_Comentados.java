package com.paulorpc.ufscar.estruturadados.cap11.Reforco;


public class Ex_Comentados {

	/*
	 * R11.1
	 * 
	 * O mergersort, assim como o quicksort, esperasse tempo o(n log n) para
	 * ordenação, uma vez que utilizam o método de divisão e comquista.No
	 * entanto, a díficil a implementação in-place do mergesort, o torna mais
	 * menos viável para orneção de arranjos que não cabem na memória principal.
	 * Já o quicksort tem vantagem quando utilizado com arranjos que cabem
	 * completamente na memória prinpal, e a menos que seja numa aplicação em
	 * tempo real, pois no pior caso, ele pode atingir tempo O(n²). O quicksort
	 * pode ser facilmente implementado in-place, tornando sua execução um pouco
	 * mais rápida uma vez que não é necessário a criação de novas sequencias e
	 * nem movimentar dados entre elas.
	 * 
	 * 
	 */

	/*
	 * 
	 * R11.2
	 * 
	 * O algoritimo bucket sort pode ordenar um arranjo de n bits (ex: 000, 001,
	 * 010, 100, 111) em tempo O(n), uma vez que ele faz a ordenação não por
	 * comparação, mas sim verificando cada digito (bit) do elemento e colocando
	 * no arranjo bucket de indice equivalente (Ex: 00[0] -> bucket[0]) , então
	 * remove os elementos dos indices na ordem inserida e reaplica o método
	 * para o segundo bit e assim por diante, até completar a qtde de vezes do
	 * maior elemento (no caso do exemplo, 3x). No final, terá o array ordenado
	 * de forma estável.
	 * 
	 * 
	 */

	/*
	 * 
	 * R11.3
	 * 
	 * Uma arvore mergesort possui altura máxima log n, pois utiliza o método
	 * divisão e conquista o qual divide por 2 q qtde de elementos
	 * recursivamente a cada chamada.
	 * 
	 */

	/*
	 * R11.4
	 * 
	 * Baixa: Uma nova chamada recursiva, fazendo a divisão. Cima: Retorno da
	 * chamada recursiva e ordenadação.
	 * 
	 */

	/*
	 * R11.5
	 * 
	 * 
	 * void mersort(Arranjo S, Comparador C) {
	 * 
	 * if (size(s) < 2) return;
	 * 
	 * mid = size(s)/2; Arranjo S1 <- CopiaArranjo(s, 0, mid); Arranjo S2 <-
	 * CopiaArranjo(s, mid, size(s));
	 * 
	 * mergesort(S1, C); mergesort(S2, C);
	 * 
	 * merge(S1, S2, S, C);
	 * 
	 * }
	 * 
	 * void merge(Arranjo S1, Arranjo S2, Arranjo S, Comparador C) {
	 * 
	 * while ( !s1.isEmpty() && !S2.isEmpty() ) {
	 * 
	 * if( c.compara(s1.elemento, s2.elemento) < 0)
	 * S.adiciona(S1.remove(s1.elemento));
	 * 
	 * if( c.compara(s1.elemento, s2.elemento) > 0) S.adiciona(
	 * S2.remove(S2.elemento) );
	 * 
	 * else S.adiciona(S1.remove(s1.elemento));
	 * 
	 * }
	 * 
	 * while( !S1.isEmpty ) S.adiciona(S1.remove(S1.elemento));
	 * 
	 * while( !S2.isEmpty ) S.adiciona(S2.remove(S2.elemento));
	 * 
	 * }
	 * 
	 */

	/*
	 * R11.7
	 * 
	 * Utilizaria um algoritmo como o bucket sort, adicionando cada elemento na
	 * respectiva posição do bucket, se ele for null. Ao final deste laço,
	 * removeria os elemento adicionando no vetor S novamente.
	 * 
	 */

	/*
	 * R11.9
	 * 
	 * A posição do pivot não modificaria o tempo de execução do algoritmo, no
	 * entanto o fato do vetor estar ordenado implicaria numa passagem de N
	 * vezes por N elementos para comparação das posições para verifar se poder
	 * fazer a inversão dos elementos, neste caso o Quicksort possue no pior
	 * caso, tempo de O(n²)
	 * 
	 */

	/*
	 * R11.11
	 * 
	 * O quicksort é umalgoritmo baseado em divisão e conquista, o qual divide
	 * por 2 a qtde de elemento a cada passagem, depois faz ordenação comparando
	 * os elemento. Ou seja, n, n/2, n/4.. e assim por diante. Logo no melhor
	 * caso temos complexidade O(nlong n)
	 * 
	 */

	/*
	 * 
	 * R11.12
	 * 
	 * void quicksort(arranjo S, Comparator C) {
	 * 
	 * se (s.lenght() < 2) return;
	 * 
	 * }
	 * 
	 * quicksortInplace(Arranjo S, Comparator C, Inteiro L, Inteiro R) {
	 * 
	 * se (L >= R) return; 
	 * pivotIndex = randon(s.size())-1 //um numero aleatóriode 0 ao tamanho do vetor 
	 * pivot = S[pivotIndex] 
	 * Leftindex = L 
	 * RightIndex = R
	 * 
	 * enquanto ( Leftindex <= RightIndex ) {
	 * 
	 * 	enquanto ( Leftindex <= RightIndex E S[LeftIndex] <= pivot) 
	 * 		LeftIndex++
	 * 
	 * 	enquanto ( Leftindex <= RightIndex E S[RightIndex] >= pivot) 
	 * 		RightIndex--
	 * 
	 *  se (LeftIndex < RightIndex ) { 
	 * 		temp = LeftIndex 
	 * 		S[LeftIndex] = S[RightIndex] 
	 * 		S[RightIndex] = temp 
	 *  } 
	 * }
	 * 
	 * temp = S[RightIndex] S[RightIndex] = pivot S[pivotIndex] = temp
	 * 
	 * quicksortInplace(S, C, L, LeftIndex-1) quicksortInplace(S, C,
	 * LeftIndex+1, R)
	 * 
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 */

	/*
	 * R11.16
	 * 
	 * Com um algoritmo quicksort utilizando a definição de pivot como o ultimo
	 * elemento da sequencia, o valor de k deve ser sempre maior que o pivot e o
	 * vetor deve estar inversamente ordenado, desta forma teriamos complexidade O(n)
	 * 
	 * 
	 */
	
	/*
	 * R11.17
	 * 
	 * Sim, pois ele mantem a ordenação de elementos de chaves iguais, na mesma ordem da origem após a ordenação.
	 * Ex: 2,d  1,a 3,c 2,a -> 1,a  2,d  2,a  3,c  
	 * 
	 * 
	 * Isso ocorre, pois a condição é: se (s1 <= s2) move de s1 para S.
	 * 
	 */
	
	/*
	 * R11.19
	 * 
	 * lista radixsort(lista S) {
	 * 
	 *  digito = 1
	 *  posicoes = 10
	 *  Arranjo<Arranjo> buckets; //array de arrays
	 *  completouDigitos=false;
	 * 
	 * while (!completouDigitos) {
	 * 
	 * completouDigitos = true;
	 * 
	 * 	while ( !s.isEmpty ) {
	 * 		tmp = s.get(first()) / digito
	 * 		
	 * 		// adiciona na ultima posicao do array interno do bucket na posicao encontrada
	 * 		buckets[ tmp % posicoes ].addlast( s.remove(s.get(first())) );
	 * 
	 * 		se (completouDigitos == true e tmp > 0)
	 * 			completouDigitos = false;
	 *  
	 *  } 
	 * 	
	 *  for ( i=0; i<bucket.lenght(); i++ ) //percorre i array bucket
	 *  	for (j=o; j<bucket[i].lenght(); j++)
	 *  		S.addlast( bucket[i].get(j) )
	 *  
	 *  digito *= posicoes;
	 * }
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	

}
