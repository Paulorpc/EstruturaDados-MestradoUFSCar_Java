package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex3;


import net.datastructures.Stack;

/**
 * @author paulo
 * @date 28 de mai de 2017
 *
 */
public class PilhaVetor<E> implements Stack<E>{
	
	private E[] data;
	private int size;
	private static final int CAPACITY = 5000;
	
	public PilhaVetor() {
		this(CAPACITY);
	}
	
	public PilhaVetor(int sizeArray) {
		data =  (E[]) new Object[sizeArray];
		size = 0;
	}

	/* (non-Javadoc)
	 * @see net.datastructures.Stack#size()
	 */
	@Override
	public int size() {
		return size;
	}

	/* (non-Javadoc)
	 * @see net.datastructures.Stack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return (size==0);
	}

	/* (non-Javadoc)
	 * @see net.datastructures.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E e) {
		data[size++] = e;
	}

	/* (non-Javadoc)
	 * @see net.datastructures.Stack#top()
	 */
	@Override
	public E top() {
		return data[size-1];
	}

	/* (non-Javadoc)
	 * @see net.datastructures.Stack#pop()
	 */
	@Override
	public E pop() {
		if(size==0) return null;
		E removido = data[size-1];
		data[--size] = null;
		return removido;
	}

}
