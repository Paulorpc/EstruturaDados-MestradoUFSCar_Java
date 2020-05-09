package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex13;


import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ex13 ex13 = new Ex13();

        String s;

        System.out.println("Digite uma frase: ");
        s = sc.nextLine();

        System.out.println("Frase sem pontuação: " + ex13.removePontuacao(s));
        
        sc.close();

    }

    public String removePontuacao(String frase) {

        frase = frase.replace("!", "");
        frase = frase.replace(".", "");
        frase = frase.replace(",", "");
        frase = frase.replace("'", "");
        frase = frase.replace(":", "");
        frase = frase.replace(";", "");

        return frase;
    }

}
