package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex20;

import java.util.Hashtable;

public class Letras {
	
	String frase;
	
	public Letras(String frase) {
		this.frase = frase.toLowerCase();
	}
	
	public int TemMaisVogais() {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht = _tmv(this.frase, 0, 0, 0, 0);
		
		return ht.get("vog").compareTo(ht.get("con"));		
	}
	
	public Hashtable<String, Integer> qtde() {
		return _tmv(this.frase, 0, 0, 0, 0);
	}
	
	private Hashtable<String, Integer> _tmv(String frase, int i, int j, int contVog, int contCon) {
			
		Hashtable<String, Integer> qtde = new Hashtable<String, Integer>();
		
		qtde.put("vog", contVog);
		qtde.put("con", contCon);
		
		boolean exit = false;
		char[] vogais = "aáãâeéêiíoóôõuú".toLowerCase().toCharArray();
		
		if (i < frase.length()) {
			
			if (j < vogais.length) {
				
				if( frase.charAt(i) == vogais[j] ) {				
					qtde = _tmv(frase, i+1, 0, qtde.get("vog")+1, qtde.get("con"));
					exit = true;
				}
				else if (frase.charAt(i) == ' ') {
					qtde = _tmv(frase, i+1, j, qtde.get("vog"), qtde.get("con"));
					exit = true;
				}
				else {
					qtde = _tmv(frase, i, j+1, qtde.get("vog"), qtde.get("con"));
					exit = true;
				}
			}
			if (!exit)
				qtde = _tmv(frase, i+1, 0, qtde.get("vog"), qtde.get("con")+1);
		}
		return qtde;
		
	}
}
