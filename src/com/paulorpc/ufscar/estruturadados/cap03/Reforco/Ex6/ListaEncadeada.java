package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex6;


public class ListaEncadeada {
	
	private Node cabeca;
	private Node cauda;
	private int tamanho;
	
	// Sentinela para criativide.ex7	
	private boolean sentinela;
	
	// Cabeça Sentinela para criativide.ex7	
	private Node cabecaS;
	
	public ListaEncadeada() {
		cabeca = cauda = cabecaS = null;
		tamanho = 0;		
		sentinela = false;
	}
	
	public ListaEncadeada(Node n) {
		cabeca = n;
		tamanho++;
	}

	public Node getCabeca() {
		return cabeca;
	}
	
	public void setCabeca(Node cabeca) {
		this.cabeca = cabeca;
	}
	
	public Node getCabecaS() {
		return cabecaS.getNext();
	}
	
	public void setCabecaS(Node cabeca) {
		Node n = new Node(null, 0, null);
		cabecaS = n;
		this.cabecaS.setNext(cabeca);
	} 

	public Node getCauda() {
		return cauda;
	}
	
	public void setCauda(Node cauda) {
		this.cauda = cauda;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	/*
	 * Representação sem nodo sentinela, pois o primeiro elemento e ultimo elemento da 
	 * lista fazem parte da lista. Não são nodos falsos. 
	 */
	public void adicionaInicio(Node n) {
		
		if (tamanho == 0) {
			cabeca = cauda = n;
		}
		else {
			n.setNext(cabeca);
			cabeca = n;
		}
		tamanho++;
	}
		
		
	public void adicionaFim(Node n) {
		
		if(tamanho == 0) {
			adicionaInicio(n);
		}
		else {
			n.setNext(null);
			cauda.setNext(n);
			cauda = n;
			tamanho++;
		}
	}
	
	public Node removeInicio() throws Exception {
		
		if(tamanho == 0)
			throw new Exception("Lista já está vazia.");
		
		Node cabecaRemovida = cabeca;
		cabeca = cabeca.getNext();
		cabecaRemovida.setNext(null);
		tamanho--;
		
		return cabecaRemovida;		
	}
	
	
	public Node removeFim() throws Exception {
		
		Node remove;
		Node aux;
		
		if ( tamanho == 0 )
			throw new Exception ("Lsita está vazia");
		
		aux = getListaNode(tamanho-1);
		remove = aux.getNext();
		aux.setNext(null);
		cauda = aux;
		
		tamanho--;
		return remove;
	}
	
	public Node getListaNode(int i) throws Exception {
		
		Node aux = null;
		
		if (tamanho == 0)
			throw new Exception("Lista vazia.");
		else if (i == 0)
			throw new Exception("Posição Inválida");
		else if(tamanho == 1)
			return cabeca;			
		else
			aux = cabeca;
			for(int j=0; j<i-1; j++) {
				
				if (aux.getNext() == null)
					throw new Exception("Indice superior ao tamanho da lista. Tamanho é " + tamanho);
				
				aux = aux.getNext();
			}

		return aux;
	}
	
	public Node getPenultimoNode() throws Exception {
		return getListaNode(tamanho-1);		
	}
	
	public void printCabeca() throws Exception {
		
		if (tamanho == 0)
			throw new Exception("Lista vazia.");
		
		System.out.println("[ Cabeça ]");
		getCabeca().printNode();
		
	}

	public void printCauda() throws Exception {		
		
		if (cauda == null)
			throw new Exception("Lista vazia.");
		
		System.out.println("[ Cauda ]");
		getCauda().printNode();
	}
	
	public void printLista() throws Exception {
		if (tamanho == 0)
			throw new Exception("Lista vazia.");
		
		//Condicional para imprimir lita com ou sem sentinela (por causa do criativide.ex7)
		if (sentinela) {
			
			Node aux = getCabecaS();
			aux.printNode();
			for (int i=0; i < tamanho-1; i++) {
				aux = aux.getNext();
				aux.printNode();
			}
		}
		else {
			for (int i=1; i <= tamanho; i++)
				getListaNode(i).printNode();
		}
	}
	
	// Lista invertida para criatividade.ex6
	public void inverterLista(int tamanhoLista, boolean first, Node aux) throws Exception {
		
		Node cabecaInv = null;
		Node caudaInv = null;
		
		if (first) {
			aux = null;
			cabecaInv = getCauda();
			caudaInv = getCabeca();	
			aux = cabecaInv;
		}
		if (tamanhoLista > 1) {
			aux.setNext( getListaNode(tamanhoLista-1) );
			aux = aux.getNext();
			inverterLista(--tamanhoLista, false, aux);
		}
		setCabeca(cabecaInv);
		setCauda(caudaInv);
	}
	
	
	//Concatena duas listas com sentinela de cabeça. criativide.ex7
	public Node concatenaListaS(ListaEncadeada L, ListaEncadeada M) {
		
		sentinela = true;
		
		L.getCauda().setNext( M.getCabeca() );
		setCabecaS( L.getCabeca() );
		
		tamanho = L.getTamanho() + M.getTamanho();
		
		return getCabecaS();
	}
	
	// criatividade.ex9
	public void trocaElementoPosicao(int x, int y) throws Exception {
		
		Node nodeCabeca, nodeCauda, nodeAntX, nodeAntY, nodeX, nodeY, nodeProxX, nodeProxY = null;
		
		// não tem mudança
		if (x==y) 
			return;

		// garante que x é sempre o menor valor
		else if (x>y){
			int nAux;
			nAux = x;
			x = y;
			y = nAux;
		}
		
		nodeCabeca = getCabeca();
		nodeCauda = getCauda();
		nodeAntX = ( x > 1 ) ? getListaNode(x-1) : null;
		nodeAntY = getListaNode(y-1);
		nodeX = getListaNode(x);
		nodeY = getListaNode(y);
		nodeProxX = getListaNode(x+1);
		nodeProxY = ( y < getTamanho() ) ? getListaNode(y+1) : null;
		Node aux;
		
		if ( tamanho == 0 )
			throw new Exception("Lista vazia");
		
		else if ( tamanho == 1 )
			throw new Exception("Lista contém apenas um elemento");
	
		else if ( x < 1 || y > getTamanho() )
			throw new Exception("Valores fora da lista");
		
		// lista tem apenas 2 elementos
		else if ( tamanho == 2 ) {
			
			aux = getCabeca();
			setCabeca( getCauda() );
			setCauda( aux );
			cabeca.setNext(getCauda());
			cauda.setNext(null);
			
		}
		else {
			// X é a cabeca e elementos são sequenciais
			if ( x == 1 && x+1 == y) {
				setCabeca( nodeY );
				cabeca.setNext( nodeX );
				nodeX.setNext( nodeProxY );
			}
			// Y é a cauda e elementos são sequenciais
			else if ( y == getTamanho() && y-1 == x) {
				nodeAntX.setNext(nodeY);
				nodeY.setNext(nodeX);
				nodeX.setNext(null);
				setCauda(nodeX);				
			}
			// X e Y são cabeca/cauda
			else if (x == 1 && y == getTamanho()) {
				setCabeca( nodeY );
				cabeca.setNext( nodeProxX );
				nodeAntY.setNext( nodeX );
				nodeX.setNext(null);
				setCauda( nodeX );
			}
			// X seja cabeca e Y intermediario
			else if (x == 1 && y < getTamanho()) {
				setCabeca( nodeY );
				cabeca.setNext( nodeProxX );
				nodeAntY.setNext( nodeX );
				nodeX.setNext( nodeProxY );
			}
			// x é intermediario e y cauda
			else if (x > 1 && y == getTamanho()) {
				nodeAntX.setNext( nodeY );
				nodeY.setNext( nodeProxX );
				nodeAntY.setNext( nodeX );
				setCauda( nodeX );
			}
			// x e y são elementos intermediarios
			else if ( x > 1 && y < getTamanho()) {
				
				// e não sequenciais
				if (x+1 != y) {
					nodeAntX.setNext( nodeY );
					nodeY.setNext( nodeProxX );
					nodeAntY.setNext(nodeX);
					nodeX.setNext( nodeProxY );
				}
				// e sequenciais
				else if (x+1 == y) {
					nodeAntX.setNext( nodeY );
					nodeY.setNext( nodeX );
					nodeX.setNext( nodeProxY );
				}
			}			
			
		}
		
	}
	
}
