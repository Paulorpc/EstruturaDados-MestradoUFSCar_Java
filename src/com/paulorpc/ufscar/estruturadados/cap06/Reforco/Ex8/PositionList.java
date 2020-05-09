package com.paulorpc.ufscar.estruturadados.cap06.Reforco.Ex8;


/**
 * @author paulo
 * @date 29 de mai de 2017
 *
 */
public interface PositionList<T> {

	public int size();

	public boolean isEmpty();

	public Position<T> first();

	public Position<T> last();

	public Position<T> next(Position<T> p) throws Exception;

	public Position<T> prev(Position<T> p) throws Exception;

	public void addFirst(T e);

	public void addLast(T e);

	public void addAfter(Position<T> p, T e) throws Exception;

	public void addBefore(Position<T> p, T e) throws Exception;

	public T remove(Position<T> p) throws Exception;

	public T set(Position<T> p, T e) throws Exception;

}
