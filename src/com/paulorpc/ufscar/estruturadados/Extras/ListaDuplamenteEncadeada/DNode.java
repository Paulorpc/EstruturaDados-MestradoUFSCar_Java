package com.paulorpc.ufscar.estruturadados.Extras.ListaDuplamenteEncadeada;


public class DNode {

	private String nome;
	private DNode prev;
	private DNode next;

	public DNode() {
		prev = next = null;
	}

	public DNode(String nome, DNode p, DNode n) {
		this.nome = nome;
		this.prev = p;
		this.next = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode p) {
		prev = p;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode n) {
		next = n;
	}

	public void printNode() {
		System.out.println("Nome: " + nome);
		System.out.println();
	}

}
