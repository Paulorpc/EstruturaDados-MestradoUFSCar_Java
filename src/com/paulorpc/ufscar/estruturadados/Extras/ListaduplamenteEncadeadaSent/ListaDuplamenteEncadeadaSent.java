package com.paulorpc.ufscar.estruturadados.Extras.ListaduplamenteEncadeadaSent;

import com.paulorpc.ufscar.estruturadados.Extras.ListaDuplamenteEncadeada.DNode;

public class ListaDuplamenteEncadeadaSent {

	private DNode sentinela;
	int size;

	public ListaDuplamenteEncadeadaSent() {
		sentinela = new DNode(null, null, null);
		sentinela.setNext(sentinela);
		sentinela.setPrev(sentinela);
		size = 0;
	}

	public void addFirst(DNode newNode) {
		if (size == 0) {
			newNode.setNext(sentinela);
			newNode.setPrev(sentinela);
			sentinela.setNext(newNode);
			sentinela.setPrev(newNode);
		} else {
			DNode prox = sentinela.getNext();
			newNode.setNext(prox);
			newNode.setPrev(sentinela);
			prox.setPrev(newNode);
			sentinela.setNext(newNode);
		}
		size++;
	}

	public void addLast(DNode newNode) {
		if (size == 0)
			addFirst(newNode);
		else {
			DNode ant = sentinela.getPrev();
			newNode.setNext(sentinela);
			newNode.setPrev(ant);
			ant.setNext(newNode);
			sentinela.setPrev(newNode);
			size++;
		}
	}

	public DNode getPos(int pos) throws Exception {
		if (size == 0)
			throw new Exception("Lista vazia.");
		if (pos < 1 || pos > size)
			throw new Exception("posição invalida");

		DNode aux = getFirst();
		for (int i = 0; i < pos - 1; i++) {
			aux = aux.getNext();
		}
		return aux;
	}

	public void addPos(int pos, DNode novoNo) throws Exception {
		if (pos < 1 || pos > size + 1)
			throw new Exception("Posicao inválida");
		if (pos == 1)
			addFirst(novoNo);
		else if (pos == size + 1)
			addLast(novoNo);
		else {
			DNode posX = getPos(pos);
			DNode antX = posX.getPrev();
			novoNo.setNext(posX);
			novoNo.setPrev(antX);
			antX.setNext(novoNo);
			posX.setPrev(novoNo);
			size++;
		}
	}

	public DNode removePos(int pos) throws Exception {
		if (size == 0)
			throw new Exception("Lista vazia.");
		if (pos < 0 || pos > size)
			throw new Exception("Posição inválida");

		DNode rem = getPos(pos);
		DNode ant = rem.getPrev();
		DNode prox = rem.getNext();
		ant.setNext(prox);
		prox.setPrev(ant);
		rem.setNext(null);
		rem.setPrev(null);

		size--;
		return rem;

	}

	public ListaDuplamenteEncadeadaSent clone() {

		ListaDuplamenteEncadeadaSent l2 = new ListaDuplamenteEncadeadaSent();

		try {
			DNode aux;

			for (int i = 1; i <= size; i++) {
				aux = getPos(i);
				DNode node = new DNode(aux.getNome(), null, null);
				l2.addLast(node);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return l2;
	}

	public void printLDE() {
		DNode aux = sentinela;
		for (int i = 0; i < size; i++) {
			aux = aux.getNext();
			aux.printNode();
		}
	}

	public void getSize() {
		System.out.println(size);
	}

	public DNode getFirst() {
		return sentinela.getNext();
	}

	public DNode getLast() {
		return sentinela.getPrev();
	}

}
