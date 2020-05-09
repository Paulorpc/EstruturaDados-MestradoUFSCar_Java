package com.paulorpc.ufscar.estruturadados.cap02.Reforco.Ex16;


public class Pair <A,B> {

    A a;
    B b;

    Pair(A a, B b){
        set(a, b);
    }

    public void set(A a, B b){
        this.a = a;
        this.b = b;
    }

//    public A printMe(int a){
//        return A a;
//    }
//    
//    public B printMeq(String c){
//    	B<String> b;
//        return b;
//    }

}

