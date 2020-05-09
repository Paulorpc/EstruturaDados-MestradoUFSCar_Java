# EstruturaDados-MestradoUFSCar_Java
Aulas de Estrutura de Dados UFSCar - DC - Mestrado em Eng. Software.
Exercícios do livro 'Estrutura de Dados e Algoritmos em Java' de Goodrich e Tamassia.

**Observação:** 
- Os exercícios da 4a edição (impressa) e da 6a. edição (pdf) são basicamente os mesmo, me lembro que alguns mudam a numeração apenas. Comprei a versão 4 para acompanhamento, mas os exercícios, salvo engano, fiz a partir do pdf da 6a. edição.

- Alguns capítulos podem ter numeração diferente por conta das edições dos livros, ex: Capítulo 10, exercícios estão como 11.x ao invés de 10.x. Isso porque na 6a edição o capítulo 11 é equivalente ao capítulo 10 da 4a.

**Link bibliotecas:** http://cs.brown.edu/cgc/net.datastructures.net/download.html

### Exercícios que não exigem implementação

---

### :bulb: Capítulo 2

#### REFORÇO

**2.1.** 
> **R:** É possível uma interface extender outras, porém se uma interface A extender uma interface B, então B não poderá extender A devido a hieranquia de classes.  

**2.2.** 
> **R:** Um exemplo de aplicação crítica, seria um sistema bancário que não pode pode ser abortado por um erro do sistema ou uma falha não esperada. Neste caso, deve-se utilizar tratamentos de exceção (try/catch) para interromper a operação ser abortar o programa. Outros exemplos seriam: Sistema para emissão de nota fiscal, comunicação de redes, etc.

**2.3.** 
> **R:** A Grande maioria dos sistemas hoje em dia devem ser pensados de forma adptativa, pois vivemos em um mundo muito dinâmico onde as empresas e pessoas estão mudando rapidamente, logo qualquer software que não seja pensado de forma que possa ter uma grande capacidade de evolução sofrerá com a possibilidade de falencia. Um exemplo de negócio que não poderia ter um sistema não adaptativo, seria o sistema bancário.

**2.11.** 
> **R:** Read it, Ship it, Buy it, Read it, Box it, Read it.
 

#### CRIATIVIDADE

**2.1.** 
> **R:** Por que o algoritmo de ativação dinâmica irá percorrer todas as classes procurando o método chamado na excução do objeto. Se o método for encontrado na classe de nível mais baixo, é executado, senão vai subindo para as superclasses a procura do método até, chegar na classe de nível mais alto. Se ainda assim o método não for encontrado então o ambiente de execução encerra o programa informando o erro relacionado.


--- 

### :bulb: Capítulo 3

#### REFORÇO

**3.4.** 
> **R:** Na classe Caesar, alteraria o valor de ALPHASIZE para a quantidade de caracteres que possua o alfabeto da linguagem, alteraria o vetor alpha para as letras do alfabeto desejado, e na onde faz a operação " - 'A'", alteraria o unicode de 'A' pelo unicode da primeira letra do alfabeto desejado (letra com menor unicode).

**3.5.** 
> **R:** Seria lançado uma exeção de nullpointer exception. Para lançar uma exceção mais instrutiva adicionaria um bloco try/catch lançando um exception com uma mensagem de leitura mais simples.

--- 

### :bulb: Capítulo 4 	 	 

#### REFORÇO

**4.1.** Suppose an initially empty stack S has performed a total of 25 push operations, 12 top operations and 10 pop operations, 3 of which returned null to indicate an empty stack. What is the current size of S?
		
> **R:** 25-7 = 18


**4.2.** Had the stack of the previous problem been an instance of the ArrayStack class, from Code Fragment 6.2, what would be the final value of the instance variable t?
	
> **R:** S[n-1] = S[17]


**4.3.** What values are returned during the following series of stack operations, if executed upon an initially empty stack? push(5), push(3), pop(), push(2), push(8),pop(), pop(), push(9), push(1), pop(), push(7), push(6), pop(), pop(), push(4),pop(), pop();
	
> **R:** [5,3], [5], [5,2,8], [5], [5,9,1], [5,9], [5,9,7,6], [5,9], [5,9,4], [5]


**4.5.** Give a precise and complete definition of the concept of matching for grouping symbols in an arithmetic expression.
	
