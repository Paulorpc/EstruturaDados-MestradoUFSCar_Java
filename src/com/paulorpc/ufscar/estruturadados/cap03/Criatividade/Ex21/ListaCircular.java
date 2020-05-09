package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex21;

import com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6.Node;

public class ListaCircular {
	
	private Node cursor;
	private int size;
	
	public ListaCircular() {
		cursor = null;
		size = 0;
	}
	
	public Node getCursor() throws Exception {
		
		if (cursor == null)
			throw new Exception("Lista vazia.");
		else
			return cursor;
	}
	public int getSize() {
		return size;
	}
	
	public void add(Node novoNo) {
		
		if (cursor == null) {
			novoNo.setNext(novoNo);
			cursor = novoNo;			
		}
		else
			novoNo.setNext(cursor.getNext());
			cursor.setNext(novoNo);
		size++;
	}
	
	public void avancar() throws Exception {
		cursor = cursor.getNext();
	}
	
	public Node remove() throws Exception {
		
		Node remover = cursor.getNext();
		
		if (remover == cursor) {
			cursor = null;
		}
		else {
			cursor.setNext(remover.getNext());
			remover.setNext(null);
		}
		size--;
		return remover;
	}
	
	public boolean compareReferenciasList(ListaCircular m) throws Exception {
		
		int nos = 0;

		if (size == 0 && m.getSize() == 0)
			return true;
		
		if(size != m.getSize()) {
			return false;
		}
		else {
			while ( !cursor.equals( m.getCursor() ) && nos < size) {
				m.avancar();
				nos++;
			}
			if(nos >= size)
				return false;
			
			for(int i=0; i<size; i++) {
				if ( cursor.equals(m.getCursor()) ) {
					this.avancar();
					m.avancar();
				}
				else
					return false;
			}
		}
		
		return true;
	}
	
	public boolean compareList(ListaCircular m) throws Exception {
		
		int nos = 0;

		if (size == 0 && m.getSize() == 0)
			return true;
		
		if(size != m.getSize()) {
			return false;
		}
		else {
			while ( !cursor.compareNodes( m.getCursor() ) && nos < size) {
				m.avancar();
				nos++;
			}
			if(nos >= size)
				return false;
			
			for(int i=0; i<size; i++) {
				if ( cursor.compareNodes(m.getCursor()) ) {
					this.avancar();
					m.avancar();
				}
				else
					return false;
			}
		}
		
		return true;
	}
	
	public void printLista() throws Exception {
		for (int i=0; i<size; i++ ) {
			cursor.printNode();
			this.avancar();
		}
	}
	
	// Ex 22 cap3
	public ListaCircular splitList() throws Exception {
		
		Node aux = null;
		Node inicioL1 = null;
		Node inicioL2 = null;
		Node fimL1 = null;
		Node fimL2 = null;
		ListaCircular l2 = new ListaCircular();
		
		if (cursor == null) {
			throw new Exception("Lista vazia. ");
		}
		else if (size == 1) {
			throw new Exception("Não é possível dividir uma lista com 1 elemento.");
		}
		else if(size == 2) {		
			l2.add(remove());
		}
		else if (size > 2 && size%2 == 0){
			
			// Avança até o ultimo elem para pegar o primeiro.
			for(int i=0; i<size-1; i++) avancar();
			inicioL1 = cursor.getNext();
			
			// avanco para o primeiro elem da lista.
			avancar();
			
			// percorro toda lista, removendo e adicionando na lista 2
			for(int i=0; i <= size; i++) {
				
				// Acanço até o centro da lista para pegar o primeiro elemento da lista 2
				if( i < (size/2)-1) {
					avancar();
				}
				
				// Adiciona o 1o elem da lista 2 e remove da lista 1
				else if ( i == (size/2-1) ) {
					l2.add(remove());
				}
				else {
					
					//Retorna o cursor para posição inicial;
					cursor = inicioL1;
					
					//percorro lista para alcançar os ultimos elementos para manter ordenação na inserção da l2 
					for (int j=0; j<size-2; j++) {
						avancar();
					}
					//Ao chegar no elemento, adiciono na lista 2 e removo da 1;
					l2.add(remove());
					
				}
			}
			
		}
		else
			throw new Exception("Qtde impar de itens na lista: " +size);
		
		// Avanço uma posição na lista1 para manter ordenação.
		avancar();
		
		return l2;	
	}	

}
