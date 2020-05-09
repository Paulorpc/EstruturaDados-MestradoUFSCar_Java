# EstruturaDados-MestradoUFSCar_Java
Aulas de Estrutura de Dados UFSCar - DC - Mestrado em Eng. Software.
Exercícios do livro 'Estrutura de Dados e Algoritmos em Java' de Goodrich e Tamassia.

Obs: Os exercícios da 4a edição (impressa) e da 6a. edição (pdf) são basicamente os mesmo, me lembro que alguns mudam a numeração apenas. Comprei a versão 4 para acompanhamento, mas os exercícios, salvo engano, fiz a partir do pdf da 6a. edição.

Link bibliotecas: http://cs.brown.edu/cgc/net.datastructures.net/download.html

### Exercícios que não exigem implementação

#### Capítulo 2

##### Criatividade
1. > **R:** Por que o algoritmo de ativação dinâmica irá percorrer todas as classes procurando o método chamado na excução do objeto. Se o método for encontrado na classe de nível mais baixo, é executado, senão vai subindo para as superclasses a procura do método até, chegar na classe de nível mais alto. Se ainda assim o método não for encontrado então o ambiente de execução encerra o programa informando o erro relacionado.

##### Reforço

1. > **R:** É possível uma interface extender outras, porém se uma interface A extender uma interface B, então B não poderá extender A devido a hieranquia de classes.  

2. > **R:** Um exemplo de aplicação crítica, seria um sistema bancário que não pode pode ser abortado por um erro do sistema ou uma falha não esperada. Neste caso, deve-se utilizar tratamentos de exceção (try/catch) para interromper a operação ser abortar o programa. Outros exemplos seriam: Sistema para emissão de nota fiscal, comunicação de redes, etc.

3. > **R:** A Grande maioria dos sistemas hoje em dia devem ser pensados de forma adptativa, pois vivemos em um mundo muito dinâmico onde as empresas e pessoas estão mudando rapidamente, logo qualquer software que não seja pensado de forma que possa ter uma grande capacidade de evolução sofrerá com a possibilidade de falencia. Um exemplo de negócio que não poderia ter um sistema não adaptativo, seria o sistema bancário.

11. > **R:** Read it, Ship it, Buy it, Read it, Box it, Read it.
 

#### Capítulo 3

#### Reforço
4. > **R:** Na classe Caesar, alteraria o valor de ALPHASIZE para a quantidade de caracteres que possua o alfabeto da linguagem, alteraria o vetor alpha para as letras do alfabeto desejado, e na onde faz a operação " - 'A'", alteraria o unicode de 'A' pelo unicode da primeira letra do alfabeto desejado (letra com menor unicode).

5. > **R:** Seria lançado uma exeção de nullpointer exception. Para lançar uma exceção mais instrutiva adicionaria um bloco try/catch lançando um exception com uma mensagem de leitura mais simples.


#### Capítulo 4

##### Criatividade
2. Describe how to implement the stack ADT using a single queue as an instance variable, and only constant additional local memory within the method bodies. What is the running time of the push(), pop(), and top() methods for your design?

```java
	metodo push(E el) {
	
		No n = novo No(el, Top)
		top = n;
		size++;
	
	} => O(1)
	
	metodo E pop() {
	
		E tmp = top.getElement();
		top = top.getNext();
		size--;
		retorno tmp;
	
	} => O(1)
	
	metodo top() {
	
		return top.getElement();
	
    } => O(1)
```

3. Suppose Alice has picked three distinct integers and placed them into a stack S in random order. Write a short, straightline piece of pseudocode (with no loops or recursion) that uses only one comparison and only one variable x, yet that results in variable x storing the largest of Alice’s three integers with probability 2/3. Argue why your method is correct.

> **R:** S = {5, 1, 4}
>
> **R:** Retiro o elemento do topo da pilha e comparo com o elemento que ficou no topo, se o elemento X for maior que o	elemento do topo, não faço nada, senão x recebe este elemento. Desta forma, entre 3 elementos, x sempre receberá o maior entre os dois do topos, logo tenho uma chance de 2/3 de ter o maior elemento em x.

```java	
	maio(S) {
	
		x = S.pop();
		
		if ( x < S.top )
			x = S.pop();
	
    }
```   

4. Descreva como implementar um TAD pilha usndo duas filas. Qual o tempo de execução dos métodos push e pop.	 
	 