> **R:** O conceito de grupos de simbolos aplicados a expressões aritiméticas, significa que para pada simbolo adicionado, deve ter o simbolo de fechamento respectivo na expressão obdecendo a ordem de inserção. Pode-se aplicar este conceito	através de pilhas, onde os simbolos necessários são adicionados em uma pilha e eles precisarão obedecer a saída da pilha para realizar os fechamentos corretos. Por exemplo: {[(5+3)*2] + (2-3)}

```java	
   [ '{', '[', '(' ]; 
   
   [ '{', '[' ]; 
   
   [ '{' ]; 
   
   [ '{', '(' ]; 
   
   [ '{' ]; 
   
   []; 
```	


**4.6.** What values are returned during the following sequence of queue operations, if executed on an initially empty queue? enqueue(5), enqueue(3), dequeue(), enqueue(2), enqueue(8), dequeue(), dequeue(), enqueue(9), enqueue(1),	dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(), enqueue(4),
	dequeue(), dequeue().
	
> **R:** [5,3]; [3]; [3,2,8]; [8]; [8,9,1]; [9,1]; [9,1,7,6]; [7,6, 4]; [4]


**4.10.** Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this order. Suppose further that you have an initially empty queue Q. Give a code fragment that uses only D and Q (and no other variables) and results in D storing the elements in the order (1,2,3,5,4,6,7,8).
	
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


#### CRIATIVIDADE

**4.2.** Describe how to implement the stack ADT using a single queue as an instance variable, and only constant additional local memory within the method bodies. What is the running time of the push(), pop(), and top() methods for your design?

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


**4.3.** Suppose Alice has picked three distinct integers and placed them into a stack S in random order. Write a short, straightline piece of pseudocode (with no loops or recursion) that uses only one comparison and only one variable x, yet that results in variable x storing the largest of Alice’s three integers with probability 2/3. Argue why your method is correct.

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


**4.4.** Descreva como implementar um TAD pilha usndo duas filas. Qual o tempo de execução dos métodos push e pop.	 
	 
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

--- 

### :bulb: Capítulo 5

#### REFORÇO

**5.1.** Suppose an initially empty stack S has performed a total of 25 push operations, 12 top operations, and 10 pop operations, 3 of which returned null to indicate an empty stack. What is the current size of S?
		
> **R:** 25-7 = 18


**5.10.** Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this order. Suppose further that you have an initially empty queue Q. Give a code fragment that uses only D and Q (and no other variables) and results in D storing the elements in the order (1,2,3,5,4,6,7,8).
	
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


**5.2.** Had the stack of the previous problem been an instance of the ArrayStack class, from Code Fragment 6.2, what would be the final value of the instance variable t?

> **R:** S[n-1] = S[17]
	

**5.3.** What values are returned during the following series of stack operations, if executed upon an initially empty stack? push(5), push(3), pop(), push(2), push(8),pop(), pop(), push(9), push(1), pop(), push(7), push(6), pop(), pop(), push(4),pop(), pop();
	
> **R:** [5,3], [5], [5,2,8], [5], [5,9,1], [5,9], [5,9,7,6], [5,9], [5,9,4], [5]


**5.5.** Give a precise and complete definition of the concept of matching for grouping symbols in an arithmetic expression.
	
> **R:** O conceito de grupos de simbolos aplicados a expressões aritiméticas, significa que para pada simbolo adicionado, deve ter o simbolo de fechamento respectivo na expressão obdecendo a ordem de inserção. Pode-se aplicar este conceito através de pilhas, onde os simbolos necessários são adicionados em uma pilha e eles precisarão obedecer a saída da pilha para realizar os fechamentos corretos. Por exemplo: {[(5+3)*2] + (2-3)}

```java	
   [ '{', '[', '(' ]; 
   
   [ '{', '[' ]; 
   
   [ '{' ]; 
   
   [ '{', '(' ]; 
   
   [ '{' ]; 
   
   []; 
```


**5.6.** What values are returned during the following sequence of queue operations, if executed on an initially empty queue? enqueue(5), enqueue(3), dequeue(),	enqueue(2), enqueue(8), dequeue(), dequeue(), enqueue(9), enqueue(1), dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(), enqueue(4), dequeue(), dequeue().
	
> **R:** [5,3]; [3]; [3,2,8]; [8]; [8,9,1]; [9,1]; [9,1,7,6]; [7,6, 4]; [4]


#### CRIATIVIDADE 

**5.2.** Describe how to implement the stack ADT using a single queue as an instance variable, and only constant additional local memory within the method bodies. What is the running time of the push(), pop(), and top() methods for your design?

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


