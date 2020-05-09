package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex10;

public class Ex10 {
	
	public static void main (String[] args) throws Exception {
		
		int[] vet = new int[10];
		
		try {

			for (int i=0; i<11; i++) {
				vet[i] = i+1;
			}			
		}
		catch(Exception e){
			throw new Exception("Acesso violado a posição inválida no vetor. Tamho do vetor: " + e.getMessage());
		}
		finally {
			System.out.println("Continuando programa através do finally...\n\n");
		}
		
	}

}