> **R:** Teria que fazer a transferência de uma fila para outra, mantendo sempre o uma fila com apenas > um elemento que seria o último elemento da fila, e o primeiro da pilha (top).
>  
> FA = [1,2,3,4]
> FB = [5]
> 
> 5 = PopB
> B -> vazio
> Transfere A -> B
> --
> FA = [4]
> FB = [1,2,3]
> 
> 4 = PopA
> A -> vazio
> Transfere B -> A
> --
> FA = [1,2]
> FB = [3]
> 
> 3 = PopB
> B -> vazio
> Transfere A -> B
> --
> FA = [2]
> FB = [1]
> 
> 2 = PopA
> A -> vazio
> 
> 1 = PopB
> B -> vazio
> 
> FA = []
> FB = []
> 
> OBS: Adicionei o flag top depois da metade do desenvolvimento do pseudocodigo, teria como > melhorar o resultado.
	 
```java
	 metodo void push (E el) {
	 
	 	No n = novo No(el, null);
	 
	 	se ( sizeA == 0 E sizeB == 0) {
	 		A.enqueu(no);
	 	}
	 	ouse ( sizeA > 0 E sizeB == 1) {
	 		A.enqueu( B.dequeu() );
	 		B.enqueu(no);
	 	}
	 	ouse ( sizeB > 0 E sizeA == 1) {
	 		B.enqueu( A.dequeu() );
	 		A.enqueu(no);
	 	}
	 
	 }
	 
	 metodo E pop () {
	 
	 	E tmp;
	 
	 	se ( sizeA == 0 E sizeB == 0) {
	 		lança exception;
	 	}
	 	ouse ( sizeA > 0 E sizeB == 1) {
	 		tmp = B.getElement();
	 		B.dequeu();
	 		transferencia("AB");
	 	}
	 	ouse ( sizeB > 0 E sizeA == 1) {
	 		tmp = A.getElement();
	 		A.dequeu();
	 		transferencia("BA");	 		
	 	}
	 	senao {
	 		 
	 		 if (top == A) {
	 		 	tmp = A.getElement();
	 		 	A.dequeu();
	 		 }
	 		 else {
	 		 	tmp = B.getElement();
	 		 	B.dequeu();
	 		 }
	 	}	 	
	 	retorno tmp;
	 }
	 
	 metodo static void transferencia(DePara) {
	 
	 Global top;
	 
	 	se (DePara == "AB") {
	 		
	 		for (int i=0; i<sizeA-1; i++)
	 			B.Enqueu( A.dequeue );
	 		
	 		top = "A"
	 	
	 	}
	 	ouse (DePara == "BA") {
	 	
	 		for (int i=0; i<sizeB-1; i++)
	 			A.Enqueu( B.dequeue );
	 		
	 		top = "B"
	 	
	 	}
	 	
	 }
```     	 	 

##### Reforço
1. Suppose an initially empty stack S has performed a total of 25 push operations, 12 top operations and 10 pop operations, 3 of which returned null to indicate an empty stack. What is the current size of S?
		
> **R:** 25-7 = 18


2. Had the stack of the previous problem been an instance of the ArrayStack class, from Code Fragment 6.2, what would be the final value of the instance variable t?
	
> **R:** S[n-1] = S[17]


3. What values are returned during the following series of stack operations, if executed upon an initially empty stack? push(5), push(3), pop(), push(2), push(8),pop(), pop(), push(9), push(1), pop(), push(7), push(6), pop(), pop(), push(4),pop(), pop();
	
> **R:** [5,3], [5], [5,2,8], [5], [5,9,1], [5,9], [5,9,7,6], [5,9], [5,9,4], [5]


5. Give a precise and complete definition of the concept of matching for grouping symbols in an arithmetic expression.
	
> **R:** O conceito de grupos de simbolos aplicados a expressões aritiméticas, significa que para pada simbolo adicionado, deve ter o simbolo de fechamento respectivo na expressão obdecendo a ordem de inserção. Pode-se aplicar este conceito	através de pilhas, onde os simbolos necessários são adicionados em uma pilha e eles precisarão obedecer a saída da pilha para realizar os fechamentos corretos. Por exemplo: {[(5+3)*2] + (2-3)}

```java	
	   [ '{', '[', '(' ]; 
	   
	   [ '{', '[' ]; 
	   
	   [ '{' ]; 
	   
	   [ '{', '(' ]; 
	   
	   [ '{' ]; 
	   
	   []; 
```	