**5.3.** Suppose Alice has picked three distinct integers and placed them into a stack S in random order. Write a short, straightline piece of pseudocode (with no loops or recursion) that uses only one comparison and only one variable x, yet that results in variable x storing the largest of Alice’s three integers with probability 2/3. Argue why your method is correct.
	 
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
	 

**5.4.** Descreva como implementar um TAD pilha usndo duas filas. Qual o tempo de execução dos métodos push e pop.	 
	 
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


**5.8.** Postfix notation is an unambiguous way of writing an arithmetic expression without parentheses. It is defined so that if “(exp1)op(exp2)” is a normal fully parenthesized expression whose operation is op,	the postfix version of this is “pexp1 pexp2 op”, where pexp1 is the postfix version of exp1 and pexp2 is the postfix version of exp2. The postfix version of a single number or variable is just that number or variable. So, for example, the postfix version of “((5+ 2) ∗(8 − 3))/4” is “5 2 + 8 3 − ∗ 4 /”. Describe a nonrecursive way of evaluating an expression in postfix notation. 
	
> **R:** Utilizaria uma pilha para empilhar os numeros sequido das operações e um array de operadores. Quando a pilha receber um operador, ela executa a operação desempilahndo os ultimos dois elementos e empilhando o resultado. 


**5.9.** Suppose you have two nonempty stacks S and T and a deque D. Describe how	to use D so that S stores all the elements of T below all of its original elements, with both sets of elements still in their original order.
	
> **R:**
> Desenpilho S, adicionando no final do deque. D[4,3,2,1]; s[]
> Desenpilho T, adicionando no final do deque. D[4,3,2,1,8,7,6,5]; T[]
> Removo do final do Deque, empinhando em S.   S[5,6,7,8,1,2,3,4]; T[]; D[]; 


**5.10.** Alice has three array-based stacks, A, B, and C, such that A has capacity 100, B has capacity 5, and C has capacity 3. Initially, A is full, and B and C are	empty. Unfortunately, the person who programmed the class for these stacks made the push and pop methods private. The only method Alice can use is a static	method, dump(S,T), which transfers (by iteratively applying the private pop and push methods) elements from stack S to stack T until either S becomes empty	or T becomes full. So, for example, starting from our initial configuration and performing dump(A,C) results in A now holding 97 elements and C holding 3. Describe a sequence of dump operations that starts from the initial configuration and results in B holding 4 elements at the end.	

> **R:**	
> 1. T(A,C); A[97]; B[0]; C[3]
> 2. T(C,B); A[97]; B[3]; C[0]
> 3. T(A,C); A[94]; B[3]; C[3]
> 4. T(C,B); A[94]; B[5]; C[1]
> 5. T(B,A); A[99]; B[0]; C[1]
> 6. T(C,B); A[99]; B[1]; C[0]
> 7. T(A,C); A[96]; B[1]; C[3]
> 8. T(C,B); A[96]; B[4]; C[0]

--- 

### :bulb: Capítulo 6

#### REFORÇO
**6.1.** Draw a representation, akin to Example 7.1, of an initially empty list L after performing 
the following sequence of operations: add(0, 4), add(0, 3), add(0, 2), add(2, 1), add(1, 5), 
add(1, 6), add(3, 7), add(0, 8).

> **R:** A = [8,2,6,5,7,3,1,4]


**6.2.** Give a justification of the running times shown in Table 7.1 for the methods of
an array list implemented with a (nonexpanding) array.

> **R:** Os métodos isEmpty(), size(), get() e set() são O(1), pois podemos executar a ação diretamente através do indice, ou seja, a execução ocorre em tempo constante. Já os métodos add() e remove() ocorrem em O(n), pois é necessários deslocar os elementos seguintes a 'i' (desloca n-i+1 elementos) para frente para adicionar e paras para remover.
>
> Um problema do Array não extensível é que por ter seu tamanho fixo, não podemos ultrapassar o tamanho estimado inicialmente e principalmente, o disperdicio de memória uma vez que ela é alocada incialmente.   


**6.11.** Suppose that we have made kn total accesses to the elements in a list L of n elements, for some integer k ≥ 1. What are the minimum and maximum number of elements that have been accessed fewer than k times?
> R: K = 1 no minimo, como tem n elementos, 1.n = n
Logo, nomínimo n e no máximo k.n;


