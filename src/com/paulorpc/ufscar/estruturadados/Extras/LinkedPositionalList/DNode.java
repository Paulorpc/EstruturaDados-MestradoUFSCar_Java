package com.paulorpc.ufscar.estruturadados.Extras.LinkedPositionalList;


public class DNode<T> implements Position<T>{

	private T elem;
	private DNode<T> prev;
	private DNode<T> next;

	public DNode() {
		prev = next = null;
	}

	public DNode(T elem, DNode<T> p, DNode<T> n) {
		this.elem = elem;
		this.prev = p;
		this.next = n;
	}

	public T getElement() {
		if(next == null) 
			throw new IllegalStateException("Posição não é mais válida");
		return elem;
	}

	public void setElem(T elem) {
		this.elem = elem;
	}

	public DNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DNode<T> p) {
		prev = p;
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> n) {
		next = n;
	}

	public void printNode() {
		System.out.print(elem.toString()+"\n");
	}
	
	

}
