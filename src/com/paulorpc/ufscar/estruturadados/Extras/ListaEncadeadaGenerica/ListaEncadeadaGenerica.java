package com.paulorpc.ufscar.estruturadados.Extras.ListaEncadeadaGenerica;


public class ListaEncadeadaGenerica<T> {

	private Node<T> cabeca;
	private Node<T> cauda;
	private int tamanho;

	public ListaEncadeadaGenerica() {
		cabeca = cauda = null;
		tamanho = 0;
	}

	public ListaEncadeadaGenerica(Node<T> novoNo) {
		cabeca = cauda = novoNo;
		cauda.setNext(null);
		tamanho = 1;
	}

	public void addFirst(Node<T> novoNo) {

		if (tamanho == 0) {
			setCabeca(novoNo);
			setCauda(novoNo);
		} else {
			novoNo.setNext(cabeca);
			cabeca = novoNo;
		}
		tamanho++;
	}

	public void addLast(Node<T> novoNo) throws Exception {

		Node<T> aux;

		if (tamanho == 0)
			addFirst(novoNo);
		else {
			aux = getElemento(tamanho - 1);
			aux.setNext(novoNo);
			cauda = novoNo;
		}

	}

	public void addPos(int pos, Node<T> novoNo) throws Exception {

		if (pos == 1)
			addFirst(novoNo);
		else if (pos == tamanho)
			addLast(novoNo);
		else {
			Node<T> noAntPos;

			noAntPos = getElemento(pos - 1);
			novoNo.setNext(noAntPos.getNext());
			noAntPos.setNext(novoNo);
		}
	}

	public Node<T> getCabeca() {
		return cabeca;
	}

	public Node<T> getCauda() {
		return cauda;
	}

	public Node<T> getElemento(int pos) throws Exception {

		Node<T> aux;

		if (pos < 1 && pos > tamanho)
			throw new Exception("Indice do vetor fora de alcance. Tamanho da lista é: " + tamanho);

		aux = cabeca;
		for (int i = 0; i < pos - 1; i++)
			aux = aux.getNext();

		return aux;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void printLista() {

		Node<T> aux = cabeca;

		System.out.println(aux.toString());
		for (int i = 0; i < tamanho - 1; i++) {
			aux = aux.getNext();
			System.out.println(aux.toString());
		}
	}

	public void setCabeca(Node<T> novaCabeca) {
		this.cabeca = novaCabeca;
	}

	public void setCauda(Node<T> novaCauda) {
		this.cauda = novaCauda;
	}

}
