package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex15;


public class Ex15 {

    public static void main(String[] args) {

        Pair<String, Boolean> pair1 = new Pair<String, Boolean>("Fabrício", true);
        Pair<String, Double>  pair2 = new Pair<String, Double>("Peso", 97.2);
        Pair<String, Float>   pair3 = new Pair<String, Float>("Tamanho", new Float(1.87));
        Pair<String, Long>    pair4 = new Pair<String, Long>("Nível de estresse", new Long(8000));
        Pair<String, Integer> pair5 = new Pair<String, Integer>("Idade", 24);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
        System.out.println(pair4);
        System.out.println(pair5);


    }

}
