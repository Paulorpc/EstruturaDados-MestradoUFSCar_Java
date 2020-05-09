package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex12;


import java.util.Scanner;

public class Ex12 {

    // Escreva um pequeno método Java que conte o número de vogais em uma string.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ex12 ex12 = new Ex12();

        String frase;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        System.out.println("Número de vogais: " + ex12.contaVogais(frase));
        
        sc.close();

    }

    public int contaVogais(String texto){

        char[] aux = texto.toLowerCase().toCharArray();

        int count = 0;

        for(int i = 0; i < aux.length; i++){       	
        	
            if(aux[i] == 'a' || 
               aux[i] == 'e' || 
               aux[i] == 'i' || 
               aux[i] == 'o' || 
               aux[i] == 'u')
            {
                count++;
            }
        }

        return count;
    }
}
