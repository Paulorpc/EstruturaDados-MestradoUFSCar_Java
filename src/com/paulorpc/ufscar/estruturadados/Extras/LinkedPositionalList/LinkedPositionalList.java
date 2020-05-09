package com.paulorpc.ufscar.estruturadados.Extras.LinkedPositionalList;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedPositionalList<T> implements PositionalList<T> {
	
	private DNode<T> header;
	private DNode<T> trailler;
	private int size;
	
	public LinkedPositionalList() {
		DNode<T> header = new DNode<T>(null,null,null);
		DNode<T> trailler = new DNode<T>(null,header,null);
		header.setNext(trailler);
		size =  0;
	}
	
	// ----------------------MÉTODOS PRIVADOS PARA MANIPULAR POSIÇÕES/NÓS-------------------------------
	/**
	 * Método para validar se um determinado position é válido e retorna ele convertido em forma de nó.
	 * @return (DNode) p
	 */
	private DNode<T> validade(Position<T> p) {
		if(!(p instanceof DNode)) 
			throw new IllegalArgumentException("position é inválido");
		DNode<T> node = (DNode<T>) p;
		return node;
	}
	
	/**
	 * Método para converter nós em positions abstraindo conceito de sentinelas
	 * @return position
	 */
	private Position<T> position(DNode<T> node) {
		if(node.equals(header) || node.equals(trailler))
			return null;
		return node;
	}
	
	/**
	 * Método para adicionar um objeto entre dois nós da lista. 
	 * @return Position adicionado
	 */
	private Position<T> addBetween(DNode<T> prev, DNode<T> next, T e) {
		DNode<T> node = new DNode<>(e, prev, next);
		prev.setNext(node);
		next.setPrev(node);
		size++;
		return position(node);
	}
	// -------------------------------------------------------------------------------------------------

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	@Override
	public Position<T> first() {
		return position(header.getNext());
	}

	@Override
	public Position<T> last() {
		return position(trailler.getPrev());
	}

	@Override
	public Position<T> before(Position<T> p) {
		DNode<T> node = validade(p);
		return position(node.getPrev());
	}

	@Override
	public Position<T> after(Position<T> p) {
		DNode<T> node = validade(p);
		return position(node.getNext());
	}
	

	@Override
	public Position<T> addFirst(T e) {
		return addBetween(header, header.getNext(), e);
	}

	@Override
	public Position<T> addLast(T e) {
		return addBetween(trailler.getPrev(), trailler, e);
	}

	@Override
	public Position<T> addBefore(Position<T> p, T e) {
		DNode<T> node = validade(p);	
		return addBetween(node.getPrev(), node, e);
	}

	@Override
	public Position<T> addAfter(Position<T> p, T e) {
		DNode<T> node = validade(p);
		return addBetween(node, node.getNext(), e);
	}

	@Override
	public T set(Position<T> p, T e) {
		DNode<T> node = validade(p);
		T swaped = node.getElement();
		node.setElem(e);
		return swaped;
	}

	@Override
	public T remove(Position<T> p) {
		DNode<T> node = validade(p);
		DNode<T> prev = node.getPrev();
		DNode<T> next = node.getNext();
		T removed = node.getElement();
		prev.setNext(next);
		next.setPrev(prev);
		size--;
		return removed;
	}
	
	
	// ----------------------------CLASSE PARA ITERAÇÃO NA LISTA DE POSITIONS---------------------------
	
	private class PositionIterator implements Iterator<Position<T>> {
		
		Position<T> cursor = first();
		Position<T> recent = null;

		@Override
		public boolean hasNext() {					// diferente de null porque estamos navegando posições e uma posição
			return (cursor != null); 				// quando encotra um sentinela retorna null
		}

		@Override
		public Position<T> next() {
			if (cursor == null) throw new NoSuchElementException("Não mais positições na lista");
			recent = cursor;
			cursor = after(cursor);
			return recent;
		}
		
		public void remove() throws IllegalStateException {
			if (recent == null) throw new IllegalStateException("Nada para remover");
			LinkedPositionalList.this.remove(recent);
			recent = null;
		}

	}
	// -------------------------------------------------------------------------------------------------
	
	

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Iterable<Position<T>> positions() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
