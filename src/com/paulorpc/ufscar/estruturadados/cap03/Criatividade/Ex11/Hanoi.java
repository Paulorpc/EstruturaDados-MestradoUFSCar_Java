package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex11;


public class Hanoi {
	

	// Método que realiza (imprime) o movimento
	// de um disco entre dois pinos
	private static void mover(int O, int D) {
		System.out.println(O + " -> " + D);
	}

	// Método que implementa a recursão
	// O = pino origem
	// D = pino destino
	// T = pino de trabalho
	static void hanoi(int n, int O, int D, int T) {

		if (n > 0) {
			hanoi(n - 1, O, T, D);
			mover(O, D);
			hanoi(n - 1, T, D, O);
		}

	}

}