**(7).21.** (livro ingles 6ed) Given the set of element {a,b,c,d,e, f } stored in a list, show the final state of the list, assuming we use the move-to-front heuristic and access the elements according to the following sequence: (a,b,c,d,e,f,a,c,f,b,d,e).

> **R:** A heuristica (regra) move to front coloca cada elemento acessado no topo da lista. Logo, ao acessar o estado final será o inverso da lista de sequencia de acesso original.

--- 

### :bulb: Capítulo 8 

#### REFORÇO
**8.1.** 
> **R:** Para que a árvore seja um Heap, de acordo com a circunstancia do
exercicio, o nodo chamado no nível anterior deve ser o nodo pai e deve
obdecer as regras de uma arvore heap, ou seja, se for uma arvore com o
minimo no topo, então o nodo pai deverá ser menor ou igual ao filho e
poderá ter no máximo dois filhos.

**8.2.**
> **R:**  
> [5,4,7,1]
> [5,4,7]
> [5,4,7,3,6]
> [5,7,6]
> Vetor final [7,8]


**8.3.**
> **R:** Optaria por um fila de prioridade baseada em TAD Árvore HEAP, pois
> terimos a leitura do primeiro registro a sair em tempo constante O(1) e fariamos
> inserções e remoções com tempo logartimo O(log n).
> 
> Talvez consideraria um sequencia ordenada, pois a prioridade para ler e remover o 
> próximo voo pode ser necessário em tempo constante, já a inserção de novos voos
> poderia ser feito em tempo linear. 


**8.5.**
> **R:**
> Selecion Sort: 	Insere na fila desordenado O(1) e remove o menor O(n). Tempo de ordenaçãototal O(n²). Gargalo, 2 fase.
> 
> Insertion Sort: 	Insere na fila ordenado O(n) e remove o menor O(1). Tempo de ordenação totalO(n²). Gargalo, 1 fase.
>  
> 1a fase
> s = [22,15,36,44,10,3,9,13,29,25], [36,44,10,3,9,13,29,25] ... []
> f = [22], [22,15] ... [22,15,36,44,10,3,9,13,29,25]
> 
> 2 fase
> s = [], [3], [3,9] ... [3,9,10,13,15,22,25,29,36,44]
> f = [22,15,36,44,10,3,9,13,29,25], [22,15,36,44,10,9,13,29,25], [22,15,36,44,10,13,29,25],... []


**8.7.** 
> **R:** Caderno


**8.8.** 
> **R:** No topo ou no maior nível da árvore.  


#### CRIATIVIDADE

**8.4.**
> R: Crio uma fila (ordenada ou não ordenada) e uma variável incremental que será a chave do elemento. O método remove, será o remove retorna o maior elemento, assim para cada inserção faz-se um > incremento na variavel chave
> 
> chave = 0;
> insert(chave++, E e)
> remove() //remove max 

---

### :bulb: Capítulo 9

#### REFORÇO

**9.1.**
> **R:** Tempo constante O(1), pois para inserção em sequencia não ordenada, não é necessário percorrer os elementos.  


**9.2.** 
> **R:** Bastaria escrever o método insert chamando put e find chamando get, pois os parametros e retornos seriam os mesmos.


**9.5.** 
> **R:** caderno


**9.6.** 
> **R:** Caderno


**9.13.** 
> **R:** As tabelas hash não mantem nenhuma informação sobre ordenação de seus elementos em sua estrutura de dados, ou seja, gerar uma tabela hash com chaves ordenadas descaracterizaria a principal função do hash que é manter a homogenedade no elementos na tabela.


**9.14.** 
> **R:** Há duas situações que podemos considerar para o pior caso. A primeira é
> no caso de uma função de compressão ineficiente que gere o mesmo valor
> hash levando a gravação dos elementos no mesmo indice do bucket array.
> Com isso, a inserção levaria O(n) uma vez que precisaria percorrer o
> array 'secundário' comparando as chaves antes de inserir o elemento.
> 
> O segundo pior caso, seria na situação de um tabela (bucket array) com
> fator de carga (n/N) acima de 1. Neste caso tb começaria a gerar colisões
> em todas as inserções, sendo necessaário percorrer o vetor secundário
> antes da inserção do elemento.

---

### :bulb: Capítulo 10

#### REFORÇO

**10.1.** 
> **R:** Forma de lista a esquerda

**11.1.** - English Version - 6ed
> **R:** Se parecerá com uma lista
	 
