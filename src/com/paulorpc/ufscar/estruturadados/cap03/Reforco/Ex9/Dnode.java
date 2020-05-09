package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex9;


public class Dnode {
	
	private String nome;
	private Integer idade;
	private Dnode previous;
	private Dnode next;
	
	public Dnode(String nome, Integer idade, Dnode p, Dnode n){
		this.nome = nome;
		this.idade = idade;
		previous = p;
		next = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Dnode getPrevious() {
		return previous;
	}

	public void setPrevious(Dnode previous) {
		this.previous = previous;
	}

	public Dnode getNext() {
		return next;
	}
	
	public void setNext(Dnode next) {
		this.next = next;
	}
	
	public void printDnode() {
		System.out.println("Nome:  "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println();
	}

}