6. What values are returned during the following sequence of queue operations, if executed on an initially empty queue? enqueue(5), enqueue(3), dequeue(), enqueue(2), enqueue(8), dequeue(), dequeue(), enqueue(9), enqueue(1),	dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(), enqueue(4),
	dequeue(), dequeue().
	
> **R:** [5,3]; [3]; [3,2,8]; [8]; [8,9,1]; [9,1]; [9,1,7,6]; [7,6, 4]; [4]


10. Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this order. Suppose further that you have an initially empty queue Q. Give a code fragment that uses only D and Q (and no other variables) and results in D storing the elements in the order (1,2,3,5,4,6,7,8).
	
> **R:** D = {1,2,3,4,5,6,7,8} =>* {1,2,3,5,4,6,7,8}
> 
> 1. Removo do inicio/final deck adicionando nfila
> 
> D={5}
> Q={1,2,3,4,8,7,6}
> 
> 2. Volto para inicio/final deck de forma que inverta o 4 e 5
> 
> D={3,2,1,5,4,8,7,6}
> Q={}
> 
> 3. Volto para fila para removendo do inicio/final do deck de forma a inverter ordem na fila
> 
> D={5,4}
> Q={3,2,1,6,7,8}
> 
> 4. Retorno adicionando inicio/final deck
> 
> ==> D={1,2,3,5,4,6,7,8}
> ==> Q={}	 


#### Capítulo 5

##### Criatividade 

2. Describe how to implement the stack ADT using a single queue as an instance variable, and only constant additional local memory within the method bodies. What is the running time of the push(), pop(), and top() methods for your design?

```java	
	metodo push(E el) {
	
		No n = novo No(el, Top)
		top = n;
		size++;
	
	} => O(1)
	
	metodo E pop() {
	
		E tmp = top.getElement();
		top = top.getNext();
		size--;
		retorno tmp;
	
	} => O(1)
	
	metodo top() {
	
		return top.getElement();
	
	} => O(1)
```


3. Suppose Alice has picked three distinct integers and placed them into a stack S in random order. Write a short, straightline piece of pseudocode (with no loops or recursion) that uses only one comparison and only one variable x, yet that results in variable x storing the largest of Alice’s three integers with probability 2/3. Argue why your method is correct.
	 
> **R:** S = {5, 1, 4}  
>
> **R:** Retiro o elemento do topo da pilha e comparo com o elemento que ficou no topo, se o elemento X for maior que o	elemento do topo, não faço nada, senão x recebe este elemento. Desta forma, entre 3 elementos, x sempre receberá o maior entre os dois do topos, logo tenho uma chance de 2/3 de ter o maior elemento em x.

```java	
	maio(S) {
	
		x = S.pop();
		
		if ( x < S.top )
			x = S.pop();
	
    }
```
	 

4. Descreva como implementar um TAD pilha usndo duas filas. Qual o tempo de execução dos métodos push e pop.	 
	 
> Teria que fazer a transferência de uma fila para outra, mantendo sempre o uma fila com apena> um elemento que seria o último elemento da fila, e o primeiro da pilha (top).
> 
> FA = [1,2,3,4]
> FB = [5]
> 
> 5 = PopB
> B -> vazio
> Transfere A -> B
> --
> FA = [4]
> FB = [1,2,3]
> 
> 4 = PopA
> A -> vazio
> Transfere B -> A
> --
> FA = [1,2]
> FB = [3]
> 
> 3 = PopB
> B -> vazio
> Transfere A -> B
> --
> FA = [2]
> FB = [1]
> 
> 2 = PopA
> A -> vazio
> 
> 1 = PopB
> B -> vazio
> 
> FA = []
> FB = []
> 
> OBS: Adicionei o flag top depois da metade do desenvolvimento do pseudocodigo, teria com> melhorar o resultado.

