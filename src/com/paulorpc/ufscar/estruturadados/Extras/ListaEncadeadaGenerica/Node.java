package com.paulorpc.ufscar.estruturadados.Extras.ListaEncadeadaGenerica;


public class Node<T> {

	private T e;
	private Node<T> next;

	public Node(T e, Node<T> next) {
		this.e = e;
		this.next = next;
	}

	public Node(T e) {
		this.e = e;
		this.next = null;
	}

	public T getObj() {
		return this.e;
	}

	public void setE(T e) {
		this.e = e;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public boolean compareNodes(Node<T> m) {
		return (e.equals(m)) ? true : false;
	}

	public String toString() {
		return e.toString();
	}

}
