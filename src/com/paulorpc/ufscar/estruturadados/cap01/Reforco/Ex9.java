package com.paulorpc.ufscar.estruturadados.cap01.Reforco;

import java.util.Scanner;

public class Ex9 {
	
	public static void main(String[] args) {
		
		Ex9 teste = new Ex9();
		
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextInt();
		
		System.out.println("O valor eh par? Resposta: " + teste.isEven(valor));
		
		ler.close();
		
	}
	
	public boolean isEven(int x){
		
		while(x > 0){
			x = x - 2;
		}
		
		if(x == 0) return true;
		else return false;
		
	}
	
}
