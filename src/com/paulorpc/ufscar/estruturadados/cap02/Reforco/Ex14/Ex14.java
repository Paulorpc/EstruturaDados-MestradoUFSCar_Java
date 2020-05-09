package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex14;


import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o promeiro valor: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        c = sc.nextInt();

        if((a + b) == c){
            System.out.println(a + " + " + b + " = " + c);
        }

        if(a == (b - c)){
            System.out.println(a + " = " + b + " - " + c);
        }

        if((a * b) == c){
            System.out.println(a + " * " + b + " = " + c);
        }
        
        sc.close();

    }
}
