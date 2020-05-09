package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex11;


import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {

		int n; // número de discos

		// recebe o número de discos digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = entrada.nextInt();

		// executa o hanoi!
		Hanoi.hanoi(n, 1, 3, 2);
	}

}
