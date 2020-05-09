package com.paulorpc.ufscar.estruturadados.cap01.Criatividade;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] letras = {'c', 'a', 'r', 'b', 'o', 'n'};
		
		String[] palavras = new String[999999];
		
		int contador = 0;
		
		for(int a = 0; a < 6; a++){
			for(int b = 0; b < 6; b++){
				for(int c = 0; c < 6; c++){
					for(int d = 0; d < 6; d++){
						for(int e = 0; e < 6; e++){
							for(int f = 0; f < 6; f++){
								palavras[contador] = String.valueOf(letras[a])
										+ String.valueOf(letras[b])
										+ String.valueOf(letras[c])
										+ String.valueOf(letras[d])
										+ String.valueOf(letras[e])
										+ String.valueOf(letras[f]);
								//palavras[contador].concat(letras[a]).concat(letras[b]).concat(letras[c]).concat(letras[d]).concat(letras[e]).concat(letras[f]);
								System.out.println("Contador: " + contador + " Palavra: " + palavras[contador]);
								contador++;
							}
						}
					}
				}
			}
		}
		
	}

}
