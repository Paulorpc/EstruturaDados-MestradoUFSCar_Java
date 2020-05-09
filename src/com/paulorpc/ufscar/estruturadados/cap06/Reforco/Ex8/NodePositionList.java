package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex8;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author paulo
 * @date 29 de mai de 2017
 *
 */
public class NodePositionList<T> implements Iterable<T>, PositionList<T> {
	
	private DNode<T> header;
	private DNode<T> trailer;
	private int size;
	
	public NodePositionList(){
		header = new DNode<>(null,null,null);
		trailer = new DNode<>(null,header,null);
		header.setNext(trailer);
		size=0;
	}
	
	// -------------------------------------------------------------------------------
	private Position<T> position(DNode<T> n) {
		if(n == header || n == trailer)
			return null;
		return (Position<T>) n;
	}
	
	private DNode<T> checkPosition(Position<T> p) throws Exception {
		if(!(p instanceof DNode))
			throw new Exception("Position não é válido");
		DNode<T> node = (DNode<T>) p;
		return node;
	}
	// -------------------------------------------------------------------------------

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
		return position(trailer.getPrev());
	}

	@Override
	public Position<T> next(Position<T> p) throws Exception {
		return position(checkPosition(p).getNext());
	}

	@Override
	public Position<T> prev(Position<T> p) throws Exception {
		return position(checkPosition(p).getPrev());
	}

	@Override
	public void addFirst(T e) {
		DNode<T> prox = header.getNext();
		DNode<T> novo = new DNode<>(e, header, prox);
		header.setNext(novo);
		prox.setPrev(novo);
		size++;
	}

	@Override
	public void addLast(T e) {
		DNode<T> ant = trailer.getPrev();
		DNode<T> novo = new DNode<>(e, ant, trailer);
		trailer.setPrev(novo);
		ant.setNext(novo);
		size++;
	}

	@Override
	public void addAfter(Position<T> p, T e) throws Exception {
		DNode<T> pos = checkPosition(p);
		DNode<T> after = pos.getNext();
		DNode<T> novo = new DNode<>(e,pos, after);
		pos.setNext(novo);
		after.setPrev(novo);
		size++;
	}

	@Override
	public void addBefore(Position<T> p, T e) throws Exception {
		DNode<T> pos = checkPosition(p);
		DNode<T> before = pos.getPrev();
		DNode<T> novo = new DNode<>(e,before, pos);
		before.setNext(novo);
		pos.setPrev(novo);
		size++;
	}

	@Override
	public T remove(Position<T> p) throws Exception {
		DNode<T> pos = checkPosition(p);
		T removido = pos.element();
		pos.getPrev().setNext(pos.getNext());
		pos.getNext().setPrev(pos.getPrev());
		pos.setNext(null);
		pos.setPrev(null);
		size--;
		return removido;
	}

	@Override
	public T set(Position<T> p, T e) throws Exception {
		T alterado = checkPosition(p).element();
		checkPosition(p).setElem(e);
		return alterado;
	}

	
	// ----------------------------------ITERATOR-------------------------------------
	/**
	 * Classe de iteração de positions 
	 */
	private class PositionIterator implements Iterator<Position<T>> {
		private Position<T> cursor = first();
		private Position<T> atual = null;
		
		public Position<T> next() {
			if (cursor == null) throw new NoSuchElementException("Não há elementos");
			try {
				atual = cursor;
				DNode<T> no;
				no = checkPosition(cursor);
				cursor = position(no.getNext());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return atual;
		}
		
		public boolean hasNext() {
			return (cursor != null);
		}
	}
	
	/**
	 * Classe com métodos de iteração entre os Elementos dos Positions 
	 */
	private class ElementIterator implements Iterator<T> {
		
		Iterator<Position<T>> posIterator = new PositionIterator();
		
		@Override
		public boolean hasNext() {
			return posIterator.hasNext();
		}
		
		@Override
		public T next() {
			return posIterator.next().element(); 	// RETORNA O ELEMENTOS E NÃO UMA POSIÇÃO!
		}
	}
	// -------------------------------------------------------------------------------
	
	// ----------------------------------ITERABLE-------------------------------------
	/**
	 * Classe iterável que possui o método que retorna um Iterador de Positions  
	 */
	private class PositionIterable implements Iterable<Position<T>> {

		@Override
		public Iterator<Position<T>> iterator() {
			return new PositionIterator();
		}
		
	}
	// -------------------------------------------------------------------------------
	
	public Iterator<T> iterator() {
		return new ElementIterator();
	}
	
	public Iterable<Position<T>> positions() {
		return new PositionIterable();
	}

	@Override
	public String toString() {
		
		Position<T> cursor = first();
		
		String ret = "(";
		while(cursor != null) {
			ret += cursor.element().toString();
			try { cursor = next(cursor); } catch (Exception e) {}
			ret += ", ";
		}
		ret = ret.substring(0, ret.length()-2) + ")";
		return ret;
	}
		
}
