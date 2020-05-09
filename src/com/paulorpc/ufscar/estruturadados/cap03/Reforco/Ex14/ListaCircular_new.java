package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex14;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class ListaCircular_new {

	private Node cursor;
	private int size;
	
	public ListaCircular_new() {
		cursor = null;
		size = 0;
	}
	
	public void add(Node NewNode) {
		if (getSize() == 0) {
			NewNode.setNext(NewNode);
			cursor = NewNode;
		}
		else {
			NewNode.setNext(cursor.getNext());
			cursor.setNext(NewNode);
		}
		size++;
	}
	
	public Node remove() {
		Node rem = cursor.getNext();
		
		if (cursor == rem) {
			cursor = null;
		}
		else {
			cursor.setNext(rem.getNext());
			rem.setNext(null);
		}
		size--;
		
		return rem;
	}
	
	public Node advance() {
		return cursor = cursor.getNext();
	}

	public Node getCursor() {
		return cursor;
	}

	public int getSize() {
		return size;
	}
	
	
	public void printlist() {
		
		for(int i=0; i<size; i++)
			advance().printNode();
	}

}
