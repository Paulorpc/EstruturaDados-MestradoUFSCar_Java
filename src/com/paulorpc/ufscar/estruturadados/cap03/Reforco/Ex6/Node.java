package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6;


public class Node {
	
	private String nome;
	private int idade;
	private Node next;
	
	public Node(String nome, int idade, Node next) {
		this.nome = nome;
		this.idade = idade;
		this.next = next;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public boolean compareNodes(Node m) {
				
		if (
			this.nome == m.getNome() && 
			this.idade == m.getIdade()
			)
			return true;
		else
			return false;
		
	}
	
	public void printNode() {
		System.out.println("Nome:  " + nome);
		System.out.println("Idade: " + idade);
		System.out.println();
	}

}
