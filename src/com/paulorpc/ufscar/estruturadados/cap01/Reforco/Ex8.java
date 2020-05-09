package com.paulorpc.ufscar.estruturadados.cap01.Reforco;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex8 teste = new Ex8();
		
		long a;
		long b;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextLong();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextLong();
		
		System.out.println("A eh multiplo de B? Resposta: " + teste.isMultiple(a,b));
		
		ler.close();
		
	}
	
	public boolean isMultiple(long n, long m){
		
		for(int i = 0; i <= n; i++){
			if (n == m*i) return true;
		}
		
		return false;
	}

}
