package com.paulorpc.ufscar.estruturadados.cap01.Reforco;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameEntry A = new GameEntry(4);
		GameEntry B = A;
		
		A.scores = 550;
		
		System.out.println("B = " + B.scores);
		
	}

}

class GameEntry {
	
	int scores;
	
	public GameEntry(int scores){
		this.scores = scores;
	}
	
}