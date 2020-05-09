package com.paulorpc.ufscar.estruturadados.cap03.Criatividade.Ex20;


public class Main {

	public static void main(String[] args) {
		
		Letras frase = new Letras("aaáêÃa sss");
		String qtde;
	
		if (frase.TemMaisVogais() == 0)
			qtde = "iguais";
		else
			qtde = (frase.TemMaisVogais() > 0)  ? "maior" : "menor";
			
		System.out.println("Frase: " +frase.frase);
		System.out.print("\nA qtde de vogais são " + qtde +". Há "+frase.qtde().get("vog").intValue() +" vogais e "+frase.qtde().get("con").intValue() +" consoantes.");
	}	
}
