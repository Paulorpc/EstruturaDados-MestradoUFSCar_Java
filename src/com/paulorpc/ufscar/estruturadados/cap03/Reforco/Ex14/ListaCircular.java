package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex14;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class ListaCircular {
	
	Node cursor;
	int tamanho;
	
	public ListaCircular() {
		cursor = null;
		tamanho = 0;		
	}
	
	public Node getProximo() {
		return cursor.getNext();
	}
	
	public void add(Node novoNo){
		
		if (cursor == null) {
			cursor = novoNo;
			novoNo.setNext(novoNo);
		}
		else {
			novoNo.setNext(cursor.getNext());
			cursor.setNext(novoNo);
		}
		tamanho++;
	}
	
	public Node remove() throws Exception {
		
		Node oldNode = cursor.getNext();
		
		if (oldNode == cursor)
			cursor = null;
		else {
			cursor.setNext(oldNode.getNext());
			oldNode.setNext(null);
			tamanho--;
		}
		
		return oldNode;
		
	}
	
	public void advance() {
		cursor = cursor.getNext();
	}
	
	public String toString() {
		
		if(cursor==null) return "[]";
		
		String s = "[..." + cursor.getNome();
		Node oldCursor = cursor;
		for(advance(); oldCursor!=cursor;advance())
			s+=", " + cursor.getNome();
		return s+"...]";		
	}

}