```java
	 metodo void push (E el) {
	 
	 	No n = novo No(el, null);
	 
	 	se ( sizeA == 0 E sizeB == 0) {
	 		A.enqueu(no);
	 	}
	 	ouse ( sizeA > 0 E sizeB == 1) {
	 		A.enqueu( B.dequeu() );
	 		B.enqueu(no);
	 	}
	 	ouse ( sizeB > 0 E sizeA == 1) {
	 		B.enqueu( A.dequeu() );
	 		A.enqueu(no);
	 	}
	 
	 }
	 
	 metodo E pop () {
	 
	 	E tmp;
	 
	 	se ( sizeA == 0 E sizeB == 0) {
	 		lança exception;
	 	}
	 	ouse ( sizeA > 0 E sizeB == 1) {
	 		tmp = B.getElement();
	 		B.dequeu();
	 		transferencia("AB");
	 	}
	 	ouse ( sizeB > 0 E sizeA == 1) {
	 		tmp = A.getElement();
	 		A.dequeu();
	 		transferencia("BA");	 		
	 	}
	 	senao {
	 		 
	 		 if (top == A) {
	 		 	tmp = A.getElement();
	 		 	A.dequeu();
	 		 }
	 		 else {
	 		 	tmp = B.getElement();
	 		 	B.dequeu();
	 		 }
	 	}	 	
	 	retorno tmp;
	 }
	 
	 metodo static void transferencia(DePara) {
	 
	 Global top;
	 
	 	se (DePara == "AB") {
	 		
	 		for (int i=0; i<sizeA-1; i++)
	 			B.Enqueu( A.dequeue );
	 		
	 		top = "A"
	 	
	 	}
	 	ouse (DePara == "BA") {
	 	
	 		for (int i=0; i<sizeB-1; i++)
	 			A.Enqueu( B.dequeue );
	 		
	 		top = "B"
	 	
	 	}
	 	
	 }
```	 


8. Postfix notation is an unambiguous way of writing an arithmetic expression without parentheses. It is defined so that if “(exp1)op(exp2)” is a normal fully parenthesized expression whose operation is op,	the postfix version of this is “pexp1 pexp2 op”, where pexp1 is the postfix version of exp1 and pexp2 is the postfix version of exp2. The postfix version of a single number or variable is just that number or variable. So, for example, the postfix version of “((5+ 2) ∗(8 − 3))/4” is “5 2 + 8 3 − ∗ 4 /”. Describe a nonrecursive way of evaluating an expression in postfix notation. 
	
> **R:** Utilizaria uma pilha para empilhar os numeros sequido das operações e um array de operadores. Quando a pilha receber um operador, ela executa a operação desempilahndo os ultimos dois elementos e empilhando o resultado. 


9. Suppose you have two nonempty stacks S and T and a deque D. Describe how	to use D so that S stores all the elements of T below all of its original elements, with both sets of elements still in their original order.
	
> **R:**
> Desenpilho S, adicionando no final do deque. D[4,3,2,1]; s[]
> Desenpilho T, adicionando no final do deque. D[4,3,2,1,8,7,6,5]; T[]
> Removo do final do Deque, empinhando em S.   S[5,6,7,8,1,2,3,4]; T[]; D[]; 


10. Alice has three array-based stacks, A, B, and C, such that A has capacity 100, B has capacity 5, and C has capacity 3. Initially, A is full, and B and C are	empty. Unfortunately, the person who programmed the class for these stacks made the push and pop methods private. The only method Alice can use is a static	method, dump(S,T), which transfers (by iteratively applying the private pop and push methods) elements from stack S to stack T until either S becomes empty	or T becomes full. So, for example, starting from our initial configuration and performing dump(A,C) results in A now holding 97 elements and C holding 3. Describe a sequence of dump operations that starts from the initial configuration and results in B holding 4 elements at the end.	

> **R:**	
> 1. T(A,C); A[97]; B[0]; C[3]
> 2. T(C,B); A[97]; B[3]; C[0]
> 3. T(A,C); A[94]; B[3]; C[3]
> 4. T(C,B); A[94]; B[5]; C[1]
> 5. T(B,A); A[99]; B[0]; C[1]
> 6. T(C,B); A[99]; B[1]; C[0]
> 7. T(A,C); A[96]; B[1]; C[3]
> 8. T(C,B); A[96]; B[4]; C[0]


##### Reforço

1. Suppose an initially empty stack S has performed a total of 25 push operations, 12 top operations, and 10 pop operations, 3 of which returned null to indicate an empty stack. What is the current size of S?
		
> **R:** 25-7 = 18


10. Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this order. Suppose further that you have an initially empty queue Q. Give a code fragment that uses only D and Q (and no other variables) and results in D storing the elements in the order (1,2,3,5,4,6,7,8).
	
