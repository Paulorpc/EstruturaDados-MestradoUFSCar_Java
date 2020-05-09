package com.paulorpc.ufscar.estruturadados.cap03.Reforco.Ex3;


public class Main {

	public static void main(String[] args) {
		
		Cesar c = new Cesar();
		
		String nome = "PAULO CEZAR";
		String nomeNovo;
		
		nomeNovo = c.encrypt(nome);
		System.out.println(nome);
		System.out.println(nomeNovo);
		nomeNovo = c.decrypt(nomeNovo);
		System.out.println(nomeNovo);

	}

}
