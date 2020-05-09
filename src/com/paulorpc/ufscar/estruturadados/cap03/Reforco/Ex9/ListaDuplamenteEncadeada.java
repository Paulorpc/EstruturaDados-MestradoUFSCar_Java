package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex9;


public class ListaDuplamenteEncadeada {
	
	Dnode cabeca;
	Dnode cauda;
	int tamanho;
	
	public ListaDuplamenteEncadeada() {
		cabeca = new Dnode(null, null, null, null);
		cauda = new Dnode (null, null, cabeca, null);
		cabeca.setNext(cauda);
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public Dnode getAnterior(Dnode no) throws Exception {
		if ( no == cabeca )
			throw new Exception("Não há nó anterior");
		return no.getPrevious();
	}
	
	public Dnode getProximo(Dnode no) throws Exception {
		if ( no == cauda )
			throw new Exception("Não há próximo nó");
			
		return no.getNext();
	}
	
	public void adicionaInicio(Dnode no) throws Exception{
		adicionaDepoisDe(cabeca, no);		
	}
	
	public void adicionaDepoisDe(Dnode no, Dnode novoNo) throws Exception {
		
		if (tamanho == 0) {
			;
			cauda.setPrevious(novoNo);
			novoNo.setNext(cauda);
			novoNo.setPrevious(cabeca);
		}
		else {
		
		Dnode aux = getProximo(no);
		
		novoNo.setNext( aux );
		novoNo.setPrevious( no );
		no.setNext( novoNo );
		aux.setPrevious( novoNo );
		}
		
		tamanho++;
	}
	
	public void adicionaAntesDe(Dnode no, Dnode novoNo) throws Exception {
		
		Dnode aux = getAnterior(no);
		
		novoNo.setPrevious( aux );
		novoNo.setNext( no );
		no.setPrevious( novoNo );
		aux.setNext( novoNo );
		
		tamanho++;
		
	}
	
	public void remove(Dnode no) throws Exception {
		
		Dnode noAnt, noProx;
		noAnt = getAnterior(no);
		noProx = getProximo(no);
		
		noAnt.setNext(noProx);
		noProx.setPrevious(noAnt);
		no.setPrevious(null);
		no.setNext(null);
		
		tamanho--;		
	}
	
	public Dnode getFirst() throws Exception{
		return getProximo(cabeca);
	}
	
	public Dnode getLast() throws Exception{
		return getAnterior(cauda);
	}
	
	public Dnode getNext(int i) throws Exception {
		
		if (i == 0)
			throw new Exception ("Não há posição 0. Comece em 1");
		
		Dnode aux = getFirst();
		
		for(int j=0; j<i-1; j++)
			aux = aux.getNext();
		
		return aux;
	}
	

	public Dnode getNodeMeio() throws Exception {
		int tam = (tamanho%2 == 0) ? tamanho/2 : tamanho/2 + 1;
		return getNext(tam);
	}
	
	public void printList() throws Exception {
		
		int i=1;
		Dnode aux = getFirst();
		aux.printDnode();
		
		while(i++ < tamanho)
			getNext(i).printDnode();
	}
	
	
	// Criado para criativida.ex8
	public void adicionaListaInicio(ListaDuplamenteEncadeada L) throws Exception {
		
		if (tamanho == 0) {
			
		}
		else {
			Dnode aux = getProximo(cabeca);
			
			cabeca.setNext( L.getFirst() );
			L.getFirst().setPrevious( cabeca );
			L.getLast().setNext( aux );
			aux.setPrevious( L.getLast() );
			
			tamanho+=L.getTamanho();
		}
	}
	
	
	// Criado para criativida.ex8
	public void concatenaListas(ListaDuplamenteEncadeada L, ListaDuplamenteEncadeada M) throws Exception {
						
	}

}
