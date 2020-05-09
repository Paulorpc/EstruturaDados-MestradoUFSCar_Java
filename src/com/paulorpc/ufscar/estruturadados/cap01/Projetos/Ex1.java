package com.paulorpc.ufscar.estruturadados.cap01.Projetos;

import java.util.ArrayList;
import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder teste = new StringBuilder();
		
		ArrayList<Integer> x = new ArrayList();
		//ArrayList<Integer> y = new ArrayList();
		//ArrayList<Integer> z = new ArrayList();
		
		//String[] caracteres = {"a", "e", "i", "o", "u"};
		char[] caracteres = {'a', 'e', 'i', 'o', 'u'};
		String frase = "Eu n�o mandarei mais spam para meus amigos";
		String fraseAux = "";
		
		Random rdmErro = new Random();
		Random rdmCaracter = new Random();
		Random rdmFrase = new Random();
		
		int i;
		
		for(i = 0; i < 8; i++){
			x.add(rdmErro.nextInt(99));
		}
		
		//System.out.println(x);
		
		//z.add(rdmCaracter.nextInt(4));
		//y.add(rdmFrase.nextInt(41));
		
		for(i = 0; i < 100; i++){
			//fraseAux = frase.toString();
			teste = new StringBuilder("Eu n�o mandarei mais spam para meus amigos");
			if(x.contains(i)){
				//fraseAux = fraseAux.replace(fraseAux.charAt(rdmFrase.nextInt(41)), caracteres[rdmCaracter.nextInt(4)]);
				teste.setCharAt(rdmFrase.nextInt(41), caracteres[rdmCaracter.nextInt(4)]);
				System.out.print("-> ");
			}
			//System.out.println(fraseAux);
			System.out.println(teste.toString());
		}
		
		
	}

}