> **R:** D = {1,2,3,4,5,6,7,8} =>* {1,2,3,5,4,6,7,8}> 
> 1. Removo do inicio/final deck adicionando nfila
> 
> D={5}
> Q={1,2,3,4,8,7,6}
> 
> 2. Volto para inicio/final deck de forma que inverta o 4 e 5
> 
> D={3,2,1,5,4,8,7,6}
> Q={}
> 
> 3. Volto para fila para removendo do inicio/final do deck de forma a inverter ordem na fila
> 
> D={5,4}
> Q={3,2,1,6,7,8}
> 
> 4. Retorno adicionando inicio/final deck
> 
> ==> D={1,2,3,5,4,6,7,8}
> ==> Q={}


2. Had the stack of the previous problem been an instance of the ArrayStack class, from Code Fragment 6.2, what would be the final value of the instance variable t?

> **R:** S[n-1] = S[17]
	

3. 	What values are returned during the following series of stack operations, if executed upon an initially empty stack? push(5), push(3), pop(), push(2), push(8),pop(), pop(), push(9), push(1), pop(), push(7), push(6), pop(), pop(), push(4),pop(), pop();
	
> **R:** [5,3], [5], [5,2,8], [5], [5,9,1], [5,9], [5,9,7,6], [5,9], [5,9,4], [5]


5. Give a precise and complete definition of the concept of matching for grouping symbols in an arithmetic expression.
	
> **R:** O conceito de grupos de simbolos aplicados a expressões aritiméticas, significa que para pada simbolo adicionado, deve ter o simbolo de fechamento respectivo na expressão obdecendo a ordem de inserção. Pode-se aplicar este conceito através de pilhas, onde os simbolos necessários são adicionados em uma pilha e eles precisarão obedecer a saída da pilha para realizar os fechamentos corretos. Por exemplo: {[(5+3)*2] + (2-3)}

```java	
	   [ '{', '[', '(' ]; 
	   
	   [ '{', '[' ]; 
	   
	   [ '{' ]; 
	   
	   [ '{', '(' ]; 
	   
	   [ '{' ]; 
	   
	   []; 
```


6. What values are returned during the following sequence of queue operations, if executed on an initially empty queue? enqueue(5), enqueue(3), dequeue(),	enqueue(2), enqueue(8), dequeue(), dequeue(), enqueue(9), enqueue(1), dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(), enqueue(4), dequeue(), dequeue().
	
> **R:** [5,3]; [3]; [3,2,8]; [8]; [8,9,1]; [9,1]; [9,1,7,6]; [7,6, 4]; [4]


#### Capítulo 6

##### Reforço
**R6.1** Draw a representation, akin to Example 7.1, of an initially empty list L after performing 
the following sequence of operations: add(0, 4), add(0, 3), add(0, 2), add(2, 1), add(1, 5), 
add(1, 6), add(3, 7), add(0, 8).

> A = [8,2,6,5,7,3,1,4]


**R6.2** Give a justification of the running times shown in Table 7.1 for the methods of
an array list implemented with a (nonexpanding) array.

> **R:** Os métodos isEmpty(), size(), get() e set() são O(1), pois podemos executar a ação diretamente através do indice, ou seja, a execução ocorre em tempo constante. Já os métodos add() e remove() ocorrem em O(n), pois é necessários deslocar os elementos seguintes a 'i' (desloca n-i+1 elementos) para frente para adicionar e paras para remover.
>
> Um problema do Array não extensível é que por ter seu tamanho fixo, não podemos ultrapassar o tamanho estimado inicialmente e principalmente, o disperdicio de memória uma vez que ela é alocada incialmente.   


**R7.21** (livro ingles 6ed) Given the set of element {a,b,c,d,e, f } stored in a list, show the final state of the list, assuming we use the move-to-front heuristic and access the elements according to the following sequence: (a,b,c,d,e,f,a,c,f,b,d,e).

> **R:** A heuristica (regra) move to front coloca cada elemento acessado no topo da lista. Logo, ao acessar o estado final será o inverso da lista de sequencia de acesso original.


11. Suppose that we have made kn total accesses to the elements in a list L of n elements, for some integer k ≥ 1. What are the minimum and maximum number of elements that have been accessed fewer than k times?
	
> **R:** K = 1 no minimo, como tem n elementos, 1.n = n	
>
> Logo, nomínimo n e no máximo k.n;