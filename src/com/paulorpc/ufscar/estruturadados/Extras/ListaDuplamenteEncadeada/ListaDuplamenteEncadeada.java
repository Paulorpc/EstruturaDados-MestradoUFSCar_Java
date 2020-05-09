package com.paulorpc.ufscar.estruturadados.Extras.ListaDuplamenteEncadeada;


public class ListaDuplamenteEncadeada {

	private DNode header;
	private DNode trailler;
	int size;

	public ListaDuplamenteEncadeada() {
		header = new DNode(null, null, null);
		trailler = new DNode(null, header, null);
		header.setNext(trailler);
		size = 0;
	}

	public void addFirst(DNode newNode) {
		if (size == 0) {
			newNode.setNext(trailler);
			newNode.setPrev(header);
			header.setNext(newNode);
			trailler.setPrev(newNode);
		} else {
			DNode prox = header.getNext();
			newNode.setNext(prox);
			newNode.setPrev(header);
			prox.setPrev(newNode);
			header.setNext(newNode);
		}
		size++;
	}

	public void addLast(DNode newNode) {
		if (size == 0)
			addFirst(newNode);
		else {
			DNode ant = trailler.getPrev();
			newNode.setNext(trailler);
			newNode.setPrev(ant);
			ant.setNext(newNode);
			trailler.setPrev(newNode);
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

	public void printLDE() {
		DNode aux = getFirst();
		aux.printNode();
		for (int i = 0; i < size - 1; i++) {
			aux = aux.getNext();
			aux.printNode();
		}
	}

	public void getSize() {
		System.out.println(size);
	}

	public DNode getFirst() {
		return header.getNext();
	}

	public DNode getLast() {
		return trailler.getPrev();
	}

}