**11.7.** (R10.8) - English Version - 6ed
> **R:** 	  
> Figura 11.11 - Diferença de 2 níveis em 78(z) com joelho a esquerda, logo rotação dupla direita.
>  
> Figura 11.13 - Diferença de 2 níveis em 44 (z) com reta a direita (44,62,78), logo rotação simples a esquerda.


**11.9.** - English Version - 6ed
> **R:** Por padrão adotaria a remoção do nodo desejado, substituindo em seu lugar o filho a esquerda de seu filho a direita. Porém, como é nulo, então a substituição ocorreria com o no 54, que é o filho a direita no filho a esquerda no nó removido (62).


**11.10.** - English Version - 6ed
> **R:** A operação de rotação num implementação usando array levaria tempo constante, como tempos N operações, temos tempos linear.
	
	
**11.14.** - English Version - 6ed
> **R:** Como na arvore Splay, o último elemento acessado deve ir para o topo, em caso de acessar em order crescente a arvore terá forma de lista.

---

### :bulb: Capítulo 11

#### REFORÇO

**11.1.**
> **R:** O mergersort, assim como o quicksort, esperasse tempo o(n log n) para ordenação, uma vez que utilizam o método de divisão e comquista.No entanto, a díficil a implementação in-place do mergesort, o torna mais menos viável para orneção de arranjos que não cabem na memória principal. Já o quicksort tem vantagem quando utilizado com arranjos que cabem completamente na memória prinpal, e a menos que seja numa aplicação em tempo real, pois no pior caso, ele pode atingir tempo O(n²). O quicksort pode ser facilmente implementado in-place, tornando sua execução um pouco mais rápida uma vez que não é necessário a criação de novas sequencias e nem movimentar dados entre elas.


**11.2.** 
> **R:** O algoritimo bucket sort pode ordenar um arranjo de n bits (ex: 000, 001,010, 100, 111) em tempo O(n), uma vez que ele faz a ordenação não por comparação, mas sim verificando cada digito (bit) do elemento e colocando no arranjo bucket de indice equivalente (Ex: 00[0] -> bucket[0]) , então remove os elementos dos indices na ordem inserida e reaplica o método para o segundo bit e assim por diante, até completar a qtde de vezes do maior elemento (no caso do exemplo, 3x). No final, terá o array ordenado de forma estável.


**11.3.** 
> **R:** Uma arvore mergesort possui altura máxima log n, pois utiliza o método divisão e conquista o qual divide por 2 q qtde de elementos recursivamente a cada chamada.


**11.4.** 
> **R:** Baixa: Uma nova chamada recursiva, fazendo a divisão. Cima: Retorno da
chamada recursiva e ordenadação.


**11.5.**
```java
void mersort(Arranjo S, Comparador C) {

	if (size(s) < 2)
		return;

	mid = size(s)/2; 
	Arranjo S1 <- CopiaArranjo(s, 0, mid); 
	Arranjo S2 <- CopiaArranjo(s, mid, size(s));

	mergesort(S1, C); 
	mergesort(S2, C);
	merge(S1, S2, S, C);

}

void merge(Arranjo S1, Arranjo S2, Arranjo S, Comparador C) {

	while ( !s1.isEmpty() && !S2.isEmpty() ) {

		if( c.compara(s1.elemento, s2.elemento) < 0)
			S.adiciona(S1.remove(s1.elemento));

		if( c.compara(s1.elemento, s2.elemento) > 0) 
			S.adiciona(	S2.remove(S2.elemento) );
		else 
			S.adiciona(S1.remove(s1.elemento));

	}

	while( !S1.isEmpty ) 
		S.adiciona(S1.remove(S1.elemento));

	while( !S2.isEmpty ) 
		S.adiciona(S2.remove(S2.elemento));

}
```

**11.7.** 
> **R:** Utilizaria um algoritmo como o bucket sort, adicionando cada elemento na respectiva posição do bucket, se ele for null. Ao final deste laço, removeria os elemento adicionando no vetor S novamente.


**11.9.** 
> **R:** A posição do pivot não modificaria o tempo de execução do algoritmo, no entanto o fato do vetor estar ordenado implicaria numa passagem de N vezes por N elementos para comparação das posições para verifar se poder fazer a inversão dos elementos, neste caso o Quicksort possue no pior caso, tempo de O(n²).


**11.11.** 
> **R:** O quicksort é umalgoritmo baseado em divisão e conquista, o qual divide por 2 a qtde de elemento a cada passagem, depois faz ordenação comparando os elemento. Ou seja, n, n/2, n/4.. e assim por diante. Logo no melhor caso temos complexidade O(nlong n)


