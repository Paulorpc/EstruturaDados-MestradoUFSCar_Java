package com.paulorpc.ufscar.estruturadados.cap01.Projetos;

import java.util.ArrayList;
import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 30;
		ArrayList<String> data = new ArrayList<>();
		ArrayList<String> dataTemp;
		ArrayList<ArrayList<String>> listaDatas = new ArrayList<>();
		
		ArrayList<Integer> vet = new ArrayList<>();
		ArrayList<Integer> datasIguais = new ArrayList<>();
		String dt = new String();
		
		Random dia = new Random();
		Random mes = new Random();
		
		for(int a = 5; a < n; a=a+5){
			vet.add(a);
		}
		
		System.out.println(vet);
		
		int cont, tempCont;
		
		for(int i = 0; i < vet.size(); i++){
			data.clear();
			for(int j = 0; j < vet.get(i); j++){
				data.add((dia.nextInt(30)+1) + "/" + (mes.nextInt(11)+1));
			}
			dataTemp = (ArrayList<String>) data.clone();
			listaDatas.add(dataTemp);
		}
		
		System.out.println(listaDatas);
		
		for (int i=0; i < listaDatas.size(); i++) {
			cont = 0; tempCont=0;
			for (int j=0; j < listaDatas.get(i).size(); j++) {
				for (int k=0; k < listaDatas.get(i).size(); k++)
					if ( listaDatas.get(i).get(j).equals( listaDatas.get(i).get(k) ) ) {
						cont++;
				}
				if (cont <= 1)cont = 0;
				else { tempCont++; cont = 0; };
			} 
			if (cont > 2) datasIguais.add(cont);
			else datasIguais.add(0);
		}
		
		System.out.println(datasIguais);
		
	}

}
