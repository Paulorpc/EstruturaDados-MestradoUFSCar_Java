package com.paulorpc.ufscar.estruturadados.Extras.ListaduplamenteEncadeadaSentIteravel;


import java.util.Iterator;

/**
 * @author paulo
 * @date 22 de mai de 2017
 *
 */
public class ListaDuplamenteEncadeadaSentIteravel<T> implements Iterable<T> {

	private DNode<T> sentinela;
	int size;

	public ListaDuplamenteEncadeadaSentIteravel() {
		sentinela = new DNode<T>(null, null, null);
		sentinela.setNext(sentinela);
		sentinela.setPrev(sentinela);
		size = 0;
	}

	public void addFirst(DNode<T> newNode) {
		if (size == 0) {
			newNode.setNext(sentinela);
			newNode.setPrev(sentinela);
			sentinela.setNext(newNode);
			sentinela.setPrev(newNode);
		} else {
			DNode<T> prox = sentinela.getNext();
			newNode.setNext(prox);
			newNode.setPrev(sentinela);
			prox.setPrev(newNode);
			sentinela.setNext(newNode);
		}
		size++;
	}

	public void addLast(DNode<T> newNode) {
		if (size == 0)
			addFirst(newNode);
		else {
			DNode<T> ant = sentinela.getPrev();
			newNode.setNext(sentinela);
			newNode.setPrev(ant);
			ant.setNext(newNode);
			sentinela.setPrev(newNode);
			size++;
		}
	}

	public DNode<T> getPos(int pos) throws Exception {
		if (size == 0)
			throw new Exception("Lista vazia.");
		if (pos < 1 || pos > size)
			throw new Exception("posição invalida");

		DNode<T> aux = getFirst();
		for (int i = 0; i < pos - 1; i++) {
			aux = aux.getNext();
		}
		return aux;
	}

	public void addPos(int pos, DNode<T> novoNo) throws Exception {
		if (pos < 1 || pos > size + 1)
			throw new Exception("Posicao inválida");
		if (pos == 1)
			addFirst(novoNo);
		else if (pos == size + 1)
			addLast(novoNo);
		else {
			DNode<T> posX = getPos(pos);
			DNode<T> antX = posX.getPrev();
			novoNo.setNext(posX);
			novoNo.setPrev(antX);
			antX.setNext(novoNo);
			posX.setPrev(novoNo);
			size++;
		}
	}

	public DNode<T> removePos(int pos) throws Exception {
		if (size == 0)
			throw new Exception("Lista vazia.");
		if (pos < 0 || pos > size)
			throw new Exception("Posição inválida");

		DNode<T> rem = getPos(pos);
		DNode<T> ant = rem.getPrev();
		DNode<T> prox = rem.getNext();
		ant.setNext(prox);
		prox.setPrev(ant);
		rem.setNext(null);
		rem.setPrev(null);

		size--;
		return rem;

	}

	public ListaDuplamenteEncadeadaSentIteravel<T> clone() {

		ListaDuplamenteEncadeadaSentIteravel<T> l2 = new ListaDuplamenteEncadeadaSentIteravel<>();

		try {
			DNode<T> aux;

			for (int i = 1; i <= size; i++) {
				aux = getPos(i);
				DNode<T> node = new DNode<T>(aux.getElement(), null, null);
				l2.addLast(node);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return l2;
	}

	public void printLDE() {
		DNode<T> aux = sentinela;
		for (int i = 0; i < size; i++) {
			aux = aux.getNext();
			aux.printNode();
		}
	}

	public void getSize() {
		System.out.println(size);
	}

	public DNode<T> getFirst() {
		return sentinela.getNext();
	}

	public DNode<T> getLast() {
		return sentinela.getPrev();
	}
	
	

	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			
	        private int count=0;
	        DNode<T> cursor = sentinela;
	        
	        public boolean hasNext(){
	            return (cursor != sentinela.getPrev());
	        }
	        public T next(){
	        	count++;
	        	cursor = cursor.getNext();
	            return cursor.getElement();
	        }
		};
	}

	// não sei se ta certo...
	public Iterable<DNode<T>> iterable() {
		
		ListaDuplamenteEncadeadaSentIteravel<DNode<T>> l2 = new ListaDuplamenteEncadeadaSentIteravel<>();
		l2 = (ListaDuplamenteEncadeadaSentIteravel<DNode<T>>) clone();
		
		return l2;
	}
	
	

}
