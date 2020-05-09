package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex3;


import java.util.ArrayList;

import net.datastructures.Stack;


/**
 * @author paulo
 * @date 28 de mai de 2017
 *
 */
public class PilhaArrayList<E> implements Stack<E> {
	
	ArrayList<E> pilha;
	int size;
	
	public PilhaArrayList() {
		pilha = new ArrayList<>();
		size=0;
	}
	
	@Override
	public int size() {
		return pilha.size();
	}
	
	@Override
	public E pop() {
		E removido = pilha.get(size()-1);
		pilha.remove(size()-1);
		return removido;
	}
	
	@Override
	public E top() {
		return pilha.get(size()-1);
	}

	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	@Override
	public void push(E e) {
		pilha.add(e);
		
	}	

}
