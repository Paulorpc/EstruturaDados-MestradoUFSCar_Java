package com.paulorpc.ufscar.estruturadados.Extras.ListaEncadeadaGenerica;


public class Main {

	public static void main(String[] args) throws Exception {

		ListaEncadeadaGenerica<Carro> l1 = new ListaEncadeadaGenerica<Carro>();
		ListaEncadeadaGenerica<Tv> l2 = new ListaEncadeadaGenerica<Tv>();

		l1.addFirst(new Node<Carro>(new Carro("Pejeout 207", 4)));
		l1.addFirst(new Node<Carro>(new Carro("Astra 2.0", 5)));
		l1.addFirst(new Node<Carro>(new Carro("Civic antigo", 5)));

		l2.addFirst(new Node<Tv>(new Tv("LG001")));
		l2.addFirst(new Node<Tv>(new Tv("LG002")));
		l2.addFirst(new Node<Tv>(new Tv("LG003")));
		l2.addFirst(new Node<Tv>(new Tv("LG004")));

		if (true)
			l1.printLista();
		else
			l2.printLista();

	}

}
