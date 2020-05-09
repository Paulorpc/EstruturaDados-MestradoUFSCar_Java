package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex5_e_7;


/**
 * @author paulo
 * @date 28 de mai de 2017
 *
 */
public class DLinkedList<E> {
	
	private DNode<E> sentinela;
	private int size;
	
	public DLinkedList() {
		sentinela = new DNode<>(null, null, null);
		sentinela.setNext(sentinela);
		sentinela.setPrev(sentinela);
		size = 0;
	}
	
	public void addBefore(DNode<E> node, E e) {
		DNode<E> prev = node.getPrev();
		DNode<E> novo = new DNode<>(e,prev,node);
		prev.setNext(novo);
		node.setPrev(novo);
		size++;
	}
	
	public void addFirst(E e) {
		DNode<E> prox = sentinela.getNext();
		DNode<E> novo = new DNode<>(e, sentinela, prox);
		prox.setPrev(novo);
		sentinela.setNext(novo);
		size++;
	}
	
	public void addLast(E e) {
		DNode<E> ant = sentinela.getPrev();
		DNode<E> novo = new DNode<>(e, ant, sentinela);
		ant.setNext(novo);
		sentinela.setPrev(novo);
		size++;
	}
	
	public DNode<E> getElement(int pos) {
		DNode<E> cursor = sentinela;
		for(int i=0; i<pos+1; i++)
			cursor = cursor.getNext();
		return cursor;
	}
	
	public int size(){
		return size;
	}
	
	
	public String toString() {
		String ret = "(";
		for(int i=0; i<size; i++) {
			ret += getElement(i).getElement();
			ret += ", ";
		}
		ret = ret.substring(0, ret.length()-2) + ")";
		return ret;
	}

}