**11.12.** 
```java
void quicksort(arranjo S, Comparator C) {
	 
	 se (s.lenght() < 2) return;
	 
	 
	 quicksortInplace(Arranjo S, Comparator C, Inteiro L, Inteiro R) {
	 
	 se (L >= R) return; 
	 pivotIndex = randon(s.size())-1 //um numero aleatóriode 0 ao tamanho do vetor 
	 pivot = S[pivotIndex] 
	 Leftindex = L 
	 RightIndex = R
	 
	 enquanto ( Leftindex <= RightIndex ) {
	 
	 	enquanto ( Leftindex <= RightIndex E S[LeftIndex] <= pivot) 
	 		LeftIndex++
	 
	 	enquanto ( Leftindex <= RightIndex E S[RightIndex] >= pivot) 
	 		RightIndex--
	 
	  se (LeftIndex < RightIndex ) { 
	 		temp = LeftIndex 
	 		S[LeftIndex] = S[RightIndex] 
	 		S[RightIndex] = temp 
	  } 
	 }
	 
	 temp = S[RightIndex] S[RightIndex] = pivot S[pivotIndex] = temp
	 
	 quicksortInplace(S, C, L, LeftIndex-1) quicksortInplace(S, C,
	 LeftIndex+1, R)
	 
	 
	 }	 
}
```


**11.16.** 
> **R:** Com um algoritmo quicksort utilizando a definição de pivot como o ultimo elemento da sequencia, o valor de k deve ser sempre maior que o pivot e o vetor deve estar inversamente ordenado, desta forma teriamos complexidade O(n)


**11.17.**
> **R:** Sim, pois ele mantem a ordenação de elementos de chaves iguais, na mesma ordem da origem após a denação. 
> 
> Ex: 2,d  1,a 3,c 2,a -> 1,a  2,d  2,a  3,c  
> 
> Isso ocorre, pois a condição é: se (s1 <= s2) move de s1 para S.


**11.19.** 
```java
lista radixsort(lista S) {
	digito = 1
	posicoes = 10
	Arranjo<Arranjo> buckets; //array de arrays
	completouDigitos=false;

	while (!completouDigitos) {

		completouDigitos = true;

		while ( !s.isEmpty ) {
			tmp = s.get(first()) / digito
			
			// adiciona na ultima posicao do array interno do bucket na posicao encontrada
			buckets[ tmp % posicoes ].addlast( s.remove(s.get(first())) );

			se (completouDigitos == true e tmp > 0)
				completouDigitos = false;

		} 
		
		for ( i=0; i<bucket.lenght(); i++ ) //percorre i array bucket
			for (j=o; j<bucket[i].lenght(); j++)
				S.addlast( bucket[i].get(j) )
		
		digito *= posicoes;
	}
}
```

---

### :bulb: Capítulo 12

#### REFORÇO

**12.1.** 
> **R:** 3: a, aa, aaa


**12.2.**
> **R:** 24 comparações - Teste mesa, caderno.


**12.5.** 
> **R:**
> PADRÃO:
> 00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 331 32 33 34 35 36 37 38 39 40 41
> t  h  e     q  u  i  c  k     b  r  o  w  n     f  o  x     j  u  m  p  e  d     o  v  e  r   a     l  a  z  y     c  a  t
> 
> ALFABETO:
>  -	 a	 b	 c	 d	 e	 f	 g	 h	 i	 j	 k	 l	 m	 n	 o	 p	 q	 r	 s	 t	 u	 vw	 x	 y	 z
> -1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	-1	--1	-1	-1	-1
> 
> ÚLTIMA OCORRENCIA
>  -	 a	 b	 c	 d	 e	 f	 g	 h	 i	 j	 k	 l	 m	 n	 o	 p	 q	 r	 s	 t	 u	 vw	 x	 y	 z
> 38  40  10  39  25  29  16  -1  01  06  20  08  34  22  14  27  23  04  30  -1  41  21  2813  18  37  36
 	


**12.6.** 
```java
 Map<Charactere, Integer> last = new hashMap();
 for (int i=0; i<n; i++)
 		last.put(text[i], -1)
 
 for (int i=0; i<m; i++
		 last.put(pattern[i], i)
```


**12.7.** 
> **R:** 
> c g t a c g t t c g t a c
> 0 0 0 0 1 2 3 0 1 2 3 4 5
