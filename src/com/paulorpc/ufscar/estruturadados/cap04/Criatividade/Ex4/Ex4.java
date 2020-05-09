package com.paulorpc.ufscar.estruturadados.cap04.Criatividade.Ex4;


/**
 * @author paulo
 * @date 15 de mai de 2017
 *
 */
public class Ex4 {
	
	/*
	 
	 Descreva como implementar um TAD pilha usndo duas filas. Qual o tempo de execução dos métodos push e pop.
	 
	 
	 Teria que fazer a transferência de uma fila para outra, mantendo sempre o uma fila com apenas um elemento
	 que seria o último elemento da fila, e o primeiro da pilha (top).
	 
	 FA = [1,2,3,4]
	 FB = [5]
	 
	 5 = PopB
	 B -> vazio
	 Transfere A -> B
	 --
	 FA = [4]
	 FB = [1,2,3]
	 
	 4 = PopA
	 A -> vazio
	 Transfere B -> A
	 --
	 FA = [1,2]
	 FB = [3]
	 
	 3 = PopB
	 B -> vazio
	 Transfere A -> B
	 --
	 FA = [2]
	 FB = [1]
	 
	 2 = PopA
	 A -> vazio
	 
	 1 = PopB
	 B -> vazio
	 
	 FA = []
	 FB = []
	 
	 OBS: Adicionei o flag top depois da metade do desenvolvimento do pseudocodigo, teria como melhorar o resultado.
	 
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
	 
	 
	*/

}
                       