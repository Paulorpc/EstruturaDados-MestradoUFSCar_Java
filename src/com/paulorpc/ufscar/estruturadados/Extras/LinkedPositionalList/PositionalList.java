package com.paulorpc.ufscar.estruturadados.Extras.LinkedPositionalList;


import java.util.Iterator;

public interface PositionalList<T> extends Iterable<T> {
	
	int size();
	boolean isEmpty();
	Position<T> first();
	Position<T> last();
	Position<T> before(Position<T> p);
	Position<T> after(Position<T> p);
	Position<T> addFirst(T e);
	Position<T> addLast(T e);
	Position<T> addBefore(Position<T> p, T e); 
	Position<T> addAfter(Position<T> p, T e);
	T set(Position<T> p, T e);
	T remove(Position<T> p);

	/**
	 * Retorna um iterator dos elementos armazenados na lista.
	 * @return iterador dos elementos da lista
	 */
	Iterator<T> iterator();
	
	/**
	 * retorna os positions da lista numa forma iterável do primeiro ao último.
	 * @return coleção de iteraveis dos positions da lista. 
	 */
	Iterable<Position<T>> positions();

}
